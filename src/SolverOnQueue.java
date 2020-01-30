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
     * Класс организующий поиск решения задачи
     */
    class PathFinder {
        private final boolean[][] connectivityMatrix;
        private final byte[] correctState;

        public PathFinder(boolean[][] connectivityMatrix, byte[] correctState) {
            this.connectivityMatrix = connectivityMatrix;
            this.correctState = correctState;
        }

        public int[] searchPathFrom(byte[] initialState){
            Queue queue = new Queue();
            queue.putState(new State(initialState));
            while (queue.hasStates()) {
                State current = queue.getState();
                if (current.isCorrectSolution(correctState)) {
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
        private LinkedList<State> queue;
        private HashSet<Long> stateHistory;

        public Queue(){
            queue = new LinkedList<State>();
            stateHistory = new HashSet<Long>();
        }

        public State getState(){
            if (queue.size() == 0) {
                return null;
            }
            State result = queue.removeFirst();
            return result;
        }

        public void putState(State newState){
            if (!stateHistory.contains(newState.asLong())) {
                queue.addLast(newState);
                stateHistory.add(newState.asLong());
            }
        }

        public void putStates(List<State> nextStates){
            for (State newState : nextStates){
                putState(newState);
            }
        }

        public boolean hasStates(){
            return (queue.size()>0);
        }
    }


    /**
     * Класс для хранения состояния графа и пути его достижения.
     */
    class State{
        private final byte[] state;         //Храним в байтах - меньше памяти потратится чем в int
        private final Path path;

        private int nullPosition; // Отслеживаем положение нуля, чтобы каждый раз не искать его в массиве

        public byte[] getState() {
            return state;
        }

        public int[] getPathAsIntArray() {
            return path.AsIntArray();
        }


        public State(byte[] state){
            this.state = state;
            for (int i = 0; i < state.length; i++){
                if (state[i] == 0) {
                     this.nullPosition = i;
                }
            }
            this.path = new Path();
        }

        private State(byte[] state, Path path, int nullPosition) {
            this.state = state;
            this.path = path;
            this.nullPosition = nullPosition;
        }

        private State getNextStepState(int nextNullPosition){
            byte[] newState = new byte[state.length];
            System.arraycopy(state, 0, newState, 0, state.length);
            newState[nullPosition] = state[nextNullPosition];
            newState[nextNullPosition] = state[nullPosition]; //а можно было просто (byte)0 :)
            return new State(newState, path.getPathWithNextStep(state[nextNullPosition]), nextNullPosition);

        }

        public LinkedList<State> getNextStepStates(boolean[][] connectivityMatrix){
            LinkedList<State> nextStates = new LinkedList<State>();
            for (int i = 0; i<state.length; i++){
                if (connectivityMatrix[nullPosition][i] && state[i] != path.getLastStep()) {
                    nextStates.add(getNextStepState(i));
                }
            }
            return nextStates;
        }

        public boolean isCorrectSolution(byte[] correctSolution){
            return Arrays.equals(state,correctSolution);
        }

        public boolean equals(State other){
            return Arrays.equals(state, other.getState());
        }

        public long asLong() {
            return ByteBuffer.wrap(state).getLong();
        }

        /**
         * Класс для хранения порядка перемещения цифр в пустую ячейку.
         *
         * Не вносятся изменения в текущие пути - для каждого возможного состояния графа создается свой путь его достижения.
         */
        class Path{
            private final byte[] array;
            // Можно было использовать ArrayList<Byte>, но есть несколько минусов:
            // 1. При достижении размера массива он увеличивается в полтора раза, мне хотелось увеличивать вручную на меньшее
            // значение для экономии памяти
            // 2. Не может хранить примитивы, Byte в памяти занимает больше чем byte. Мной ожидается большое количество
            // хранимых "возможных путей"
            private final int countStep;

            public Path(){
                array = new byte[10];
                countStep = 0;
            }

            public Path(byte[] array, int countStep){
                this.array = array;
                this.countStep = countStep;
            }

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

            public int[] AsIntArray(){
                int[] result = new int[countStep];
                for (int i = 0; i < countStep; i++){
                    result[i] = (int)array[i];
                }
                return result;
            }

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
