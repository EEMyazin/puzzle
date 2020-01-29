import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) {
        ConundrumSolver sol = new Solver();
        int[] test1 = {1,2,3,4,0,5,6,7};
        for(int i : sol.resolve(test1)){
            System.out.print(i + ' ');
        }
        int[] test2 = {2,1,3,4,0,5,6,7};
        for(int i : sol.resolve(test2)){
            System.out.print(i + ' ');
        }
        int[] test3 = {0,1,2,3,4,5,6,7};
        for(int i : sol.resolve(test3)){
            System.out.print(i + ' ');
        }
    }
}
