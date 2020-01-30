import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolverOnTasksTest {

    @Test
    public void resolve1() {
        int[] input = {1, 2, 3, 4, 0, 5, 6, 7};
        int[] actual = new SolverOnTasks().resolve(input);
        int[] expected = {};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve2() {
        int[] input = {2, 1, 3, 4, 0, 5, 6, 7};
        int[] actual = new SolverOnTasks().resolve(input);
        int[] expected = {5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve3() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] actual = new SolverOnTasks().resolve(input);
        int[] expected = {2, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve4() {
        int[] input = {7, 2, 3, 4, 1, 5, 6, 0};
        int[] actual = new SolverOnTasks().resolve(input);
        int[] expected = {6, 4, 2, 7, 3, 7, 2, 1, 5, 7, 3, 2, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve5() {
        int[] input = {7, 2, 3, 4, 0, 5, 6, 1};
        int[] actual = new SolverOnTasks().resolve(input);
        int[] expected = {5, 1, 6, 4, 2, 3, 1, 5, 2, 3, 7, 1, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve6() {
        int[] input = {1, 2, 3, 4, 0, 5, 7, 6};
        int[] actual = new SolverOnTasks().resolve(input);
        int[] expected = {4, 7, 6, 5, 3, 2, 7, 6, 5, 3, 2, 1, 7, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve7() {
        int[] input = {1, 2, 3, 4, 0, 6, 5, 7};
        int[] actual = new SolverOnTasks().resolve(input);
        int[] expected = {4, 2, 1, 3, 1, 2, 4, 6, 1, 3, 2, 4, 6, 1, 3, 4, 6, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};

        Assert.assertArrayEquals(actual,expected);
    }
}