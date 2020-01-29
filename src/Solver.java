import java.util.LinkedList;
import java.util.List;

public class Solver implements ConundrumSolver{
    private List<int[]> solutions = new LinkedList<>();
    private int[][] connectivityMatrix= {{0,1,1,0,0,0,0,0},
                                         {1,0,1,1,0,0,0,0},
                                         {1,1,0,0,0,1,0,0},
                                         {0,1,0,0,1,0,1,0},
                                         {0,0,0,1,0,1,0,0},
                                         {0,0,1,0,1,0,0,1},
                                         {0,0,0,1,0,0,0,1},
                                         {0,0,0,0,0,1,1,0}};
    private int[] correctSolution = {1,2,3,4,0,5,6,7};

    private int[] path;

    @Override
    public int[] resolve(int[] initialState) {


        return new int[0];
    }
}
