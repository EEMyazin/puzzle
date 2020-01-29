public class Solution {
    public static void main(String[] args) {
        ConundrumSolver sol = new RecursiveSolver();
        int[] test = {1,2,3,4,0,5,6,7};
        for(int i : sol.resolve(test){
            System.out.print(i + ' ');
        }
        int[] test = {2,1,3,4,0,5,6,7};
        for(int i : sol.resolve(test){
            System.out.print(i + ' ');
        }
        int[] test = {0,1,2,3,4,5,6,7};
        for(int i : sol.resolve(test){
            System.out.print(i + ' ');
        }
    }
}
