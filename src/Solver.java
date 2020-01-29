import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solver implements ConundrumSolver{
    private List<int[]> solutions;
    private ArrayList<Integer> path;
    private int[][] connectivityMatrix= {{0,1,1,0,0,0,0,0},
                                        {1,0,1,1,0,0,0,0},
                                        {1,1,0,0,0,1,0,0},
                                        {0,1,0,0,1,0,1,0},
                                        {0,0,0,1,0,1,0,0},
                                        {0,0,1,0,1,0,0,1},
                                        {0,0,0,1,0,0,0,1},
                                        {0,0,0,0,0,1,1,0}};
    private int[] correctSolution = {1,2,3,4,0,5,6,7};

    public Solver(){
        solutions = new LinkedList<>();
        path = new ArrayList<>();
    }

    @Override
    public int[] resolve(int[] initialState) {


        return new int[0];
    }
}
