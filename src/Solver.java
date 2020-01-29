import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solver implements ConundrumSolver{
    private List<byte[]> solutions;
    private ArrayList<Byte> path;
    private boolean[][] connectivityMatrix = {{false,true,true,false,false,false,false,false},
                                            {true,false,true,true,false,false,false,false},
                                            {true,true,false,false,false,true,false,false},
                                            {false,true,false,false,true,false,true,false},
                                            {false,false,false,true,false,true,false,false},
                                            {false,false,true,false,true,false,false,true},
                                            {false,false,false,true,false,false,false,true},
                                            {false,false,false,false,false,true,true,false}};
    private byte[] currentState;
    private byte[] correctSolution = {1,2,3,4,0,5,6,7};

    public Solver(){
        solutions = new LinkedList<>();
        path = new ArrayList<>();
        currentState = new byte[8];
    }

    @Override
    public int[] resolve(int[] initialState) {
        byte nullPosition = -1;
        for (int i = 0; i < 8; i++){
            if (initialState[i] == 0) {
                nullPosition = (byte)i;
            }
            currentState[i] = (byte)initialState[i];
        }
        FindSolutionsRecursively(currentState, new ArrayList<Byte>(), nullPosition, (byte) -1);
        return FindShortestSolution();
    }

    private void FindSolutionsRecursively(byte[] currentState, ArrayList<Byte> path, byte nullPosition, byte nullPreviousPosition){
        if (Arrays.equals(currentState, correctSolution)) {
            SaveSolution(path);
        }
        else {
            int pathLength = path.size(); //сохраняется чтобы не тратить время на вызов функции для каждого ребра
            for (byte i = 0; i < 8; i ++){
                if (connectivityMatrix[nullPosition][i] && (nullPreviousPosition != i)) {
                    path.add(currentState[i]);
                    FindSolutionsRecursively(swapElement(currentState, i, nullPosition), path, i, nullPosition);
                    path.remove(pathLength);
                }
            }

        }
    }

    private void SaveSolution(ArrayList<Byte> path){
        int pathLength = path.size(); //сохраняется чтобы не тратить время на вызов функции для каждого ребра
        byte[] solution = new byte[pathLength];
        for (int i = 0; i < pathLength; i ++){
            solution[i] = path.get(i);
        }
        solutions.add(solution);
    }

    private int[] FindShortestSolution(){
        byte[] shortestSolution = new byte[0];
        int shortestSolutionLength = Integer.MAX_VALUE;
        for (byte[] solution : solutions) {
            if (solution.length < shortestSolutionLength) {
                shortestSolution = solution;
                shortestSolutionLength = shortestSolution.length;
            }
        }
        int[] result = new int[shortestSolutionLength];
        for (int i = 0; i < shortestSolutionLength; i++){
            result[i] = (int)shortestSolution[i];
        }
        return result;
    }

    private byte[] swapElement(byte[] array, byte firstElementIndex, byte secondElementIndex){
        byte temp = array[firstElementIndex];
        array[firstElementIndex] = array[secondElementIndex];
        array[secondElementIndex] = temp;
        return array;
    }
}
