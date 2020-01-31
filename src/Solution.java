import org.junit.Assert;
import org.junit.Test;
import org.paukov.combinatorics3.Generator;
import org.w3c.dom.ls.LSOutput;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.paukov.combinatorics3.Generator.*;


public class Solution {
    public static void main(String[] args) {
        ConundrumSolver sol = new SolverOnQueue();
        List<List<Integer>> permutations = permutation(0, 1, 2, 3, 4, 5, 6, 7).simple().stream().collect(Collectors.toList());
        List<Integer[]> inputsArray = new LinkedList<Integer[]>();
        for (List<Integer> comb : permutations){
            inputsArray.add(comb.toArray(Integer[]::new));
        }
        int i = 0;
        for (Integer[] input : inputsArray){
            i++;
            //System.out.println(Arrays.toString(input) + " -> " + Arrays.toString(sol.resolve(Arrays.stream(input).mapToInt(Integer::intValue).toArray())));
            System.out.println("@Test\n" +
                    "        public void resolve" + Integer.toString(i) + "() {\n" +
                    "            int[] input = " + Arrays.toString(input).replace('[','{').replace(']','}') +";\n" +
                    "            int[] actual = new SolverOnQueue().resolve(input);\n" +
                    "            int[] expected = " + Arrays.toString(sol.resolve(Arrays.stream(input).mapToInt(Integer::intValue).toArray())).replace('[','{').replace(']','}') + ";\n" +
                    "            Assert.assertArrayEquals(actual,expected);\n" +
                    "        }\n");
        }
    }
}
