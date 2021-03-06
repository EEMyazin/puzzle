import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.paukov.combinatorics3.Generator.permutation;


public class Solution {
    public static void main(String[] args) {
        ConundrumSolver solver = new SolverOnQueue();
        //Алгоритм успешно отработал на всех возможных корректных входных условиях
        List<List<Integer>> permutations = permutation(0, 1, 2, 3, 4, 5, 6, 7).simple().stream().collect(Collectors.toList());
        List<Integer[]> inputsArray = new LinkedList<Integer[]>();
        for (List<Integer> comb : permutations){
            inputsArray.add(comb.toArray(Integer[]::new));
        }
        int i = 0;
        for (Integer[] input : inputsArray){
            i++;
            StringBuffer printout = new StringBuffer()
                    .append(String.format("%5d", i))
                    .append(". ")
                    .append(Arrays.toString(input))
                    .append(" -> ")
                    .append(Arrays.toString(solver.resolve(Arrays.stream(input).mapToInt(Integer::intValue).toArray())));
            System.out.println(printout);
            /*System.out.println("@Test\n" +
                    "        public void resolve" + Integer.toString(i) + "() {\n" +
                    "            int[] input = " + Arrays.toString(input).replace('[','{').replace(']','}') +";\n" +
                    "            int[] actual = new SolverOnQueue().resolve(input);\n" +
                    "            int[] expected = " + Arrays.toString(solver.resolve(Arrays.stream(input).mapToInt(Integer::intValue).toArray())).replace('[','{').replace(']','}') + ";\n" +
                    "            Assert.assertArrayEquals(actual,expected);\n" +
                    "        }\n");*/
        }
    }
}
