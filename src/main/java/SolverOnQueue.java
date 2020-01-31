import java.nio.ByteBuffer;
import java.util.*;

public class SolverOnQueue implements ConundrumSolver {
    private final boolean[][] connectivityMatrix = {{false,true,true,false,false,false,false,false},
                                                    {true,false,true,true,false,false,false,false},
                                                    {true,true,false,false,false,true,false,false},
                                                    {false,true,false,false,true,false,true,false},
                                                    {false,false,false,true,false,true,false,false},
                                                    {false,false,true,false,true,false,false,true},
                                                    {false,false,false,true,false,false,false,true},
                                                    {false,false,false,false,false,true,true,false}};
    private final byte[] desiredState = {1,2,3,4,0,5,6,7};

    @Override
    public int[] resolve(int[] initialState) {
        byte[] firstState = new byte[initialState.length];
        for (int i = 0; i < initialState.length; i++){
            firstState[i] = (byte)initialState[i];
        }
        PathFinder pathFinder = new PathFinder(connectivityMatrix, desiredState);
        return pathFinder.searchPathFrom(firstState);
    }

    /**
     * Класс организующий поиск решения задачи. Решением будет путь, который пройдет пустая клетка.
     */
    class PathFinder {
        /** Массив для хранения матрицы связности*/
        private final boolean[][] connectivityMatrix;
        /** Массив для хранения искомого состояния графа*/
        private final State correctState;

        /**
         * Конструктор - создание нового поисковика
         * @param connectivityMatrix матрица связности для обрабатываемого графа
         * @param correctState искомое состояние графа
         */
        public PathFinder(boolean[][] connectivityMatrix, byte[] correctState) {
            this.connectivityMatrix = connectivityMatrix;
            this.correctState = new State(correctState);
        }

        /**
         * Функция поиска искомого состояния графа, заданного матрицей связности из исходного состояния графа
         * @param initialState исходное состояние графа
         * @return путь пустой клетки для получения искомого состояния графа
         */
        public int[] searchPathFrom(byte[] initialState){
            Queue queue = new Queue();
            queue.putState(new State(initialState));
            while (queue.hasStates()) {
                State current = queue.getState();
                if (current.equals(correctState)) {
                    return current.getPathAsIntArray();
                }
                queue.putStates(current.getNextStepStates(connectivityMatrix));
            }
            return new int[0];
        }
    }

    /**
     * Класс реализующий очередь(FIFO) обработки состояний графа.
     */
    class Queue {
        /** Список для хранения состояний графа по которым необходимо произвести поиск */
        private final LinkedList<State> queue;
        /** Список хранящий предыдущие обработанные состояния графа*/
        private final HashSet<Long> stateHistory;

        /**
         * Конструктор - создание новой очереди
         */
        public Queue(){
            queue = new LinkedList<>();
            stateHistory = new HashSet<>();
        }

        /**
         * Функция, возвращающая следующее состояние из очереди
         * @return следующее состояние
         */
        public State getState(){
            if (queue.size() == 0) {
                return null;
            }
            return queue.removeFirst();
        }

        /**
         * Функция, помещающая состояние в очередь, при условии, что оно ранее не обрабатывалось
         * @param newState новое состояние графа
         */
        public void putState(State newState){
            if (!stateHistory.contains(newState.asLong())) {
                queue.addLast(newState);
                stateHistory.add(newState.asLong());
            }
        }

        /**
         * Функция, помещающая в очередь несколько состояний
         * @param nextStates список новых состояний графа
         */
        public void putStates(List<State> nextStates){
            for (State newState : nextStates){
                putState(newState);
            }
        }

        /**
         * Функция проверяющая наличие состояний в очереди
         * @return true если в очереди еще есть состояние; false если очередь пуста
         */
        public boolean hasStates(){
            return (queue.size()>0);
        }
    }


    /**
     * Класс для хранения состояния графа и пути его достижения.
     */
    class State{
        /** Поле для хранения состояния графа*/
        private final byte[] state;         //Храним в байтах - меньше памяти потратится чем в int
        /** Поле для хранения пути до текущего состояния графа*/
        private final Path path;
        /** Вспомогательное поле для хранения положения нуля на графе */
        private int nullPosition; // Отслеживаем положение нуля, чтобы каждый раз не искать его в массиве

        /**
         * Конструктор - создание нового состояния без пути
         * @param state состояние графа
         */
        public State(byte[] state){
            this.state = state;
            for (int i = 0; i < state.length; i++){
                if (state[i] == 0) {
                     this.nullPosition = i;
                }
            }
            this.path = new Path();
        }

