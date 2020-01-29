import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solver implements ConundrumSolver{
    private List<int[]> solutions;
    private ArrayList<Integer> path;
    private int[][] connectivityMatrix = {{0,1,1,0,0,0,0,0},
                                        {1,0,1,1,0,0,0,0},
                                        {1,1,0,0,0,1,0,0},
                                        {0,1,0,0,1,0,1,0},
                                        {0,0,0,1,0,1,0,0},
                                        {0,0,1,0,1,0,0,1},
                                        {0,0,0,1,0,0,0,1},
                                        {0,0,0,0,0,1,1,0}};
    private int[][] currentMatrix;
    private int[] correctSolution = {1,2,3,4,0,5,6,7};

    public Solver(){
        solutions = new LinkedList<>();
        path = new ArrayList<>();
        currentMatrix = new int[8][8];
    }

    @Override
    public int[] resolve(int[] initialState) {
        for (int i = 0; i < 8; i++){
            currentMatrix[i][i] = initialState[i];
        }
        /*for (int[] i : currentMatrix){
            for (int j : i) {
                System.out.print(' ' + Integer.toString(j));
            }
            System.out.println();
        }*/
        return new int[0];
    }
}