        /**
         * Конструктор - создание нового состояния с определенными значениями
         * @param state состояние графа
         * @param path путь до этого состояния графа
         * @param nullPosition индекс вершины в которой находится пустая ячейка
         */
        private State(byte[] state, Path path, int nullPosition) {
            this.state = state;
            this.path = path;
            this.nullPosition = nullPosition;
        }

        /**
         * Создание нового состояния на основании текущего(для формирования используется индекс вершины из которой
         * будет перемещена цифра)
         * @param nextNullPosition индекс вершины
         * @return полученное состояние графа
         */
        private State getNextStepState(int nextNullPosition){
            byte[] newState = new byte[state.length];
            System.arraycopy(state, 0, newState, 0, state.length);
            newState[nullPosition] = state[nextNullPosition];
            newState[nextNullPosition] = state[nullPosition]; //а можно было просто (byte)0 :)
            return new State(newState, path.getPathWithNextStep(state[nextNullPosition]), nextNullPosition);

        }

        /**
         * Функция получения текущего расположения цифр в вершинах
         * @return текущее расположение цифр
         */
        public byte[] getState() {
            return state;
        }

        /**
         * Возвращает текущее состояние графа
         * @return текущее состояние графа как массив цифр в вершинах
         */
        public int[] getPathAsIntArray() {
            return path.AsIntArray();
        }

        /**
         * Возвращает состояния в которые может перейти граф из текущего
         * @param connectivityMatrix матрица связности графа
         * @return список состояний
         */
        public LinkedList<State> getNextStepStates(boolean[][] connectivityMatrix){
            LinkedList<State> nextStates = new LinkedList<>();
            for (int i = 0; i<state.length; i++){
                if (connectivityMatrix[nullPosition][i] && state[i] != path.getLastStep()) {
                    nextStates.add(getNextStepState(i));
                }
            }
            return nextStates;
        }

        /**
         * Проверяет текущее состояние на соответствие другому
         *
         * @param other состояние для сравнения
         * @return true расположение цифр в графах одинаково; false если различны
         */

        public boolean equals(State other){
            return Arrays.equals(state,other.getState());
        }

        /**
         * Возвращает текущее расположение цифр в графе
         * @return текущее расположение цифр в графе упакованное в Long
         */
        public long asLong() {
            return ByteBuffer.wrap(state).getLong();
        }

        /**
         * Класс для хранения порядка перемещения цифр в пустую ячейку.
         *
         * Не вносятся изменения в текущие пути - для каждого возможного состояния графа создается свой путь его достижения.
         */
        class Path{
            /**
             * Поле для хранения "пути" пустой ячейки
             */
            private final byte[] array;
            // Можно было использовать ArrayList<Byte>, но есть несколько минусов:
            // 1. При достижении размера массива он увеличивается в полтора раза, мне хотелось увеличивать вручную на меньшее
            // значение для экономии памяти
            // 2. Не может хранить примитивы, Byte в памяти занимает больше чем byte
            /**
             * Вспомогательное поле для хранения количества шагов в пути
             */
            private final int countStep;

            /**
             * Конструктор для создания пустого пути
             */
            public Path(){
                array = new byte[10];
                countStep = 0;
            }

            /**
             * Конструктор для создания пути
             * @param array массив шагов в пути
             * @param countStep количество шагов в пути
             */
            public Path(byte[] array, int countStep){
                this.array = array;
                this.countStep = countStep;
            }

            /**
             * Функция возвращающая новый путь на основании текущего, в конец которого добавлен новый шаг
             * @param nextStep в качестве шага передается цифра, которая будет передвинута в пустую ячейку
             * @return путь полученный после шага
             */
            public Path getPathWithNextStep(byte nextStep){
                byte[] newArray;
                if (array.length == countStep){
                    newArray = new byte[array.length + 5];
                }
                else {
                    newArray = new byte[array.length];
                }
                System.arraycopy(array, 0, newArray,0, countStep);
                newArray[countStep] = nextStep;
                return new Path(newArray, countStep + 1);
            }

            /**
             * Возвращает текущий путь
             * @return текущий путь как массив Int
             */
            public int[] AsIntArray(){
                int[] result = new int[countStep];
                for (int i = 0; i < countStep; i++){
                    result[i] = array[i];
                }
                return result;
            }

            /**
             * Возвращает последний шаг
             * @return последняя цифра, поменявшаяся с пустой ячейкой
             */
            public byte getLastStep(){
                if (countStep == 0){
                    return 0;
                }
                else {
                    return array[countStep - 1];
                }
            }
        }
    }
}
