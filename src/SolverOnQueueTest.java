import org.junit.Assert;
import org.junit.Test;

public class SolverOnQueueTest {

    @Test
    public void resolve1() {
        int[] input = {1, 2, 3, 4, 0, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve2() {
        int[] input = {2, 1, 3, 4, 0, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve3() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve4() {
        int[] input = {7, 2, 3, 4, 1, 5, 6, 0};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 7, 3, 7, 2, 1, 5, 7, 3, 2, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve5() {
        int[] input = {7, 2, 3, 4, 0, 5, 6, 1};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 4, 2, 3, 1, 5, 2, 3, 7, 1, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve6() {
        int[] input = {1, 2, 3, 4, 0, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 5, 3, 2, 7, 6, 5, 3, 2, 1, 7, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve7() {
        int[] input = {1, 2, 3, 4, 0, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 1, 3, 1, 2, 4, 6, 1, 3, 2, 4, 6, 1, 3, 4, 6, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};

        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve8() {
        int[] input = {1, 2, 3, 4, 0, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 5, 6, 2, 3, 1, 7, 5, 4, 3, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};

        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve9() {
        int[] input = {1, 2, 3, 4, 0, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 1, 3, 7, 4, 2, 1, 3, 7, 3, 1, 2, 4, 3, 7, 1, 2, 4, 3, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};

        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve10() {
        int[] input = {0, 7, 1, 2, 3, 4, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }
    @Test
    public void resolve37188() {
        int[] input = {1, 5, 0, 3, 7, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 7, 2, 1, 5, 3, 7, 2, 1, 5, 7, 2, 1, 5, 7, 3, 2, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37189() {
        int[] input = {1, 5, 0, 7, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37190() {
        int[] input = {1, 5, 7, 0, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 1, 5, 3, 2, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37191() {
        int[] input = {1, 7, 5, 0, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37192() {
        int[] input = {7, 1, 5, 0, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37193() {
        int[] input = {7, 1, 5, 0, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 3, 1, 6, 4, 3, 1, 6, 5, 7, 2, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37194() {
        int[] input = {1, 7, 5, 0, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 1, 7, 3, 2, 1, 7, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37195() {
        int[] input = {1, 5, 7, 0, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 1, 5, 3, 2, 1, 7, 5, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37196() {
        int[] input = {1, 5, 0, 7, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 3, 2, 1, 7, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37197() {
        int[] input = {1, 5, 0, 3, 7, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 4, 6, 3, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37198() {
        int[] input = {1, 5, 0, 3, 2, 7, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 3, 2, 4, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37199() {
        int[] input = {1, 5, 0, 3, 2, 6, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 6, 1, 5, 3, 2, 6, 1, 4, 7, 6, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37200() {
        int[] input = {1, 5, 0, 3, 2, 6, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 6, 1, 5, 3, 5, 1, 7, 4, 2, 5, 3, 1, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37201() {
        int[] input = {1, 5, 0, 3, 6, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 2, 5, 1, 3, 6, 4, 7, 5, 2, 4, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37202() {
        int[] input = {1, 5, 0, 3, 6, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 2, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37203() {
        int[] input = {1, 5, 0, 3, 6, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 7, 6, 5, 3, 1, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37204() {
        int[] input = {1, 5, 0, 3, 7, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 4, 6, 1, 3, 2, 7, 1, 3, 5, 2, 5, 3, 1, 7, 5, 2, 3, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37205() {
        int[] input = {1, 5, 0, 7, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 4, 6, 1, 5, 7, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37206() {
        int[] input = {1, 5, 7, 0, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 7, 1, 5, 2, 4, 6, 7, 3, 4, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37207() {
        int[] input = {1, 7, 5, 0, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 5, 7, 2, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37208() {
        int[] input = {7, 1, 5, 0, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 6, 4, 2, 1, 3, 4, 6, 7, 3, 1, 2, 6, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37209() {
        int[] input = {7, 1, 5, 0, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 6, 1, 7, 5, 3, 5, 7, 2, 4, 6, 5, 7, 2, 1, 5, 7, 3, 2, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37210() {
        int[] input = {1, 7, 5, 0, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 3, 6, 7, 2, 4, 6, 3, 1, 2, 7, 3, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37211() {
        int[] input = {1, 5, 7, 0, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37212() {
        int[] input = {1, 5, 0, 7, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 2, 4, 6, 3, 1, 5, 2, 7, 3, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37213() {
        int[] input = {1, 5, 0, 6, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 5, 3, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37214() {
        int[] input = {1, 5, 0, 6, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37215() {
        int[] input = {1, 5, 0, 6, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 6, 5, 1, 2, 4, 3, 5, 1, 2, 4, 2, 1, 5, 3, 2, 4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37216() {
        int[] input = {1, 5, 0, 6, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 3, 6, 1, 5, 2, 5, 1, 4, 7, 3, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37217() {
        int[] input = {1, 5, 6, 0, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 2, 3, 5, 1, 6, 2, 3, 5, 1, 4, 7, 5, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37218() {
        int[] input = {1, 5, 6, 0, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 4, 3, 1, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37219() {
        int[] input = {1, 5, 6, 0, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 1, 5, 3, 7, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37220() {
        int[] input = {1, 5, 6, 0, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 1, 5, 7, 3, 1, 6, 5, 6, 1, 4, 2, 7, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37221() {
        int[] input = {1, 5, 6, 7, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 6, 1, 5, 7, 3, 1, 6, 5, 6, 1, 4, 2, 7, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37222() {
        int[] input = {1, 5, 7, 6, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37223() {
        int[] input = {1, 7, 5, 6, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 3, 6, 7, 2, 4, 6, 3, 1, 2, 7, 3, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37224() {
        int[] input = {7, 1, 5, 6, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 1, 6, 3, 5, 1, 7, 6, 7, 1, 4, 2, 3, 7, 6, 1, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37225() {
        int[] input = {7, 1, 6, 5, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 6, 3, 5, 1, 7, 6, 3, 6, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37226() {
        int[] input = {1, 7, 6, 5, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 3, 6, 1, 7, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37227() {
        int[] input = {1, 6, 7, 5, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 6, 5, 3, 7, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37228() {
        int[] input = {1, 6, 5, 7, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37229() {
        int[] input = {1, 6, 5, 0, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 7, 6, 5, 3, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37230() {
        int[] input = {1, 6, 5, 0, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37231() {
        int[] input = {1, 6, 5, 0, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 1, 6, 3, 2, 5, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37232() {
        int[] input = {1, 6, 5, 0, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 2, 3, 6, 1, 5, 2, 5, 1, 4, 7, 3, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37233() {
        int[] input = {6, 1, 5, 0, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 3, 4, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37234() {
        int[] input = {6, 1, 5, 0, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 1, 3, 2, 5, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37235() {
        int[] input = {6, 1, 5, 0, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 5, 1, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37236() {
        int[] input = {6, 1, 5, 0, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37237() {
        int[] input = {6, 1, 5, 7, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37238() {
        int[] input = {6, 1, 7, 5, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 3, 5, 1, 7, 6, 3, 6, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37239() {
        int[] input = {6, 7, 1, 5, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 6, 7, 5, 3, 1, 4, 2, 3, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37240() {
        int[] input = {7, 6, 1, 5, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 6, 5, 3, 1, 4, 2, 3, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37241() {
        int[] input = {7, 6, 5, 1, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37242() {
        int[] input = {6, 7, 5, 1, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 7, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37243() {
        int[] input = {6, 5, 7, 1, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 1, 2, 4, 7, 5, 1, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37244() {
        int[] input = {6, 5, 1, 7, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 6, 5, 6, 1, 4, 2, 7, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37245() {
        int[] input = {6, 5, 1, 0, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 1, 6, 5, 6, 1, 4, 2, 7, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37246() {
        int[] input = {6, 5, 1, 0, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37247() {
        int[] input = {6, 5, 1, 0, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 4, 7, 5, 1, 6, 2, 4, 3, 1, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37248() {
        int[] input = {6, 5, 1, 0, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 3, 5, 1, 6, 2, 3, 5, 1, 4, 7, 5, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37249() {
        int[] input = {5, 6, 1, 0, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 3, 6, 1, 5, 2, 5, 1, 4, 7, 3, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37250() {
        int[] input = {5, 6, 1, 0, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 4, 7, 6, 1, 5, 2, 4, 3, 1, 5, 4, 3, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37251() {
        int[] input = {5, 6, 1, 0, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37252() {
        int[] input = {5, 6, 1, 0, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 3, 7, 6, 5, 3, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37253() {
        int[] input = {5, 6, 1, 7, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 7, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37254() {
        int[] input = {5, 6, 7, 1, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 5, 6, 1, 3, 5, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37255() {
        int[] input = {5, 7, 6, 1, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 1, 3, 4, 6, 7, 3, 1, 2, 6, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37256() {
        int[] input = {7, 5, 6, 1, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 1, 3, 4, 6, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37257() {
        int[] input = {7, 5, 1, 6, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37258() {
        int[] input = {5, 7, 1, 6, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 5, 7, 6, 3, 1, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37259() {
        int[] input = {5, 1, 7, 6, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 1, 5, 7, 3, 6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37260() {
        int[] input = {5, 1, 6, 7, 0, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 6, 5, 1, 7, 3, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37261() {
        int[] input = {5, 1, 6, 0, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 5, 1, 7, 3, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37262() {
        int[] input = {5, 1, 6, 0, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 5, 1, 2, 4, 7, 5, 1, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37263() {
        int[] input = {5, 1, 6, 0, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 3, 1, 5, 2, 3, 1, 5, 2, 6, 3, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37264() {
        int[] input = {5, 1, 6, 0, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 6, 1, 4, 3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37265() {
        int[] input = {5, 1, 0, 6, 3, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 1, 5, 2, 5, 1, 4, 7, 3, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37266() {
        int[] input = {5, 1, 0, 6, 3, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 6, 1, 5, 2, 4, 3, 1, 5, 4, 3, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37267() {
        int[] input = {5, 1, 0, 6, 3, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 7, 3, 6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37268() {
        int[] input = {5, 1, 0, 6, 7, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 3, 7, 6, 5, 3, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37269() {
        int[] input = {5, 1, 0, 7, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 2, 4, 6, 3, 1, 2, 7, 3, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37270() {
        int[] input = {5, 1, 7, 0, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 6, 1, 7, 5, 3, 5, 7, 2, 4, 6, 5, 7, 2, 1, 5, 7, 3, 2, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37271() {
        int[] input = {5, 7, 1, 0, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 1, 5, 7, 6, 3, 1, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37272() {
        int[] input = {7, 5, 1, 0, 6, 3, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37273() {
        int[] input = {7, 5, 1, 0, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 1, 5, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37274() {
        int[] input = {5, 7, 1, 0, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 1, 5, 7, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37275() {
        int[] input = {5, 1, 7, 0, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 2, 1, 3, 4, 6, 7, 3, 1, 2, 6, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37276() {
        int[] input = {5, 1, 0, 7, 3, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 4, 6, 1, 5, 7, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37277() {
        int[] input = {5, 1, 0, 3, 7, 6, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 4, 6, 1, 3, 2, 7, 1, 3, 5, 2, 5, 3, 1, 7, 5, 2, 3, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37278() {
        int[] input = {5, 1, 0, 3, 6, 7, 2, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 6, 7, 1, 5, 3, 5, 1, 7, 6, 5, 3, 1, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37279() {
        int[] input = {5, 1, 0, 3, 6, 2, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 6, 2, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37280() {
        int[] input = {5, 1, 0, 3, 6, 2, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 6, 2, 5, 1, 3, 6, 4, 7, 5, 2, 4, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37281() {
        int[] input = {5, 1, 0, 3, 2, 6, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 6, 1, 5, 3, 5, 1, 7, 4, 2, 5, 3, 1, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37282() {
        int[] input = {5, 1, 0, 3, 2, 6, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 6, 1, 5, 3, 2, 6, 1, 4, 7, 6, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37283() {
        int[] input = {5, 1, 0, 3, 2, 7, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 3, 2, 4, 7, 5, 1, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37284() {
        int[] input = {5, 1, 0, 3, 7, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 3, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37285() {
        int[] input = {5, 1, 0, 7, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 2, 1, 7, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37286() {
        int[] input = {5, 1, 7, 0, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 3, 1, 6, 4, 3, 1, 6, 5, 7, 2, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37287() {
        int[] input = {5, 7, 1, 0, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37288() {
        int[] input = {7, 5, 1, 0, 3, 2, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 5, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37289() {
        int[] input = {7, 5, 1, 0, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37290() {
        int[] input = {5, 7, 1, 0, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37291() {
        int[] input = {5, 1, 7, 0, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37292() {
        int[] input = {5, 1, 0, 7, 3, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37293() {
        int[] input = {5, 1, 0, 3, 7, 2, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 2, 1, 5, 3, 7, 2, 1, 5, 7, 2, 1, 5, 7, 3, 2, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37294() {
        int[] input = {5, 1, 0, 3, 2, 7, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37295() {
        int[] input = {5, 1, 0, 3, 2, 4, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 1, 4, 2, 3, 1, 7, 6, 3, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37296() {
        int[] input = {5, 1, 0, 3, 2, 4, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37297() {
        int[] input = {5, 1, 0, 3, 4, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 1, 5, 2, 4, 3, 1, 5, 4, 3, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37298() {
        int[] input = {5, 1, 0, 3, 4, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 6, 2, 1, 5, 3, 7, 4, 1, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37299() {
        int[] input = {5, 1, 0, 3, 4, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37300() {
        int[] input = {5, 1, 0, 3, 7, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 2, 6, 7, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37301() {
        int[] input = {5, 1, 0, 7, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 4, 1, 5, 7, 5, 1, 4, 3, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37302() {
        int[] input = {5, 1, 7, 0, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37303() {
        int[] input = {5, 7, 1, 0, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 1, 5, 7, 5, 1, 4, 3, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37304() {
        int[] input = {7, 5, 1, 0, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37305() {
        int[] input = {7, 5, 1, 0, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 1, 5, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37306() {
        int[] input = {5, 7, 1, 0, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 1, 5, 7, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37307() {
        int[] input = {5, 1, 7, 0, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 6, 3, 4, 2, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37308() {
        int[] input = {5, 1, 0, 7, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 4, 1, 5, 7, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37309() {
        int[] input = {5, 1, 0, 3, 7, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 3, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37310() {
        int[] input = {5, 1, 0, 3, 4, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 3, 4, 2, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37311() {
        int[] input = {5, 1, 0, 3, 4, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 1, 5, 6, 5, 1, 7, 2, 4, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37312() {
        int[] input = {5, 1, 0, 3, 4, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 7, 4, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37313() {
        int[] input = {5, 1, 0, 3, 6, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 3, 1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37314() {
        int[] input = {5, 1, 0, 3, 6, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 6, 4, 2, 7, 6, 4, 2, 5, 3, 4, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37315() {
        int[] input = {5, 1, 0, 3, 6, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 3, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37316() {
        int[] input = {5, 1, 0, 3, 7, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37317() {
        int[] input = {5, 1, 0, 7, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 3, 6, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37318() {
        int[] input = {5, 1, 7, 0, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 6, 2, 4, 1, 3, 2, 6, 5, 3, 1, 4, 6, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37319() {
        int[] input = {5, 7, 1, 0, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 7, 3, 4, 2, 1, 6, 4, 2, 1, 6, 7, 5, 3, 2, 1, 6, 7, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37320() {
        int[] input = {7, 5, 1, 0, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 2, 4, 5, 1, 7, 6, 7, 1, 3, 2, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37321() {
        int[] input = {7, 5, 1, 0, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37322() {
        int[] input = {5, 7, 1, 0, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37323() {
        int[] input = {5, 1, 7, 0, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 3, 2, 4, 1, 5, 3, 2, 6, 5, 3, 7, 2, 7, 3, 1, 4, 6, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37324() {
        int[] input = {5, 1, 0, 7, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37325() {
        int[] input = {5, 1, 0, 6, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 4, 2, 7, 3, 5, 1, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37326() {
        int[] input = {5, 1, 0, 6, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 1, 5, 6, 5, 1, 2, 4, 3, 5, 6, 1, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37327() {
        int[] input = {5, 1, 0, 6, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37328() {
        int[] input = {5, 1, 0, 6, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37329() {
        int[] input = {5, 1, 6, 0, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37330() {
        int[] input = {5, 1, 6, 0, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 5, 1, 7, 2, 4, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37331() {
        int[] input = {5, 1, 6, 0, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37332() {
        int[] input = {5, 1, 6, 0, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 3, 7, 1, 5, 6, 3, 6, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37333() {
        int[] input = {5, 1, 6, 7, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 6, 3, 7, 1, 5, 6, 3, 6, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37334() {
        int[] input = {5, 1, 7, 6, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 7, 3, 2, 4, 1, 5, 3, 2, 6, 5, 3, 7, 2, 7, 3, 1, 4, 6, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37335() {
        int[] input = {5, 7, 1, 6, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37336() {
        int[] input = {7, 5, 1, 6, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 7, 5, 6, 3, 1, 7, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37337() {
        int[] input = {7, 5, 6, 1, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 1, 3, 2, 6, 5, 3, 1, 4, 6, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37338() {
        int[] input = {5, 7, 6, 1, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 1, 7, 6, 2, 4, 1, 7, 6, 5, 2, 4, 1, 7, 6, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37339() {
        int[] input = {5, 6, 7, 1, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37340() {
        int[] input = {5, 6, 1, 7, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 6, 7, 3, 1, 2, 4, 3, 1, 2, 6, 5, 7, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37341() {
        int[] input = {5, 6, 1, 0, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 1, 6, 7, 3, 1, 2, 4, 3, 1, 2, 6, 5, 7, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37342() {
        int[] input = {5, 6, 1, 0, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 5, 6, 5, 1, 2, 4, 3, 5, 6, 1, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37343() {
        int[] input = {5, 6, 1, 0, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37344() {
        int[] input = {5, 6, 1, 0, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37345() {
        int[] input = {6, 5, 1, 0, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 1, 6, 5, 6, 1, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37346() {
        int[] input = {6, 5, 1, 0, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37347() {
        int[] input = {6, 5, 1, 0, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 6, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37348() {
        int[] input = {6, 5, 1, 0, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 7, 5, 4, 2, 7, 5, 4, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37349() {
        int[] input = {6, 5, 1, 7, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 6, 5, 7, 3, 1, 2, 4, 3, 1, 2, 6, 5, 7, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37350() {
        int[] input = {6, 5, 7, 1, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 5, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37351() {
        int[] input = {6, 7, 5, 1, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 1, 7, 6, 5, 2, 4, 1, 7, 6, 5, 2, 4, 1, 7, 6, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37352() {
        int[] input = {7, 6, 5, 1, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 7, 6, 1, 3, 7, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37353() {
        int[] input = {7, 6, 1, 5, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37354() {
        int[] input = {6, 7, 1, 5, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 6, 7, 6, 1, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37355() {
        int[] input = {6, 1, 7, 5, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 1, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37356() {
        int[] input = {6, 1, 5, 7, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 3, 7, 1, 5, 6, 3, 6, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37357() {
        int[] input = {6, 1, 5, 0, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 7, 1, 5, 6, 3, 6, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37358() {
        int[] input = {6, 1, 5, 0, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37359() {
        int[] input = {6, 1, 5, 0, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37360() {
        int[] input = {6, 1, 5, 0, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 1, 2, 7, 3, 1, 2, 5, 6, 4, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37361() {
        int[] input = {1, 6, 5, 0, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37362() {
        int[] input = {1, 6, 5, 0, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37363() {
        int[] input = {1, 6, 5, 0, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 1, 6, 1, 5, 7, 3, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37364() {
        int[] input = {1, 6, 5, 0, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 7, 6, 4, 2, 7, 3, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37365() {
        int[] input = {1, 6, 5, 7, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 7, 4, 2, 5, 6, 7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37366() {
        int[] input = {1, 6, 7, 5, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37367() {
        int[] input = {1, 7, 6, 5, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 6, 1, 7, 5, 3, 1, 6, 7, 6, 1, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37368() {
        int[] input = {7, 1, 6, 5, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 6, 7, 1, 5, 3, 7, 6, 1, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37369() {
        int[] input = {7, 1, 5, 6, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 3, 2, 4, 1, 5, 3, 2, 6, 5, 3, 7, 2, 7, 3, 1, 4, 6, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37370() {
        int[] input = {1, 7, 5, 6, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37371() {
        int[] input = {1, 5, 7, 6, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 3, 2, 4, 5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37372() {
        int[] input = {1, 5, 6, 7, 0, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 6, 1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37373() {
        int[] input = {1, 5, 6, 0, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 6, 1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37374() {
        int[] input = {1, 5, 6, 0, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37375() {
        int[] input = {1, 5, 6, 0, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 1, 5, 3, 4, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37376() {
        int[] input = {1, 5, 6, 0, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37377() {
        int[] input = {1, 5, 0, 6, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37378() {
        int[] input = {1, 5, 0, 6, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37379() {
        int[] input = {1, 5, 0, 6, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 3, 7, 1, 5, 6, 5, 1, 2, 4, 3, 5, 6, 1, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37380() {
        int[] input = {1, 5, 0, 6, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 4, 2, 7, 3, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37381() {
        int[] input = {1, 5, 0, 7, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37382() {
        int[] input = {1, 5, 7, 0, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 2, 4, 5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37383() {
        int[] input = {1, 7, 5, 0, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37384() {
        int[] input = {7, 1, 5, 0, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 4, 1, 5, 3, 2, 6, 5, 3, 7, 2, 7, 3, 1, 4, 6, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37385() {
        int[] input = {7, 1, 5, 0, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 4, 1, 3, 2, 6, 5, 3, 1, 4, 6, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37386() {
        int[] input = {1, 7, 5, 0, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 5, 1, 7, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37387() {
        int[] input = {1, 5, 7, 0, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 6, 2, 4, 5, 1, 7, 6, 7, 1, 3, 2, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37388() {
        int[] input = {1, 5, 0, 7, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 2, 6, 5, 1, 7, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37389() {
        int[] input = {1, 5, 0, 3, 7, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37390() {
        int[] input = {1, 5, 0, 3, 6, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 7, 2, 4, 3, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37391() {
        int[] input = {1, 5, 0, 3, 6, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 4, 2, 7, 6, 4, 2, 5, 3, 4, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37392() {
        int[] input = {1, 5, 0, 3, 6, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 6, 3, 1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37393() {
        int[] input = {1, 5, 0, 3, 4, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 7, 4, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37394() {
        int[] input = {1, 5, 0, 3, 4, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 6, 5, 1, 3, 4, 6, 5, 2, 7, 6, 4, 1, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37395() {
        int[] input = {1, 5, 0, 3, 4, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 6, 2, 4, 3, 6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37396() {
        int[] input = {1, 5, 0, 3, 7, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 2, 6, 3, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37397() {
        int[] input = {1, 5, 0, 7, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 3, 4, 1, 5, 7, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37398() {
        int[] input = {1, 5, 7, 0, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 3, 6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37399() {
        int[] input = {1, 7, 5, 0, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 1, 7, 3, 4, 1, 5, 7, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37400() {
        int[] input = {7, 1, 5, 0, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 6, 1, 5, 7, 4, 7, 5, 3, 2, 7, 4, 5, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37401() {
        int[] input = {7, 1, 5, 0, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37402() {
        int[] input = {1, 7, 5, 0, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 1, 7, 1, 5, 4, 3, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37403() {
        int[] input = {1, 5, 7, 0, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37404() {
        int[] input = {1, 5, 0, 7, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 3, 4, 1, 5, 7, 5, 1, 4, 3, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37405() {
        int[] input = {1, 5, 0, 3, 7, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 2, 6, 7, 4, 5, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37406() {
        int[] input = {1, 5, 0, 3, 4, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37407() {
        int[] input = {1, 5, 0, 3, 4, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 7, 6, 2, 1, 5, 3, 7, 4, 1, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37408() {
        int[] input = {1, 5, 0, 3, 4, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 2, 5, 3, 4, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37409() {
        int[] input = {1, 0, 5, 3, 4, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 5, 3, 4, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37410() {
        int[] input = {1, 0, 5, 3, 4, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 7, 6, 2, 1, 5, 3, 7, 4, 1, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37411() {
        int[] input = {1, 0, 5, 3, 4, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37412() {
        int[] input = {1, 0, 5, 3, 7, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 3, 2, 6, 7, 4, 5, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37413() {
        int[] input = {1, 0, 5, 7, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 5, 1, 7, 1, 5, 4, 3, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37414() {
        int[] input = {1, 0, 7, 5, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37415() {
        int[] input = {1, 7, 0, 5, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37416() {
        int[] input = {7, 1, 0, 5, 3, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37417() {
        int[] input = {7, 1, 0, 5, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 4, 1, 5, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37418() {
        int[] input = {1, 7, 0, 5, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 4, 1, 5, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37419() {
        int[] input = {1, 0, 7, 5, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 2, 4, 3, 6, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37420() {
        int[] input = {1, 0, 5, 7, 3, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 7, 3, 4, 1, 5, 7, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37421() {
        int[] input = {1, 0, 5, 3, 7, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 6, 3, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37422() {
        int[] input = {1, 0, 5, 3, 4, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 6, 3, 4, 2, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37423() {
        int[] input = {1, 0, 5, 3, 4, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 6, 5, 1, 3, 4, 6, 5, 2, 7, 6, 4, 1, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37424() {
        int[] input = {1, 0, 5, 3, 4, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 4, 3, 2, 7, 4, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37425() {
        int[] input = {1, 0, 5, 3, 6, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 6, 3, 1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37426() {
        int[] input = {1, 0, 5, 3, 6, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 2, 7, 6, 4, 2, 5, 3, 4, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37427() {
        int[] input = {1, 0, 5, 3, 6, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 4, 3, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37428() {
        int[] input = {1, 0, 5, 3, 7, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37429() {
        int[] input = {1, 0, 5, 7, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 6, 5, 1, 7, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37430() {
        int[] input = {1, 0, 7, 5, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 2, 4, 5, 1, 7, 6, 7, 1, 3, 2, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37431() {
        int[] input = {1, 7, 0, 5, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 6, 2, 4, 5, 1, 7, 6, 7, 1, 3, 2, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37432() {
        int[] input = {7, 1, 0, 5, 3, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 5, 1, 7, 6, 7, 1, 3, 2, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37433() {
        int[] input = {7, 1, 0, 5, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 3, 2, 4, 5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37434() {
        int[] input = {1, 7, 0, 5, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37435() {
        int[] input = {1, 0, 7, 5, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 4, 5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37436() {
        int[] input = {1, 0, 5, 7, 6, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37437() {
        int[] input = {1, 0, 5, 6, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 6, 4, 2, 7, 3, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37438() {
        int[] input = {1, 0, 5, 6, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 6, 3, 7, 1, 5, 6, 5, 1, 2, 4, 3, 5, 6, 1, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37439() {
        int[] input = {1, 0, 5, 6, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37440() {
        int[] input = {1, 0, 5, 6, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 7, 4, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37441() {
        int[] input = {1, 0, 6, 5, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37442() {
        int[] input = {1, 0, 6, 5, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 3, 4, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37443() {
        int[] input = {1, 0, 6, 5, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37444() {
        int[] input = {1, 0, 6, 5, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 5, 4, 2, 7, 5, 4, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37445() {
        int[] input = {1, 0, 6, 7, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 7, 5, 3, 1, 6, 7, 6, 1, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37446() {
        int[] input = {1, 0, 7, 6, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 6, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37447() {
        int[] input = {1, 7, 0, 6, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37448() {
        int[] input = {7, 1, 0, 6, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 3, 5, 6, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37449() {
        int[] input = {7, 1, 6, 0, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 7, 1, 5, 3, 7, 6, 1, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37450() {
        int[] input = {1, 7, 6, 0, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 1, 7, 5, 3, 1, 6, 7, 6, 1, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37451() {
        int[] input = {1, 6, 7, 0, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 5, 6, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37452() {
        int[] input = {1, 6, 0, 7, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 3, 1, 6, 7, 6, 1, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37453() {
        int[] input = {1, 6, 0, 5, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 4, 2, 7, 5, 4, 2, 7, 5, 3, 1, 6, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37454() {
        int[] input = {1, 6, 0, 5, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37455() {
        int[] input = {1, 6, 0, 5, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 4, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37456() {
        int[] input = {1, 6, 0, 5, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37457() {
        int[] input = {6, 1, 0, 5, 3, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37458() {
        int[] input = {6, 1, 0, 5, 3, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 4, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37459() {
        int[] input = {6, 1, 0, 5, 3, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37460() {
        int[] input = {6, 1, 0, 5, 7, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 4, 2, 7, 5, 4, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37461() {
        int[] input = {6, 1, 0, 7, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 1, 6, 7, 6, 1, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37462() {
        int[] input = {6, 1, 7, 0, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 6, 1, 5, 3, 7, 6, 5, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37463() {
        int[] input = {6, 7, 1, 0, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 1, 6, 7, 6, 1, 2, 4, 5, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37464() {
        int[] input = {7, 6, 1, 0, 5, 3, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 3, 5, 6, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37465() {
        int[] input = {7, 6, 1, 0, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 3, 6, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37466() {
        int[] input = {6, 7, 1, 0, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 1, 7, 3, 5, 1, 7, 6, 3, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37467() {
        int[] input = {6, 1, 7, 0, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 4, 1, 7, 6, 5, 2, 4, 1, 7, 6, 5, 2, 4, 1, 7, 6, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37468() {
        int[] input = {6, 1, 0, 7, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 2, 5, 6, 7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37469() {
        int[] input = {6, 1, 0, 3, 7, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37470() {
        int[] input = {6, 1, 0, 3, 5, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 5, 7, 6, 1, 3, 5, 4, 2, 6, 1, 3, 5, 3, 1, 7, 4, 3, 5, 1, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37471() {
        int[] input = {6, 1, 0, 3, 5, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 1, 4, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37472() {
        int[] input = {6, 1, 0, 3, 5, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 7, 4, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37473() {
        int[] input = {1, 6, 0, 3, 5, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 2, 7, 4, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37474() {
        int[] input = {1, 6, 0, 3, 5, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 6, 1, 4, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37475() {
        int[] input = {1, 6, 0, 3, 5, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 7, 6, 1, 3, 5, 4, 2, 6, 1, 3, 5, 3, 1, 7, 4, 3, 5, 1, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37476() {
        int[] input = {1, 6, 0, 3, 7, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 7, 3, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37477() {
        int[] input = {1, 6, 0, 7, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 2, 5, 6, 7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37478() {
        int[] input = {1, 6, 7, 0, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 3, 6, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37479() {
        int[] input = {1, 7, 6, 0, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 6, 7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37480() {
        int[] input = {7, 1, 6, 0, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37481() {
        int[] input = {7, 1, 0, 6, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 5, 3, 6, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37482() {
        int[] input = {1, 7, 0, 6, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37483() {
        int[] input = {1, 0, 7, 6, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 3, 6, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37484() {
        int[] input = {1, 0, 6, 7, 3, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 5, 6, 7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37485() {
        int[] input = {1, 0, 6, 3, 7, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 3, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37486() {
        int[] input = {1, 0, 6, 3, 5, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 6, 1, 3, 5, 4, 2, 6, 1, 3, 5, 3, 1, 7, 4, 3, 5, 1, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37487() {
        int[] input = {1, 0, 6, 3, 5, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 3, 6, 1, 4, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37488() {
        int[] input = {1, 0, 6, 3, 5, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 2, 7, 4, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37489() {
        int[] input = {1, 0, 3, 6, 5, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37490() {
        int[] input = {1, 0, 3, 6, 5, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 2, 7, 6, 5, 2, 4, 1, 5, 2, 4, 1, 3, 5, 3, 1, 4, 2, 3, 5, 1, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37491() {
        int[] input = {1, 0, 3, 6, 5, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 7, 5, 4, 2, 7, 5, 3, 1, 6, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37492() {
        int[] input = {1, 0, 3, 6, 7, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 4, 6, 3, 1, 5, 2, 4, 6, 3, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37493() {
        int[] input = {1, 0, 3, 7, 6, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37494() {
        int[] input = {1, 0, 7, 3, 6, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 3, 6, 5, 1, 7, 3, 7, 1, 5, 6, 7, 3, 1, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37495() {
        int[] input = {1, 7, 0, 3, 6, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 5, 6, 7, 3, 1, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37496() {
        int[] input = {7, 1, 0, 3, 6, 5, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 6, 5, 1, 7, 3, 7, 1, 5, 6, 7, 3, 1, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37497() {
        int[] input = {7, 1, 0, 3, 5, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 4, 2, 6, 7, 3, 4, 2, 6, 7, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37498() {
        int[] input = {1, 7, 0, 3, 5, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 2, 6, 7, 3, 4, 2, 6, 7, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37499() {
        int[] input = {1, 0, 7, 3, 5, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 6, 7, 3, 4, 2, 6, 7, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37500() {
        int[] input = {1, 0, 3, 7, 5, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 2, 4, 5, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37501() {
        int[] input = {1, 0, 3, 5, 7, 6, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 6, 3, 1, 5, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37502() {
        int[] input = {1, 0, 3, 5, 6, 7, 4, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 7, 3, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37503() {
        int[] input = {1, 0, 3, 5, 6, 4, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 6, 5, 1, 3, 4, 3, 1, 5, 6, 3, 4, 1, 5, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37504() {
        int[] input = {1, 0, 3, 5, 6, 4, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 1, 5, 2, 7, 4, 1, 5, 2, 6, 1, 4, 7, 6, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37505() {
        int[] input = {1, 0, 3, 5, 4, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 3, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37506() {
        int[] input = {1, 0, 3, 5, 4, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 3, 1, 5, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37507() {
        int[] input = {1, 0, 3, 5, 4, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37508() {
        int[] input = {1, 0, 3, 5, 7, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 6, 5, 3, 4, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37509() {
        int[] input = {1, 0, 3, 7, 5, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 7, 3, 1, 4, 5, 2, 6, 3, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37510() {
        int[] input = {1, 0, 7, 3, 5, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 6, 3, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37511() {
        int[] input = {1, 7, 0, 3, 5, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 2, 6, 3, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37512() {
        int[] input = {7, 1, 0, 3, 5, 4, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 3, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37513() {
        int[] input = {7, 1, 0, 3, 5, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 4, 5, 3, 7, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37514() {
        int[] input = {1, 7, 0, 3, 5, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 7, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37515() {
        int[] input = {1, 0, 7, 3, 5, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 3, 7, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37516() {
        int[] input = {1, 0, 3, 7, 5, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 5, 7, 1, 3, 4, 3, 1, 7, 5, 3, 4, 1, 4, 3, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37517() {
        int[] input = {1, 0, 3, 5, 7, 4, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 7, 5, 1, 3, 4, 3, 1, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37518() {
        int[] input = {1, 0, 3, 5, 4, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 3, 1, 5, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37519() {
        int[] input = {1, 0, 3, 5, 4, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 3, 5, 4, 7, 6, 3, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37520() {
        int[] input = {1, 0, 3, 5, 4, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 4, 5, 1, 2, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37521() {
        int[] input = {1, 0, 3, 4, 5, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37522() {
        int[] input = {1, 0, 3, 4, 5, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 4, 3, 1, 2, 6, 5, 3, 1, 2, 6, 2, 1, 4, 7, 5, 2, 6, 1, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37523() {
        int[] input = {1, 0, 3, 4, 5, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 7, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37524() {
        int[] input = {1, 0, 3, 4, 7, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37525() {
        int[] input = {1, 0, 3, 7, 4, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 1, 7, 2, 6, 5, 1, 7, 2, 4, 1, 5, 6, 4, 1, 5, 7, 3, 2, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37526() {
        int[] input = {1, 0, 7, 3, 4, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 3, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37527() {
        int[] input = {1, 7, 0, 3, 4, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 4, 3, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37528() {
        int[] input = {7, 1, 0, 3, 4, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37529() {
        int[] input = {7, 1, 0, 3, 4, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37530() {
        int[] input = {1, 7, 0, 3, 4, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37531() {
        int[] input = {1, 0, 7, 3, 4, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37532() {
        int[] input = {1, 0, 3, 7, 4, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 7, 3, 1, 5, 4, 2, 6, 3, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37533() {
        int[] input = {1, 0, 3, 4, 7, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 5, 3, 4, 6, 2, 5, 3, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37534() {
        int[] input = {1, 0, 3, 4, 5, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 1, 4, 5, 7, 1, 3, 4, 3, 1, 2, 6, 5, 3, 4, 1, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37535() {
        int[] input = {1, 0, 3, 4, 5, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 6, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37536() {
        int[] input = {1, 0, 3, 4, 5, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 6, 5, 4, 1, 3, 6, 3, 1, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37537() {
        int[] input = {1, 0, 3, 4, 6, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 3, 1, 4, 1, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37538() {
        int[] input = {1, 0, 3, 4, 6, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37539() {
        int[] input = {1, 0, 3, 4, 6, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 3, 1, 4, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37540() {
        int[] input = {1, 0, 3, 4, 7, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37541() {
        int[] input = {1, 0, 3, 7, 4, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 6, 3, 7, 5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37542() {
        int[] input = {1, 0, 7, 3, 4, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 6, 7, 1, 3, 5, 4, 7, 1, 3, 5, 3, 1, 7, 4, 3, 5, 1, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37543() {
        int[] input = {1, 7, 0, 3, 4, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 2, 6, 7, 1, 3, 5, 4, 7, 1, 3, 5, 3, 1, 7, 4, 3, 5, 1, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37544() {
        int[] input = {7, 1, 0, 3, 4, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 5, 2, 6, 7, 1, 3, 5, 4, 7, 1, 3, 5, 3, 1, 7, 4, 3, 5, 1, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37545() {
        int[] input = {7, 1, 0, 3, 6, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37546() {
        int[] input = {1, 7, 0, 3, 6, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37547() {
        int[] input = {1, 0, 7, 3, 6, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37548() {
        int[] input = {1, 0, 3, 7, 6, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 4, 3, 1, 7, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37549() {
        int[] input = {1, 0, 3, 6, 7, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37550() {
        int[] input = {1, 0, 3, 6, 4, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 4, 6, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37551() {
        int[] input = {1, 0, 3, 6, 4, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 2, 7, 6, 1, 3, 5, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37552() {
        int[] input = {1, 0, 3, 6, 4, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 7, 5, 3, 1, 6, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37553() {
        int[] input = {1, 0, 6, 3, 4, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 4, 3, 2, 7, 4, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37554() {
        int[] input = {1, 0, 6, 3, 4, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 4, 3, 6, 5, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37555() {
        int[] input = {1, 0, 6, 3, 4, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 7, 2, 5, 4, 7, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37556() {
        int[] input = {1, 0, 6, 3, 7, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 7, 4, 1, 6, 3, 6, 1, 2, 5, 7, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37557() {
        int[] input = {1, 0, 6, 7, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 2, 5, 7, 1, 6, 4, 6, 1, 3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37558() {
        int[] input = {1, 0, 7, 6, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 6, 5, 2, 4, 1, 6, 5, 3, 1, 4, 2, 3, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37559() {
        int[] input = {1, 7, 0, 6, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 5, 2, 4, 1, 6, 5, 3, 1, 4, 2, 3, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37560() {
        int[] input = {7, 1, 0, 6, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 2, 4, 1, 6, 5, 3, 1, 4, 2, 3, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37561() {
        int[] input = {7, 1, 6, 0, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 3, 1, 7, 4, 3, 2, 5, 7, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37562() {
        int[] input = {1, 7, 6, 0, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 4, 2, 5, 7, 1, 6, 4, 6, 1, 3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37563() {
        int[] input = {1, 6, 7, 0, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 1, 6, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 7, 2, 5, 4, 7, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37564() {
        int[] input = {1, 6, 0, 7, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 2, 5, 7, 1, 6, 4, 6, 1, 3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37565() {
        int[] input = {1, 6, 0, 3, 7, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 4, 1, 6, 3, 6, 1, 2, 5, 7, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37566() {
        int[] input = {1, 6, 0, 3, 4, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 7, 2, 5, 4, 7, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37567() {
        int[] input = {1, 6, 0, 3, 4, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 6, 5, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37568() {
        int[] input = {1, 6, 0, 3, 4, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 2, 7, 4, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37569() {
        int[] input = {6, 1, 0, 3, 4, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 5, 4, 3, 2, 7, 4, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37570() {
        int[] input = {6, 1, 0, 3, 4, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 5, 4, 3, 6, 5, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37571() {
        int[] input = {6, 1, 0, 3, 4, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 7, 2, 5, 4, 7, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37572() {
        int[] input = {6, 1, 0, 3, 7, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 4, 1, 6, 3, 6, 1, 2, 5, 7, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37573() {
        int[] input = {6, 1, 0, 7, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 7, 1, 6, 4, 6, 1, 3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37574() {
        int[] input = {6, 1, 7, 0, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 3, 1, 7, 4, 3, 2, 5, 7, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37575() {
        int[] input = {6, 7, 1, 0, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 2, 5, 7, 1, 6, 4, 6, 1, 3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37576() {
        int[] input = {7, 6, 1, 0, 3, 4, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 1, 6, 5, 3, 1, 4, 2, 3, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37577() {
        int[] input = {7, 6, 1, 0, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 4, 1, 7, 6, 2, 3, 1, 7, 6, 2, 3, 1, 7, 6, 3, 1, 5, 4, 6, 3, 2, 1, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37578() {
        int[] input = {6, 7, 1, 0, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 3, 7, 2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37579() {
        int[] input = {6, 1, 7, 0, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 5, 2, 1, 3, 5, 4, 6, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37580() {
        int[] input = {6, 1, 0, 7, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37581() {
        int[] input = {6, 1, 0, 3, 7, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37582() {
        int[] input = {6, 1, 0, 3, 4, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 1, 6, 7, 4, 5, 2, 1, 3, 5, 4, 6, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37583() {
        int[] input = {6, 1, 0, 3, 4, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 2, 1, 6, 3, 6, 1, 2, 4, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37584() {
        int[] input = {6, 1, 0, 3, 4, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 1, 6, 2, 4, 3, 1, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37585() {
        int[] input = {1, 6, 0, 3, 4, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 4, 3, 1, 6, 2, 4, 3, 1, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37586() {
        int[] input = {1, 6, 0, 3, 4, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 4, 2, 1, 6, 3, 6, 1, 2, 4, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37587() {
        int[] input = {1, 6, 0, 3, 4, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 5, 4, 7, 6, 2, 3, 7, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37588() {
        int[] input = {1, 6, 0, 3, 7, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37589() {
        int[] input = {1, 6, 0, 7, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 2, 5, 3, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37590() {
        int[] input = {1, 6, 7, 0, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 4, 7, 6, 2, 3, 7, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37591() {
        int[] input = {1, 7, 6, 0, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 4, 3, 7, 2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37592() {
        int[] input = {7, 1, 6, 0, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 2, 1, 3, 5, 4, 6, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37593() {
        int[] input = {7, 1, 0, 6, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37594() {
        int[] input = {1, 7, 0, 6, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 5, 4, 7, 6, 2, 3, 7, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37595() {
        int[] input = {1, 0, 7, 6, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 4, 7, 6, 2, 3, 7, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37596() {
        int[] input = {1, 0, 6, 7, 3, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 3, 7, 2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37597() {
        int[] input = {1, 0, 6, 3, 7, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37598() {
        int[] input = {1, 0, 6, 3, 4, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 3, 1, 6, 7, 4, 5, 2, 1, 3, 5, 4, 6, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37599() {
        int[] input = {1, 0, 6, 3, 4, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 4, 2, 1, 6, 3, 6, 1, 2, 4, 6, 1, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37600() {
        int[] input = {1, 0, 6, 3, 4, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 4, 3, 1, 6, 2, 4, 3, 1, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37601() {
        int[] input = {1, 0, 3, 6, 4, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 3, 1, 6, 4, 5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37602() {
        int[] input = {1, 0, 3, 6, 4, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37603() {
        int[] input = {1, 0, 3, 6, 4, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 4, 6, 1, 7, 4, 6, 1, 2, 5, 6, 1, 2, 7, 3, 4, 1, 2, 7, 3, 4, 1, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37604() {
        int[] input = {1, 0, 3, 6, 7, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 6, 3, 1, 4, 7, 6, 3, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37605() {
        int[] input = {1, 0, 3, 7, 6, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 5, 4, 3, 1, 7, 2, 6, 3, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37606() {
        int[] input = {1, 0, 7, 3, 6, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 3, 1, 7, 4, 7, 1, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37607() {
        int[] input = {1, 7, 0, 3, 6, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 6, 3, 1, 7, 4, 7, 1, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37608() {
        int[] input = {7, 1, 0, 3, 6, 4, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 3, 1, 7, 4, 7, 1, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37609() {
        int[] input = {7, 1, 0, 3, 4, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 7, 3, 1, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37610() {
        int[] input = {1, 7, 0, 3, 4, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 7, 3, 1, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37611() {
        int[] input = {1, 0, 7, 3, 4, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 7, 3, 1, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37612() {
        int[] input = {1, 0, 3, 7, 4, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 7, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37613() {
        int[] input = {1, 0, 3, 4, 7, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 5, 2, 7, 6, 5, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37614() {
        int[] input = {1, 0, 3, 4, 6, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 6, 4, 1, 3, 7, 3, 1, 2, 5, 6, 3, 7, 1, 2, 4, 3, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37615() {
        int[] input = {1, 0, 3, 4, 6, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 5, 7, 6, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37616() {
        int[] input = {1, 0, 3, 4, 6, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 3, 4, 6, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37617() {
        int[] input = {1, 0, 3, 4, 2, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 1, 4, 2, 6, 1, 3, 4, 2, 6, 1, 3, 4, 2, 6, 5, 7, 3, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37618() {
        int[] input = {1, 0, 3, 4, 2, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 3, 1, 4, 1, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37619() {
        int[] input = {1, 0, 3, 4, 2, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 6, 4, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37620() {
        int[] input = {1, 0, 3, 4, 7, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 2, 3, 1, 4, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37621() {
        int[] input = {1, 0, 3, 7, 4, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 1, 7, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37622() {
        int[] input = {1, 0, 7, 3, 4, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 5, 6, 4, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37623() {
        int[] input = {1, 7, 0, 3, 4, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 2, 5, 6, 4, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37624() {
        int[] input = {7, 1, 0, 3, 4, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 4, 2, 5, 6, 4, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37625() {
        int[] input = {7, 1, 0, 3, 4, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 4, 2, 7, 1, 3, 4, 5, 6, 7, 2, 5, 4, 1, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37626() {
        int[] input = {1, 7, 0, 3, 4, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 2, 7, 1, 3, 4, 5, 6, 7, 2, 5, 4, 1, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37627() {
        int[] input = {1, 0, 7, 3, 4, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 7, 1, 3, 4, 5, 6, 7, 2, 5, 4, 1, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37628() {
        int[] input = {1, 0, 3, 7, 4, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 7, 4, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37629() {
        int[] input = {1, 0, 3, 4, 7, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 1, 4, 7, 2, 1, 3, 4, 3, 1, 2, 7, 3, 4, 1, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37630() {
        int[] input = {1, 0, 3, 4, 2, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 7, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37631() {
        int[] input = {1, 0, 3, 4, 2, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 6, 7, 4, 1, 3, 5, 3, 1, 2, 6, 3, 5, 1, 2, 4, 7, 3, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37632() {
        int[] input = {1, 0, 3, 4, 2, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37633() {
        int[] input = {1, 0, 4, 3, 2, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 3, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37634() {
        int[] input = {1, 0, 4, 3, 2, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 3, 1, 4, 5, 2, 3, 1, 7, 6, 3, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37635() {
        int[] input = {1, 0, 4, 3, 2, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 7, 4, 1, 3, 5, 2, 4, 1, 3, 5, 3, 1, 4, 2, 3, 5, 1, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37636() {
        int[] input = {1, 0, 4, 3, 7, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37637() {
        int[] input = {1, 0, 4, 7, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 7, 1, 4, 2, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37638() {
        int[] input = {1, 0, 7, 4, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37639() {
        int[] input = {1, 7, 0, 4, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37640() {
        int[] input = {7, 1, 0, 4, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37641() {
        int[] input = {7, 1, 0, 4, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 4, 1, 7, 2, 7, 1, 3, 5, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37642() {
        int[] input = {1, 7, 0, 4, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 7, 1, 4, 3, 2, 7, 1, 4, 3, 4, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37643() {
        int[] input = {1, 0, 7, 4, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 1, 4, 3, 2, 7, 1, 4, 3, 4, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37644() {
        int[] input = {1, 0, 4, 7, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 7, 1, 4, 2, 4, 1, 6, 5, 3, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37645() {
        int[] input = {1, 0, 4, 3, 7, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 4, 1, 2, 7, 5, 6, 4, 3, 5, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37646() {
        int[] input = {1, 0, 4, 3, 2, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 2, 7, 1, 4, 3, 4, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37647() {
        int[] input = {1, 0, 4, 3, 2, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37648() {
        int[] input = {1, 0, 4, 3, 2, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 3, 1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37649() {
        int[] input = {1, 0, 4, 3, 6, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 5, 7, 2, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37650() {
        int[] input = {1, 0, 4, 3, 6, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 6, 3, 1, 4, 2, 6, 3, 1, 4, 6, 3, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37651() {
        int[] input = {1, 0, 4, 3, 6, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 6, 3, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37652() {
        int[] input = {1, 0, 4, 3, 7, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 7, 3, 1, 4, 6, 4, 1, 3, 7, 4, 6, 1, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37653() {
        int[] input = {1, 0, 4, 7, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 5, 6, 3, 2, 7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37654() {
        int[] input = {1, 0, 7, 4, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37655() {
        int[] input = {1, 7, 0, 4, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37656() {
        int[] input = {7, 1, 0, 4, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37657() {
        int[] input = {7, 1, 0, 4, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 3, 5, 2, 4, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37658() {
        int[] input = {1, 7, 0, 4, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 4, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37659() {
        int[] input = {1, 0, 7, 4, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 2, 4, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37660() {
        int[] input = {1, 0, 4, 7, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 5, 2, 7, 6, 5, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37661() {
        int[] input = {1, 0, 4, 6, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 3, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37662() {
        int[] input = {1, 0, 4, 6, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 7, 4, 6, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37663() {
        int[] input = {1, 0, 4, 6, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 6, 3, 2, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37664() {
        int[] input = {1, 0, 4, 6, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 2, 3, 5, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37665() {
        int[] input = {1, 0, 6, 4, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 1, 4, 1, 6, 2, 3, 1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37666() {
        int[] input = {1, 0, 6, 4, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37667() {
        int[] input = {1, 0, 6, 4, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37668() {
        int[] input = {1, 0, 6, 4, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 5, 2, 4, 1, 3, 5, 7, 1, 3, 6, 5, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37669() {
        int[] input = {1, 0, 6, 7, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37670() {
        int[] input = {1, 0, 7, 6, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 6, 2, 5, 3, 1, 6, 2, 4, 1, 6, 7, 2, 7, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37671() {
        int[] input = {1, 7, 0, 6, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 2, 5, 3, 1, 6, 2, 4, 1, 6, 7, 2, 7, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37672() {
        int[] input = {7, 1, 0, 6, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 5, 3, 1, 6, 2, 4, 1, 6, 7, 2, 7, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37673() {
        int[] input = {7, 1, 6, 0, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37674() {
        int[] input = {1, 7, 6, 0, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37675() {
        int[] input = {1, 6, 7, 0, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 1, 6, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37676() {
        int[] input = {1, 6, 0, 7, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37677() {
        int[] input = {1, 6, 0, 4, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 5, 2, 4, 1, 3, 5, 7, 1, 3, 6, 5, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37678() {
        int[] input = {1, 6, 0, 4, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37679() {
        int[] input = {1, 6, 0, 4, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37680() {
        int[] input = {1, 6, 0, 4, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 6, 1, 4, 1, 6, 2, 3, 1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37681() {
        int[] input = {6, 1, 0, 4, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 1, 2, 3, 4, 1, 5, 7, 4, 1, 5, 2, 6, 3, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37682() {
        int[] input = {6, 1, 0, 4, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37683() {
        int[] input = {6, 1, 0, 4, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37684() {
        int[] input = {6, 1, 0, 4, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 4, 1, 3, 5, 7, 1, 3, 6, 5, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37685() {
        int[] input = {6, 1, 0, 7, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37686() {
        int[] input = {6, 1, 7, 0, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 1, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37687() {
        int[] input = {6, 7, 1, 0, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37688() {
        int[] input = {7, 6, 1, 0, 4, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 1, 6, 2, 4, 1, 6, 7, 2, 7, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37689() {
        int[] input = {7, 6, 1, 0, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37690() {
        int[] input = {6, 7, 1, 0, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37691() {
        int[] input = {6, 1, 7, 0, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 4, 1, 7, 3, 4, 2, 5, 7, 3, 4, 2, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37692() {
        int[] input = {6, 1, 0, 7, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37693() {
        int[] input = {6, 1, 0, 4, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 7, 3, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37694() {
        int[] input = {6, 1, 0, 4, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 5, 4, 1, 7, 2, 3, 1, 4, 5, 3, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37695() {
        int[] input = {6, 1, 0, 4, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37696() {
        int[] input = {6, 1, 0, 4, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 4, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37697() {
        int[] input = {1, 6, 0, 4, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 7, 2, 4, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37698() {
        int[] input = {1, 6, 0, 4, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 3, 4, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37699() {
        int[] input = {1, 6, 0, 4, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 6, 1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37700() {
        int[] input = {1, 6, 0, 4, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 3, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37701() {
        int[] input = {1, 6, 0, 7, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37702() {
        int[] input = {1, 6, 7, 0, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37703() {
        int[] input = {1, 7, 6, 0, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37704() {
        int[] input = {7, 1, 6, 0, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 3, 4, 1, 7, 3, 4, 2, 5, 7, 3, 4, 2, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37705() {
        int[] input = {7, 1, 0, 6, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37706() {
        int[] input = {1, 7, 0, 6, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37707() {
        int[] input = {1, 0, 7, 6, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37708() {
        int[] input = {1, 0, 6, 7, 4, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37709() {
        int[] input = {1, 0, 6, 4, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37710() {
        int[] input = {1, 0, 6, 4, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 5, 4, 1, 7, 2, 3, 1, 4, 5, 3, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37711() {
        int[] input = {1, 0, 6, 4, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37712() {
        int[] input = {1, 0, 6, 4, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 2, 4, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37713() {
        int[] input = {1, 0, 4, 6, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 6, 2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37714() {
        int[] input = {1, 0, 4, 6, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37715() {
        int[] input = {1, 0, 4, 6, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 7, 3, 5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37716() {
        int[] input = {1, 0, 4, 6, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37717() {
        int[] input = {1, 0, 4, 7, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 6, 7, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37718() {
        int[] input = {1, 0, 7, 4, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 6, 4, 1, 3, 6, 4, 1, 3, 7, 6, 4, 1, 3, 7, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37719() {
        int[] input = {1, 7, 0, 4, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 4, 6, 2, 3, 1, 7, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37720() {
        int[] input = {7, 1, 0, 4, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 1, 3, 6, 4, 1, 3, 7, 6, 4, 1, 3, 7, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37721() {
        int[] input = {7, 1, 0, 4, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37722() {
        int[] input = {1, 7, 0, 4, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 3, 6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37723() {
        int[] input = {1, 0, 7, 4, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 3, 6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37724() {
        int[] input = {1, 0, 4, 7, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37725() {
        int[] input = {1, 0, 4, 3, 7, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 4, 1, 3, 7, 5, 2, 4, 1, 3, 7, 3, 1, 6, 5, 3, 7, 1, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37726() {
        int[] input = {1, 0, 4, 3, 6, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 6, 3, 1, 4, 7, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37727() {
        int[] input = {1, 0, 4, 3, 6, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 3, 7, 2, 6, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37728() {
        int[] input = {1, 0, 4, 3, 6, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37729() {
        int[] input = {1, 0, 4, 3, 5, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 3, 2, 7, 5, 6, 4, 2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37730() {
        int[] input = {1, 0, 4, 3, 5, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37731() {
        int[] input = {1, 0, 4, 3, 5, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37732() {
        int[] input = {1, 0, 4, 3, 7, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 6, 3, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37733() {
        int[] input = {1, 0, 4, 7, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 7, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37734() {
        int[] input = {1, 0, 7, 4, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37735() {
        int[] input = {1, 7, 0, 4, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37736() {
        int[] input = {7, 1, 0, 4, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 4, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37737() {
        int[] input = {7, 1, 0, 4, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37738() {
        int[] input = {1, 7, 0, 4, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37739() {
        int[] input = {1, 0, 7, 4, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37740() {
        int[] input = {1, 0, 4, 7, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37741() {
        int[] input = {1, 0, 4, 3, 7, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37742() {
        int[] input = {1, 0, 4, 3, 5, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 5, 2, 3, 1, 4, 5, 2, 3, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37743() {
        int[] input = {1, 0, 4, 3, 5, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 6, 7, 3, 1, 4, 2, 6, 5, 1, 3, 7, 5, 1, 3, 4, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37744() {
        int[] input = {1, 0, 4, 3, 5, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 3, 4, 2, 5, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37745() {
        int[] input = {1, 0, 4, 5, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37746() {
        int[] input = {1, 0, 4, 5, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 3, 2, 1, 5, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37747() {
        int[] input = {1, 0, 4, 5, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 3, 5, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37748() {
        int[] input = {1, 0, 4, 5, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37749() {
        int[] input = {1, 0, 4, 7, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37750() {
        int[] input = {1, 0, 7, 4, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 5, 3, 1, 4, 5, 3, 1, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37751() {
        int[] input = {1, 7, 0, 4, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 5, 3, 1, 4, 5, 3, 1, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37752() {
        int[] input = {7, 1, 0, 4, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 1, 4, 5, 3, 1, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37753() {
        int[] input = {7, 1, 0, 4, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 1, 3, 2, 5, 1, 3, 7, 2, 7, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37754() {
        int[] input = {1, 7, 0, 4, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 3, 2, 6, 4, 1, 3, 2, 5, 1, 3, 7, 2, 7, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37755() {
        int[] input = {1, 0, 7, 4, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 2, 6, 4, 1, 3, 2, 5, 1, 3, 7, 2, 7, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37756() {
        int[] input = {1, 0, 4, 7, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 7, 5, 3, 1, 7, 5, 3, 1, 2, 6, 3, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37757() {
        int[] input = {1, 0, 4, 5, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37758() {
        int[] input = {1, 0, 4, 5, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 6, 5, 4, 1, 7, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37759() {
        int[] input = {1, 0, 4, 5, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 3, 6, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37760() {
        int[] input = {1, 0, 4, 5, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 3, 6, 1, 4, 5, 4, 1, 7, 2, 3, 4, 5, 1, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37761() {
        int[] input = {1, 0, 4, 5, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 4, 1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37762() {
        int[] input = {1, 0, 4, 5, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37763() {
        int[] input = {1, 0, 4, 5, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37764() {
        int[] input = {1, 0, 4, 5, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 7, 3, 2, 6, 7, 4, 5, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37765() {
        int[] input = {1, 0, 4, 7, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 7, 3, 2, 6, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37766() {
        int[] input = {1, 0, 7, 4, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37767() {
        int[] input = {1, 7, 0, 4, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37768() {
        int[] input = {7, 1, 0, 4, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37769() {
        int[] input = {7, 1, 0, 4, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37770() {
        int[] input = {1, 7, 0, 4, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37771() {
        int[] input = {1, 0, 7, 4, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37772() {
        int[] input = {1, 0, 4, 7, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 3, 7, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37773() {
        int[] input = {1, 0, 4, 6, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37774() {
        int[] input = {1, 0, 4, 6, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 6, 4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37775() {
        int[] input = {1, 0, 4, 6, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37776() {
        int[] input = {1, 0, 4, 6, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37777() {
        int[] input = {1, 0, 6, 4, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 5, 4, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37778() {
        int[] input = {1, 0, 6, 4, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 5, 4, 1, 6, 3, 5, 4, 1, 6, 5, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37779() {
        int[] input = {1, 0, 6, 4, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37780() {
        int[] input = {1, 0, 6, 4, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37781() {
        int[] input = {1, 0, 6, 7, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37782() {
        int[] input = {1, 0, 7, 6, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37783() {
        int[] input = {1, 7, 0, 6, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37784() {
        int[] input = {7, 1, 0, 6, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37785() {
        int[] input = {7, 1, 6, 0, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 4, 1, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37786() {
        int[] input = {1, 7, 6, 0, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37787() {
        int[] input = {1, 6, 7, 0, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 5, 4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37788() {
        int[] input = {1, 6, 0, 7, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37789() {
        int[] input = {1, 6, 0, 4, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37790() {
        int[] input = {1, 6, 0, 4, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37791() {
        int[] input = {1, 6, 0, 4, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 5, 4, 1, 6, 3, 5, 4, 1, 6, 5, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37792() {
        int[] input = {1, 6, 0, 4, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 2, 7, 5, 3, 1, 6, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37793() {
        int[] input = {6, 1, 0, 4, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37794() {
        int[] input = {6, 1, 0, 4, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 1, 6, 3, 5, 4, 1, 6, 5, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37795() {
        int[] input = {6, 1, 0, 4, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37796() {
        int[] input = {6, 1, 0, 4, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37797() {
        int[] input = {6, 1, 0, 7, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37798() {
        int[] input = {6, 1, 7, 0, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 4, 1, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37799() {
        int[] input = {6, 7, 1, 0, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37800() {
        int[] input = {7, 6, 1, 0, 4, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37801() {
        int[] input = {7, 6, 1, 0, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37802() {
        int[] input = {6, 7, 1, 0, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37803() {
        int[] input = {6, 1, 7, 0, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37804() {
        int[] input = {6, 1, 0, 7, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37805() {
        int[] input = {6, 1, 0, 5, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37806() {
        int[] input = {6, 1, 0, 5, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37807() {
        int[] input = {6, 1, 0, 5, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 1, 3, 4, 5, 1, 3, 6, 4, 5, 1, 3, 6, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37808() {
        int[] input = {6, 1, 0, 5, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 3, 4, 5, 6, 3, 4, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37809() {
        int[] input = {1, 6, 0, 5, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 6, 3, 4, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37810() {
        int[] input = {1, 6, 0, 5, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 4, 3, 6, 1, 5, 4, 3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37811() {
        int[] input = {1, 6, 0, 5, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37812() {
        int[] input = {1, 6, 0, 5, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37813() {
        int[] input = {1, 6, 0, 7, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37814() {
        int[] input = {1, 6, 7, 0, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 1, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37815() {
        int[] input = {1, 7, 6, 0, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37816() {
        int[] input = {7, 1, 6, 0, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37817() {
        int[] input = {7, 1, 0, 6, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37818() {
        int[] input = {1, 7, 0, 6, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37819() {
        int[] input = {1, 0, 7, 6, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37820() {
        int[] input = {1, 0, 6, 7, 5, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37821() {
        int[] input = {1, 0, 6, 5, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37822() {
        int[] input = {1, 0, 6, 5, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37823() {
        int[] input = {1, 0, 6, 5, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 6, 1, 5, 4, 3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37824() {
        int[] input = {1, 0, 6, 5, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 4, 5, 6, 3, 4, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37825() {
        int[] input = {1, 0, 5, 6, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 6, 2, 7, 3, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37826() {
        int[] input = {1, 0, 5, 6, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37827() {
        int[] input = {1, 0, 5, 6, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37828() {
        int[] input = {1, 0, 5, 6, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37829() {
        int[] input = {1, 0, 5, 7, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 3, 7, 6, 2, 3, 7, 6, 1, 5, 4, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37830() {
        int[] input = {1, 0, 7, 5, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37831() {
        int[] input = {1, 7, 0, 5, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37832() {
        int[] input = {7, 1, 0, 5, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37833() {
        int[] input = {7, 1, 0, 5, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37834() {
        int[] input = {1, 7, 0, 5, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37835() {
        int[] input = {1, 0, 7, 5, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37836() {
        int[] input = {1, 0, 5, 7, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 3, 7, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37837() {
        int[] input = {1, 0, 5, 4, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37838() {
        int[] input = {1, 0, 5, 4, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37839() {
        int[] input = {1, 0, 5, 4, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37840() {
        int[] input = {1, 0, 5, 4, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37841() {
        int[] input = {1, 0, 5, 4, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37842() {
        int[] input = {1, 0, 5, 4, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 6, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37843() {
        int[] input = {1, 0, 5, 4, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 6, 4, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37844() {
        int[] input = {1, 0, 5, 4, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37845() {
        int[] input = {1, 0, 5, 7, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37846() {
        int[] input = {1, 0, 7, 5, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 4, 3, 1, 7, 5, 7, 1, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37847() {
        int[] input = {1, 7, 0, 5, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 3, 1, 7, 5, 7, 1, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37848() {
        int[] input = {7, 1, 0, 5, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 1, 7, 5, 7, 1, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37849() {
        int[] input = {7, 1, 0, 5, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37850() {
        int[] input = {1, 7, 0, 5, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37851() {
        int[] input = {1, 0, 7, 5, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37852() {
        int[] input = {1, 0, 5, 7, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 1, 2, 6, 7, 4, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37853() {
        int[] input = {1, 0, 5, 4, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37854() {
        int[] input = {1, 0, 5, 4, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 2, 6, 7, 1, 4, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37855() {
        int[] input = {1, 0, 5, 4, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 2, 3, 7, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37856() {
        int[] input = {1, 0, 5, 4, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 3, 2, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37857() {
        int[] input = {1, 5, 0, 4, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 2, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37858() {
        int[] input = {1, 5, 0, 4, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37859() {
        int[] input = {1, 5, 0, 4, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 6, 7, 1, 4, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37860() {
        int[] input = {1, 5, 0, 4, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37861() {
        int[] input = {1, 5, 0, 7, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 2, 7, 4, 6, 3, 1, 5, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37862() {
        int[] input = {1, 5, 7, 0, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37863() {
        int[] input = {1, 7, 5, 0, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 5, 1, 7, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37864() {
        int[] input = {7, 1, 5, 0, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 4, 1, 5, 7, 3, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37865() {
        int[] input = {7, 1, 5, 0, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 4, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37866() {
        int[] input = {1, 7, 5, 0, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37867() {
        int[] input = {1, 5, 7, 0, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 1, 5, 4, 3, 1, 7, 5, 7, 1, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37868() {
        int[] input = {1, 5, 0, 7, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 3, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37869() {
        int[] input = {1, 5, 0, 4, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37870() {
        int[] input = {1, 5, 0, 4, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 7, 2, 6, 4, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37871() {
        int[] input = {1, 5, 0, 4, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37872() {
        int[] input = {1, 5, 0, 4, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37873() {
        int[] input = {1, 5, 0, 4, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37874() {
        int[] input = {1, 5, 0, 4, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37875() {
        int[] input = {1, 5, 0, 4, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37876() {
        int[] input = {1, 5, 0, 4, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37877() {
        int[] input = {1, 5, 0, 7, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 6, 2, 3, 7, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37878() {
        int[] input = {1, 5, 7, 0, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37879() {
        int[] input = {1, 7, 5, 0, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 1, 7, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37880() {
        int[] input = {7, 1, 5, 0, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37881() {
        int[] input = {7, 1, 5, 0, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37882() {
        int[] input = {1, 7, 5, 0, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 6, 3, 2, 4, 6, 5, 7, 2, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37883() {
        int[] input = {1, 5, 7, 0, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 4, 2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37884() {
        int[] input = {1, 5, 0, 7, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 6, 2, 3, 7, 6, 5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37885() {
        int[] input = {1, 5, 0, 6, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37886() {
        int[] input = {1, 5, 0, 6, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 7, 5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37887() {
        int[] input = {1, 5, 0, 6, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37888() {
        int[] input = {1, 5, 0, 6, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 7, 3, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37889() {
        int[] input = {1, 5, 6, 0, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 6, 5, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37890() {
        int[] input = {1, 5, 6, 0, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 1, 5, 4, 3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37891() {
        int[] input = {1, 5, 6, 0, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37892() {
        int[] input = {1, 5, 6, 0, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 7, 4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37893() {
        int[] input = {1, 5, 6, 7, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37894() {
        int[] input = {1, 5, 7, 6, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 6, 4, 7, 5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37895() {
        int[] input = {1, 7, 5, 6, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 4, 6, 3, 2, 4, 6, 5, 7, 2, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37896() {
        int[] input = {7, 1, 5, 6, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37897() {
        int[] input = {7, 1, 6, 5, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37898() {
        int[] input = {1, 7, 6, 5, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37899() {
        int[] input = {1, 6, 7, 5, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 7, 1, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37900() {
        int[] input = {1, 6, 5, 7, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37901() {
        int[] input = {1, 6, 5, 0, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37902() {
        int[] input = {1, 6, 5, 0, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37903() {
        int[] input = {1, 6, 5, 0, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37904() {
        int[] input = {1, 6, 5, 0, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 1, 6, 2, 7, 3, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37905() {
        int[] input = {6, 1, 5, 0, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 6, 1, 2, 7, 3, 6, 5, 1, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37906() {
        int[] input = {6, 1, 5, 0, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37907() {
        int[] input = {6, 1, 5, 0, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37908() {
        int[] input = {6, 1, 5, 0, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37909() {
        int[] input = {6, 1, 5, 7, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37910() {
        int[] input = {6, 1, 7, 5, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37911() {
        int[] input = {6, 7, 1, 5, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 1, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37912() {
        int[] input = {7, 6, 1, 5, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37913() {
        int[] input = {7, 6, 5, 1, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37914() {
        int[] input = {6, 7, 5, 1, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 5, 6, 7, 1, 4, 6, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37915() {
        int[] input = {6, 5, 7, 1, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 4, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37916() {
        int[] input = {6, 5, 1, 7, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37917() {
        int[] input = {6, 5, 1, 0, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37918() {
        int[] input = {6, 5, 1, 0, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37919() {
        int[] input = {6, 5, 1, 0, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 1, 5, 4, 3, 1, 5, 6, 4, 6, 5, 1, 3, 6, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37920() {
        int[] input = {6, 5, 1, 0, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37921() {
        int[] input = {5, 6, 1, 0, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37922() {
        int[] input = {5, 6, 1, 0, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37923() {
        int[] input = {5, 6, 1, 0, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 3, 4, 7, 2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37924() {
        int[] input = {5, 6, 1, 0, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37925() {
        int[] input = {5, 6, 1, 7, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37926() {
        int[] input = {5, 6, 7, 1, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 5, 6, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37927() {
        int[] input = {5, 7, 6, 1, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37928() {
        int[] input = {7, 5, 6, 1, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37929() {
        int[] input = {7, 5, 1, 6, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 6, 5, 1, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37930() {
        int[] input = {5, 7, 1, 6, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 4, 6, 3, 2, 4, 6, 1, 5, 7, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37931() {
        int[] input = {5, 1, 7, 6, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37932() {
        int[] input = {5, 1, 6, 7, 0, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37933() {
        int[] input = {5, 1, 6, 0, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 7, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37934() {
        int[] input = {5, 1, 6, 0, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 7, 4, 1, 5, 7, 4, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37935() {
        int[] input = {5, 1, 6, 0, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37936() {
        int[] input = {5, 1, 6, 0, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 6, 5, 1, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37937() {
        int[] input = {5, 1, 0, 6, 4, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 7, 3, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37938() {
        int[] input = {5, 1, 0, 6, 4, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37939() {
        int[] input = {5, 1, 0, 6, 4, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 1, 7, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37940() {
        int[] input = {5, 1, 0, 6, 7, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37941() {
        int[] input = {5, 1, 0, 7, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 6, 2, 3, 7, 6, 1, 5, 4, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37942() {
        int[] input = {5, 1, 7, 0, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37943() {
        int[] input = {5, 7, 1, 0, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 6, 3, 2, 4, 6, 1, 5, 7, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37944() {
        int[] input = {7, 5, 1, 0, 6, 4, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37945() {
        int[] input = {7, 5, 1, 0, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37946() {
        int[] input = {5, 7, 1, 0, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 5, 7, 5, 1, 6, 4, 5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37947() {
        int[] input = {5, 1, 7, 0, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37948() {
        int[] input = {5, 1, 0, 7, 4, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37949() {
        int[] input = {5, 1, 0, 4, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37950() {
        int[] input = {5, 1, 0, 4, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37951() {
        int[] input = {5, 1, 0, 4, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37952() {
        int[] input = {5, 1, 0, 4, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37953() {
        int[] input = {5, 1, 0, 4, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37954() {
        int[] input = {5, 1, 0, 4, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37955() {
        int[] input = {5, 1, 0, 4, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 4, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37956() {
        int[] input = {5, 1, 0, 4, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37957() {
        int[] input = {5, 1, 0, 7, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 4, 3, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37958() {
        int[] input = {5, 1, 7, 0, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 5, 1, 4, 3, 2, 6, 4, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37959() {
        int[] input = {5, 7, 1, 0, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37960() {
        int[] input = {7, 5, 1, 0, 4, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 1, 7, 5, 7, 1, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37961() {
        int[] input = {7, 5, 1, 0, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 7, 5, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37962() {
        int[] input = {5, 7, 1, 0, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 4, 7, 1, 5, 3, 4, 7, 1, 2, 6, 7, 4, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37963() {
        int[] input = {5, 1, 7, 0, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 3, 4, 1, 5, 7, 3, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37964() {
        int[] input = {5, 1, 0, 7, 4, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 1, 5, 3, 4, 7, 1, 2, 6, 7, 4, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37965() {
        int[] input = {5, 1, 0, 4, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37966() {
        int[] input = {5, 1, 0, 4, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 6, 7, 1, 4, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37967() {
        int[] input = {5, 1, 0, 4, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 1, 5, 4, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37968() {
        int[] input = {5, 1, 0, 4, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37969() {
        int[] input = {5, 1, 4, 0, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37970() {
        int[] input = {5, 1, 4, 0, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 1, 7, 6, 3, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37971() {
        int[] input = {5, 1, 4, 0, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37972() {
        int[] input = {5, 1, 4, 0, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 7, 1, 5, 4, 3, 4, 5, 2, 6, 7, 4, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37973() {
        int[] input = {5, 1, 4, 7, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 1, 7, 3, 4, 1, 5, 7, 5, 1, 4, 3, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37974() {
        int[] input = {5, 1, 7, 4, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 7, 3, 4, 1, 5, 7, 3, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37975() {
        int[] input = {5, 7, 1, 4, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 7, 4, 3, 1, 7, 5, 4, 3, 2, 6, 7, 1, 2, 3, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37976() {
        int[] input = {7, 5, 1, 4, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 7, 5, 4, 3, 1, 7, 5, 4, 3, 2, 6, 7, 1, 2, 3, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37977() {
        int[] input = {7, 5, 1, 4, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 7, 5, 7, 1, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37978() {
        int[] input = {5, 7, 1, 4, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37979() {
        int[] input = {5, 1, 7, 4, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37980() {
        int[] input = {5, 1, 4, 7, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 3, 2, 6, 1, 4, 3, 2, 7, 4, 3, 5, 2, 5, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37981() {
        int[] input = {5, 1, 4, 0, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 6, 1, 4, 3, 2, 7, 4, 3, 5, 2, 5, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37982() {
        int[] input = {5, 1, 4, 0, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 6, 1, 3, 2, 7, 4, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37983() {
        int[] input = {5, 1, 4, 0, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 4, 1, 7, 3, 4, 1, 5, 7, 5, 1, 4, 3, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37984() {
        int[] input = {5, 1, 4, 0, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37985() {
        int[] input = {5, 1, 4, 0, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 5, 1, 2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37986() {
        int[] input = {5, 1, 4, 0, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 7, 6, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37987() {
        int[] input = {5, 1, 4, 0, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37988() {
        int[] input = {5, 1, 4, 0, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 6, 7, 1, 3, 2, 7, 6, 5, 3, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37989() {
        int[] input = {5, 1, 4, 7, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 4, 6, 7, 1, 3, 2, 7, 6, 5, 3, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37990() {
        int[] input = {5, 1, 7, 4, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37991() {
        int[] input = {5, 7, 1, 4, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 7, 5, 1, 6, 4, 5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37992() {
        int[] input = {7, 5, 1, 4, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37993() {
        int[] input = {7, 5, 1, 4, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37994() {
        int[] input = {5, 7, 1, 4, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 5, 1, 6, 4, 5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37995() {
        int[] input = {5, 1, 7, 4, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37996() {
        int[] input = {5, 1, 4, 7, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 2, 3, 7, 6, 1, 5, 4, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37997() {
        int[] input = {5, 1, 4, 6, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37998() {
        int[] input = {5, 1, 4, 6, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve37999() {
        int[] input = {5, 1, 4, 6, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38000() {
        int[] input = {5, 1, 4, 6, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 5, 1, 2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38001() {
        int[] input = {5, 1, 6, 4, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 6, 5, 1, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38002() {
        int[] input = {5, 1, 6, 4, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38003() {
        int[] input = {5, 1, 6, 4, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 7, 4, 1, 5, 7, 4, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38004() {
        int[] input = {5, 1, 6, 4, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 5, 6, 7, 4, 1, 5, 7, 4, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38005() {
        int[] input = {5, 1, 6, 7, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38006() {
        int[] input = {5, 1, 7, 6, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 7, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38007() {
        int[] input = {5, 7, 1, 6, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 1, 7, 5, 6, 5, 7, 1, 4, 5, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38008() {
        int[] input = {7, 5, 1, 6, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 5, 1, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38009() {
        int[] input = {7, 5, 6, 1, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38010() {
        int[] input = {5, 7, 6, 1, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38011() {
        int[] input = {5, 6, 7, 1, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 5, 7, 4, 1, 5, 7, 4, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38012() {
        int[] input = {5, 6, 1, 7, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 3, 2, 1, 6, 7, 3, 2, 1, 6, 7, 5, 3, 2, 1, 6, 7, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38013() {
        int[] input = {5, 6, 1, 4, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 7, 2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38014() {
        int[] input = {5, 6, 1, 4, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 4, 7, 2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38015() {
        int[] input = {5, 6, 1, 4, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38016() {
        int[] input = {5, 6, 1, 4, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38017() {
        int[] input = {6, 5, 1, 4, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38018() {
        int[] input = {6, 5, 1, 4, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 5, 4, 3, 1, 5, 6, 4, 6, 5, 1, 3, 6, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38019() {
        int[] input = {6, 5, 1, 4, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38020() {
        int[] input = {6, 5, 1, 4, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 4, 7, 1, 6, 4, 7, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38021() {
        int[] input = {6, 5, 1, 7, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38022() {
        int[] input = {6, 5, 7, 1, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 7, 4, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38023() {
        int[] input = {6, 7, 5, 1, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 6, 5, 6, 7, 1, 4, 6, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38024() {
        int[] input = {7, 6, 5, 1, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38025() {
        int[] input = {7, 6, 1, 5, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38026() {
        int[] input = {6, 7, 1, 5, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38027() {
        int[] input = {6, 1, 7, 5, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38028() {
        int[] input = {6, 1, 5, 7, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38029() {
        int[] input = {6, 1, 5, 4, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38030() {
        int[] input = {6, 1, 5, 4, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38031() {
        int[] input = {6, 1, 5, 4, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38032() {
        int[] input = {6, 1, 5, 4, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 6, 1, 2, 7, 3, 6, 5, 1, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38033() {
        int[] input = {1, 6, 5, 4, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 5, 1, 6, 2, 7, 3, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38034() {
        int[] input = {1, 6, 5, 4, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 5, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38035() {
        int[] input = {1, 6, 5, 4, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38036() {
        int[] input = {1, 6, 5, 4, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38037() {
        int[] input = {1, 6, 5, 7, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 1, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38038() {
        int[] input = {1, 6, 7, 5, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 1, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38039() {
        int[] input = {1, 7, 6, 5, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38040() {
        int[] input = {7, 1, 6, 5, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38041() {
        int[] input = {7, 1, 5, 6, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38042() {
        int[] input = {1, 7, 5, 6, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 1, 5, 4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38043() {
        int[] input = {1, 5, 7, 6, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 4, 7, 5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38044() {
        int[] input = {1, 5, 6, 7, 4, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38045() {
        int[] input = {1, 5, 6, 4, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 1, 6, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38046() {
        int[] input = {1, 5, 6, 4, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 6, 7, 4, 5, 1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38047() {
        int[] input = {1, 5, 6, 4, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 5, 4, 3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38048() {
        int[] input = {1, 5, 6, 4, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 6, 5, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38049() {
        int[] input = {1, 5, 4, 6, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38050() {
        int[] input = {1, 5, 4, 6, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38051() {
        int[] input = {1, 5, 4, 6, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 4, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38052() {
        int[] input = {1, 5, 4, 6, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38053() {
        int[] input = {1, 5, 4, 7, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 2, 3, 7, 6, 5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38054() {
        int[] input = {1, 5, 7, 4, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38055() {
        int[] input = {1, 7, 5, 4, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38056() {
        int[] input = {7, 1, 5, 4, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38057() {
        int[] input = {7, 1, 5, 4, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38058() {
        int[] input = {1, 7, 5, 4, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 7, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38059() {
        int[] input = {1, 5, 7, 4, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38060() {
        int[] input = {1, 5, 4, 7, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 6, 7, 3, 2, 6, 7, 4, 5, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38061() {
        int[] input = {1, 5, 4, 0, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 3, 2, 6, 7, 4, 5, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38062() {
        int[] input = {1, 5, 4, 0, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38063() {
        int[] input = {1, 5, 4, 0, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38064() {
        int[] input = {1, 5, 4, 0, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 4, 1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38065() {
        int[] input = {1, 5, 4, 0, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 1, 5, 1, 4, 6, 3, 1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38066() {
        int[] input = {1, 5, 4, 0, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 1, 5, 3, 6, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38067() {
        int[] input = {1, 5, 4, 0, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 7, 4, 1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38068() {
        int[] input = {1, 5, 4, 0, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38069() {
        int[] input = {1, 5, 4, 7, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38070() {
        int[] input = {1, 5, 7, 4, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 5, 1, 7, 2, 6, 4, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38071() {
        int[] input = {1, 7, 5, 4, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38072() {
        int[] input = {7, 1, 5, 4, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38073() {
        int[] input = {7, 1, 5, 4, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 3, 4, 1, 5, 7, 3, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38074() {
        int[] input = {1, 7, 5, 4, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 1, 7, 4, 3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38075() {
        int[] input = {1, 5, 7, 4, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 3, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38076() {
        int[] input = {1, 5, 4, 7, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 4, 3, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38077() {
        int[] input = {1, 5, 4, 0, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 3, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38078() {
        int[] input = {1, 5, 4, 0, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 4, 5, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38079() {
        int[] input = {1, 5, 4, 0, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 1, 5, 3, 2, 1, 5, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38080() {
        int[] input = {1, 5, 4, 0, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38081() {
        int[] input = {1, 4, 5, 0, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 1, 4, 3, 2, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38082() {
        int[] input = {1, 4, 5, 0, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 3, 7, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38083() {
        int[] input = {1, 4, 5, 0, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38084() {
        int[] input = {1, 4, 5, 0, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38085() {
        int[] input = {1, 4, 5, 7, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38086() {
        int[] input = {1, 4, 7, 5, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 7, 1, 4, 5, 3, 1, 4, 5, 3, 1, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38087() {
        int[] input = {1, 7, 4, 5, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38088() {
        int[] input = {7, 1, 4, 5, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38089() {
        int[] input = {7, 1, 4, 5, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38090() {
        int[] input = {1, 7, 4, 5, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 1, 7, 5, 3, 4, 1, 5, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38091() {
        int[] input = {1, 4, 7, 5, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 5, 4, 1, 7, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38092() {
        int[] input = {1, 4, 5, 7, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38093() {
        int[] input = {1, 4, 5, 0, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38094() {
        int[] input = {1, 4, 5, 0, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 7, 2, 6, 4, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38095() {
        int[] input = {1, 4, 5, 0, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38096() {
        int[] input = {1, 4, 5, 0, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38097() {
        int[] input = {1, 4, 5, 0, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38098() {
        int[] input = {1, 4, 5, 0, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 1, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38099() {
        int[] input = {1, 4, 5, 0, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38100() {
        int[] input = {1, 4, 5, 0, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38101() {
        int[] input = {1, 4, 5, 7, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38102() {
        int[] input = {1, 4, 7, 5, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 7, 1, 4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38103() {
        int[] input = {1, 7, 4, 5, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 5, 3, 7, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38104() {
        int[] input = {7, 1, 4, 5, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38105() {
        int[] input = {7, 1, 4, 5, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38106() {
        int[] input = {1, 7, 4, 5, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 2, 6, 5, 3, 7, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38107() {
        int[] input = {1, 4, 7, 5, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38108() {
        int[] input = {1, 4, 5, 7, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38109() {
        int[] input = {1, 4, 5, 6, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38110() {
        int[] input = {1, 4, 5, 6, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38111() {
        int[] input = {1, 4, 5, 6, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 5, 1, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38112() {
        int[] input = {1, 4, 5, 6, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38113() {
        int[] input = {1, 4, 6, 5, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 6, 3, 5, 4, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38114() {
        int[] input = {1, 4, 6, 5, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 4, 5, 3, 6, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38115() {
        int[] input = {1, 4, 6, 5, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 6, 1, 4, 5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38116() {
        int[] input = {1, 4, 6, 5, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 2, 3, 5, 7, 4, 6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38117() {
        int[] input = {1, 4, 6, 7, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 1, 6, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38118() {
        int[] input = {1, 4, 7, 6, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38119() {
        int[] input = {1, 7, 4, 6, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38120() {
        int[] input = {7, 1, 4, 6, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38121() {
        int[] input = {7, 1, 6, 4, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38122() {
        int[] input = {1, 7, 6, 4, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38123() {
        int[] input = {1, 6, 7, 4, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 4, 5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38124() {
        int[] input = {1, 6, 4, 7, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38125() {
        int[] input = {1, 6, 4, 5, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38126() {
        int[] input = {1, 6, 4, 5, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 7, 5, 6, 4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38127() {
        int[] input = {1, 6, 4, 5, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38128() {
        int[] input = {1, 6, 4, 5, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38129() {
        int[] input = {6, 1, 4, 5, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 6, 1, 6, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38130() {
        int[] input = {6, 1, 4, 5, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 5, 1, 6, 4, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38131() {
        int[] input = {6, 1, 4, 5, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 7, 4, 1, 3, 2, 7, 4, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38132() {
        int[] input = {6, 1, 4, 5, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 3, 2, 4, 1, 5, 3, 7, 1, 5, 6, 3, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38133() {
        int[] input = {6, 1, 4, 7, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38134() {
        int[] input = {6, 1, 7, 4, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38135() {
        int[] input = {6, 7, 1, 4, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 5, 1, 2, 3, 5, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38136() {
        int[] input = {7, 6, 1, 4, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 5, 1, 2, 3, 5, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38137() {
        int[] input = {7, 6, 1, 4, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 6, 4, 5, 1, 2, 3, 5, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38138() {
        int[] input = {6, 7, 1, 4, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38139() {
        int[] input = {6, 1, 7, 4, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 5, 4, 1, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38140() {
        int[] input = {6, 1, 4, 7, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38141() {
        int[] input = {6, 1, 4, 0, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38142() {
        int[] input = {6, 1, 4, 0, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 4, 1, 3, 2, 7, 4, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38143() {
        int[] input = {6, 1, 4, 0, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 3, 5, 1, 6, 3, 5, 2, 7, 6, 3, 5, 2, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38144() {
        int[] input = {6, 1, 4, 0, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 1, 4, 6, 3, 6, 4, 2, 7, 5, 6, 4, 2, 1, 6, 4, 3, 2, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38145() {
        int[] input = {1, 6, 4, 0, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38146() {
        int[] input = {1, 6, 4, 0, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38147() {
        int[] input = {1, 6, 4, 0, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 5, 6, 4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38148() {
        int[] input = {1, 6, 4, 0, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38149() {
        int[] input = {1, 6, 4, 7, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38150() {
        int[] input = {1, 6, 7, 4, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 7, 5, 4, 6, 1, 7, 5, 4, 6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38151() {
        int[] input = {1, 7, 6, 4, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 6, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38152() {
        int[] input = {7, 1, 6, 4, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 4, 1, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38153() {
        int[] input = {7, 1, 4, 6, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38154() {
        int[] input = {1, 7, 4, 6, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 7, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38155() {
        int[] input = {1, 4, 7, 6, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38156() {
        int[] input = {1, 4, 6, 7, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 6, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38157() {
        int[] input = {1, 4, 6, 0, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38158() {
        int[] input = {1, 4, 6, 0, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 1, 4, 5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38159() {
        int[] input = {1, 4, 6, 0, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 3, 5, 4, 1, 6, 3, 5, 4, 1, 6, 5, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38160() {
        int[] input = {1, 4, 6, 0, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 3, 5, 4, 2, 7, 5, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38161() {
        int[] input = {1, 4, 0, 6, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38162() {
        int[] input = {1, 4, 0, 6, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38163() {
        int[] input = {1, 4, 0, 6, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38164() {
        int[] input = {1, 4, 0, 6, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38165() {
        int[] input = {1, 4, 0, 7, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 7, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38166() {
        int[] input = {1, 4, 7, 0, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38167() {
        int[] input = {1, 7, 4, 0, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 4, 1, 7, 6, 5, 4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38168() {
        int[] input = {7, 1, 4, 0, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 5, 6, 1, 7, 5, 6, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38169() {
        int[] input = {7, 1, 4, 0, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 2, 3, 5, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38170() {
        int[] input = {1, 7, 4, 0, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 5, 3, 7, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38171() {
        int[] input = {1, 4, 7, 0, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 1, 4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38172() {
        int[] input = {1, 4, 0, 7, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 3, 2, 6, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38173() {
        int[] input = {1, 4, 0, 5, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 2, 6, 7, 3, 2, 6, 7, 1, 4, 5, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38174() {
        int[] input = {1, 4, 0, 5, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38175() {
        int[] input = {1, 4, 0, 5, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38176() {
        int[] input = {1, 4, 0, 5, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 3, 4, 1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38177() {
        int[] input = {1, 4, 0, 5, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 6, 1, 4, 5, 4, 1, 7, 2, 3, 4, 5, 1, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38178() {
        int[] input = {1, 4, 0, 5, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 6, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38179() {
        int[] input = {1, 4, 0, 5, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 5, 4, 1, 7, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38180() {
        int[] input = {1, 4, 0, 5, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38181() {
        int[] input = {1, 4, 0, 7, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 3, 1, 7, 5, 3, 1, 2, 6, 3, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38182() {
        int[] input = {1, 4, 7, 0, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 3, 2, 6, 4, 1, 3, 2, 5, 1, 3, 7, 2, 7, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38183() {
        int[] input = {1, 7, 4, 0, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 1, 7, 5, 3, 4, 1, 5, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38184() {
        int[] input = {7, 1, 4, 0, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 1, 4, 7, 3, 5, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38185() {
        int[] input = {7, 1, 4, 0, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38186() {
        int[] input = {1, 7, 4, 0, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38187() {
        int[] input = {1, 4, 7, 0, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 1, 4, 5, 3, 1, 4, 5, 3, 1, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38188() {
        int[] input = {1, 4, 0, 7, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38189() {
        int[] input = {1, 4, 0, 5, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 2, 6, 7, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38190() {
        int[] input = {1, 4, 0, 5, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 7, 3, 5, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38191() {
        int[] input = {1, 4, 0, 5, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 2, 1, 5, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38192() {
        int[] input = {1, 4, 0, 5, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38193() {
        int[] input = {1, 4, 0, 3, 5, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 4, 2, 5, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38194() {
        int[] input = {1, 4, 0, 3, 5, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 6, 7, 3, 1, 4, 2, 6, 5, 1, 3, 7, 5, 1, 3, 4, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38195() {
        int[] input = {1, 4, 0, 3, 5, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 6, 7, 1, 3, 2, 5, 1, 3, 4, 2, 4, 3, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38196() {
        int[] input = {1, 4, 0, 3, 7, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38197() {
        int[] input = {1, 4, 0, 7, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38198() {
        int[] input = {1, 4, 7, 0, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 3, 2, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38199() {
        int[] input = {1, 7, 4, 0, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38200() {
        int[] input = {7, 1, 4, 0, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 5, 3, 1, 7, 4, 5, 4, 7, 1, 3, 4, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38201() {
        int[] input = {7, 1, 4, 0, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 7, 1, 3, 5, 7, 4, 1, 3, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38202() {
        int[] input = {1, 7, 4, 0, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 3, 7, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38203() {
        int[] input = {1, 4, 7, 0, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38204() {
        int[] input = {1, 4, 0, 7, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38205() {
        int[] input = {1, 4, 0, 3, 7, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 2, 6, 3, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38206() {
        int[] input = {1, 4, 0, 3, 5, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38207() {
        int[] input = {1, 4, 0, 3, 5, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38208() {
        int[] input = {1, 4, 0, 3, 5, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 2, 7, 5, 6, 4, 2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38209() {
        int[] input = {1, 4, 0, 3, 6, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38210() {
        int[] input = {1, 4, 0, 3, 6, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 7, 2, 6, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38211() {
        int[] input = {1, 4, 0, 3, 6, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 7, 6, 3, 1, 4, 7, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38212() {
        int[] input = {1, 4, 0, 3, 7, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 2, 6, 1, 3, 5, 7, 1, 3, 4, 5, 7, 1, 3, 4, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38213() {
        int[] input = {1, 4, 0, 7, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38214() {
        int[] input = {1, 4, 7, 0, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 1, 4, 3, 6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38215() {
        int[] input = {1, 7, 4, 0, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38216() {
        int[] input = {7, 1, 4, 0, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38217() {
        int[] input = {7, 1, 4, 0, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 3, 6, 1, 7, 4, 3, 4, 7, 5, 2, 6, 4, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38218() {
        int[] input = {1, 7, 4, 0, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 3, 6, 7, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38219() {
        int[] input = {1, 4, 7, 0, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 7, 1, 4, 6, 3, 7, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38220() {
        int[] input = {1, 4, 0, 7, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38221() {
        int[] input = {1, 4, 0, 6, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38222() {
        int[] input = {1, 4, 0, 6, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 7, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38223() {
        int[] input = {1, 4, 0, 6, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38224() {
        int[] input = {1, 4, 0, 6, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38225() {
        int[] input = {1, 4, 6, 0, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 5, 6, 4, 2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38226() {
        int[] input = {1, 4, 6, 0, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38227() {
        int[] input = {1, 4, 6, 0, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 2, 5, 4, 1, 7, 2, 3, 1, 4, 5, 3, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38228() {
        int[] input = {1, 4, 6, 0, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38229() {
        int[] input = {1, 4, 6, 7, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38230() {
        int[] input = {1, 4, 7, 6, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 4, 6, 3, 7, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38231() {
        int[] input = {1, 7, 4, 6, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 4, 3, 6, 7, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38232() {
        int[] input = {7, 1, 4, 6, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 3, 6, 1, 7, 4, 3, 4, 7, 5, 2, 6, 4, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38233() {
        int[] input = {7, 1, 6, 4, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 4, 3, 6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38234() {
        int[] input = {1, 7, 6, 4, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38235() {
        int[] input = {1, 6, 7, 4, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38236() {
        int[] input = {1, 6, 4, 7, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 1, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38237() {
        int[] input = {1, 6, 4, 0, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 1, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38238() {
        int[] input = {1, 6, 4, 0, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 3, 5, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38239() {
        int[] input = {1, 6, 4, 0, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38240() {
        int[] input = {1, 6, 4, 0, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 5, 3, 6, 2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38241() {
        int[] input = {6, 1, 4, 0, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 1, 3, 2, 7, 4, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38242() {
        int[] input = {6, 1, 4, 0, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 3, 1, 6, 5, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38243() {
        int[] input = {6, 1, 4, 0, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 3, 1, 4, 6, 7, 6, 4, 1, 3, 6, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38244() {
        int[] input = {6, 1, 4, 0, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 6, 1, 7, 3, 6, 4, 1, 4, 6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38245() {
        int[] input = {6, 1, 4, 7, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 1, 6, 4, 6, 1, 3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38246() {
        int[] input = {6, 1, 7, 4, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 4, 1, 7, 2, 3, 1, 4, 5, 3, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38247() {
        int[] input = {6, 7, 1, 4, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38248() {
        int[] input = {7, 6, 1, 4, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38249() {
        int[] input = {7, 6, 1, 4, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 3, 1, 6, 2, 4, 1, 6, 7, 2, 7, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38250() {
        int[] input = {6, 7, 1, 4, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38251() {
        int[] input = {6, 1, 7, 4, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38252() {
        int[] input = {6, 1, 4, 7, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38253() {
        int[] input = {6, 1, 4, 0, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38254() {
        int[] input = {6, 1, 4, 0, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 4, 6, 1, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38255() {
        int[] input = {6, 1, 4, 0, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 6, 1, 3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38256() {
        int[] input = {6, 1, 4, 0, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38257() {
        int[] input = {1, 6, 4, 0, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 3, 5, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38258() {
        int[] input = {1, 6, 4, 0, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 1, 6, 3, 2, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38259() {
        int[] input = {1, 6, 4, 0, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 4, 6, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38260() {
        int[] input = {1, 6, 4, 0, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38261() {
        int[] input = {1, 6, 4, 7, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 5, 3, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38262() {
        int[] input = {1, 6, 7, 4, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 6, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38263() {
        int[] input = {1, 7, 6, 4, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38264() {
        int[] input = {7, 1, 6, 4, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38265() {
        int[] input = {7, 1, 4, 6, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38266() {
        int[] input = {1, 7, 4, 6, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 3, 5, 2, 7, 6, 5, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38267() {
        int[] input = {1, 4, 7, 6, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 3, 5, 2, 4, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38268() {
        int[] input = {1, 4, 6, 7, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 4, 7, 2, 5, 6, 3, 2, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38269() {
        int[] input = {1, 4, 6, 0, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 6, 1, 4, 7, 2, 5, 6, 3, 2, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38270() {
        int[] input = {1, 4, 6, 0, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 1, 4, 3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38271() {
        int[] input = {1, 4, 6, 0, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38272() {
        int[] input = {1, 4, 6, 0, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 1, 4, 1, 6, 2, 3, 1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38273() {
        int[] input = {1, 4, 0, 6, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 7, 2, 3, 5, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38274() {
        int[] input = {1, 4, 0, 6, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 2, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38275() {
        int[] input = {1, 4, 0, 6, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 3, 7, 4, 6, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38276() {
        int[] input = {1, 4, 0, 6, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 5, 3, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38277() {
        int[] input = {1, 4, 0, 7, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 7, 6, 5, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38278() {
        int[] input = {1, 4, 7, 0, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 5, 2, 4, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38279() {
        int[] input = {1, 7, 4, 0, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 5, 2, 7, 6, 5, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38280() {
        int[] input = {7, 1, 4, 0, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38281() {
        int[] input = {7, 1, 4, 0, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 7, 1, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38282() {
        int[] input = {1, 7, 4, 0, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 3, 2, 7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38283() {
        int[] input = {1, 4, 7, 0, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38284() {
        int[] input = {1, 4, 0, 7, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 5, 6, 3, 2, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38285() {
        int[] input = {1, 4, 0, 3, 7, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 3, 4, 1, 6, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38286() {
        int[] input = {1, 4, 0, 3, 6, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38287() {
        int[] input = {1, 4, 0, 3, 6, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 6, 3, 1, 4, 2, 6, 3, 1, 4, 6, 3, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38288() {
        int[] input = {1, 4, 0, 3, 6, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 7, 2, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38289() {
        int[] input = {1, 4, 0, 3, 2, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 6, 2, 3, 1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38290() {
        int[] input = {1, 4, 0, 3, 2, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38291() {
        int[] input = {1, 4, 0, 3, 2, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 7, 1, 4, 3, 4, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38292() {
        int[] input = {1, 4, 0, 3, 7, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 4, 1, 2, 7, 5, 6, 4, 3, 5, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38293() {
        int[] input = {1, 4, 0, 7, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 3, 7, 1, 4, 2, 4, 1, 6, 5, 3, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38294() {
        int[] input = {1, 4, 7, 0, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 1, 4, 3, 2, 7, 1, 4, 3, 4, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38295() {
        int[] input = {1, 7, 4, 0, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 2, 3, 7, 1, 4, 2, 4, 1, 6, 5, 3, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38296() {
        int[] input = {7, 1, 4, 0, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 3, 1, 7, 2, 3, 1, 7, 2, 4, 3, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38297() {
        int[] input = {7, 1, 4, 0, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 1, 4, 7, 2, 7, 4, 1, 3, 7, 2, 4, 1, 5, 6, 7, 2, 4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38298() {
        int[] input = {1, 7, 4, 0, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 2, 3, 7, 1, 4, 2, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38299() {
        int[] input = {1, 4, 7, 0, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38300() {
        int[] input = {1, 4, 0, 7, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 3, 7, 1, 4, 2, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38301() {
        int[] input = {1, 4, 0, 3, 7, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38302() {
        int[] input = {1, 4, 0, 3, 2, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 6, 7, 1, 4, 3, 5, 2, 1, 4, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38303() {
        int[] input = {1, 4, 0, 3, 2, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 3, 2, 6, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38304() {
        int[] input = {1, 4, 0, 3, 2, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 2, 3, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38305() {
        int[] input = {4, 1, 0, 3, 2, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38306() {
        int[] input = {4, 1, 0, 3, 2, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 1, 4, 5, 2, 3, 1, 7, 6, 3, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38307() {
        int[] input = {4, 1, 0, 3, 2, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 6, 7, 1, 4, 3, 5, 2, 1, 4, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38308() {
        int[] input = {4, 1, 0, 3, 7, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38309() {
        int[] input = {4, 1, 0, 7, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 4, 2, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38310() {
        int[] input = {4, 1, 7, 0, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 3, 1, 4, 7, 2, 7, 4, 1, 3, 7, 2, 4, 1, 5, 6, 7, 2, 4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38311() {
        int[] input = {4, 7, 1, 0, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 3, 7, 1, 4, 2, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38312() {
        int[] input = {7, 4, 1, 0, 3, 2, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38313() {
        int[] input = {7, 4, 1, 0, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 5, 6, 4, 1, 7, 2, 7, 1, 3, 5, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38314() {
        int[] input = {4, 7, 1, 0, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 3, 7, 1, 4, 2, 4, 1, 6, 5, 3, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38315() {
        int[] input = {4, 1, 7, 0, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 1, 3, 2, 7, 1, 4, 3, 4, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38316() {
        int[] input = {4, 1, 0, 7, 3, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 4, 2, 4, 1, 6, 5, 3, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38317() {
        int[] input = {4, 1, 0, 3, 7, 2, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 2, 7, 3, 4, 1, 2, 7, 5, 6, 4, 3, 5, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38318() {
        int[] input = {4, 1, 0, 3, 2, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 7, 1, 4, 3, 4, 1, 5, 6, 2, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38319() {
        int[] input = {4, 1, 0, 3, 2, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38320() {
        int[] input = {4, 1, 0, 3, 2, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38321() {
        int[] input = {4, 1, 0, 3, 6, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 7, 2, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38322() {
        int[] input = {4, 1, 0, 3, 6, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 1, 4, 2, 6, 3, 1, 4, 6, 3, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38323() {
        int[] input = {4, 1, 0, 3, 6, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38324() {
        int[] input = {4, 1, 0, 3, 7, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 1, 4, 6, 4, 1, 3, 7, 4, 6, 1, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38325() {
        int[] input = {4, 1, 0, 7, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 5, 6, 3, 2, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38326() {
        int[] input = {4, 1, 7, 0, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38327() {
        int[] input = {4, 7, 1, 0, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 3, 2, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38328() {
        int[] input = {7, 4, 1, 0, 3, 6, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 7, 4, 2, 5, 6, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38329() {
        int[] input = {7, 4, 1, 0, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 3, 5, 2, 4, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38330() {
        int[] input = {4, 7, 1, 0, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 1, 4, 7, 4, 1, 6, 2, 4, 7, 1, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38331() {
        int[] input = {4, 1, 7, 0, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 7, 4, 1, 2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38332() {
        int[] input = {4, 1, 0, 7, 6, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 3, 5, 2, 7, 6, 5, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38333() {
        int[] input = {4, 1, 0, 6, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 2, 5, 3, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38334() {
        int[] input = {4, 1, 0, 6, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 3, 7, 4, 6, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38335() {
        int[] input = {4, 1, 0, 6, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 2, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38336() {
        int[] input = {4, 1, 0, 6, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 7, 2, 3, 5, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38337() {
        int[] input = {4, 1, 6, 0, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38338() {
        int[] input = {4, 1, 6, 0, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38339() {
        int[] input = {4, 1, 6, 0, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 4, 1, 3, 7, 4, 6, 1, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38340() {
        int[] input = {4, 1, 6, 0, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 4, 1, 2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38341() {
        int[] input = {4, 1, 6, 7, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 6, 4, 1, 2, 5, 3, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38342() {
        int[] input = {4, 1, 7, 6, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 3, 7, 4, 1, 2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38343() {
        int[] input = {4, 7, 1, 6, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 3, 1, 4, 7, 4, 1, 6, 2, 4, 7, 1, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38344() {
        int[] input = {7, 4, 1, 6, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 1, 3, 5, 2, 4, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38345() {
        int[] input = {7, 4, 6, 1, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 3, 1, 2, 4, 7, 6, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38346() {
        int[] input = {4, 7, 6, 1, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 1, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38347() {
        int[] input = {4, 6, 7, 1, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 4, 6, 1, 3, 7, 4, 6, 1, 3, 2, 5, 4, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38348() {
        int[] input = {4, 6, 1, 7, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 7, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38349() {
        int[] input = {4, 6, 1, 0, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 2, 7, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38350() {
        int[] input = {4, 6, 1, 0, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38351() {
        int[] input = {4, 6, 1, 0, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38352() {
        int[] input = {4, 6, 1, 0, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 3, 5, 6, 4, 1, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38353() {
        int[] input = {6, 4, 1, 0, 3, 2, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 4, 3, 2, 1, 7, 5, 2, 1, 7, 4, 6, 3, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38354() {
        int[] input = {6, 4, 1, 0, 3, 2, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38355() {
        int[] input = {6, 4, 1, 0, 3, 7, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 6, 4, 6, 1, 5, 2, 3, 7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38356() {
        int[] input = {6, 4, 1, 0, 7, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 1, 6, 4, 6, 1, 5, 2, 7, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38357() {
        int[] input = {6, 4, 1, 7, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 6, 4, 6, 1, 5, 2, 7, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38358() {
        int[] input = {6, 4, 7, 1, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 3, 1, 2, 4, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38359() {
        int[] input = {6, 7, 4, 1, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 1, 7, 6, 4, 5, 2, 1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38360() {
        int[] input = {7, 6, 4, 1, 0, 3, 2, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 1, 3, 5, 4, 6, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38361() {
        int[] input = {7, 6, 4, 1, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 3, 2, 5, 6, 4, 3, 2, 5, 6, 4, 3, 7, 2, 7, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38362() {
        int[] input = {6, 7, 4, 1, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 3, 2, 5, 7, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38363() {
        int[] input = {6, 4, 7, 1, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 7, 6, 4, 1, 3, 6, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38364() {
        int[] input = {6, 4, 1, 7, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38365() {
        int[] input = {6, 4, 1, 0, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38366() {
        int[] input = {6, 4, 1, 0, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 6, 4, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38367() {
        int[] input = {6, 4, 1, 0, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 3, 4, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38368() {
        int[] input = {6, 4, 1, 0, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 7, 2, 4, 1, 6, 5, 6, 1, 3, 7, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38369() {
        int[] input = {4, 6, 1, 0, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 3, 6, 2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38370() {
        int[] input = {4, 6, 1, 0, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38371() {
        int[] input = {4, 6, 1, 0, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38372() {
        int[] input = {4, 6, 1, 0, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38373() {
        int[] input = {4, 6, 1, 7, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38374() {
        int[] input = {4, 6, 7, 1, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 3, 7, 6, 5, 1, 7, 6, 4, 5, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38375() {
        int[] input = {4, 7, 6, 1, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 7, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38376() {
        int[] input = {7, 4, 6, 1, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38377() {
        int[] input = {7, 4, 1, 6, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 7, 4, 6, 3, 1, 2, 5, 3, 6, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38378() {
        int[] input = {4, 7, 1, 6, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 3, 6, 7, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38379() {
        int[] input = {4, 1, 7, 6, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 3, 6, 1, 7, 4, 3, 4, 7, 5, 2, 6, 4, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38380() {
        int[] input = {4, 1, 6, 7, 0, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 1, 4, 6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38381() {
        int[] input = {4, 1, 6, 0, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 6, 4, 1, 4, 6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38382() {
        int[] input = {4, 1, 6, 0, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 7, 3, 1, 4, 6, 7, 6, 4, 1, 3, 6, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38383() {
        int[] input = {4, 1, 6, 0, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 1, 6, 5, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38384() {
        int[] input = {4, 1, 6, 0, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 5, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38385() {
        int[] input = {4, 1, 0, 6, 3, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38386() {
        int[] input = {4, 1, 0, 6, 3, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38387() {
        int[] input = {4, 1, 0, 6, 3, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38388() {
        int[] input = {4, 1, 0, 6, 7, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38389() {
        int[] input = {4, 1, 0, 7, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38390() {
        int[] input = {4, 1, 7, 0, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 6, 1, 7, 4, 3, 4, 7, 5, 2, 6, 4, 7, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38391() {
        int[] input = {4, 7, 1, 0, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 6, 7, 5, 2, 6, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38392() {
        int[] input = {7, 4, 1, 0, 6, 3, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 1, 7, 4, 6, 3, 1, 2, 5, 3, 6, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38393() {
        int[] input = {7, 4, 1, 0, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 7, 4, 7, 1, 2, 5, 3, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38394() {
        int[] input = {4, 7, 1, 0, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38395() {
        int[] input = {4, 1, 7, 0, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38396() {
        int[] input = {4, 1, 0, 7, 3, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 6, 2, 5, 7, 4, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38397() {
        int[] input = {4, 1, 0, 3, 7, 6, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 2, 6, 1, 3, 5, 7, 1, 3, 4, 5, 7, 1, 3, 4, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38398() {
        int[] input = {4, 1, 0, 3, 6, 7, 5, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 1, 4, 7, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38399() {
        int[] input = {4, 1, 0, 3, 6, 5, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 5, 6, 3, 7, 2, 6, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38400() {
        int[] input = {4, 1, 0, 3, 6, 5, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38401() {
        int[] input = {4, 1, 0, 3, 5, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 2, 7, 5, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38402() {
        int[] input = {4, 1, 0, 3, 5, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38403() {
        int[] input = {4, 1, 0, 3, 5, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38404() {
        int[] input = {4, 1, 0, 3, 7, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 3, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38405() {
        int[] input = {4, 1, 0, 7, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 5, 3, 7, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38406() {
        int[] input = {4, 1, 7, 0, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 4, 1, 3, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38407() {
        int[] input = {4, 7, 1, 0, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38408() {
        int[] input = {7, 4, 1, 0, 3, 5, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 5, 2, 6, 4, 7, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38409() {
        int[] input = {7, 4, 1, 0, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38410() {
        int[] input = {4, 7, 1, 0, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38411() {
        int[] input = {4, 1, 7, 0, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 1, 7, 4, 5, 4, 7, 1, 3, 4, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38412() {
        int[] input = {4, 1, 0, 7, 3, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38413() {
        int[] input = {4, 1, 0, 3, 7, 5, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38414() {
        int[] input = {4, 1, 0, 3, 5, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 6, 7, 1, 3, 2, 5, 1, 3, 4, 2, 4, 3, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38415() {
        int[] input = {4, 1, 0, 3, 5, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 3, 1, 4, 2, 6, 5, 1, 3, 7, 5, 1, 3, 4, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38416() {
        int[] input = {4, 1, 0, 3, 5, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 2, 1, 4, 3, 5, 2, 1, 4, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38417() {
        int[] input = {4, 1, 0, 5, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38418() {
        int[] input = {4, 1, 0, 5, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 1, 5, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38419() {
        int[] input = {4, 1, 0, 5, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38420() {
        int[] input = {4, 1, 0, 5, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38421() {
        int[] input = {4, 1, 0, 7, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 3, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38422() {
        int[] input = {4, 1, 7, 0, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38423() {
        int[] input = {4, 7, 1, 0, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 3, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38424() {
        int[] input = {7, 4, 1, 0, 5, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 1, 4, 5, 3, 1, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38425() {
        int[] input = {7, 4, 1, 0, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 2, 6, 4, 1, 3, 2, 5, 1, 3, 7, 2, 7, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38426() {
        int[] input = {4, 7, 1, 0, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 1, 7, 5, 3, 1, 2, 6, 3, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38427() {
        int[] input = {4, 1, 7, 0, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38428() {
        int[] input = {4, 1, 0, 7, 5, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 1, 7, 5, 3, 1, 2, 6, 3, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38429() {
        int[] input = {4, 1, 0, 5, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38430() {
        int[] input = {4, 1, 0, 5, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38431() {
        int[] input = {4, 1, 0, 5, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 6, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38432() {
        int[] input = {4, 1, 0, 5, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 6, 1, 4, 5, 4, 1, 7, 2, 3, 4, 5, 1, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38433() {
        int[] input = {4, 1, 0, 5, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 3, 4, 1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38434() {
        int[] input = {4, 1, 0, 5, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38435() {
        int[] input = {4, 1, 0, 5, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38436() {
        int[] input = {4, 1, 0, 5, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 6, 7, 3, 2, 6, 7, 1, 4, 5, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38437() {
        int[] input = {4, 1, 0, 7, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 2, 6, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38438() {
        int[] input = {4, 1, 7, 0, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 2, 3, 1, 7, 6, 2, 3, 1, 7, 6, 4, 2, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38439() {
        int[] input = {4, 7, 1, 0, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38440() {
        int[] input = {7, 4, 1, 0, 5, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38441() {
        int[] input = {7, 4, 1, 0, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38442() {
        int[] input = {4, 7, 1, 0, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 4, 7, 6, 5, 1, 4, 6, 5, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38443() {
        int[] input = {4, 1, 7, 0, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 6, 3, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38444() {
        int[] input = {4, 1, 0, 7, 6, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 3, 2, 6, 5, 1, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38445() {
        int[] input = {4, 1, 0, 6, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38446() {
        int[] input = {4, 1, 0, 6, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 1, 6, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38447() {
        int[] input = {4, 1, 0, 6, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38448() {
        int[] input = {4, 1, 0, 6, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38449() {
        int[] input = {4, 1, 6, 0, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 5, 1, 4, 6, 3, 6, 4, 2, 7, 5, 6, 4, 2, 1, 6, 4, 3, 2, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38450() {
        int[] input = {4, 1, 6, 0, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 5, 1, 6, 3, 5, 2, 7, 6, 3, 5, 2, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38451() {
        int[] input = {4, 1, 6, 0, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 1, 6, 4, 7, 4, 6, 1, 5, 4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38452() {
        int[] input = {4, 1, 6, 0, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 4, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38453() {
        int[] input = {4, 1, 6, 7, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 6, 4, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38454() {
        int[] input = {4, 1, 7, 6, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 5, 6, 3, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38455() {
        int[] input = {4, 7, 1, 6, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 6, 5, 1, 4, 6, 5, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38456() {
        int[] input = {7, 4, 1, 6, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38457() {
        int[] input = {7, 4, 6, 1, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 1, 5, 2, 6, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38458() {
        int[] input = {4, 7, 6, 1, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 4, 7, 1, 5, 4, 6, 7, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38459() {
        int[] input = {4, 6, 7, 1, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 7, 4, 6, 1, 5, 4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38460() {
        int[] input = {4, 6, 1, 7, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38461() {
        int[] input = {4, 6, 1, 0, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38462() {
        int[] input = {4, 6, 1, 0, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 6, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38463() {
        int[] input = {4, 6, 1, 0, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38464() {
        int[] input = {4, 6, 1, 0, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38465() {
        int[] input = {6, 4, 1, 0, 5, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 1, 4, 2, 5, 1, 4, 6, 2, 6, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38466() {
        int[] input = {6, 4, 1, 0, 5, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 5, 4, 1, 6, 3, 5, 4, 1, 6, 5, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38467() {
        int[] input = {6, 4, 1, 0, 5, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38468() {
        int[] input = {6, 4, 1, 0, 7, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38469() {
        int[] input = {6, 4, 1, 7, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38470() {
        int[] input = {6, 4, 7, 1, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 5, 7, 4, 3, 1, 7, 4, 6, 3, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38471() {
        int[] input = {6, 7, 4, 1, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 7, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38472() {
        int[] input = {7, 6, 4, 1, 0, 5, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38473() {
        int[] input = {7, 6, 4, 1, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38474() {
        int[] input = {6, 7, 4, 1, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38475() {
        int[] input = {6, 4, 7, 1, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 2, 5, 7, 4, 3, 1, 7, 4, 6, 3, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38476() {
        int[] input = {6, 4, 1, 7, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38477() {
        int[] input = {6, 4, 1, 5, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38478() {
        int[] input = {6, 4, 1, 5, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 4, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38479() {
        int[] input = {6, 4, 1, 5, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 3, 5, 4, 1, 6, 3, 5, 4, 1, 6, 5, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38480() {
        int[] input = {6, 4, 1, 5, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 3, 1, 4, 2, 5, 1, 4, 6, 2, 6, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38481() {
        int[] input = {4, 6, 1, 5, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38482() {
        int[] input = {4, 6, 1, 5, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 1, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38483() {
        int[] input = {4, 6, 1, 5, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38484() {
        int[] input = {4, 6, 1, 5, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 1, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38485() {
        int[] input = {4, 6, 1, 7, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38486() {
        int[] input = {4, 6, 7, 1, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 4, 7, 4, 6, 1, 5, 4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38487() {
        int[] input = {4, 7, 6, 1, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 1, 7, 6, 2, 3, 1, 7, 6, 4, 2, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38488() {
        int[] input = {7, 4, 6, 1, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 1, 5, 2, 6, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38489() {
        int[] input = {7, 4, 1, 6, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38490() {
        int[] input = {4, 7, 1, 6, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 6, 5, 1, 4, 6, 5, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38491() {
        int[] input = {4, 1, 7, 6, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 2, 5, 6, 3, 2, 5, 6, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38492() {
        int[] input = {4, 1, 6, 7, 5, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 4, 6, 4, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38493() {
        int[] input = {4, 1, 6, 5, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 2, 3, 5, 7, 1, 4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38494() {
        int[] input = {4, 1, 6, 5, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 7, 5, 1, 6, 4, 7, 4, 6, 1, 5, 4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38495() {
        int[] input = {4, 1, 6, 5, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 5, 1, 6, 2, 3, 1, 5, 7, 3, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38496() {
        int[] input = {4, 1, 6, 5, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 5, 3, 6, 1, 4, 5, 4, 1, 7, 2, 3, 4, 5, 1, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38497() {
        int[] input = {4, 1, 5, 6, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38498() {
        int[] input = {4, 1, 5, 6, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38499() {
        int[] input = {4, 1, 5, 6, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38500() {
        int[] input = {4, 1, 5, 6, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38501() {
        int[] input = {4, 1, 5, 7, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 2, 6, 5, 1, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38502() {
        int[] input = {4, 1, 7, 5, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38503() {
        int[] input = {4, 7, 1, 5, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 2, 6, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38504() {
        int[] input = {7, 4, 1, 5, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38505() {
        int[] input = {7, 4, 1, 5, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38506() {
        int[] input = {4, 7, 1, 5, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38507() {
        int[] input = {4, 1, 7, 5, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38508() {
        int[] input = {4, 1, 5, 7, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 6, 5, 1, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38509() {
        int[] input = {4, 1, 5, 0, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 5, 1, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38510() {
        int[] input = {4, 1, 5, 0, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38511() {
        int[] input = {4, 1, 5, 0, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 4, 1, 6, 3, 2, 7, 6, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38512() {
        int[] input = {4, 1, 5, 0, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38513() {
        int[] input = {4, 1, 5, 0, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38514() {
        int[] input = {4, 1, 5, 0, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 5, 4, 1, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38515() {
        int[] input = {4, 1, 5, 0, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 2, 6, 1, 3, 2, 7, 4, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38516() {
        int[] input = {4, 1, 5, 0, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 2, 6, 1, 4, 3, 2, 7, 4, 3, 5, 2, 5, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38517() {
        int[] input = {4, 1, 5, 7, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 3, 2, 6, 1, 4, 3, 2, 7, 4, 3, 5, 2, 5, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38518() {
        int[] input = {4, 1, 7, 5, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 3, 5, 1, 4, 7, 3, 5, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38519() {
        int[] input = {4, 7, 1, 5, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 7, 5, 3, 1, 2, 6, 3, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38520() {
        int[] input = {7, 4, 1, 5, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 7, 4, 5, 3, 1, 2, 6, 3, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38521() {
        int[] input = {7, 4, 1, 5, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 4, 5, 3, 1, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38522() {
        int[] input = {4, 7, 1, 5, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 1, 3, 5, 7, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38523() {
        int[] input = {4, 1, 7, 5, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38524() {
        int[] input = {4, 1, 5, 7, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 1, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38525() {
        int[] input = {4, 1, 5, 0, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 4, 1, 4, 5, 3, 7, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38526() {
        int[] input = {4, 1, 5, 0, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 1, 3, 7, 5, 1, 4, 3, 4, 1, 5, 7, 4, 3, 1, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38527() {
        int[] input = {4, 1, 5, 0, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 3, 1, 7, 6, 3, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38528() {
        int[] input = {4, 1, 5, 0, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38529() {
        int[] input = {4, 5, 1, 0, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38530() {
        int[] input = {4, 5, 1, 0, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 5, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38531() {
        int[] input = {4, 5, 1, 0, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 1, 4, 5, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38532() {
        int[] input = {4, 5, 1, 0, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 7, 5, 2, 6, 7, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38533() {
        int[] input = {4, 5, 1, 7, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 4, 5, 7, 3, 1, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38534() {
        int[] input = {4, 5, 7, 1, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 7, 4, 5, 1, 3, 4, 7, 5, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38535() {
        int[] input = {4, 7, 5, 1, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 5, 4, 7, 1, 3, 4, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38536() {
        int[] input = {7, 4, 5, 1, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 4, 7, 5, 3, 1, 7, 4, 5, 4, 7, 1, 3, 4, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38537() {
        int[] input = {7, 4, 5, 1, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 3, 2, 6, 4, 7, 5, 3, 5, 7, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38538() {
        int[] input = {4, 7, 5, 1, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 1, 7, 5, 3, 1, 2, 6, 5, 3, 4, 1, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38539() {
        int[] input = {4, 5, 7, 1, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 1, 3, 2, 7, 4, 5, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38540() {
        int[] input = {4, 5, 1, 7, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38541() {
        int[] input = {4, 5, 1, 0, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38542() {
        int[] input = {4, 5, 1, 0, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 7, 2, 6, 5, 4, 1, 7, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38543() {
        int[] input = {4, 5, 1, 0, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38544() {
        int[] input = {4, 5, 1, 0, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 4, 5, 4, 1, 7, 2, 3, 4, 5, 1, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38545() {
        int[] input = {4, 5, 1, 0, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 4, 5, 6, 3, 4, 1, 5, 6, 2, 7, 4, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38546() {
        int[] input = {4, 5, 1, 0, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38547() {
        int[] input = {4, 5, 1, 0, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38548() {
        int[] input = {4, 5, 1, 0, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 3, 2, 6, 7, 1, 4, 5, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38549() {
        int[] input = {4, 5, 1, 7, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 6, 7, 3, 2, 6, 7, 1, 4, 5, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38550() {
        int[] input = {4, 5, 7, 1, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 6, 1, 5, 7, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38551() {
        int[] input = {4, 7, 5, 1, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 6, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38552() {
        int[] input = {7, 4, 5, 1, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 6, 1, 4, 5, 7, 6, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38553() {
        int[] input = {7, 4, 5, 1, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 5, 6, 1, 4, 5, 7, 6, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38554() {
        int[] input = {4, 7, 5, 1, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 5, 6, 2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38555() {
        int[] input = {4, 5, 7, 1, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38556() {
        int[] input = {4, 5, 1, 7, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 6, 1, 2, 3, 6, 7, 4, 2, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38557() {
        int[] input = {4, 5, 1, 6, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38558() {
        int[] input = {4, 5, 1, 6, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 4, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38559() {
        int[] input = {4, 5, 1, 6, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38560() {
        int[] input = {4, 5, 1, 6, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 5, 6, 3, 1, 5, 4, 6, 3, 2, 7, 5, 1, 2, 3, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38561() {
        int[] input = {4, 5, 6, 1, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 3, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38562() {
        int[] input = {4, 5, 6, 1, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 6, 3, 1, 5, 4, 3, 1, 2, 7, 4, 3, 6, 1, 2, 5, 3, 4, 7, 5, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38563() {
        int[] input = {4, 5, 6, 1, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 7, 6, 5, 3, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38564() {
        int[] input = {4, 5, 6, 1, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 2, 7, 6, 5, 3, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38565() {
        int[] input = {4, 5, 6, 7, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38566() {
        int[] input = {4, 5, 7, 6, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 1, 7, 5, 4, 6, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38567() {
        int[] input = {4, 7, 5, 6, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 6, 1, 5, 4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38568() {
        int[] input = {7, 4, 5, 6, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 1, 5, 4, 6, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38569() {
        int[] input = {7, 4, 6, 5, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 7, 6, 1, 5, 7, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38570() {
        int[] input = {4, 7, 6, 5, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38571() {
        int[] input = {4, 6, 7, 5, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 4, 7, 2, 3, 5, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38572() {
        int[] input = {4, 6, 5, 7, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 5, 1, 2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38573() {
        int[] input = {4, 6, 5, 1, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38574() {
        int[] input = {4, 6, 5, 1, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 6, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38575() {
        int[] input = {4, 6, 5, 1, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38576() {
        int[] input = {4, 6, 5, 1, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 4, 6, 2, 7, 3, 4, 5, 6, 5, 4, 1, 2, 5, 6, 4, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38577() {
        int[] input = {6, 4, 5, 1, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 5, 6, 4, 1, 3, 6, 5, 4, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38578() {
        int[] input = {6, 4, 5, 1, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 1, 3, 2, 5, 6, 4, 3, 1, 7, 5, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38579() {
        int[] input = {6, 4, 5, 1, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38580() {
        int[] input = {6, 4, 5, 1, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 7, 5, 4, 6, 1, 6, 4, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38581() {
        int[] input = {6, 4, 5, 7, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 1, 5, 4, 6, 7, 1, 3, 2, 4, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38582() {
        int[] input = {6, 4, 7, 5, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38583() {
        int[] input = {6, 7, 4, 5, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38584() {
        int[] input = {7, 6, 4, 5, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38585() {
        int[] input = {7, 6, 5, 4, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 5, 2, 1, 6, 5, 7, 2, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38586() {
        int[] input = {6, 7, 5, 4, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 3, 2, 5, 7, 4, 3, 1, 7, 4, 6, 3, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38587() {
        int[] input = {6, 5, 7, 4, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38588() {
        int[] input = {6, 5, 4, 7, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 5, 6, 4, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38589() {
        int[] input = {6, 5, 4, 1, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 4, 7, 2, 3, 5, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38590() {
        int[] input = {6, 5, 4, 1, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 7, 2, 3, 5, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38591() {
        int[] input = {6, 5, 4, 1, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 1, 7, 2, 4, 5, 6, 1, 7, 3, 5, 6, 7, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38592() {
        int[] input = {6, 5, 4, 1, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 3, 1, 2, 5, 6, 4, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38593() {
        int[] input = {5, 6, 4, 1, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 3, 4, 5, 6, 5, 4, 1, 2, 5, 6, 4, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38594() {
        int[] input = {5, 6, 4, 1, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38595() {
        int[] input = {5, 6, 4, 1, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 7, 1, 6, 4, 5, 7, 1, 6, 4, 5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38596() {
        int[] input = {5, 6, 4, 1, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 1, 7, 4, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38597() {
        int[] input = {5, 6, 4, 7, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 1, 4, 6, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38598() {
        int[] input = {5, 6, 7, 4, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 5, 7, 1, 4, 5, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38599() {
        int[] input = {5, 7, 6, 4, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 5, 6, 1, 4, 5, 7, 6, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38600() {
        int[] input = {7, 5, 6, 4, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 6, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38601() {
        int[] input = {7, 5, 4, 6, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38602() {
        int[] input = {5, 7, 4, 6, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 4, 2, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38603() {
        int[] input = {5, 4, 7, 6, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 7, 1, 6, 4, 5, 7, 1, 7, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38604() {
        int[] input = {5, 4, 6, 7, 1, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38605() {
        int[] input = {5, 4, 6, 1, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 6, 7, 1, 4, 5, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38606() {
        int[] input = {5, 4, 6, 1, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 6, 7, 1, 4, 5, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38607() {
        int[] input = {5, 4, 6, 1, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 6, 3, 2, 7, 4, 5, 3, 2, 1, 5, 3, 6, 2, 1, 5, 3, 4, 7, 5, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38608() {
        int[] input = {5, 4, 6, 1, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 5, 4, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38609() {
        int[] input = {5, 4, 1, 6, 0, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 1, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38610() {
        int[] input = {5, 4, 1, 6, 0, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38611() {
        int[] input = {5, 4, 1, 6, 0, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 1, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38612() {
        int[] input = {5, 4, 1, 6, 7, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38613() {
        int[] input = {5, 4, 1, 7, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 4, 1, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38614() {
        int[] input = {5, 4, 7, 1, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38615() {
        int[] input = {5, 7, 4, 1, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38616() {
        int[] input = {7, 5, 4, 1, 6, 0, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 2, 6, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38617() {
        int[] input = {7, 5, 4, 1, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 6, 4, 7, 5, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38618() {
        int[] input = {5, 7, 4, 1, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 2, 6, 4, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38619() {
        int[] input = {5, 4, 7, 1, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 4, 1, 3, 2, 7, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38620() {
        int[] input = {5, 4, 1, 7, 0, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 4, 1, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38621() {
        int[] input = {5, 4, 1, 0, 7, 6, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 3, 7, 4, 1, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38622() {
        int[] input = {5, 4, 1, 0, 6, 7, 3, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 7, 6, 4, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38623() {
        int[] input = {5, 4, 1, 0, 6, 3, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38624() {
        int[] input = {5, 4, 1, 0, 6, 3, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38625() {
        int[] input = {5, 4, 1, 0, 3, 6, 2, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 5, 4, 3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38626() {
        int[] input = {5, 4, 1, 0, 3, 6, 7, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38627() {
        int[] input = {5, 4, 1, 0, 3, 7, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 2, 6, 4, 1, 5, 7, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38628() {
        int[] input = {5, 4, 1, 0, 7, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38629() {
        int[] input = {5, 4, 1, 7, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 1, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38630() {
        int[] input = {5, 4, 7, 1, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 1, 3, 2, 7, 4, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38631() {
        int[] input = {5, 7, 4, 1, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 3, 1, 7, 5, 3, 1, 2, 6, 5, 3, 4, 1, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38632() {
        int[] input = {7, 5, 4, 1, 0, 3, 6, 2};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 4, 3, 2, 6, 5, 7, 3, 2, 1, 7, 3, 4, 2, 1, 7, 3, 5, 6, 7, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38633() {
        int[] input = {7, 5, 4, 1, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 5, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38634() {
        int[] input = {5, 7, 4, 1, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38635() {
        int[] input = {5, 4, 7, 1, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 2, 1, 3, 6, 7, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38636() {
        int[] input = {5, 4, 1, 7, 0, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38637() {
        int[] input = {5, 4, 1, 0, 7, 3, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38638() {
        int[] input = {5, 4, 1, 0, 3, 7, 2, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 1, 4, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38639() {
        int[] input = {5, 4, 1, 0, 3, 2, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 5, 4, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38640() {
        int[] input = {5, 4, 1, 0, 3, 2, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38641() {
        int[] input = {5, 4, 1, 0, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 1, 4, 2, 3, 1, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38642() {
        int[] input = {5, 4, 1, 0, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38643() {
        int[] input = {5, 4, 1, 0, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38644() {
        int[] input = {5, 4, 1, 0, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 5, 4, 7, 2, 6, 3, 7, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38645() {
        int[] input = {5, 4, 1, 7, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 7, 4, 5, 1, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38646() {
        int[] input = {5, 4, 7, 1, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38647() {
        int[] input = {5, 7, 4, 1, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 6, 3, 7, 4, 5, 2, 5, 4, 1, 6, 5, 2, 4, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38648() {
        int[] input = {7, 5, 4, 1, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 4, 7, 5, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38649() {
        int[] input = {7, 5, 4, 1, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 2, 4, 5, 6, 3, 2, 4, 5, 6, 3, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38650() {
        int[] input = {5, 7, 4, 1, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38651() {
        int[] input = {5, 4, 7, 1, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 2, 3, 6, 4, 1, 3, 2, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38652() {
        int[] input = {5, 4, 1, 7, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38653() {
        int[] input = {5, 4, 1, 0, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38654() {
        int[] input = {5, 4, 1, 0, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 6, 2, 4, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38655() {
        int[] input = {5, 4, 1, 0, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38656() {
        int[] input = {5, 4, 1, 0, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 1, 5, 4, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38657() {
        int[] input = {5, 4, 1, 0, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38658() {
        int[] input = {5, 4, 1, 0, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38659() {
        int[] input = {5, 4, 1, 0, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 2, 6, 4, 5, 1, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38660() {
        int[] input = {5, 4, 1, 0, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38661() {
        int[] input = {5, 4, 1, 7, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38662() {
        int[] input = {5, 4, 7, 1, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 6, 7, 4, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38663() {
        int[] input = {5, 7, 4, 1, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 7, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38664() {
        int[] input = {7, 5, 4, 1, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38665() {
        int[] input = {7, 5, 4, 1, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38666() {
        int[] input = {5, 7, 4, 1, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 7, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38667() {
        int[] input = {5, 4, 7, 1, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 3, 6, 7, 4, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38668() {
        int[] input = {5, 4, 1, 7, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38669() {
        int[] input = {5, 4, 1, 6, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 5, 1, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38670() {
        int[] input = {5, 4, 1, 6, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 6, 4, 5, 1, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38671() {
        int[] input = {5, 4, 1, 6, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38672() {
        int[] input = {5, 4, 1, 6, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 7, 2, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38673() {
        int[] input = {5, 4, 6, 1, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 1, 4, 6, 5, 2, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38674() {
        int[] input = {5, 4, 6, 1, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 4, 5, 6, 2, 1, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38675() {
        int[] input = {5, 4, 6, 1, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38676() {
        int[] input = {5, 4, 6, 1, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38677() {
        int[] input = {5, 4, 6, 7, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 1, 6, 4, 5, 7, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38678() {
        int[] input = {5, 4, 7, 6, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 3, 1, 6, 2, 3, 1, 6, 7, 4, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38679() {
        int[] input = {5, 7, 4, 6, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 4, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38680() {
        int[] input = {7, 5, 4, 6, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 7, 4, 1, 6, 7, 5, 4, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38681() {
        int[] input = {7, 5, 6, 4, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 4, 2, 3, 6, 7, 4, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38682() {
        int[] input = {5, 7, 6, 4, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 2, 3, 6, 7, 4, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38683() {
        int[] input = {5, 6, 7, 4, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 1, 7, 6, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38684() {
        int[] input = {5, 6, 4, 7, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38685() {
        int[] input = {5, 6, 4, 1, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 4, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38686() {
        int[] input = {5, 6, 4, 1, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 4, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38687() {
        int[] input = {5, 6, 4, 1, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 2, 3, 7, 6, 1, 3, 2, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38688() {
        int[] input = {5, 6, 4, 1, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 2, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38689() {
        int[] input = {6, 5, 4, 1, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 2, 4, 6, 5, 6, 4, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38690() {
        int[] input = {6, 5, 4, 1, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 4, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38691() {
        int[] input = {6, 5, 4, 1, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 4, 6, 5, 1, 7, 6, 4, 5, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38692() {
        int[] input = {6, 5, 4, 1, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 3, 4, 6, 5, 7, 3, 4, 6, 7, 3, 1, 2, 6, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38693() {
        int[] input = {6, 5, 4, 7, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38694() {
        int[] input = {6, 5, 7, 4, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 5, 4, 1, 7, 6, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38695() {
        int[] input = {6, 7, 5, 4, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 1, 4, 2, 7, 5, 4, 1, 3, 7, 5, 6, 4, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38696() {
        int[] input = {7, 6, 5, 4, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 7, 5, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38697() {
        int[] input = {7, 6, 4, 5, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 2, 3, 4, 6, 5, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38698() {
        int[] input = {6, 7, 4, 5, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 4, 3, 2, 5, 7, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38699() {
        int[] input = {6, 4, 7, 5, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 5, 1, 7, 6, 4, 5, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38700() {
        int[] input = {6, 4, 5, 7, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 3, 1, 5, 4, 2, 7, 5, 4, 6, 2, 6, 4, 1, 3, 7, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38701() {
        int[] input = {6, 4, 5, 1, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 6, 5, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38702() {
        int[] input = {6, 4, 5, 1, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 5, 6, 4, 1, 7, 6, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38703() {
        int[] input = {6, 4, 5, 1, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 5, 2, 1, 4, 6, 2, 1, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38704() {
        int[] input = {6, 4, 5, 1, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 4, 1, 3, 7, 5, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38705() {
        int[] input = {4, 6, 5, 1, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 7, 2, 1, 3, 6, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38706() {
        int[] input = {4, 6, 5, 1, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 2, 3, 7, 6, 1, 3, 2, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38707() {
        int[] input = {4, 6, 5, 1, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38708() {
        int[] input = {4, 6, 5, 1, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38709() {
        int[] input = {4, 6, 5, 7, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 5, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38710() {
        int[] input = {4, 6, 7, 5, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 5, 1, 7, 6, 4, 5, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38711() {
        int[] input = {4, 7, 6, 5, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 4, 6, 3, 2, 5, 7, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38712() {
        int[] input = {7, 4, 6, 5, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 1, 3, 6, 4, 1, 5, 2, 6, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38713() {
        int[] input = {7, 4, 5, 6, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 7, 5, 1, 6, 7, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38714() {
        int[] input = {4, 7, 5, 6, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38715() {
        int[] input = {4, 5, 7, 6, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 3, 1, 6, 2, 3, 1, 6, 7, 4, 5, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38716() {
        int[] input = {4, 5, 6, 7, 1, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 6, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38717() {
        int[] input = {4, 5, 6, 1, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38718() {
        int[] input = {4, 5, 6, 1, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 5, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38719() {
        int[] input = {4, 5, 6, 1, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38720() {
        int[] input = {4, 5, 6, 1, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 6, 4, 5, 3, 7, 2, 4, 6, 5, 6, 4, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38721() {
        int[] input = {4, 5, 1, 6, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38722() {
        int[] input = {4, 5, 1, 6, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38723() {
        int[] input = {4, 5, 1, 6, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 6, 7, 1, 3, 2, 7, 6, 5, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38724() {
        int[] input = {4, 5, 1, 6, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 7, 1, 3, 2, 7, 6, 5, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38725() {
        int[] input = {4, 5, 1, 7, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38726() {
        int[] input = {4, 5, 7, 1, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 3, 6, 7, 4, 5, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38727() {
        int[] input = {4, 7, 5, 1, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 4, 5, 3, 2, 1, 4, 5, 3, 6, 4, 5, 7, 3, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38728() {
        int[] input = {7, 4, 5, 1, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 4, 5, 3, 6, 4, 5, 7, 3, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38729() {
        int[] input = {7, 4, 5, 1, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 1, 4, 5, 3, 6, 4, 5, 7, 3, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38730() {
        int[] input = {4, 7, 5, 1, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 6, 1, 7, 5, 4, 6, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38731() {
        int[] input = {4, 5, 7, 1, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 6, 7, 4, 5, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38732() {
        int[] input = {4, 5, 1, 7, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38733() {
        int[] input = {4, 5, 1, 0, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38734() {
        int[] input = {4, 5, 1, 0, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 6, 7, 1, 3, 2, 7, 6, 5, 3, 2, 7, 6, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38735() {
        int[] input = {4, 5, 1, 0, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 6, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38736() {
        int[] input = {4, 5, 1, 0, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38737() {
        int[] input = {4, 5, 1, 0, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 2, 5, 1, 4, 6, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38738() {
        int[] input = {4, 5, 1, 0, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 2, 5, 1, 4, 6, 4, 1, 5, 2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38739() {
        int[] input = {4, 5, 1, 0, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38740() {
        int[] input = {4, 5, 1, 0, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38741() {
        int[] input = {4, 5, 1, 7, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38742() {
        int[] input = {4, 5, 7, 1, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 7, 2, 1, 5, 4, 2, 1, 3, 6, 4, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38743() {
        int[] input = {4, 7, 5, 1, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 5, 2, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38744() {
        int[] input = {7, 4, 5, 1, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 3, 6, 4, 1, 3, 2, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38745() {
        int[] input = {7, 4, 5, 1, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 7, 4, 1, 2, 7, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38746() {
        int[] input = {4, 7, 5, 1, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 6, 2, 5, 7, 3, 1, 5, 7, 4, 3, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38747() {
        int[] input = {4, 5, 7, 1, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38748() {
        int[] input = {4, 5, 1, 7, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 7, 5, 1, 6, 2, 5, 1, 4, 6, 4, 1, 5, 2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38749() {
        int[] input = {4, 5, 1, 0, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 2, 7, 5, 3, 6, 7, 5, 3, 4, 2, 5, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38750() {
        int[] input = {4, 5, 1, 0, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38751() {
        int[] input = {4, 5, 1, 0, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38752() {
        int[] input = {4, 5, 1, 0, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38753() {
        int[] input = {4, 1, 5, 0, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38754() {
        int[] input = {4, 1, 5, 0, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 2, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38755() {
        int[] input = {4, 1, 5, 0, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38756() {
        int[] input = {4, 1, 5, 0, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38757() {
        int[] input = {4, 1, 5, 7, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38758() {
        int[] input = {4, 1, 7, 5, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38759() {
        int[] input = {4, 7, 1, 5, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 4, 7, 4, 1, 6, 3, 5, 4, 7, 1, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38760() {
        int[] input = {7, 4, 1, 5, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 1, 7, 4, 5, 2, 7, 4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38761() {
        int[] input = {7, 4, 1, 5, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 4, 5, 2, 1, 3, 6, 2, 1, 3, 4, 7, 5, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38762() {
        int[] input = {4, 7, 1, 5, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 5, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38763() {
        int[] input = {4, 1, 7, 5, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38764() {
        int[] input = {4, 1, 5, 7, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38765() {
        int[] input = {4, 1, 5, 0, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38766() {
        int[] input = {4, 1, 5, 0, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 5, 4, 1, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38767() {
        int[] input = {4, 1, 5, 0, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38768() {
        int[] input = {4, 1, 5, 0, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 4, 1, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38769() {
        int[] input = {4, 1, 5, 0, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 1, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38770() {
        int[] input = {4, 1, 5, 0, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 6, 1, 5, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38771() {
        int[] input = {4, 1, 5, 0, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 5, 4, 1, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38772() {
        int[] input = {4, 1, 5, 0, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38773() {
        int[] input = {4, 1, 5, 7, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38774() {
        int[] input = {4, 1, 7, 5, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 6, 3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38775() {
        int[] input = {4, 7, 1, 5, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 1, 7, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38776() {
        int[] input = {7, 4, 1, 5, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38777() {
        int[] input = {7, 4, 1, 5, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 5, 2, 3, 1, 6, 2, 3, 1, 6, 7, 4, 5, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38778() {
        int[] input = {4, 7, 1, 5, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 3, 1, 6, 2, 3, 1, 6, 7, 4, 5, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38779() {
        int[] input = {4, 1, 7, 5, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 7, 6, 3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38780() {
        int[] input = {4, 1, 5, 7, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38781() {
        int[] input = {4, 1, 5, 6, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 3, 7, 5, 4, 1, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38782() {
        int[] input = {4, 1, 5, 6, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 5, 4, 1, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38783() {
        int[] input = {4, 1, 5, 6, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 1, 5, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38784() {
        int[] input = {4, 1, 5, 6, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 1, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38785() {
        int[] input = {4, 1, 6, 5, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 6, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38786() {
        int[] input = {4, 1, 6, 5, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 6, 4, 1, 5, 2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38787() {
        int[] input = {4, 1, 6, 5, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38788() {
        int[] input = {4, 1, 6, 5, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38789() {
        int[] input = {4, 1, 6, 7, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 3, 5, 6, 1, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38790() {
        int[] input = {4, 1, 7, 6, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 5, 7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38791() {
        int[] input = {4, 7, 1, 6, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38792() {
        int[] input = {7, 4, 1, 6, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 3, 1, 4, 6, 2, 3, 1, 4, 6, 7, 2, 3, 1, 4, 6, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38793() {
        int[] input = {7, 4, 6, 1, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 5, 3, 6, 4, 5, 1, 2, 6, 4, 7, 5, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38794() {
        int[] input = {4, 7, 6, 1, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38795() {
        int[] input = {4, 6, 7, 1, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38796() {
        int[] input = {4, 6, 1, 7, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 4, 1, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38797() {
        int[] input = {4, 6, 1, 5, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38798() {
        int[] input = {4, 6, 1, 5, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38799() {
        int[] input = {4, 6, 1, 5, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38800() {
        int[] input = {4, 6, 1, 5, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 2, 5, 3, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38801() {
        int[] input = {6, 4, 1, 5, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 4, 5, 3, 7, 1, 4, 6, 5, 6, 4, 2, 3, 6, 5, 4, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38802() {
        int[] input = {6, 4, 1, 5, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38803() {
        int[] input = {6, 4, 1, 5, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38804() {
        int[] input = {6, 4, 1, 5, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38805() {
        int[] input = {6, 4, 1, 7, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 1, 3, 2, 5, 7, 4, 3, 2, 5, 7, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38806() {
        int[] input = {6, 4, 7, 1, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38807() {
        int[] input = {6, 7, 4, 1, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38808() {
        int[] input = {7, 6, 4, 1, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 7, 4, 5, 1, 6, 7, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38809() {
        int[] input = {7, 6, 4, 1, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 5, 1, 6, 7, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38810() {
        int[] input = {6, 7, 4, 1, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38811() {
        int[] input = {6, 4, 7, 1, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 4, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38812() {
        int[] input = {6, 4, 1, 7, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 1, 6, 4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38813() {
        int[] input = {6, 4, 1, 0, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 6, 4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38814() {
        int[] input = {6, 4, 1, 0, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38815() {
        int[] input = {6, 4, 1, 0, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38816() {
        int[] input = {6, 4, 1, 0, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 1, 4, 5, 3, 7, 1, 4, 6, 5, 6, 4, 2, 3, 6, 5, 4, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38817() {
        int[] input = {4, 6, 1, 0, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 5, 3, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38818() {
        int[] input = {4, 6, 1, 0, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38819() {
        int[] input = {4, 6, 1, 0, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38820() {
        int[] input = {4, 6, 1, 0, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 3, 2, 7, 6, 4, 1, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38821() {
        int[] input = {4, 6, 1, 7, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 7, 6, 4, 1, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38822() {
        int[] input = {4, 6, 7, 1, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 1, 6, 7, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38823() {
        int[] input = {4, 7, 6, 1, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38824() {
        int[] input = {7, 4, 6, 1, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 1, 5, 3, 6, 4, 5, 1, 2, 6, 4, 7, 5, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38825() {
        int[] input = {7, 4, 1, 6, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 1, 5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38826() {
        int[] input = {4, 7, 1, 6, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38827() {
        int[] input = {4, 1, 7, 6, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 7, 5, 3, 2, 1, 4, 5, 3, 6, 4, 5, 7, 3, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38828() {
        int[] input = {4, 1, 6, 7, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 5, 6, 1, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38829() {
        int[] input = {4, 1, 6, 0, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 6, 1, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38830() {
        int[] input = {4, 1, 6, 0, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38831() {
        int[] input = {4, 1, 6, 0, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 4, 1, 5, 2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38832() {
        int[] input = {4, 1, 6, 0, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38833() {
        int[] input = {4, 1, 0, 6, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 2, 5, 3, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38834() {
        int[] input = {4, 1, 0, 6, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38835() {
        int[] input = {4, 1, 0, 6, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38836() {
        int[] input = {4, 1, 0, 6, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 5, 3, 2, 6, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38837() {
        int[] input = {4, 1, 0, 7, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38838() {
        int[] input = {4, 1, 7, 0, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 3, 2, 1, 4, 5, 3, 6, 4, 5, 7, 3, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38839() {
        int[] input = {4, 7, 1, 0, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38840() {
        int[] input = {7, 4, 1, 0, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38841() {
        int[] input = {7, 4, 1, 0, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38842() {
        int[] input = {4, 7, 1, 0, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 1, 7, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38843() {
        int[] input = {4, 1, 7, 0, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38844() {
        int[] input = {4, 1, 0, 7, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 3, 6, 1, 7, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38845() {
        int[] input = {4, 1, 0, 5, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38846() {
        int[] input = {4, 1, 0, 5, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 5, 1, 7, 6, 3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38847() {
        int[] input = {4, 1, 0, 5, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 2, 3, 7, 6, 5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38848() {
        int[] input = {4, 1, 0, 5, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38849() {
        int[] input = {4, 1, 0, 5, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 1, 4, 6, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38850() {
        int[] input = {4, 1, 0, 5, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 1, 4, 6, 4, 1, 5, 2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38851() {
        int[] input = {4, 1, 0, 5, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38852() {
        int[] input = {4, 1, 0, 5, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38853() {
        int[] input = {4, 1, 0, 7, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 3, 6, 5, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38854() {
        int[] input = {4, 1, 7, 0, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38855() {
        int[] input = {4, 7, 1, 0, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 5, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38856() {
        int[] input = {7, 4, 1, 0, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 1, 4, 5, 2, 1, 3, 6, 2, 1, 3, 4, 7, 5, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38857() {
        int[] input = {7, 4, 1, 0, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 7, 4, 5, 2, 7, 4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38858() {
        int[] input = {4, 7, 1, 0, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 1, 4, 7, 4, 1, 6, 3, 5, 4, 7, 1, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38859() {
        int[] input = {4, 1, 7, 0, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38860() {
        int[] input = {4, 1, 0, 7, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 1, 4, 7, 4, 1, 6, 3, 5, 4, 7, 1, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38861() {
        int[] input = {4, 1, 0, 5, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 2, 7, 5, 3, 6, 7, 5, 3, 4, 2, 5, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38862() {
        int[] input = {4, 1, 0, 5, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38863() {
        int[] input = {4, 1, 0, 5, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 6, 3, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38864() {
        int[] input = {4, 1, 0, 5, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38865() {
        int[] input = {4, 1, 0, 2, 5, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38866() {
        int[] input = {4, 1, 0, 2, 5, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 7, 6, 3, 5, 7, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38867() {
        int[] input = {4, 1, 0, 2, 5, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 6, 7, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38868() {
        int[] input = {4, 1, 0, 2, 7, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38869() {
        int[] input = {4, 1, 0, 7, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38870() {
        int[] input = {4, 1, 7, 0, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 2, 1, 4, 7, 5, 7, 4, 1, 2, 7, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38871() {
        int[] input = {4, 7, 1, 0, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 7, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38872() {
        int[] input = {7, 4, 1, 0, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38873() {
        int[] input = {7, 4, 1, 0, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38874() {
        int[] input = {4, 7, 1, 0, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 5, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38875() {
        int[] input = {4, 1, 7, 0, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 4, 1, 2, 5, 3, 6, 2, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38876() {
        int[] input = {4, 1, 0, 7, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 5, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38877() {
        int[] input = {4, 1, 0, 2, 7, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38878() {
        int[] input = {4, 1, 0, 2, 5, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 6, 2, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38879() {
        int[] input = {4, 1, 0, 2, 5, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 6, 1, 4, 2, 5, 6, 1, 3, 7, 6, 5, 4, 3, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38880() {
        int[] input = {4, 1, 0, 2, 5, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 3, 7, 5, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38881() {
        int[] input = {4, 1, 0, 2, 6, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38882() {
        int[] input = {4, 1, 0, 2, 6, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38883() {
        int[] input = {4, 1, 0, 2, 6, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38884() {
        int[] input = {4, 1, 0, 2, 7, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 6, 3, 5, 7, 2, 1, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38885() {
        int[] input = {4, 1, 0, 7, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 7, 1, 4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38886() {
        int[] input = {4, 1, 7, 0, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38887() {
        int[] input = {4, 7, 1, 0, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 1, 4, 7, 4, 1, 6, 2, 4, 7, 1, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38888() {
        int[] input = {7, 4, 1, 0, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38889() {
        int[] input = {7, 4, 1, 0, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 5, 6, 4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38890() {
        int[] input = {4, 7, 1, 0, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 1, 4, 7, 4, 1, 3, 5, 6, 4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38891() {
        int[] input = {4, 1, 7, 0, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38892() {
        int[] input = {4, 1, 0, 7, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 1, 2, 3, 6, 1, 2, 4, 3, 4, 2, 1, 6, 4, 3, 2, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38893() {
        int[] input = {4, 1, 0, 6, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 1, 4, 2, 4, 1, 6, 7, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38894() {
        int[] input = {4, 1, 0, 6, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38895() {
        int[] input = {4, 1, 0, 6, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 6, 1, 5, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38896() {
        int[] input = {4, 1, 0, 6, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38897() {
        int[] input = {4, 1, 6, 0, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38898() {
        int[] input = {4, 1, 6, 0, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 2, 1, 6, 4, 5, 2, 3, 7, 6, 1, 3, 2, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38899() {
        int[] input = {4, 1, 6, 0, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 7, 2, 1, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38900() {
        int[] input = {4, 1, 6, 0, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 5, 7, 1, 4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38901() {
        int[] input = {4, 1, 6, 7, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 1, 4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38902() {
        int[] input = {4, 1, 7, 6, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 7, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38903() {
        int[] input = {4, 7, 1, 6, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 4, 7, 4, 1, 3, 5, 6, 4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38904() {
        int[] input = {7, 4, 1, 6, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 6, 4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38905() {
        int[] input = {7, 4, 6, 1, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 6, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38906() {
        int[] input = {4, 7, 6, 1, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 1, 5, 7, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38907() {
        int[] input = {4, 6, 7, 1, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 6, 4, 7, 2, 1, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38908() {
        int[] input = {4, 6, 1, 7, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 7, 5, 3, 1, 2, 5, 7, 6, 2, 1, 3, 7, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38909() {
        int[] input = {4, 6, 1, 0, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 7, 6, 1, 4, 2, 4, 1, 6, 7, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38910() {
        int[] input = {4, 6, 1, 0, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 4, 6, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38911() {
        int[] input = {4, 6, 1, 0, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 1, 4, 6, 2, 5, 1, 4, 6, 2, 6, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38912() {
        int[] input = {4, 6, 1, 0, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38913() {
        int[] input = {6, 4, 1, 0, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38914() {
        int[] input = {6, 4, 1, 0, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 1, 4, 2, 5, 1, 4, 6, 2, 6, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38915() {
        int[] input = {6, 4, 1, 0, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 2, 4, 1, 6, 7, 6, 1, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38916() {
        int[] input = {6, 4, 1, 0, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 1, 6, 4, 7, 5, 3, 1, 2, 5, 7, 6, 2, 1, 3, 7, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38917() {
        int[] input = {6, 4, 1, 7, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 4, 7, 5, 3, 1, 2, 5, 7, 6, 2, 1, 3, 7, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38918() {
        int[] input = {6, 4, 7, 1, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 1, 4, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38919() {
        int[] input = {6, 7, 4, 1, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38920() {
        int[] input = {7, 6, 4, 1, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 4, 6, 5, 1, 4, 6, 7, 5, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38921() {
        int[] input = {7, 6, 4, 1, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38922() {
        int[] input = {6, 7, 4, 1, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 2, 1, 3, 7, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38923() {
        int[] input = {6, 4, 7, 1, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 4, 6, 7, 2, 1, 6, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38924() {
        int[] input = {6, 4, 1, 7, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 4, 7, 3, 5, 1, 2, 3, 7, 4, 2, 1, 5, 7, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38925() {
        int[] input = {6, 4, 1, 0, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 4, 7, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38926() {
        int[] input = {6, 4, 1, 0, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 6, 4, 2, 7, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38927() {
        int[] input = {6, 4, 1, 0, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38928() {
        int[] input = {6, 4, 1, 0, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38929() {
        int[] input = {4, 6, 1, 0, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38930() {
        int[] input = {4, 6, 1, 0, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 5, 7, 6, 2, 5, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38931() {
        int[] input = {4, 6, 1, 0, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 2, 6, 1, 4, 7, 4, 1, 3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38932() {
        int[] input = {4, 6, 1, 0, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38933() {
        int[] input = {4, 6, 1, 7, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 5, 2, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38934() {
        int[] input = {4, 6, 7, 1, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38935() {
        int[] input = {4, 7, 6, 1, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 2, 1, 3, 7, 4, 6, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38936() {
        int[] input = {7, 4, 6, 1, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 5, 2, 6, 4, 3, 5, 2, 6, 4, 7, 3, 5, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38937() {
        int[] input = {7, 4, 1, 6, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38938() {
        int[] input = {4, 7, 1, 6, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38939() {
        int[] input = {4, 1, 7, 6, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 7, 4, 1, 3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38940() {
        int[] input = {4, 1, 6, 7, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 2, 5, 3, 1, 7, 5, 3, 1, 7, 6, 4, 2, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38941() {
        int[] input = {4, 1, 6, 0, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 5, 3, 1, 7, 5, 3, 1, 7, 6, 4, 2, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38942() {
        int[] input = {4, 1, 6, 0, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 1, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38943() {
        int[] input = {4, 1, 6, 0, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38944() {
        int[] input = {4, 1, 6, 0, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 4, 1, 5, 7, 3, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38945() {
        int[] input = {4, 1, 0, 6, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38946() {
        int[] input = {4, 1, 0, 6, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 6, 2, 5, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38947() {
        int[] input = {4, 1, 0, 6, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 1, 4, 7, 4, 1, 3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38948() {
        int[] input = {4, 1, 0, 6, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 5, 2, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38949() {
        int[] input = {4, 1, 0, 7, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38950() {
        int[] input = {4, 1, 7, 0, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 4, 1, 3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38951() {
        int[] input = {4, 7, 1, 0, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38952() {
        int[] input = {7, 4, 1, 0, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38953() {
        int[] input = {7, 4, 1, 0, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 1, 4, 2, 6, 1, 4, 7, 2, 7, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38954() {
        int[] input = {4, 7, 1, 0, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 2, 7, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38955() {
        int[] input = {4, 1, 7, 0, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 2, 1, 3, 5, 2, 1, 3, 7, 4, 6, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38956() {
        int[] input = {4, 1, 0, 7, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 2, 7, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38957() {
        int[] input = {4, 1, 0, 2, 7, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38958() {
        int[] input = {4, 1, 0, 2, 6, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 6, 7, 5, 3, 6, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38959() {
        int[] input = {4, 1, 0, 2, 6, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38960() {
        int[] input = {4, 1, 0, 2, 6, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 3, 1, 4, 2, 6, 5, 7, 1, 3, 5, 6, 4, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38961() {
        int[] input = {4, 1, 0, 2, 3, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 1, 4, 6, 4, 1, 5, 7, 3, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38962() {
        int[] input = {4, 1, 0, 2, 3, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38963() {
        int[] input = {4, 1, 0, 2, 3, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 7, 3, 2, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38964() {
        int[] input = {4, 1, 0, 2, 7, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 3, 5, 6, 2, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38965() {
        int[] input = {4, 1, 0, 7, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 1, 4, 3, 2, 7, 1, 4, 3, 2, 7, 5, 6, 4, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38966() {
        int[] input = {4, 1, 7, 0, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 3, 2, 1, 4, 3, 2, 5, 6, 4, 3, 7, 2, 7, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38967() {
        int[] input = {4, 7, 1, 0, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 1, 4, 7, 4, 1, 3, 2, 4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38968() {
        int[] input = {7, 4, 1, 0, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38969() {
        int[] input = {7, 4, 1, 0, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 7, 4, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38970() {
        int[] input = {4, 7, 1, 0, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38971() {
        int[] input = {4, 1, 7, 0, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38972() {
        int[] input = {4, 1, 0, 7, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38973() {
        int[] input = {4, 1, 0, 2, 7, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 4, 3, 7, 2, 5, 6, 7, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38974() {
        int[] input = {4, 1, 0, 2, 3, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38975() {
        int[] input = {4, 1, 0, 2, 3, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 2, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38976() {
        int[] input = {4, 1, 0, 2, 3, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38977() {
        int[] input = {1, 4, 0, 2, 3, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 5, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38978() {
        int[] input = {1, 4, 0, 2, 3, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 2, 3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38979() {
        int[] input = {1, 4, 0, 2, 3, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38980() {
        int[] input = {1, 4, 0, 2, 7, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 5, 6, 7, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38981() {
        int[] input = {1, 4, 0, 7, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38982() {
        int[] input = {1, 4, 7, 0, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38983() {
        int[] input = {1, 7, 4, 0, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38984() {
        int[] input = {7, 1, 4, 0, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 7, 1, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38985() {
        int[] input = {7, 1, 4, 0, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 1, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38986() {
        int[] input = {1, 7, 4, 0, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 1, 7, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38987() {
        int[] input = {1, 4, 7, 0, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38988() {
        int[] input = {1, 4, 0, 7, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 3, 4, 1, 7, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38989() {
        int[] input = {1, 4, 0, 2, 7, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 2, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38990() {
        int[] input = {1, 4, 0, 2, 3, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38991() {
        int[] input = {1, 4, 0, 2, 3, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38992() {
        int[] input = {1, 4, 0, 2, 3, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 4, 1, 6, 1, 4, 5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38993() {
        int[] input = {1, 4, 0, 2, 6, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 6, 3, 1, 4, 2, 6, 5, 7, 1, 3, 5, 6, 4, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38994() {
        int[] input = {1, 4, 0, 2, 6, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38995() {
        int[] input = {1, 4, 0, 2, 6, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 7, 5, 3, 6, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38996() {
        int[] input = {1, 4, 0, 2, 7, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38997() {
        int[] input = {1, 4, 0, 7, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 7, 4, 1, 6, 5, 2, 4, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38998() {
        int[] input = {1, 4, 7, 0, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 5, 3, 4, 7, 6, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve38999() {
        int[] input = {1, 7, 4, 0, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 5, 2, 1, 4, 6, 2, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39000() {
        int[] input = {7, 1, 4, 0, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 2, 1, 3, 5, 2, 1, 3, 7, 4, 6, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39001() {
        int[] input = {7, 1, 4, 0, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39002() {
        int[] input = {1, 7, 4, 0, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39003() {
        int[] input = {1, 4, 7, 0, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 1, 4, 6, 2, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39004() {
        int[] input = {1, 4, 0, 7, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39005() {
        int[] input = {1, 4, 0, 6, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 5, 2, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39006() {
        int[] input = {1, 4, 0, 6, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 7, 2, 6, 1, 4, 7, 4, 1, 3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39007() {
        int[] input = {1, 4, 0, 6, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 6, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39008() {
        int[] input = {1, 4, 0, 6, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39009() {
        int[] input = {1, 4, 6, 0, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 1, 4, 5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39010() {
        int[] input = {1, 4, 6, 0, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39011() {
        int[] input = {1, 4, 6, 0, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39012() {
        int[] input = {1, 4, 6, 0, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 4, 7, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39013() {
        int[] input = {1, 4, 6, 7, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 4, 7, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39014() {
        int[] input = {1, 4, 7, 6, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 7, 1, 4, 6, 2, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39015() {
        int[] input = {1, 7, 4, 6, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39016() {
        int[] input = {7, 1, 4, 6, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39017() {
        int[] input = {7, 1, 6, 4, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 2, 4, 1, 6, 7, 2, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39018() {
        int[] input = {1, 7, 6, 4, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 4, 7, 6, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39019() {
        int[] input = {1, 6, 7, 4, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 4, 2, 7, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39020() {
        int[] input = {1, 6, 4, 7, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 1, 6, 7, 3, 5, 4, 1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39021() {
        int[] input = {1, 6, 4, 0, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 1, 6, 3, 5, 2, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39022() {
        int[] input = {1, 6, 4, 0, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 6, 2, 3, 5, 4, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39023() {
        int[] input = {1, 6, 4, 0, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 3, 5, 7, 6, 2, 5, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39024() {
        int[] input = {1, 6, 4, 0, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39025() {
        int[] input = {6, 1, 4, 0, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39026() {
        int[] input = {6, 1, 4, 0, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39027() {
        int[] input = {6, 1, 4, 0, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 7, 2, 1, 6, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39028() {
        int[] input = {6, 1, 4, 0, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 2, 5, 3, 1, 7, 5, 3, 1, 7, 6, 4, 2, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39029() {
        int[] input = {6, 1, 4, 7, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 4, 2, 5, 3, 1, 7, 5, 3, 1, 7, 6, 4, 2, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39030() {
        int[] input = {6, 1, 7, 4, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 2, 4, 1, 6, 7, 2, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39031() {
        int[] input = {6, 7, 1, 4, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39032() {
        int[] input = {7, 6, 1, 4, 0, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 4, 3, 5, 1, 6, 7, 4, 3, 5, 1, 6, 7, 4, 3, 5, 1, 6, 7, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39033() {
        int[] input = {7, 6, 1, 4, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39034() {
        int[] input = {6, 7, 1, 4, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39035() {
        int[] input = {6, 1, 7, 4, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 6, 1, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39036() {
        int[] input = {6, 1, 4, 7, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39037() {
        int[] input = {6, 1, 4, 0, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 5, 7, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39038() {
        int[] input = {6, 1, 4, 0, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39039() {
        int[] input = {6, 1, 4, 0, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 2, 1, 6, 4, 5, 2, 3, 7, 6, 1, 3, 2, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39040() {
        int[] input = {6, 1, 4, 0, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 6, 1, 3, 7, 5, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39041() {
        int[] input = {1, 6, 4, 0, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 1, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39042() {
        int[] input = {1, 6, 4, 0, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 5, 3, 7, 6, 1, 5, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39043() {
        int[] input = {1, 6, 4, 0, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39044() {
        int[] input = {1, 6, 4, 0, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 6, 7, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39045() {
        int[] input = {1, 6, 4, 7, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 6, 7, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39046() {
        int[] input = {1, 6, 7, 4, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 7, 1, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39047() {
        int[] input = {1, 7, 6, 4, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39048() {
        int[] input = {7, 1, 6, 4, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39049() {
        int[] input = {7, 1, 4, 6, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39050() {
        int[] input = {1, 7, 4, 6, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 1, 7, 1, 4, 2, 6, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39051() {
        int[] input = {1, 4, 7, 6, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 6, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39052() {
        int[] input = {1, 4, 6, 7, 0, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 4, 6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39053() {
        int[] input = {1, 4, 6, 0, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 5, 7, 4, 6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39054() {
        int[] input = {1, 4, 6, 0, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 2, 4, 1, 6, 7, 6, 1, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39055() {
        int[] input = {1, 4, 6, 0, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 2, 4, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39056() {
        int[] input = {1, 4, 6, 0, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39057() {
        int[] input = {1, 4, 0, 6, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39058() {
        int[] input = {1, 4, 0, 6, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 3, 7, 6, 1, 5, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39059() {
        int[] input = {1, 4, 0, 6, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39060() {
        int[] input = {1, 4, 0, 6, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 7, 6, 1, 4, 2, 4, 1, 6, 7, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39061() {
        int[] input = {1, 4, 0, 7, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39062() {
        int[] input = {1, 4, 7, 0, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 5, 6, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39063() {
        int[] input = {1, 7, 4, 0, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 2, 3, 5, 7, 1, 2, 3, 6, 1, 2, 4, 3, 4, 2, 1, 6, 4, 3, 2, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39064() {
        int[] input = {7, 1, 4, 0, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39065() {
        int[] input = {7, 1, 4, 0, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 7, 1, 5, 3, 6, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39066() {
        int[] input = {1, 7, 4, 0, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 6, 3, 5, 7, 1, 4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39067() {
        int[] input = {1, 4, 7, 0, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39068() {
        int[] input = {1, 4, 0, 7, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 7, 4, 6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39069() {
        int[] input = {1, 4, 0, 2, 7, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 7, 6, 3, 5, 7, 2, 1, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39070() {
        int[] input = {1, 4, 0, 2, 6, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39071() {
        int[] input = {1, 4, 0, 2, 6, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39072() {
        int[] input = {1, 4, 0, 2, 6, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39073() {
        int[] input = {1, 4, 0, 2, 5, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39074() {
        int[] input = {1, 4, 0, 2, 5, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 1, 3, 7, 6, 5, 4, 3, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39075() {
        int[] input = {1, 4, 0, 2, 5, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 7, 3, 6, 2, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39076() {
        int[] input = {1, 4, 0, 2, 7, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39077() {
        int[] input = {1, 4, 0, 7, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39078() {
        int[] input = {1, 4, 7, 0, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 1, 4, 6, 3, 5, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39079() {
        int[] input = {1, 7, 4, 0, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39080() {
        int[] input = {7, 1, 4, 0, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 6, 2, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39081() {
        int[] input = {7, 1, 4, 0, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 1, 4, 7, 5, 7, 4, 1, 2, 7, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39082() {
        int[] input = {1, 7, 4, 0, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 2, 7, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39083() {
        int[] input = {1, 4, 7, 0, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 1, 4, 2, 3, 6, 7, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39084() {
        int[] input = {1, 4, 0, 7, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 7, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39085() {
        int[] input = {1, 4, 0, 2, 7, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39086() {
        int[] input = {1, 4, 0, 2, 5, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 6, 7, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39087() {
        int[] input = {1, 4, 0, 2, 5, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 6, 3, 5, 7, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39088() {
        int[] input = {1, 4, 0, 2, 5, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39089() {
        int[] input = {1, 4, 0, 5, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39090() {
        int[] input = {1, 4, 0, 5, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 6, 3, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39091() {
        int[] input = {1, 4, 0, 5, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39092() {
        int[] input = {1, 4, 0, 5, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 5, 3, 6, 7, 5, 3, 4, 2, 5, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39093() {
        int[] input = {1, 4, 0, 7, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 4, 1, 2, 5, 7, 4, 3, 6, 7, 5, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39094() {
        int[] input = {1, 4, 7, 0, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39095() {
        int[] input = {1, 7, 4, 0, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 5, 7, 4, 1, 2, 5, 7, 4, 3, 6, 7, 5, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39096() {
        int[] input = {7, 1, 4, 0, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39097() {
        int[] input = {7, 1, 4, 0, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 1, 7, 4, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39098() {
        int[] input = {1, 7, 4, 0, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 5, 7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39099() {
        int[] input = {1, 4, 7, 0, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 5, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39100() {
        int[] input = {1, 4, 0, 7, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 5, 2, 3, 6, 5, 7, 1, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39101() {
        int[] input = {1, 4, 0, 5, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 2, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39102() {
        int[] input = {1, 4, 0, 5, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 6, 5, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39103() {
        int[] input = {1, 4, 0, 5, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 4, 1, 6, 1, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39104() {
        int[] input = {1, 4, 0, 5, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 6, 2, 5, 1, 4, 6, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39105() {
        int[] input = {1, 4, 0, 5, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39106() {
        int[] input = {1, 4, 0, 5, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 2, 3, 7, 6, 5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39107() {
        int[] input = {1, 4, 0, 5, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 3, 7, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39108() {
        int[] input = {1, 4, 0, 5, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39109() {
        int[] input = {1, 4, 0, 7, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 3, 6, 1, 7, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39110() {
        int[] input = {1, 4, 7, 0, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 1, 4, 2, 3, 6, 7, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39111() {
        int[] input = {1, 7, 4, 0, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 1, 7, 2, 3, 6, 1, 7, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39112() {
        int[] input = {7, 1, 4, 0, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39113() {
        int[] input = {7, 1, 4, 0, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 2, 1, 4, 5, 3, 6, 4, 5, 7, 3, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39114() {
        int[] input = {1, 7, 4, 0, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39115() {
        int[] input = {1, 4, 7, 0, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39116() {
        int[] input = {1, 4, 0, 7, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39117() {
        int[] input = {1, 4, 0, 6, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39118() {
        int[] input = {1, 4, 0, 6, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 5, 7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39119() {
        int[] input = {1, 4, 0, 6, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39120() {
        int[] input = {1, 4, 0, 6, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 7, 2, 5, 3, 6, 1, 5, 2, 7, 6, 1, 4, 5, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39121() {
        int[] input = {1, 4, 6, 0, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39122() {
        int[] input = {1, 4, 6, 0, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 1, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39123() {
        int[] input = {1, 4, 6, 0, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39124() {
        int[] input = {1, 4, 6, 0, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39125() {
        int[] input = {1, 4, 6, 7, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39126() {
        int[] input = {1, 4, 7, 6, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39127() {
        int[] input = {1, 7, 4, 6, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 4, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39128() {
        int[] input = {7, 1, 4, 6, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 5, 3, 2, 1, 4, 5, 3, 6, 4, 5, 7, 3, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39129() {
        int[] input = {7, 1, 6, 4, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39130() {
        int[] input = {1, 7, 6, 4, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 6, 5, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39131() {
        int[] input = {1, 6, 7, 4, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 5, 4, 6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39132() {
        int[] input = {1, 6, 4, 7, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 7, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39133() {
        int[] input = {1, 6, 4, 0, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 3, 2, 7, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39134() {
        int[] input = {1, 6, 4, 0, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 1, 6, 5, 7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39135() {
        int[] input = {1, 6, 4, 0, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39136() {
        int[] input = {1, 6, 4, 0, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 3, 5, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39137() {
        int[] input = {6, 1, 4, 0, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39138() {
        int[] input = {6, 1, 4, 0, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39139() {
        int[] input = {6, 1, 4, 0, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39140() {
        int[] input = {6, 1, 4, 0, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39141() {
        int[] input = {6, 1, 4, 7, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 4, 5, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39142() {
        int[] input = {6, 1, 7, 4, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 5, 7, 6, 1, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39143() {
        int[] input = {6, 7, 1, 4, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 5, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39144() {
        int[] input = {7, 6, 1, 4, 0, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 1, 5, 4, 6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39145() {
        int[] input = {7, 6, 1, 4, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 6, 7, 1, 3, 5, 6, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39146() {
        int[] input = {6, 7, 1, 4, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 6, 1, 3, 2, 4, 6, 7, 1, 3, 5, 6, 7, 3, 5, 6, 7, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39147() {
        int[] input = {6, 1, 7, 4, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 5, 7, 6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39148() {
        int[] input = {6, 1, 4, 7, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 6, 4, 5, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39149() {
        int[] input = {6, 1, 4, 5, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 6, 4, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39150() {
        int[] input = {6, 1, 4, 5, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 4, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39151() {
        int[] input = {6, 1, 4, 5, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39152() {
        int[] input = {6, 1, 4, 5, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39153() {
        int[] input = {1, 6, 4, 5, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 5, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39154() {
        int[] input = {1, 6, 4, 5, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39155() {
        int[] input = {1, 6, 4, 5, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 5, 6, 1, 4, 1, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39156() {
        int[] input = {1, 6, 4, 5, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 6, 1, 4, 1, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39157() {
        int[] input = {1, 6, 4, 7, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39158() {
        int[] input = {1, 6, 7, 4, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 5, 7, 6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39159() {
        int[] input = {1, 7, 6, 4, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 2, 3, 6, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39160() {
        int[] input = {7, 1, 6, 4, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 2, 3, 6, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39161() {
        int[] input = {7, 1, 4, 6, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39162() {
        int[] input = {1, 7, 4, 6, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 1, 4, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39163() {
        int[] input = {1, 4, 7, 6, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 6, 5, 7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39164() {
        int[] input = {1, 4, 6, 7, 5, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39165() {
        int[] input = {1, 4, 6, 5, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39166() {
        int[] input = {1, 4, 6, 5, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39167() {
        int[] input = {1, 4, 6, 5, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 1, 6, 1, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39168() {
        int[] input = {1, 4, 6, 5, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39169() {
        int[] input = {1, 4, 5, 6, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 1, 4, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39170() {
        int[] input = {1, 4, 5, 6, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39171() {
        int[] input = {1, 4, 5, 6, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39172() {
        int[] input = {1, 4, 5, 6, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39173() {
        int[] input = {1, 4, 5, 7, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 4, 1, 5, 1, 4, 6, 3, 1, 5, 4, 5, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39174() {
        int[] input = {1, 4, 7, 5, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 3, 6, 7, 1, 4, 2, 3, 6, 7, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39175() {
        int[] input = {1, 7, 4, 5, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39176() {
        int[] input = {7, 1, 4, 5, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 4, 1, 7, 5, 7, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39177() {
        int[] input = {7, 1, 4, 5, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 4, 6, 3, 2, 1, 7, 6, 3, 2, 1, 7, 6, 4, 3, 2, 1, 7, 6, 4, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39178() {
        int[] input = {1, 7, 4, 5, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 4, 1, 7, 2, 3, 6, 1, 7, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39179() {
        int[] input = {1, 4, 7, 5, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 7, 1, 4, 2, 3, 6, 7, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39180() {
        int[] input = {1, 4, 5, 7, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 6, 5, 1, 4, 1, 5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39181() {
        int[] input = {1, 4, 5, 0, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 5, 1, 4, 1, 5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39182() {
        int[] input = {1, 4, 5, 0, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39183() {
        int[] input = {1, 4, 5, 0, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39184() {
        int[] input = {1, 4, 5, 0, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 1, 4, 3, 7, 2, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39185() {
        int[] input = {1, 4, 5, 0, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39186() {
        int[] input = {1, 4, 5, 0, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39187() {
        int[] input = {1, 4, 5, 0, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39188() {
        int[] input = {1, 4, 5, 0, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39189() {
        int[] input = {1, 4, 5, 7, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39190() {
        int[] input = {1, 4, 7, 5, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 5, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39191() {
        int[] input = {1, 7, 4, 5, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 5, 7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39192() {
        int[] input = {7, 1, 4, 5, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 1, 7, 4, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39193() {
        int[] input = {7, 1, 4, 5, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39194() {
        int[] input = {1, 7, 4, 5, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 1, 7, 1, 4, 2, 5, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39195() {
        int[] input = {1, 4, 7, 5, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39196() {
        int[] input = {1, 4, 5, 7, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 7, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39197() {
        int[] input = {1, 4, 5, 0, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 3, 7, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39198() {
        int[] input = {1, 4, 5, 0, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39199() {
        int[] input = {1, 4, 5, 0, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39200() {
        int[] input = {1, 4, 5, 0, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 3, 2, 4, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39201() {
        int[] input = {1, 5, 4, 0, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39202() {
        int[] input = {1, 5, 4, 0, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 1, 5, 7, 6, 3, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39203() {
        int[] input = {1, 5, 4, 0, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39204() {
        int[] input = {1, 5, 4, 0, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 1, 5, 1, 4, 2, 7, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39205() {
        int[] input = {1, 5, 4, 7, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 1, 5, 1, 4, 2, 7, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39206() {
        int[] input = {1, 5, 7, 4, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 1, 5, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39207() {
        int[] input = {1, 7, 5, 4, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39208() {
        int[] input = {7, 1, 5, 4, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 5, 7, 1, 4, 2, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39209() {
        int[] input = {7, 1, 5, 4, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 1, 4, 6, 3, 5, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39210() {
        int[] input = {1, 7, 5, 4, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 4, 7, 5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39211() {
        int[] input = {1, 5, 7, 4, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 7, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39212() {
        int[] input = {1, 5, 4, 7, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 4, 1, 5, 7, 2, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39213() {
        int[] input = {1, 5, 4, 0, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 1, 5, 7, 2, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39214() {
        int[] input = {1, 5, 4, 0, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39215() {
        int[] input = {1, 5, 4, 0, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 4, 1, 5, 2, 6, 4, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39216() {
        int[] input = {1, 5, 4, 0, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 6, 2, 5, 1, 4, 6, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39217() {
        int[] input = {1, 5, 4, 0, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 1, 5, 3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39218() {
        int[] input = {1, 5, 4, 0, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 6, 5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39219() {
        int[] input = {1, 5, 4, 0, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39220() {
        int[] input = {1, 5, 4, 0, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39221() {
        int[] input = {1, 5, 4, 7, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39222() {
        int[] input = {1, 5, 7, 4, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 6, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39223() {
        int[] input = {1, 7, 5, 4, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39224() {
        int[] input = {7, 1, 5, 4, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 4, 1, 2, 3, 4, 6, 5, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39225() {
        int[] input = {7, 1, 5, 4, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 7, 5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39226() {
        int[] input = {1, 7, 5, 4, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39227() {
        int[] input = {1, 5, 7, 4, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 3, 6, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39228() {
        int[] input = {1, 5, 4, 7, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39229() {
        int[] input = {1, 5, 4, 6, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39230() {
        int[] input = {1, 5, 4, 6, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39231() {
        int[] input = {1, 5, 4, 6, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39232() {
        int[] input = {1, 5, 4, 6, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 4, 1, 5, 3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39233() {
        int[] input = {1, 5, 6, 4, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 6, 1, 5, 3, 7, 2, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39234() {
        int[] input = {1, 5, 6, 4, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39235() {
        int[] input = {1, 5, 6, 4, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39236() {
        int[] input = {1, 5, 6, 4, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39237() {
        int[] input = {1, 5, 6, 7, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 1, 6, 3, 2, 7, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39238() {
        int[] input = {1, 5, 7, 6, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 1, 7, 4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39239() {
        int[] input = {1, 7, 5, 6, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39240() {
        int[] input = {7, 1, 5, 6, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39241() {
        int[] input = {7, 1, 6, 5, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 2, 3, 6, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39242() {
        int[] input = {1, 7, 6, 5, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 6, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39243() {
        int[] input = {1, 6, 7, 5, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 6, 1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39244() {
        int[] input = {1, 6, 5, 7, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 6, 1, 5, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39245() {
        int[] input = {1, 6, 5, 4, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39246() {
        int[] input = {1, 6, 5, 4, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39247() {
        int[] input = {1, 6, 5, 4, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 4, 2, 3, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39248() {
        int[] input = {1, 6, 5, 4, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 2, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39249() {
        int[] input = {6, 1, 5, 4, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 1, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39250() {
        int[] input = {6, 1, 5, 4, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39251() {
        int[] input = {6, 1, 5, 4, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 7, 3, 2, 1, 5, 7, 3, 2, 1, 5, 7, 6, 3, 2, 1, 5, 7, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39252() {
        int[] input = {6, 1, 5, 4, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39253() {
        int[] input = {6, 1, 5, 7, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39254() {
        int[] input = {6, 1, 7, 5, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 3, 4, 7, 1, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39255() {
        int[] input = {6, 7, 1, 5, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39256() {
        int[] input = {7, 6, 1, 5, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 5, 6, 1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39257() {
        int[] input = {7, 6, 5, 1, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 1, 2, 3, 5, 7, 6, 1, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39258() {
        int[] input = {6, 7, 5, 1, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 2, 3, 5, 7, 6, 1, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39259() {
        int[] input = {6, 5, 7, 1, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 1, 5, 7, 3, 2, 1, 5, 7, 6, 3, 2, 1, 5, 7, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39260() {
        int[] input = {6, 5, 1, 7, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 2, 3, 1, 6, 7, 2, 3, 1, 6, 7, 5, 2, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39261() {
        int[] input = {6, 5, 1, 4, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 3, 1, 5, 4, 2, 7, 5, 4, 6, 2, 6, 4, 1, 3, 7, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39262() {
        int[] input = {6, 5, 1, 4, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 3, 7, 5, 1, 3, 4, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39263() {
        int[] input = {6, 5, 1, 4, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 5, 4, 2, 1, 6, 5, 4, 5, 6, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39264() {
        int[] input = {6, 5, 1, 4, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 2, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39265() {
        int[] input = {5, 6, 1, 4, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 1, 2, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39266() {
        int[] input = {5, 6, 1, 4, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 4, 2, 1, 6, 5, 4, 5, 6, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39267() {
        int[] input = {5, 6, 1, 4, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 7, 4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39268() {
        int[] input = {5, 6, 1, 4, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 4, 2, 3, 1, 5, 4, 2, 7, 5, 4, 6, 2, 6, 4, 1, 3, 7, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39269() {
        int[] input = {5, 6, 1, 7, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 3, 1, 6, 7, 2, 3, 1, 6, 7, 5, 2, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39270() {
        int[] input = {5, 6, 7, 1, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 4, 1, 6, 7, 5, 4, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39271() {
        int[] input = {5, 7, 6, 1, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 3, 4, 6, 5, 7, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39272() {
        int[] input = {7, 5, 6, 1, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 2, 3, 4, 6, 5, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39273() {
        int[] input = {7, 5, 1, 6, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 7, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39274() {
        int[] input = {5, 7, 1, 6, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39275() {
        int[] input = {5, 1, 7, 6, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39276() {
        int[] input = {5, 1, 6, 7, 4, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39277() {
        int[] input = {5, 1, 6, 4, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39278() {
        int[] input = {5, 1, 6, 4, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39279() {
        int[] input = {5, 1, 6, 4, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39280() {
        int[] input = {5, 1, 6, 4, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39281() {
        int[] input = {5, 1, 4, 6, 0, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 5, 1, 6, 2, 5, 1, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39282() {
        int[] input = {5, 1, 4, 6, 0, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 1, 5, 4, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39283() {
        int[] input = {5, 1, 4, 6, 0, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 7, 6, 1, 2, 3, 6, 7, 4, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39284() {
        int[] input = {5, 1, 4, 6, 7, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 7, 6, 1, 2, 3, 6, 7, 4, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39285() {
        int[] input = {5, 1, 4, 7, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39286() {
        int[] input = {5, 1, 7, 4, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 3, 6, 7, 5, 1, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39287() {
        int[] input = {5, 7, 1, 4, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 7, 1, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39288() {
        int[] input = {7, 5, 1, 4, 6, 0, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 2, 3, 1, 6, 2, 3, 1, 6, 7, 4, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39289() {
        int[] input = {7, 5, 1, 4, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 5, 4, 2, 3, 1, 6, 2, 3, 1, 6, 7, 4, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39290() {
        int[] input = {5, 7, 1, 4, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 4, 7, 1, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39291() {
        int[] input = {5, 1, 7, 4, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 6, 7, 5, 1, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39292() {
        int[] input = {5, 1, 4, 7, 0, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39293() {
        int[] input = {5, 1, 4, 0, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39294() {
        int[] input = {5, 1, 4, 0, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 6, 1, 2, 3, 6, 7, 4, 2, 3, 6, 7, 4, 5, 2, 5, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39295() {
        int[] input = {5, 1, 4, 0, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 6, 1, 5, 4, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39296() {
        int[] input = {5, 1, 4, 0, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 5, 1, 6, 2, 5, 1, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39297() {
        int[] input = {5, 1, 4, 0, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 4, 1, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39298() {
        int[] input = {5, 1, 4, 0, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 6, 2, 1, 5, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39299() {
        int[] input = {5, 1, 4, 0, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 1, 4, 5, 7, 2, 3, 6, 4, 1, 3, 2, 5, 1, 3, 2, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39300() {
        int[] input = {5, 1, 4, 0, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 5, 1, 6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39301() {
        int[] input = {5, 1, 4, 7, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 4, 5, 1, 6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39302() {
        int[] input = {5, 1, 7, 4, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 1, 4, 2, 7, 3, 6, 2, 4, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39303() {
        int[] input = {5, 7, 1, 4, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 4, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39304() {
        int[] input = {7, 5, 1, 4, 0, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 1, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39305() {
        int[] input = {7, 5, 1, 4, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 2, 1, 5, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39306() {
        int[] input = {5, 7, 1, 4, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 1, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39307() {
        int[] input = {5, 1, 7, 4, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39308() {
        int[] input = {5, 1, 4, 7, 0, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39309() {
        int[] input = {5, 1, 4, 0, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39310() {
        int[] input = {5, 1, 4, 0, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39311() {
        int[] input = {5, 1, 4, 0, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 5, 1, 2, 3, 6, 7, 2, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39312() {
        int[] input = {5, 1, 4, 0, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39313() {
        int[] input = {5, 1, 0, 4, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39314() {
        int[] input = {5, 1, 0, 4, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 6, 3, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39315() {
        int[] input = {5, 1, 0, 4, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39316() {
        int[] input = {5, 1, 0, 4, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 2, 6, 3, 7, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39317() {
        int[] input = {5, 1, 0, 7, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39318() {
        int[] input = {5, 1, 7, 0, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39319() {
        int[] input = {5, 7, 1, 0, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39320() {
        int[] input = {7, 5, 1, 0, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 2, 1, 5, 3, 4, 1, 2, 6, 4, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39321() {
        int[] input = {7, 5, 1, 0, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39322() {
        int[] input = {5, 7, 1, 0, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 6, 4, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39323() {
        int[] input = {5, 1, 7, 0, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 1, 4, 2, 7, 3, 6, 2, 4, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39324() {
        int[] input = {5, 1, 0, 7, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 4, 2, 3, 6, 4, 7, 5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39325() {
        int[] input = {5, 1, 0, 4, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39326() {
        int[] input = {5, 1, 0, 4, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 7, 3, 6, 2, 4, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39327() {
        int[] input = {5, 1, 0, 4, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39328() {
        int[] input = {5, 1, 0, 4, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 2, 6, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39329() {
        int[] input = {5, 1, 0, 4, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 7, 2, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39330() {
        int[] input = {5, 1, 0, 4, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39331() {
        int[] input = {5, 1, 0, 4, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 2, 3, 7, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39332() {
        int[] input = {5, 1, 0, 4, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39333() {
        int[] input = {5, 1, 0, 7, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 7, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39334() {
        int[] input = {5, 1, 7, 0, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 5, 1, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39335() {
        int[] input = {5, 7, 1, 0, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 3, 2, 4, 7, 1, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39336() {
        int[] input = {7, 5, 1, 0, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 7, 5, 4, 2, 3, 1, 6, 2, 3, 1, 6, 7, 4, 3, 1, 6, 7, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39337() {
        int[] input = {7, 5, 1, 0, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 1, 7, 5, 7, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39338() {
        int[] input = {5, 7, 1, 0, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39339() {
        int[] input = {5, 1, 7, 0, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39340() {
        int[] input = {5, 1, 0, 7, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39341() {
        int[] input = {5, 1, 0, 6, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 1, 6, 7, 2, 3, 1, 6, 7, 2, 3, 1, 6, 7, 5, 2, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39342() {
        int[] input = {5, 1, 0, 6, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39343() {
        int[] input = {5, 1, 0, 6, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 1, 2, 3, 4, 1, 2, 5, 3, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39344() {
        int[] input = {5, 1, 0, 6, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 2, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39345() {
        int[] input = {5, 1, 6, 0, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39346() {
        int[] input = {5, 1, 6, 0, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39347() {
        int[] input = {5, 1, 6, 0, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39348() {
        int[] input = {5, 1, 6, 0, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 4, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39349() {
        int[] input = {5, 1, 6, 7, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39350() {
        int[] input = {5, 1, 7, 6, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39351() {
        int[] input = {5, 7, 1, 6, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39352() {
        int[] input = {7, 5, 1, 6, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 7, 5, 7, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39353() {
        int[] input = {7, 5, 6, 1, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 4, 6, 5, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39354() {
        int[] input = {5, 7, 6, 1, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 4, 6, 5, 7, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39355() {
        int[] input = {5, 6, 7, 1, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 1, 6, 7, 5, 4, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39356() {
        int[] input = {5, 6, 1, 7, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 7, 2, 3, 1, 6, 7, 2, 3, 1, 6, 7, 5, 2, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39357() {
        int[] input = {5, 6, 1, 0, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 1, 6, 7, 2, 3, 1, 6, 7, 2, 3, 1, 6, 7, 5, 2, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39358() {
        int[] input = {5, 6, 1, 0, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39359() {
        int[] input = {5, 6, 1, 0, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 3, 7, 6, 1, 2, 3, 4, 1, 2, 5, 3, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39360() {
        int[] input = {5, 6, 1, 0, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 2, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39361() {
        int[] input = {6, 5, 1, 0, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39362() {
        int[] input = {6, 5, 1, 0, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 6, 5, 4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39363() {
        int[] input = {6, 5, 1, 0, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 3, 7, 5, 1, 3, 4, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39364() {
        int[] input = {6, 5, 1, 0, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 7, 5, 1, 6, 4, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39365() {
        int[] input = {6, 5, 1, 7, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 1, 6, 5, 7, 2, 3, 1, 6, 7, 2, 3, 1, 6, 7, 5, 2, 3, 1, 6, 7, 5, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39366() {
        int[] input = {6, 5, 7, 1, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 1, 5, 7, 3, 2, 1, 5, 7, 6, 3, 2, 1, 5, 7, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39367() {
        int[] input = {6, 7, 5, 1, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 4, 1, 2, 7, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39368() {
        int[] input = {7, 6, 5, 1, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 4, 1, 6, 7, 5, 4, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39369() {
        int[] input = {7, 6, 1, 5, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 5, 6, 1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39370() {
        int[] input = {6, 7, 1, 5, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39371() {
        int[] input = {6, 1, 7, 5, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 7, 1, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39372() {
        int[] input = {6, 1, 5, 7, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39373() {
        int[] input = {6, 1, 5, 0, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 4, 3, 2, 1, 7, 3, 2, 1, 7, 6, 5, 4, 2, 1, 7, 6, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39374() {
        int[] input = {6, 1, 5, 0, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 3, 2, 1, 5, 7, 3, 2, 1, 5, 7, 6, 3, 2, 1, 5, 7, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39375() {
        int[] input = {6, 1, 5, 0, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39376() {
        int[] input = {6, 1, 5, 0, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 6, 1, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39377() {
        int[] input = {1, 6, 5, 0, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39378() {
        int[] input = {1, 6, 5, 0, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 4, 2, 3, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39379() {
        int[] input = {1, 6, 5, 0, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 7, 4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39380() {
        int[] input = {1, 6, 5, 0, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 7, 6, 1, 5, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39381() {
        int[] input = {1, 6, 5, 7, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 6, 1, 5, 3, 2, 7, 6, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39382() {
        int[] input = {1, 6, 7, 5, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 7, 1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39383() {
        int[] input = {1, 7, 6, 5, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 6, 7, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39384() {
        int[] input = {7, 1, 6, 5, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39385() {
        int[] input = {7, 1, 5, 6, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39386() {
        int[] input = {1, 7, 5, 6, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39387() {
        int[] input = {1, 5, 7, 6, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 4, 7, 1, 5, 1, 7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39388() {
        int[] input = {1, 5, 6, 7, 0, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 1, 5, 1, 6, 3, 2, 7, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39389() {
        int[] input = {1, 5, 6, 0, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39390() {
        int[] input = {1, 5, 6, 0, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39391() {
        int[] input = {1, 5, 6, 0, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39392() {
        int[] input = {1, 5, 6, 0, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 1, 5, 3, 7, 2, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39393() {
        int[] input = {1, 5, 0, 6, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39394() {
        int[] input = {1, 5, 0, 6, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39395() {
        int[] input = {1, 5, 0, 6, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 7, 4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39396() {
        int[] input = {1, 5, 0, 6, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39397() {
        int[] input = {1, 5, 0, 7, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39398() {
        int[] input = {1, 5, 7, 0, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 7, 1, 5, 1, 7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39399() {
        int[] input = {1, 7, 5, 0, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39400() {
        int[] input = {7, 1, 5, 0, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39401() {
        int[] input = {7, 1, 5, 0, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 4, 1, 2, 3, 4, 6, 5, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39402() {
        int[] input = {1, 7, 5, 0, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39403() {
        int[] input = {1, 5, 7, 0, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39404() {
        int[] input = {1, 5, 0, 7, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 6, 3, 2, 7, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39405() {
        int[] input = {1, 5, 0, 4, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39406() {
        int[] input = {1, 5, 0, 4, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 3, 7, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39407() {
        int[] input = {1, 5, 0, 4, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39408() {
        int[] input = {1, 5, 0, 4, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 7, 2, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39409() {
        int[] input = {1, 5, 0, 4, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 6, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39410() {
        int[] input = {1, 5, 0, 4, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39411() {
        int[] input = {1, 5, 0, 4, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 7, 3, 6, 2, 4, 1, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39412() {
        int[] input = {1, 5, 0, 4, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39413() {
        int[] input = {1, 5, 0, 7, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 2, 3, 6, 4, 7, 5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39414() {
        int[] input = {1, 5, 7, 0, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39415() {
        int[] input = {1, 7, 5, 0, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 6, 4, 7, 5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39416() {
        int[] input = {7, 1, 5, 0, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 3, 6, 1, 7, 2, 3, 4, 7, 2, 5, 3, 4, 7, 2, 1, 6, 7, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39417() {
        int[] input = {7, 1, 5, 0, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 7, 1, 4, 2, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39418() {
        int[] input = {1, 7, 5, 0, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39419() {
        int[] input = {1, 5, 7, 0, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 1, 5, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39420() {
        int[] input = {1, 5, 0, 7, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39421() {
        int[] input = {1, 5, 0, 4, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 2, 6, 3, 7, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39422() {
        int[] input = {1, 5, 0, 4, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39423() {
        int[] input = {1, 5, 0, 4, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 6, 3, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39424() {
        int[] input = {1, 5, 0, 4, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 2, 4, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39425() {
        int[] input = {1, 0, 5, 4, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 2, 4, 1, 3, 2, 4, 1, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39426() {
        int[] input = {1, 0, 5, 4, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 3, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39427() {
        int[] input = {1, 0, 5, 4, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39428() {
        int[] input = {1, 0, 5, 4, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 6, 3, 7, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39429() {
        int[] input = {1, 0, 5, 7, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39430() {
        int[] input = {1, 0, 7, 5, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 7, 1, 5, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39431() {
        int[] input = {1, 7, 0, 5, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 2, 7, 1, 5, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39432() {
        int[] input = {7, 1, 0, 5, 4, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 4, 2, 7, 1, 5, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39433() {
        int[] input = {7, 1, 0, 5, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39434() {
        int[] input = {1, 7, 0, 5, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39435() {
        int[] input = {1, 0, 7, 5, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 3, 6, 5, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39436() {
        int[] input = {1, 0, 5, 7, 4, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 6, 4, 7, 5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39437() {
        int[] input = {1, 0, 5, 4, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39438() {
        int[] input = {1, 0, 5, 4, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39439() {
        int[] input = {1, 0, 5, 4, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39440() {
        int[] input = {1, 0, 5, 4, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39441() {
        int[] input = {1, 0, 5, 4, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 3, 7, 2, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39442() {
        int[] input = {1, 0, 5, 4, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39443() {
        int[] input = {1, 0, 5, 4, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 5, 4, 2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39444() {
        int[] input = {1, 0, 5, 4, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 7, 6, 1, 5, 4, 5, 1, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39445() {
        int[] input = {1, 0, 5, 7, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 3, 2, 7, 1, 6, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39446() {
        int[] input = {1, 0, 7, 5, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39447() {
        int[] input = {1, 7, 0, 5, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 3, 6, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39448() {
        int[] input = {7, 1, 0, 5, 4, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 3, 6, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39449() {
        int[] input = {7, 1, 0, 5, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 4, 1, 7, 5, 7, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39450() {
        int[] input = {1, 7, 0, 5, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 6, 4, 1, 7, 5, 7, 1, 4, 6, 7, 5, 1, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39451() {
        int[] input = {1, 0, 7, 5, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 7, 1, 5, 1, 7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39452() {
        int[] input = {1, 0, 5, 7, 6, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39453() {
        int[] input = {1, 0, 5, 6, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 2, 6, 5, 1, 4, 3, 7, 5, 1, 4, 3, 4, 1, 6, 2, 7, 5, 6, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39454() {
        int[] input = {1, 0, 5, 6, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 4, 6, 1, 5, 7, 5, 1, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39455() {
        int[] input = {1, 0, 5, 6, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 3, 7, 6, 1, 2, 3, 4, 1, 2, 5, 3, 5, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39456() {
        int[] input = {1, 0, 5, 6, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39457() {
        int[] input = {1, 0, 6, 5, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 3, 7, 2, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39458() {
        int[] input = {1, 0, 6, 5, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39459() {
        int[] input = {1, 0, 6, 5, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 2, 5, 6, 1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39460() {
        int[] input = {1, 0, 6, 5, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 7, 5, 1, 6, 4, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39461() {
        int[] input = {1, 0, 6, 7, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 7, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39462() {
        int[] input = {1, 0, 7, 6, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 4, 7, 1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39463() {
        int[] input = {1, 7, 0, 6, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 3, 4, 7, 1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39464() {
        int[] input = {7, 1, 0, 6, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 1, 4, 3, 5, 1, 4, 7, 3, 5, 2, 6, 4, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39465() {
        int[] input = {7, 1, 6, 0, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39466() {
        int[] input = {1, 7, 6, 0, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 7, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39467() {
        int[] input = {1, 6, 7, 0, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 7, 1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39468() {
        int[] input = {1, 6, 0, 7, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39469() {
        int[] input = {1, 6, 0, 5, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 5, 6, 1, 4, 1, 6, 7, 3, 1, 4, 6, 4, 1, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39470() {
        int[] input = {1, 6, 0, 5, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 5, 6, 1, 7, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39471() {
        int[] input = {1, 6, 0, 5, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39472() {
        int[] input = {1, 6, 0, 5, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 7, 2, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39473() {
        int[] input = {6, 1, 0, 5, 4, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 7, 2, 1, 6, 5, 6, 1, 4, 3, 6, 5, 1, 4, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39474() {
        int[] input = {6, 1, 0, 5, 4, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 4, 2, 6, 5, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39475() {
        int[] input = {6, 1, 0, 5, 4, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 3, 7, 1, 5, 2, 4, 1, 5, 6, 2, 4, 3, 7, 5, 1, 3, 4, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39476() {
        int[] input = {6, 1, 0, 5, 7, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 5, 1, 6, 4, 6, 1, 5, 7, 6, 4, 1, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39477() {
        int[] input = {6, 1, 0, 7, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 4, 3, 2, 7, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39478() {
        int[] input = {6, 1, 7, 0, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 7, 1, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39479() {
        int[] input = {6, 7, 1, 0, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 4, 3, 2, 7, 6, 4, 3, 2, 7, 6, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39480() {
        int[] input = {7, 6, 1, 0, 5, 4, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 2, 5, 6, 1, 3, 4, 6, 1, 7, 3, 7, 1, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39481() {
        int[] input = {7, 6, 1, 0, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 5, 4, 6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39482() {
        int[] input = {6, 7, 1, 0, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39483() {
        int[] input = {6, 1, 7, 0, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 6, 1, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39484() {
        int[] input = {6, 1, 0, 7, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39485() {
        int[] input = {6, 1, 0, 4, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39486() {
        int[] input = {6, 1, 0, 4, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 5, 7, 6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39487() {
        int[] input = {6, 1, 0, 4, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39488() {
        int[] input = {6, 1, 0, 4, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39489() {
        int[] input = {1, 6, 0, 4, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39490() {
        int[] input = {1, 6, 0, 4, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39491() {
        int[] input = {1, 6, 0, 4, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 5, 7, 6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39492() {
        int[] input = {1, 6, 0, 4, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39493() {
        int[] input = {1, 6, 0, 7, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39494() {
        int[] input = {1, 6, 7, 0, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 5, 4, 6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39495() {
        int[] input = {1, 7, 6, 0, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 5, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39496() {
        int[] input = {7, 1, 6, 0, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 7, 1, 2, 3, 5, 7, 6, 1, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39497() {
        int[] input = {7, 1, 0, 6, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 2, 3, 4, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39498() {
        int[] input = {1, 7, 0, 6, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39499() {
        int[] input = {1, 0, 7, 6, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 6, 7, 5, 4, 3, 2, 7, 6, 3, 2, 7, 6, 5, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39500() {
        int[] input = {1, 0, 6, 7, 4, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 2, 7, 1, 6, 5, 3, 4, 1, 6, 5, 3, 4, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39501() {
        int[] input = {1, 0, 6, 4, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 5, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39502() {
        int[] input = {1, 0, 6, 4, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 7, 6, 4, 5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39503() {
        int[] input = {1, 0, 6, 4, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39504() {
        int[] input = {1, 0, 6, 4, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39505() {
        int[] input = {1, 0, 4, 6, 5, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 7, 3, 5, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39506() {
        int[] input = {1, 0, 4, 6, 5, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39507() {
        int[] input = {1, 0, 4, 6, 5, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 6, 5, 7, 1, 4, 6, 4, 1, 3, 2, 5, 7, 3, 2, 5, 7, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39508() {
        int[] input = {1, 0, 4, 6, 7, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 2, 6, 4, 5, 3, 2, 6, 4, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39509() {
        int[] input = {1, 0, 4, 7, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 6, 7, 1, 4, 5, 4, 1, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39510() {
        int[] input = {1, 0, 7, 4, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39511() {
        int[] input = {1, 7, 0, 4, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39512() {
        int[] input = {7, 1, 0, 4, 6, 5, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 5, 3, 2, 4, 7, 1, 5, 3, 6, 7, 1, 5, 3, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39513() {
        int[] input = {7, 1, 0, 4, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 6, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39514() {
        int[] input = {1, 7, 0, 4, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 3, 6, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39515() {
        int[] input = {1, 0, 7, 4, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 2, 3, 6, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39516() {
        int[] input = {1, 0, 4, 7, 5, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 7, 2, 3, 6, 1, 7, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39517() {
        int[] input = {1, 0, 4, 5, 7, 6, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39518() {
        int[] input = {1, 0, 4, 5, 6, 7, 2, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 7, 4, 1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39519() {
        int[] input = {1, 0, 4, 5, 6, 2, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 2, 3, 7, 6, 5, 4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39520() {
        int[] input = {1, 0, 4, 5, 6, 2, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39521() {
        int[] input = {1, 0, 4, 5, 2, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 5, 1, 4, 6, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39522() {
        int[] input = {1, 0, 4, 5, 2, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 5, 1, 4, 6, 4, 1, 5, 2, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39523() {
        int[] input = {1, 0, 4, 5, 2, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39524() {
        int[] input = {1, 0, 4, 5, 7, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 7, 2, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39525() {
        int[] input = {1, 0, 4, 7, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 3, 6, 5, 7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39526() {
        int[] input = {1, 0, 7, 4, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 3, 6, 5, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39527() {
        int[] input = {1, 7, 0, 4, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 2, 3, 6, 5, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39528() {
        int[] input = {7, 1, 0, 4, 5, 2, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 2, 3, 6, 5, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39529() {
        int[] input = {7, 1, 0, 4, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 5, 2, 7, 4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39530() {
        int[] input = {1, 7, 0, 4, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 2, 7, 4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39531() {
        int[] input = {1, 0, 7, 4, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 7, 4, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39532() {
        int[] input = {1, 0, 4, 7, 5, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 7, 4, 1, 2, 5, 7, 4, 3, 6, 7, 5, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39533() {
        int[] input = {1, 0, 4, 5, 7, 2, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 5, 3, 6, 7, 5, 3, 4, 2, 5, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39534() {
        int[] input = {1, 0, 4, 5, 2, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39535() {
        int[] input = {1, 0, 4, 5, 2, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 5, 7, 6, 3, 1, 4, 5, 4, 1, 2, 7, 4, 5, 1, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39536() {
        int[] input = {1, 0, 4, 5, 2, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39537() {
        int[] input = {1, 0, 4, 2, 5, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39538() {
        int[] input = {1, 0, 4, 2, 5, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 3, 5, 7, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39539() {
        int[] input = {1, 0, 4, 2, 5, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 3, 6, 7, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39540() {
        int[] input = {1, 0, 4, 2, 7, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39541() {
        int[] input = {1, 0, 4, 7, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 2, 7, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39542() {
        int[] input = {1, 0, 7, 4, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 2, 5, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39543() {
        int[] input = {1, 7, 0, 4, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39544() {
        int[] input = {7, 1, 0, 4, 2, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 5, 1, 7, 4, 2, 5, 1, 7, 4, 2, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39545() {
        int[] input = {7, 1, 0, 4, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 5, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39546() {
        int[] input = {1, 7, 0, 4, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 3, 5, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39547() {
        int[] input = {1, 0, 7, 4, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 6, 3, 5, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39548() {
        int[] input = {1, 0, 4, 7, 2, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 7, 4, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39549() {
        int[] input = {1, 0, 4, 2, 7, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39550() {
        int[] input = {1, 0, 4, 2, 5, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 3, 6, 2, 1, 4, 7, 4, 1, 5, 3, 4, 7, 1, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39551() {
        int[] input = {1, 0, 4, 2, 5, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 6, 5, 7, 2, 1, 4, 5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39552() {
        int[] input = {1, 0, 4, 2, 5, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 2, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39553() {
        int[] input = {1, 0, 4, 2, 6, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 5, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39554() {
        int[] input = {1, 0, 4, 2, 6, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39555() {
        int[] input = {1, 0, 4, 2, 6, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 4, 2, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39556() {
        int[] input = {1, 0, 4, 2, 7, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 3, 5, 7, 2, 1, 4, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39557() {
        int[] input = {1, 0, 4, 7, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 5, 7, 1, 4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39558() {
        int[] input = {1, 0, 7, 4, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39559() {
        int[] input = {1, 7, 0, 4, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39560() {
        int[] input = {7, 1, 0, 4, 2, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 6, 2, 4, 7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39561() {
        int[] input = {7, 1, 0, 4, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 3, 5, 6, 4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39562() {
        int[] input = {1, 7, 0, 4, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 2, 3, 5, 6, 4, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39563() {
        int[] input = {1, 0, 7, 4, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 3, 5, 6, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39564() {
        int[] input = {1, 0, 4, 7, 6, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 3, 5, 7, 1, 2, 3, 6, 1, 2, 4, 3, 4, 2, 1, 6, 4, 3, 2, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39565() {
        int[] input = {1, 0, 4, 6, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 6, 7, 4, 2, 1, 6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39566() {
        int[] input = {1, 0, 4, 6, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39567() {
        int[] input = {1, 0, 4, 6, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 3, 7, 6, 1, 5, 3, 2, 1, 5, 4, 3, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39568() {
        int[] input = {1, 0, 4, 6, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 6, 3, 7, 5, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39569() {
        int[] input = {1, 0, 6, 4, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39570() {
        int[] input = {1, 0, 6, 4, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 2, 4, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39571() {
        int[] input = {1, 0, 6, 4, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 4, 1, 6, 7, 6, 1, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39572() {
        int[] input = {1, 0, 6, 4, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 3, 5, 7, 4, 6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39573() {
        int[] input = {1, 0, 6, 7, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39574() {
        int[] input = {1, 0, 7, 6, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39575() {
        int[] input = {1, 7, 0, 6, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39576() {
        int[] input = {7, 1, 0, 6, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39577() {
        int[] input = {7, 1, 6, 0, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39578() {
        int[] input = {1, 7, 6, 0, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39579() {
        int[] input = {1, 6, 7, 0, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 1, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39580() {
        int[] input = {1, 6, 0, 7, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39581() {
        int[] input = {1, 6, 0, 4, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 7, 2, 1, 6, 4, 7, 5, 3, 1, 2, 5, 7, 6, 2, 1, 3, 7, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39582() {
        int[] input = {1, 6, 0, 4, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 7, 2, 4, 1, 6, 7, 6, 1, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39583() {
        int[] input = {1, 6, 0, 4, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 2, 4, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39584() {
        int[] input = {1, 6, 0, 4, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39585() {
        int[] input = {6, 1, 0, 4, 2, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39586() {
        int[] input = {6, 1, 0, 4, 2, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39587() {
        int[] input = {6, 1, 0, 4, 2, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 1, 6, 7, 6, 1, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39588() {
        int[] input = {6, 1, 0, 4, 7, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 1, 6, 4, 7, 5, 3, 1, 2, 5, 7, 6, 2, 1, 3, 7, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39589() {
        int[] input = {6, 1, 0, 7, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39590() {
        int[] input = {6, 1, 7, 0, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 6, 1, 5, 3, 2, 6, 7, 1, 5, 3, 2, 6, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39591() {
        int[] input = {6, 7, 1, 0, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39592() {
        int[] input = {7, 6, 1, 0, 4, 2, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39593() {
        int[] input = {7, 6, 1, 0, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 2, 4, 6, 7, 1, 2, 4, 5, 3, 7, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39594() {
        int[] input = {6, 7, 1, 0, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 2, 5, 3, 7, 6, 2, 5, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39595() {
        int[] input = {6, 1, 7, 0, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 4, 1, 6, 7, 2, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39596() {
        int[] input = {6, 1, 0, 7, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 7, 4, 5, 2, 1, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39597() {
        int[] input = {6, 1, 0, 4, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 4, 1, 6, 2, 6, 1, 4, 7, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39598() {
        int[] input = {6, 1, 0, 4, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 4, 2, 7, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39599() {
        int[] input = {6, 1, 0, 4, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39600() {
        int[] input = {6, 1, 0, 4, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39601() {
        int[] input = {1, 6, 0, 4, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39602() {
        int[] input = {1, 6, 0, 4, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39603() {
        int[] input = {1, 6, 0, 4, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 7, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39604() {
        int[] input = {1, 6, 0, 4, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 7, 4, 1, 6, 2, 6, 1, 4, 7, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39605() {
        int[] input = {1, 6, 0, 7, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 7, 6, 2, 5, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39606() {
        int[] input = {1, 6, 7, 0, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 2, 4, 6, 7, 1, 2, 4, 5, 3, 7, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39607() {
        int[] input = {1, 7, 6, 0, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 5, 3, 7, 6, 2, 5, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39608() {
        int[] input = {7, 1, 6, 0, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 4, 1, 6, 7, 2, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39609() {
        int[] input = {7, 1, 0, 6, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 2, 4, 6, 7, 1, 2, 4, 5, 3, 7, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39610() {
        int[] input = {1, 7, 0, 6, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 7, 1, 2, 4, 5, 3, 7, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39611() {
        int[] input = {1, 0, 7, 6, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 6, 7, 1, 2, 4, 5, 3, 7, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39612() {
        int[] input = {1, 0, 6, 7, 4, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 3, 7, 6, 2, 5, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39613() {
        int[] input = {1, 0, 6, 4, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 4, 7, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39614() {
        int[] input = {1, 0, 6, 4, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 6, 1, 4, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39615() {
        int[] input = {1, 0, 6, 4, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39616() {
        int[] input = {1, 0, 6, 4, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39617() {
        int[] input = {1, 0, 4, 6, 2, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39618() {
        int[] input = {1, 0, 4, 6, 2, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 5, 7, 6, 2, 5, 3, 1, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39619() {
        int[] input = {1, 0, 4, 6, 2, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 7, 2, 6, 1, 4, 7, 4, 1, 3, 5, 2, 4, 7, 1, 3, 5, 2, 4, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39620() {
        int[] input = {1, 0, 4, 6, 7, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 6, 3, 5, 2, 1, 6, 3, 7, 1, 2, 5, 7, 1, 2, 6, 4, 3, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39621() {
        int[] input = {1, 0, 4, 7, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39622() {
        int[] input = {1, 0, 7, 4, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 6, 2, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39623() {
        int[] input = {1, 7, 0, 4, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 2, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39624() {
        int[] input = {7, 1, 0, 4, 6, 2, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 2, 1, 7, 4, 7, 1, 2, 6, 7, 4, 1, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39625() {
        int[] input = {7, 1, 0, 4, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 1, 6, 2, 4, 1, 6, 7, 2, 4, 1, 6, 7, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39626() {
        int[] input = {1, 7, 0, 4, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 4, 7, 6, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39627() {
        int[] input = {1, 0, 7, 4, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 5, 3, 4, 7, 6, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39628() {
        int[] input = {1, 0, 4, 7, 2, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 3, 7, 4, 1, 6, 5, 2, 4, 1, 5, 2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39629() {
        int[] input = {1, 0, 4, 2, 7, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 7, 6, 1, 4, 2, 4, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39630() {
        int[] input = {1, 0, 4, 2, 6, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 5, 3, 6, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39631() {
        int[] input = {1, 0, 4, 2, 6, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39632() {
        int[] input = {1, 0, 4, 2, 6, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 6, 3, 1, 4, 2, 6, 5, 7, 1, 3, 5, 6, 4, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39633() {
        int[] input = {1, 0, 4, 2, 3, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 6, 3, 2, 1, 4, 6, 4, 1, 5, 7, 3, 4, 6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39634() {
        int[] input = {1, 0, 4, 2, 3, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 4, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39635() {
        int[] input = {1, 0, 4, 2, 3, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 2, 4, 1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39636() {
        int[] input = {1, 0, 4, 2, 7, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 5, 6, 2, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39637() {
        int[] input = {1, 0, 4, 7, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 4, 1, 7, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39638() {
        int[] input = {1, 0, 7, 4, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39639() {
        int[] input = {1, 7, 0, 4, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39640() {
        int[] input = {7, 1, 0, 4, 2, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 4, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39641() {
        int[] input = {7, 1, 0, 4, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39642() {
        int[] input = {1, 7, 0, 4, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39643() {
        int[] input = {1, 0, 7, 4, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39644() {
        int[] input = {1, 0, 4, 7, 2, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39645() {
        int[] input = {1, 0, 4, 2, 7, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 2, 5, 6, 7, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39646() {
        int[] input = {1, 0, 4, 2, 3, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39647() {
        int[] input = {1, 0, 4, 2, 3, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 7, 2, 3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39648() {
        int[] input = {1, 0, 4, 2, 3, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39649() {
        int[] input = {1, 0, 2, 4, 3, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39650() {
        int[] input = {1, 0, 2, 4, 3, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 4, 7, 6, 5, 1, 2, 4, 2, 1, 3, 7, 2, 4, 1, 3, 5, 6, 2, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39651() {
        int[] input = {1, 0, 2, 4, 3, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39652() {
        int[] input = {1, 0, 2, 4, 7, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 2, 1, 4, 1, 2, 3, 7, 1, 4, 2, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39653() {
        int[] input = {1, 0, 2, 7, 4, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 1, 7, 1, 2, 3, 4, 1, 7, 2, 7, 1, 4, 3, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39654() {
        int[] input = {1, 0, 7, 2, 4, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39655() {
        int[] input = {1, 7, 0, 2, 4, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 3, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39656() {
        int[] input = {7, 1, 0, 2, 4, 3, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 4, 3, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39657() {
        int[] input = {7, 1, 0, 2, 4, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 6, 2, 1, 3, 5, 4, 1, 3, 7, 5, 7, 3, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39658() {
        int[] input = {1, 7, 0, 2, 4, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 3, 5, 6, 4, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39659() {
        int[] input = {1, 0, 7, 2, 4, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 5, 6, 4, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39660() {
        int[] input = {1, 0, 2, 7, 4, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 5, 3, 2, 1, 7, 6, 4, 2, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39661() {
        int[] input = {1, 0, 2, 4, 7, 3, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 4, 7, 3, 1, 2, 4, 2, 1, 3, 7, 2, 4, 1, 3, 5, 6, 2, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39662() {
        int[] input = {1, 0, 2, 4, 3, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 5, 6, 4, 3, 5, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39663() {
        int[] input = {1, 0, 2, 4, 3, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 3, 4, 1, 2, 6, 2, 1, 4, 3, 2, 6, 1, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39664() {
        int[] input = {1, 0, 2, 4, 3, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 2, 1, 4, 3, 5, 7, 2, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39665() {
        int[] input = {1, 0, 2, 4, 6, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 4, 6, 3, 1, 4, 6, 5, 7, 1, 3, 5, 6, 4, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39666() {
        int[] input = {1, 0, 2, 4, 6, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 4, 1, 2, 3, 4, 6, 1, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39667() {
        int[] input = {1, 0, 2, 4, 6, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 5, 7, 2, 1, 4, 3, 5, 7, 2, 1, 4, 3, 5, 6, 1, 2, 7, 6, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39668() {
        int[] input = {1, 0, 2, 4, 7, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39669() {
        int[] input = {1, 0, 2, 7, 4, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 4, 7, 3, 5, 4, 6, 1, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39670() {
        int[] input = {1, 0, 7, 2, 4, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 2, 1, 7, 6, 7, 1, 3, 5, 4, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39671() {
        int[] input = {1, 7, 0, 2, 4, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 6, 4, 2, 1, 7, 6, 7, 1, 3, 5, 4, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39672() {
        int[] input = {7, 1, 0, 2, 4, 6, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 1, 7, 6, 7, 1, 3, 5, 4, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39673() {
        int[] input = {7, 1, 0, 2, 6, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 4, 5, 3, 6, 4, 5, 3, 6, 4, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39674() {
        int[] input = {1, 7, 0, 2, 6, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 6, 4, 5, 3, 6, 4, 5, 3, 6, 4, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39675() {
        int[] input = {1, 0, 7, 2, 6, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 4, 5, 3, 6, 4, 5, 3, 6, 4, 2, 1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39676() {
        int[] input = {1, 0, 2, 7, 6, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 5, 3, 7, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39677() {
        int[] input = {1, 0, 2, 6, 7, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 3, 6, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39678() {
        int[] input = {1, 0, 2, 6, 4, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 5, 3, 6, 4, 5, 3, 6, 4, 2, 1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39679() {
        int[] input = {1, 0, 2, 6, 4, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39680() {
        int[] input = {1, 0, 2, 6, 4, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 3, 4, 5, 6, 1, 2, 4, 5, 6, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39681() {
        int[] input = {1, 0, 6, 2, 4, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 7, 5, 4, 2, 1, 6, 7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39682() {
        int[] input = {1, 0, 6, 2, 4, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39683() {
        int[] input = {1, 0, 6, 2, 4, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39684() {
        int[] input = {1, 0, 6, 2, 7, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 4, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39685() {
        int[] input = {1, 0, 6, 7, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 7, 3, 5, 4, 1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39686() {
        int[] input = {1, 0, 7, 6, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 2, 6, 7, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39687() {
        int[] input = {1, 7, 0, 6, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 7, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39688() {
        int[] input = {7, 1, 0, 6, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 4, 2, 6, 7, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39689() {
        int[] input = {7, 1, 6, 0, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 7, 1, 3, 5, 4, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39690() {
        int[] input = {1, 7, 6, 0, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 1, 7, 3, 5, 4, 1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39691() {
        int[] input = {1, 6, 7, 0, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 2, 6, 7, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39692() {
        int[] input = {1, 6, 0, 7, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 3, 5, 4, 1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39693() {
        int[] input = {1, 6, 0, 2, 7, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 5, 4, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39694() {
        int[] input = {1, 6, 0, 2, 4, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39695() {
        int[] input = {1, 6, 0, 2, 4, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39696() {
        int[] input = {1, 6, 0, 2, 4, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 4, 3, 7, 5, 4, 2, 1, 7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39697() {
        int[] input = {6, 1, 0, 2, 4, 3, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 3, 7, 5, 4, 2, 1, 7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39698() {
        int[] input = {6, 1, 0, 2, 4, 3, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39699() {
        int[] input = {6, 1, 0, 2, 4, 7, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 4, 7, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39700() {
        int[] input = {6, 1, 0, 2, 7, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39701() {
        int[] input = {6, 1, 0, 7, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 5, 4, 1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39702() {
        int[] input = {6, 1, 7, 0, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 7, 6, 1, 3, 2, 7, 6, 3, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39703() {
        int[] input = {6, 7, 1, 0, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39704() {
        int[] input = {7, 6, 1, 0, 2, 4, 3, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 4, 2, 6, 7, 4, 2, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39705() {
        int[] input = {7, 6, 1, 0, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 1, 6, 2, 4, 1, 6, 7, 2, 7, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39706() {
        int[] input = {6, 7, 1, 0, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 3, 5, 7, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39707() {
        int[] input = {6, 1, 7, 0, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 1, 5, 3, 2, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39708() {
        int[] input = {6, 1, 0, 7, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 5, 7, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39709() {
        int[] input = {6, 1, 0, 2, 7, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39710() {
        int[] input = {6, 1, 0, 2, 4, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 7, 1, 6, 2, 4, 7, 1, 3, 5, 7, 4, 6, 3, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39711() {
        int[] input = {6, 1, 0, 2, 4, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 2, 1, 5, 4, 2, 1, 5, 6, 4, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39712() {
        int[] input = {6, 1, 0, 2, 4, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 7, 5, 1, 2, 3, 4, 1, 2, 6, 3, 6, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39713() {
        int[] input = {1, 6, 0, 2, 4, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 3, 7, 5, 1, 2, 3, 4, 1, 2, 6, 3, 6, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39714() {
        int[] input = {1, 6, 0, 2, 4, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 4, 2, 1, 5, 4, 2, 1, 5, 6, 4, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39715() {
        int[] input = {1, 6, 0, 2, 4, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 4, 7, 1, 6, 2, 4, 7, 1, 3, 5, 7, 4, 6, 3, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39716() {
        int[] input = {1, 6, 0, 2, 7, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39717() {
        int[] input = {1, 6, 0, 7, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 3, 5, 7, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39718() {
        int[] input = {1, 6, 7, 0, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 4, 2, 6, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39719() {
        int[] input = {1, 7, 6, 0, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 4, 3, 5, 7, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39720() {
        int[] input = {7, 1, 6, 0, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 2, 1, 5, 3, 2, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39721() {
        int[] input = {7, 1, 0, 6, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 6, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39722() {
        int[] input = {1, 7, 0, 6, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 2, 6, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39723() {
        int[] input = {1, 0, 7, 6, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 6, 1, 4, 2, 6, 1, 4, 7, 2, 6, 1, 4, 7, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39724() {
        int[] input = {1, 0, 6, 7, 2, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 3, 5, 7, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39725() {
        int[] input = {1, 0, 6, 2, 7, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39726() {
        int[] input = {1, 0, 6, 2, 4, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 4, 7, 1, 6, 2, 4, 7, 1, 3, 5, 7, 4, 6, 3, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39727() {
        int[] input = {1, 0, 6, 2, 4, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 4, 2, 1, 5, 4, 2, 1, 5, 6, 4, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39728() {
        int[] input = {1, 0, 6, 2, 4, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 3, 7, 5, 1, 2, 3, 4, 1, 2, 6, 3, 6, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39729() {
        int[] input = {1, 0, 2, 6, 4, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 4, 6, 1, 2, 5, 2, 1, 3, 7, 4, 2, 5, 1, 3, 6, 2, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39730() {
        int[] input = {1, 0, 2, 6, 4, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39731() {
        int[] input = {1, 0, 2, 6, 4, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 6, 4, 7, 1, 6, 4, 7, 1, 3, 5, 7, 4, 6, 3, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39732() {
        int[] input = {1, 0, 2, 6, 7, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39733() {
        int[] input = {1, 0, 2, 7, 6, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 5, 7, 2, 1, 4, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39734() {
        int[] input = {1, 0, 7, 2, 6, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 6, 2, 1, 7, 4, 7, 1, 5, 3, 6, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39735() {
        int[] input = {1, 7, 0, 2, 6, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 6, 2, 1, 7, 4, 7, 1, 5, 3, 6, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39736() {
        int[] input = {7, 1, 0, 2, 6, 4, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 2, 1, 7, 4, 7, 1, 5, 3, 6, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39737() {
        int[] input = {7, 1, 0, 2, 4, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 3, 6, 1, 2, 5, 4, 1, 2, 7, 5, 4, 1, 2, 7, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39738() {
        int[] input = {1, 7, 0, 2, 4, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 2, 7, 1, 6, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39739() {
        int[] input = {1, 0, 7, 2, 4, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 5, 2, 7, 1, 6, 3, 4, 7, 1, 6, 3, 6, 1, 2, 5, 4, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39740() {
        int[] input = {1, 0, 2, 7, 4, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 4, 7, 1, 2, 6, 2, 1, 7, 4, 2, 6, 1, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39741() {
        int[] input = {1, 0, 2, 4, 7, 6, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 4, 5, 3, 6, 7, 5, 3, 6, 7, 1, 2, 4, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39742() {
        int[] input = {1, 0, 2, 4, 6, 7, 5, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 4, 6, 7, 1, 2, 4, 2, 1, 3, 5, 6, 2, 4, 1, 3, 5, 6, 2, 4, 3, 5, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39743() {
        int[] input = {1, 0, 2, 4, 6, 5, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39744() {
        int[] input = {1, 0, 2, 4, 6, 5, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 3, 4, 2, 5, 7, 3, 4, 2, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39745() {
        int[] input = {1, 0, 2, 4, 5, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 6, 2, 1, 4, 5, 3, 7, 2, 1, 4, 5, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39746() {
        int[] input = {1, 0, 2, 4, 5, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 3, 7, 4, 1, 6, 3, 5, 1, 4, 7, 5, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39747() {
        int[] input = {1, 0, 2, 4, 5, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 6, 4, 2, 1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39748() {
        int[] input = {1, 0, 2, 4, 7, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 7, 4, 1, 2, 5, 2, 1, 4, 7, 2, 5, 1, 5, 2, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39749() {
        int[] input = {1, 0, 2, 7, 4, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 2, 7, 4, 5, 2, 3, 6, 5, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39750() {
        int[] input = {1, 0, 7, 2, 4, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 3, 6, 4, 2, 1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39751() {
        int[] input = {1, 7, 0, 2, 4, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 4, 5, 3, 6, 4, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39752() {
        int[] input = {7, 1, 0, 2, 4, 5, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 5, 3, 6, 4, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39753() {
        int[] input = {7, 1, 0, 2, 4, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 5, 1, 7, 2, 4, 5, 1, 7, 4, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39754() {
        int[] input = {1, 7, 0, 2, 4, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 4, 5, 1, 7, 2, 4, 5, 1, 7, 4, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39755() {
        int[] input = {1, 0, 7, 2, 4, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 4, 5, 1, 7, 2, 4, 5, 1, 7, 4, 5, 3, 6, 7, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39756() {
        int[] input = {1, 0, 2, 7, 4, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 3, 7, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39757() {
        int[] input = {1, 0, 2, 4, 7, 5, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 7, 4, 3, 6, 7, 5, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39758() {
        int[] input = {1, 0, 2, 4, 5, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 4, 3, 6, 7, 1, 2, 4, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39759() {
        int[] input = {1, 0, 2, 4, 5, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 5, 3, 2, 1, 6, 7, 2, 1, 6, 5, 4, 3, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39760() {
        int[] input = {1, 0, 2, 4, 5, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39761() {
        int[] input = {1, 0, 2, 5, 4, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39762() {
        int[] input = {1, 0, 2, 5, 4, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 5, 4, 3, 1, 5, 4, 7, 6, 1, 3, 7, 4, 5, 3, 1, 6, 4, 5, 2, 3, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39763() {
        int[] input = {1, 0, 2, 5, 4, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 7, 4, 3, 5, 1, 2, 4, 3, 5, 1, 2, 4, 2, 1, 5, 3, 2, 4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39764() {
        int[] input = {1, 0, 2, 5, 7, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 5, 7, 4, 1, 2, 5, 2, 1, 4, 7, 2, 5, 1, 4, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39765() {
        int[] input = {1, 0, 2, 7, 5, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 7, 2, 1, 4, 5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39766() {
        int[] input = {1, 0, 7, 2, 5, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 5, 2, 7, 1, 4, 5, 2, 7, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39767() {
        int[] input = {1, 7, 0, 2, 5, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 7, 1, 4, 5, 2, 7, 1, 5, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39768() {
        int[] input = {7, 1, 0, 2, 5, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 4, 1, 2, 5, 4, 1, 2, 7, 5, 4, 1, 2, 7, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39769() {
        int[] input = {7, 1, 0, 2, 5, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 5, 4, 7, 2, 5, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39770() {
        int[] input = {1, 7, 0, 2, 5, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 5, 4, 7, 2, 5, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39771() {
        int[] input = {1, 0, 7, 2, 5, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 4, 7, 2, 5, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39772() {
        int[] input = {1, 0, 2, 7, 5, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 7, 2, 4, 5, 3, 6, 2, 4, 1, 5, 3, 7, 4, 1, 5, 3, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39773() {
        int[] input = {1, 0, 2, 5, 7, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 3, 6, 5, 1, 4, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39774() {
        int[] input = {1, 0, 2, 5, 4, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 3, 6, 4, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39775() {
        int[] input = {1, 0, 2, 5, 4, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 2, 1, 5, 1, 2, 6, 4, 1, 5, 2, 5, 1, 4, 6, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39776() {
        int[] input = {1, 0, 2, 5, 4, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 2, 1, 5, 4, 3, 7, 2, 1, 4, 3, 6, 1, 2, 7, 6, 1, 2, 4, 5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39777() {
        int[] input = {1, 0, 2, 5, 6, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 7, 4, 2, 5, 3, 6, 2, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39778() {
        int[] input = {1, 0, 2, 5, 6, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 5, 6, 4, 1, 2, 5, 2, 1, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39779() {
        int[] input = {1, 0, 2, 5, 6, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 7, 2, 1, 5, 6, 7, 2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39780() {
        int[] input = {1, 0, 2, 5, 7, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 4, 5, 2, 1, 6, 3, 7, 2, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39781() {
        int[] input = {1, 0, 2, 7, 5, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39782() {
        int[] input = {1, 0, 7, 2, 5, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39783() {
        int[] input = {1, 7, 0, 2, 5, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39784() {
        int[] input = {7, 1, 0, 2, 5, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39785() {
        int[] input = {7, 1, 0, 2, 6, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 3, 5, 1, 2, 4, 6, 1, 2, 7, 4, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39786() {
        int[] input = {1, 7, 0, 2, 6, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 4, 3, 5, 1, 2, 4, 6, 1, 2, 7, 4, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39787() {
        int[] input = {1, 0, 7, 2, 6, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 4, 3, 5, 1, 2, 4, 6, 1, 2, 7, 4, 7, 2, 1, 6, 7, 4, 2, 1, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39788() {
        int[] input = {1, 0, 2, 7, 6, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 6, 7, 4, 3, 6, 7, 4, 3, 6, 7, 5, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39789() {
        int[] input = {1, 0, 2, 6, 7, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 6, 7, 5, 1, 2, 6, 2, 1, 3, 4, 7, 2, 6, 1, 3, 5, 2, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39790() {
        int[] input = {1, 0, 2, 6, 5, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 2, 1, 6, 5, 7, 2, 1, 6, 5, 6, 1, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39791() {
        int[] input = {1, 0, 2, 6, 5, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 5, 6, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39792() {
        int[] input = {1, 0, 2, 6, 5, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 5, 6, 3, 7, 5, 4, 1, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39793() {
        int[] input = {1, 0, 6, 2, 5, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 2, 1, 6, 4, 6, 1, 3, 7, 5, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39794() {
        int[] input = {1, 0, 6, 2, 5, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39795() {
        int[] input = {1, 0, 6, 2, 5, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 3, 4, 2, 1, 7, 3, 5, 1, 7, 6, 3, 6, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39796() {
        int[] input = {1, 0, 6, 2, 7, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 5, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39797() {
        int[] input = {1, 0, 6, 7, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39798() {
        int[] input = {1, 0, 7, 6, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 6, 1, 7, 5, 7, 1, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39799() {
        int[] input = {1, 7, 0, 6, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 2, 6, 1, 7, 5, 7, 1, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39800() {
        int[] input = {7, 1, 0, 6, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 1, 7, 5, 7, 1, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39801() {
        int[] input = {7, 1, 6, 0, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 1, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39802() {
        int[] input = {1, 7, 6, 0, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39803() {
        int[] input = {1, 6, 7, 0, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 5, 2, 6, 1, 7, 5, 7, 1, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39804() {
        int[] input = {1, 6, 0, 7, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39805() {
        int[] input = {1, 6, 0, 2, 7, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 3, 5, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39806() {
        int[] input = {1, 6, 0, 2, 5, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 7, 3, 4, 2, 1, 7, 3, 5, 1, 7, 6, 3, 6, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39807() {
        int[] input = {1, 6, 0, 2, 5, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39808() {
        int[] input = {1, 6, 0, 2, 5, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 5, 2, 1, 6, 4, 6, 1, 3, 7, 5, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39809() {
        int[] input = {6, 1, 0, 2, 5, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 2, 1, 6, 4, 6, 1, 3, 7, 5, 6, 4, 1, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39810() {
        int[] input = {6, 1, 0, 2, 5, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 4, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39811() {
        int[] input = {6, 1, 0, 2, 5, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 2, 1, 7, 3, 5, 1, 7, 6, 3, 6, 7, 1, 5, 6, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39812() {
        int[] input = {6, 1, 0, 2, 7, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 4, 3, 5, 6, 2, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39813() {
        int[] input = {6, 1, 0, 7, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39814() {
        int[] input = {6, 1, 7, 0, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 2, 1, 6, 5, 2, 1, 6, 5, 7, 2, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39815() {
        int[] input = {6, 7, 1, 0, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39816() {
        int[] input = {7, 6, 1, 0, 2, 5, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 2, 6, 1, 7, 5, 7, 1, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39817() {
        int[] input = {7, 6, 1, 0, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 1, 7, 6, 5, 4, 3, 1, 2, 4, 5, 7, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39818() {
        int[] input = {6, 7, 1, 0, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39819() {
        int[] input = {6, 1, 7, 0, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 3, 4, 1, 6, 2, 3, 5, 6, 2, 7, 3, 5, 6, 2, 1, 4, 6, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39820() {
        int[] input = {6, 1, 0, 7, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39821() {
        int[] input = {6, 1, 0, 5, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 1, 6, 5, 6, 1, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39822() {
        int[] input = {6, 1, 0, 5, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 7, 1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 7, 6, 5, 3, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39823() {
        int[] input = {6, 1, 0, 5, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39824() {
        int[] input = {6, 1, 0, 5, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 1, 4, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39825() {
        int[] input = {1, 6, 0, 5, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 3, 5, 2, 7, 4, 1, 6, 2, 7, 4, 1, 6, 2, 6, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39826() {
        int[] input = {1, 6, 0, 5, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39827() {
        int[] input = {1, 6, 0, 5, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 5, 6, 7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39828() {
        int[] input = {1, 6, 0, 5, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 2, 1, 6, 5, 6, 1, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39829() {
        int[] input = {1, 6, 0, 7, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39830() {
        int[] input = {1, 6, 7, 0, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 5, 6, 7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39831() {
        int[] input = {1, 7, 6, 0, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39832() {
        int[] input = {7, 1, 6, 0, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 1, 5, 2, 6, 3, 4, 2, 5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39833() {
        int[] input = {7, 1, 0, 6, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 2, 1, 7, 6, 5, 4, 3, 1, 2, 4, 5, 7, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39834() {
        int[] input = {1, 7, 0, 6, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 5, 2, 1, 7, 6, 5, 4, 3, 1, 2, 4, 5, 7, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39835() {
        int[] input = {1, 0, 7, 6, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 3, 4, 5, 6, 7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39836() {
        int[] input = {1, 0, 6, 7, 5, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 6, 2, 1, 4, 7, 6, 5, 3, 7, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39837() {
        int[] input = {1, 0, 6, 5, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 7, 2, 1, 6, 5, 6, 1, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39838() {
        int[] input = {1, 0, 6, 5, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 4, 5, 6, 7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39839() {
        int[] input = {1, 0, 6, 5, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39840() {
        int[] input = {1, 0, 6, 5, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 2, 5, 1, 4, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39841() {
        int[] input = {1, 0, 5, 6, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 7, 4, 5, 1, 6, 3, 2, 5, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39842() {
        int[] input = {1, 0, 5, 6, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 6, 2, 4, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39843() {
        int[] input = {1, 0, 5, 6, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 6, 5, 7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39844() {
        int[] input = {1, 0, 5, 6, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 2, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39845() {
        int[] input = {1, 0, 5, 7, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 5, 1, 7, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39846() {
        int[] input = {1, 0, 7, 5, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39847() {
        int[] input = {1, 7, 0, 5, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39848() {
        int[] input = {7, 1, 0, 5, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39849() {
        int[] input = {7, 1, 0, 5, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 6, 3, 4, 2, 5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39850() {
        int[] input = {1, 7, 0, 5, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 6, 3, 4, 2, 5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39851() {
        int[] input = {1, 0, 7, 5, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 3, 4, 2, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39852() {
        int[] input = {1, 0, 5, 7, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 3, 4, 7, 2, 3, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39853() {
        int[] input = {1, 0, 5, 2, 7, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 6, 7, 4, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39854() {
        int[] input = {1, 0, 5, 2, 6, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 4, 2, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39855() {
        int[] input = {1, 0, 5, 2, 6, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 4, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39856() {
        int[] input = {1, 0, 5, 2, 6, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39857() {
        int[] input = {1, 0, 5, 2, 4, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 4, 2, 1, 6, 4, 2, 1, 3, 7, 2, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39858() {
        int[] input = {1, 0, 5, 2, 4, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39859() {
        int[] input = {1, 0, 5, 2, 4, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39860() {
        int[] input = {1, 0, 5, 2, 7, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 2, 5, 1, 4, 7, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39861() {
        int[] input = {1, 0, 5, 7, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 7, 1, 5, 4, 5, 1, 6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39862() {
        int[] input = {1, 0, 7, 5, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39863() {
        int[] input = {1, 7, 0, 5, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39864() {
        int[] input = {7, 1, 0, 5, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39865() {
        int[] input = {7, 1, 0, 5, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 5, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39866() {
        int[] input = {1, 7, 0, 5, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 4, 2, 5, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39867() {
        int[] input = {1, 0, 7, 5, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 4, 2, 5, 1, 7, 4, 7, 1, 5, 2, 7, 4, 1, 5, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39868() {
        int[] input = {1, 0, 5, 7, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 7, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39869() {
        int[] input = {1, 0, 5, 2, 7, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39870() {
        int[] input = {1, 0, 5, 2, 4, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39871() {
        int[] input = {1, 0, 5, 2, 4, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 6, 7, 2, 4, 6, 3, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39872() {
        int[] input = {1, 0, 5, 2, 4, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39873() {
        int[] input = {1, 5, 0, 2, 4, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39874() {
        int[] input = {1, 5, 0, 2, 4, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 2, 4, 6, 3, 5, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39875() {
        int[] input = {1, 5, 0, 2, 4, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39876() {
        int[] input = {1, 5, 0, 2, 7, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 3, 6, 7, 4, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39877() {
        int[] input = {1, 5, 0, 7, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 2, 7, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39878() {
        int[] input = {1, 5, 7, 0, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 5, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39879() {
        int[] input = {1, 7, 5, 0, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 4, 2, 7, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39880() {
        int[] input = {7, 1, 5, 0, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 1, 5, 7, 4, 7, 5, 1, 2, 7, 4, 5, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39881() {
        int[] input = {7, 1, 5, 0, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 2, 1, 7, 4, 2, 1, 7, 4, 5, 2, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39882() {
        int[] input = {1, 7, 5, 0, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 1, 7, 2, 4, 5, 3, 6, 4, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39883() {
        int[] input = {1, 5, 7, 0, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39884() {
        int[] input = {1, 5, 0, 7, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 2, 7, 1, 5, 4, 5, 1, 6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39885() {
        int[] input = {1, 5, 0, 2, 7, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 5, 1, 4, 7, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39886() {
        int[] input = {1, 5, 0, 2, 4, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39887() {
        int[] input = {1, 5, 0, 2, 4, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39888() {
        int[] input = {1, 5, 0, 2, 4, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 6, 4, 2, 1, 6, 4, 2, 1, 3, 7, 2, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39889() {
        int[] input = {1, 5, 0, 2, 6, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39890() {
        int[] input = {1, 5, 0, 2, 6, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 6, 4, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39891() {
        int[] input = {1, 5, 0, 2, 6, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 2, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39892() {
        int[] input = {1, 5, 0, 2, 7, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 3, 6, 7, 4, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39893() {
        int[] input = {1, 5, 0, 7, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 4, 7, 2, 3, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39894() {
        int[] input = {1, 5, 7, 0, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 4, 2, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39895() {
        int[] input = {1, 7, 5, 0, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 6, 3, 4, 7, 2, 3, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39896() {
        int[] input = {7, 1, 5, 0, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 7, 1, 4, 3, 6, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39897() {
        int[] input = {7, 1, 5, 0, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 7, 1, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39898() {
        int[] input = {1, 7, 5, 0, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 5, 1, 7, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39899() {
        int[] input = {1, 5, 7, 0, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39900() {
        int[] input = {1, 5, 0, 7, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 6, 2, 1, 5, 7, 5, 1, 2, 6, 5, 7, 1, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39901() {
        int[] input = {1, 5, 0, 6, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 7, 2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39902() {
        int[] input = {1, 5, 0, 6, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 5, 7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39903() {
        int[] input = {1, 5, 0, 6, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 2, 4, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39904() {
        int[] input = {1, 5, 0, 6, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 7, 4, 5, 1, 6, 3, 2, 5, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39905() {
        int[] input = {1, 5, 6, 0, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 4, 2, 5, 1, 4, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39906() {
        int[] input = {1, 5, 6, 0, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39907() {
        int[] input = {1, 5, 6, 0, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 5, 2, 4, 3, 6, 7, 4, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39908() {
        int[] input = {1, 5, 6, 0, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 4, 7, 2, 3, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39909() {
        int[] input = {1, 5, 6, 7, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 7, 2, 3, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39910() {
        int[] input = {1, 5, 7, 6, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39911() {
        int[] input = {1, 7, 5, 6, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 5, 1, 7, 1, 5, 6, 4, 1, 7, 5, 7, 1, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39912() {
        int[] input = {7, 1, 5, 6, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 5, 7, 1, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39913() {
        int[] input = {7, 1, 6, 5, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 1, 5, 2, 6, 3, 4, 2, 5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39914() {
        int[] input = {1, 7, 6, 5, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 1, 7, 5, 2, 6, 3, 4, 2, 5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39915() {
        int[] input = {1, 6, 7, 5, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 5, 6, 7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39916() {
        int[] input = {1, 6, 5, 7, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39917() {
        int[] input = {1, 6, 5, 0, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 4, 7, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39918() {
        int[] input = {1, 6, 5, 0, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 2, 6, 5, 7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39919() {
        int[] input = {1, 6, 5, 0, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 1, 6, 2, 4, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39920() {
        int[] input = {1, 6, 5, 0, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 4, 5, 1, 6, 3, 2, 5, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39921() {
        int[] input = {6, 1, 5, 0, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 4, 2, 1, 3, 7, 2, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39922() {
        int[] input = {6, 1, 5, 0, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 2, 1, 5, 6, 4, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39923() {
        int[] input = {6, 1, 5, 0, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 7, 5, 6, 1, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39924() {
        int[] input = {6, 1, 5, 0, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 5, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39925() {
        int[] input = {6, 1, 5, 7, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 5, 1, 4, 7, 5, 1, 6, 4, 6, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39926() {
        int[] input = {6, 1, 7, 5, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 5, 1, 6, 7, 3, 2, 1, 6, 7, 3, 2, 1, 6, 7, 2, 1, 4, 5, 7, 2, 3, 1, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39927() {
        int[] input = {6, 7, 1, 5, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 7, 5, 4, 3, 1, 2, 4, 5, 7, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39928() {
        int[] input = {7, 6, 1, 5, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 7, 6, 5, 4, 3, 1, 2, 4, 5, 7, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39929() {
        int[] input = {7, 6, 5, 1, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 2, 1, 6, 5, 7, 2, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39930() {
        int[] input = {6, 7, 5, 1, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 3, 4, 7, 5, 2, 3, 1, 5, 2, 6, 3, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39931() {
        int[] input = {6, 5, 7, 1, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 1, 4, 5, 7, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39932() {
        int[] input = {6, 5, 1, 7, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 5, 6, 1, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39933() {
        int[] input = {6, 5, 1, 0, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 1, 6, 5, 6, 1, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39934() {
        int[] input = {6, 5, 1, 0, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 7, 6, 5, 3, 7, 6, 5, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39935() {
        int[] input = {6, 5, 1, 0, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39936() {
        int[] input = {6, 5, 1, 0, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 4, 2, 5, 1, 4, 2, 5, 1, 3, 7, 5, 1, 3, 4, 6, 2, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39937() {
        int[] input = {5, 6, 1, 0, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 1, 5, 6, 2, 4, 1, 5, 6, 2, 4, 3, 7, 5, 1, 3, 4, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39938() {
        int[] input = {5, 6, 1, 0, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39939() {
        int[] input = {5, 6, 1, 0, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 7, 2, 6, 5, 7, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39940() {
        int[] input = {5, 6, 1, 0, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39941() {
        int[] input = {5, 6, 1, 7, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39942() {
        int[] input = {5, 6, 7, 1, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 2, 1, 6, 5, 7, 2, 1, 3, 4, 5, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39943() {
        int[] input = {5, 7, 6, 1, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 1, 4, 3, 6, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39944() {
        int[] input = {7, 5, 6, 1, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 4, 3, 2, 1, 4, 5, 7, 6, 1, 2, 3, 5, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39945() {
        int[] input = {7, 5, 1, 6, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 1, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39946() {
        int[] input = {5, 7, 1, 6, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 5, 7, 5, 1, 2, 6, 5, 7, 1, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39947() {
        int[] input = {5, 1, 7, 6, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39948() {
        int[] input = {5, 1, 6, 7, 0, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 2, 3, 4, 1, 7, 3, 4, 1, 7, 6, 5, 2, 4, 1, 7, 6, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39949() {
        int[] input = {5, 1, 6, 0, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 3, 4, 1, 7, 3, 4, 1, 7, 6, 5, 2, 4, 1, 7, 6, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39950() {
        int[] input = {5, 1, 6, 0, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 3, 7, 5, 6, 4, 3, 2, 6, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39951() {
        int[] input = {5, 1, 6, 0, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 5, 1, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39952() {
        int[] input = {5, 1, 6, 0, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 2, 1, 3, 7, 2, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39953() {
        int[] input = {5, 1, 0, 6, 2, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 3, 7, 4, 5, 1, 6, 3, 2, 5, 1, 6, 3, 6, 1, 5, 2, 6, 3, 1, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39954() {
        int[] input = {5, 1, 0, 6, 2, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 4, 1, 5, 6, 5, 1, 4, 2, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39955() {
        int[] input = {5, 1, 0, 6, 2, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39956() {
        int[] input = {5, 1, 0, 6, 7, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 3, 4, 7, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39957() {
        int[] input = {5, 1, 0, 7, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 2, 1, 5, 7, 5, 1, 2, 6, 5, 7, 1, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39958() {
        int[] input = {5, 1, 7, 0, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 6, 4, 3, 2, 6, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39959() {
        int[] input = {5, 7, 1, 0, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 1, 5, 7, 5, 1, 2, 6, 5, 7, 1, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39960() {
        int[] input = {7, 5, 1, 0, 6, 2, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 2, 3, 4, 5, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39961() {
        int[] input = {7, 5, 1, 0, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 4, 2, 5, 1, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39962() {
        int[] input = {5, 7, 1, 0, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 3, 4, 7, 2, 3, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39963() {
        int[] input = {5, 1, 7, 0, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 6, 7, 1, 4, 3, 6, 7, 1, 5, 4, 5, 1, 2, 3, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39964() {
        int[] input = {5, 1, 0, 7, 2, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 4, 7, 2, 3, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39965() {
        int[] input = {5, 1, 0, 2, 7, 6, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 4, 3, 6, 7, 4, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39966() {
        int[] input = {5, 1, 0, 2, 6, 7, 4, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 7, 3, 4, 2, 5, 1, 7, 3, 6, 5, 1, 7, 3, 7, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39967() {
        int[] input = {5, 1, 0, 2, 6, 4, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 4, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39968() {
        int[] input = {5, 1, 0, 2, 6, 4, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 4, 1, 5, 2, 5, 1, 7, 3, 6, 4, 7, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39969() {
        int[] input = {5, 1, 0, 2, 4, 6, 3, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 2, 1, 6, 4, 2, 1, 3, 7, 2, 1, 3, 6, 5, 4, 1, 2, 7, 6, 5, 4, 1, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39970() {
        int[] input = {5, 1, 0, 2, 4, 6, 7, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 4, 6, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39971() {
        int[] input = {5, 1, 0, 2, 4, 7, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39972() {
        int[] input = {5, 1, 0, 2, 7, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 4, 7, 2, 5, 1, 4, 7, 3, 6, 5, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39973() {
        int[] input = {5, 1, 0, 7, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 1, 5, 4, 5, 1, 6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39974() {
        int[] input = {5, 1, 7, 0, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 1, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39975() {
        int[] input = {5, 7, 1, 0, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 4, 2, 7, 1, 5, 4, 5, 1, 6, 3, 2, 5, 4, 1, 6, 7, 5, 2, 3, 7, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39976() {
        int[] input = {7, 5, 1, 0, 2, 4, 6, 3};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 7, 5, 2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39977() {
        int[] input = {7, 5, 1, 0, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 1, 7, 5, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39978() {
        int[] input = {5, 7, 1, 0, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 4, 1, 7, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39979() {
        int[] input = {5, 1, 7, 0, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 5, 1, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39980() {
        int[] input = {5, 1, 0, 7, 2, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 2, 7, 1, 5, 4, 2, 7, 1, 3, 6, 7, 1, 3, 5, 4, 2, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39981() {
        int[] input = {5, 1, 0, 2, 7, 4, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 7, 2, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39982() {
        int[] input = {5, 1, 0, 2, 4, 7, 3, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 3, 6, 7, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39983() {
        int[] input = {5, 1, 0, 2, 4, 3, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 7, 2, 4, 6, 3, 5, 1, 4, 2, 7, 3, 5, 1, 4, 2, 6, 5, 1, 4, 2, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39984() {
        int[] input = {5, 1, 0, 2, 4, 3, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39985() {
        int[] input = {5, 1, 0, 2, 3, 4, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39986() {
        int[] input = {5, 1, 0, 2, 3, 4, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 6, 7, 2, 1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39987() {
        int[] input = {5, 1, 0, 2, 3, 7, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 6, 7, 3, 4, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39988() {
        int[] input = {5, 1, 0, 2, 7, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 3, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39989() {
        int[] input = {5, 1, 0, 7, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39990() {
        int[] input = {5, 1, 7, 0, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 2, 1, 7, 5, 3, 5, 7, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39991() {
        int[] input = {5, 7, 1, 0, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39992() {
        int[] input = {7, 5, 1, 0, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 1, 5, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39993() {
        int[] input = {7, 5, 1, 0, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 1, 7, 5, 2, 3, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39994() {
        int[] input = {5, 7, 1, 0, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 1, 5, 7, 5, 1, 4, 6, 2, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39995() {
        int[] input = {5, 1, 7, 0, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 2, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39996() {
        int[] input = {5, 1, 0, 7, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 3, 1, 5, 7, 5, 1, 4, 6, 2, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39997() {
        int[] input = {5, 1, 0, 2, 7, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 1, 5, 3, 7, 4, 6, 1, 2, 4, 7, 5, 2, 1, 6, 7, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39998() {
        int[] input = {5, 1, 0, 2, 3, 7, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 2, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve39999() {
        int[] input = {5, 1, 0, 2, 3, 6, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40000() {
        int[] input = {5, 1, 0, 2, 3, 6, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 6, 1, 5, 2, 3, 6, 1, 5, 2, 3, 6, 4, 7, 5, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40001() {
        int[] input = {5, 1, 0, 2, 6, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 4, 7, 3, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40002() {
        int[] input = {5, 1, 0, 2, 6, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 6, 3, 4, 7, 6, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40003() {
        int[] input = {5, 1, 0, 2, 6, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40004() {
        int[] input = {5, 1, 0, 2, 7, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 6, 4, 3, 7, 6, 4, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40005() {
        int[] input = {5, 1, 0, 7, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 3, 4, 6, 5, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40006() {
        int[] input = {5, 1, 7, 0, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40007() {
        int[] input = {5, 7, 1, 0, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 1, 5, 7, 3, 4, 6, 5, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40008() {
        int[] input = {7, 5, 1, 0, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40009() {
        int[] input = {7, 5, 1, 0, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 2, 6, 5, 1, 7, 2, 7, 1, 3, 4, 6, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40010() {
        int[] input = {5, 7, 1, 0, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 4, 3, 7, 1, 2, 4, 6, 1, 2, 5, 4, 6, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40011() {
        int[] input = {5, 1, 7, 0, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40012() {
        int[] input = {5, 1, 0, 7, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 7, 1, 2, 4, 6, 1, 2, 5, 4, 6, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40013() {
        int[] input = {5, 1, 0, 6, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40014() {
        int[] input = {5, 1, 0, 6, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40015() {
        int[] input = {5, 1, 0, 6, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40016() {
        int[] input = {5, 1, 0, 6, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 2, 3, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40017() {
        int[] input = {5, 1, 6, 0, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 5, 1, 2, 3, 5, 1, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40018() {
        int[] input = {5, 1, 6, 0, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40019() {
        int[] input = {5, 1, 6, 0, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 2, 1, 3, 4, 2, 7, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40020() {
        int[] input = {5, 1, 6, 0, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40021() {
        int[] input = {5, 1, 6, 7, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40022() {
        int[] input = {5, 1, 7, 6, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40023() {
        int[] input = {5, 7, 1, 6, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 2, 4, 3, 7, 1, 2, 4, 6, 1, 2, 5, 4, 6, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40024() {
        int[] input = {7, 5, 1, 6, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 2, 6, 5, 1, 7, 2, 7, 1, 3, 4, 6, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40025() {
        int[] input = {7, 5, 6, 1, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40026() {
        int[] input = {5, 7, 6, 1, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 7, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40027() {
        int[] input = {5, 6, 7, 1, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 3, 4, 2, 7, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40028() {
        int[] input = {5, 6, 1, 7, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40029() {
        int[] input = {5, 6, 1, 0, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40030() {
        int[] input = {5, 6, 1, 0, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 2, 6, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40031() {
        int[] input = {5, 6, 1, 0, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40032() {
        int[] input = {5, 6, 1, 0, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 1, 5, 6, 2, 3, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40033() {
        int[] input = {6, 5, 1, 0, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 3, 7, 4, 5, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40034() {
        int[] input = {6, 5, 1, 0, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 1, 6, 5, 6, 1, 3, 2, 6, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40035() {
        int[] input = {6, 5, 1, 0, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 1, 6, 5, 2, 7, 1, 6, 5, 2, 5, 6, 4, 3, 7, 5, 6, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40036() {
        int[] input = {6, 5, 1, 0, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40037() {
        int[] input = {6, 5, 1, 7, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 1, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40038() {
        int[] input = {6, 5, 7, 1, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 7, 6, 5, 1, 2, 6, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40039() {
        int[] input = {6, 7, 5, 1, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 4, 3, 7, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40040() {
        int[] input = {7, 6, 5, 1, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 7, 6, 3, 4, 2, 7, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40041() {
        int[] input = {7, 6, 1, 5, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 1, 6, 5, 2, 1, 6, 5, 2, 3, 4, 6, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40042() {
        int[] input = {6, 7, 1, 5, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 4, 2, 1, 7, 3, 5, 1, 7, 6, 3, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40043() {
        int[] input = {6, 1, 7, 5, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 2, 4, 3, 1, 7, 6, 2, 4, 3, 1, 7, 6, 4, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40044() {
        int[] input = {6, 1, 5, 7, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40045() {
        int[] input = {6, 1, 5, 0, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40046() {
        int[] input = {6, 1, 5, 0, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 7, 2, 1, 3, 4, 2, 7, 6, 3, 1, 7, 6, 5, 3, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40047() {
        int[] input = {6, 1, 5, 0, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 3, 2, 1, 6, 3, 2, 4, 7, 6, 3, 5, 2, 4, 1, 3, 5, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40048() {
        int[] input = {6, 1, 5, 0, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 1, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40049() {
        int[] input = {1, 6, 5, 0, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40050() {
        int[] input = {1, 6, 5, 0, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40051() {
        int[] input = {1, 6, 5, 0, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 7, 2, 6, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40052() {
        int[] input = {1, 6, 5, 0, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 1, 6, 7, 2, 1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40053() {
        int[] input = {1, 6, 5, 7, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 5, 1, 6, 7, 2, 1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40054() {
        int[] input = {1, 6, 7, 5, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 1, 7, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 6, 3, 4, 5, 6, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40055() {
        int[] input = {1, 7, 6, 5, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 1, 7, 5, 3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40056() {
        int[] input = {7, 1, 6, 5, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 1, 5, 3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40057() {
        int[] input = {7, 1, 5, 6, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 5, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40058() {
        int[] input = {1, 7, 5, 6, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 1, 7, 6, 3, 4, 5, 1, 6, 3, 2, 1, 5, 4, 2, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40059() {
        int[] input = {1, 5, 7, 6, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 6, 2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40060() {
        int[] input = {1, 5, 6, 7, 0, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40061() {
        int[] input = {1, 5, 6, 0, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40062() {
        int[] input = {1, 5, 6, 0, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 1, 5, 2, 7, 6, 4, 3, 7, 6, 4, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40063() {
        int[] input = {1, 5, 6, 0, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40064() {
        int[] input = {1, 5, 6, 0, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 6, 3, 7, 4, 5, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40065() {
        int[] input = {1, 5, 0, 6, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 2, 3, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40066() {
        int[] input = {1, 5, 0, 6, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40067() {
        int[] input = {1, 5, 0, 6, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 6, 2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40068() {
        int[] input = {1, 5, 0, 6, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 6, 7, 2, 1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40069() {
        int[] input = {1, 5, 0, 7, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 5, 1, 2, 6, 4, 3, 5, 1, 2, 6, 2, 1, 7, 4, 2, 6, 1, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40070() {
        int[] input = {1, 5, 7, 0, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 3, 6, 2, 4, 7, 1, 5, 2, 4, 7, 1, 5, 2, 5, 1, 3, 6, 4, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40071() {
        int[] input = {1, 7, 5, 0, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 4, 3, 7, 1, 2, 4, 6, 1, 2, 5, 4, 6, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40072() {
        int[] input = {7, 1, 5, 0, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40073() {
        int[] input = {7, 1, 5, 0, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40074() {
        int[] input = {1, 7, 5, 0, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 6, 5, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40075() {
        int[] input = {1, 5, 7, 0, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 1, 7, 1, 5, 3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40076() {
        int[] input = {1, 5, 0, 7, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 4, 6, 5, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40077() {
        int[] input = {1, 5, 0, 2, 7, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 7, 6, 4, 3, 7, 6, 4, 3, 7, 6, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40078() {
        int[] input = {1, 5, 0, 2, 6, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40079() {
        int[] input = {1, 5, 0, 2, 6, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 3, 4, 7, 6, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40080() {
        int[] input = {1, 5, 0, 2, 6, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 4, 7, 3, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40081() {
        int[] input = {1, 5, 0, 2, 3, 6, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 2, 5, 1, 6, 3, 7, 4, 5, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40082() {
        int[] input = {1, 5, 0, 2, 3, 6, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40083() {
        int[] input = {1, 5, 0, 2, 3, 7, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40084() {
        int[] input = {1, 5, 0, 2, 7, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 3, 7, 2, 1, 5, 3, 7, 4, 6, 1, 2, 4, 7, 5, 2, 1, 6, 7, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40085() {
        int[] input = {1, 5, 0, 7, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 3, 1, 5, 7, 5, 1, 4, 6, 2, 5, 7, 1, 7, 5, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40086() {
        int[] input = {1, 5, 7, 0, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40087() {
        int[] input = {1, 7, 5, 0, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 1, 7, 1, 5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40088() {
        int[] input = {7, 1, 5, 0, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 7, 1, 2, 3, 4, 6, 2, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40089() {
        int[] input = {7, 1, 5, 0, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 2, 1, 7, 5, 3, 5, 7, 1, 2, 5, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40090() {
        int[] input = {1, 7, 5, 0, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40091() {
        int[] input = {1, 5, 7, 0, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 1, 5, 2, 4, 6, 7, 3, 4, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40092() {
        int[] input = {1, 5, 0, 7, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40093() {
        int[] input = {1, 5, 0, 2, 7, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 7, 3, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40094() {
        int[] input = {1, 5, 0, 2, 3, 7, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 4, 6, 7, 3, 4, 2, 1, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40095() {
        int[] input = {1, 5, 0, 2, 3, 4, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 4, 6, 7, 2, 1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40096() {
        int[] input = {1, 5, 0, 2, 3, 4, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40097() {
        int[] input = {1, 0, 5, 2, 3, 4, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40098() {
        int[] input = {1, 0, 5, 2, 3, 4, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 4, 6, 7, 2, 1, 5, 4, 5, 1, 3, 6, 5, 4, 1, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40099() {
        int[] input = {1, 0, 5, 2, 3, 7, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 6, 7, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40100() {
        int[] input = {1, 0, 5, 2, 7, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 7, 3, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40101() {
        int[] input = {1, 0, 5, 7, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 7, 5, 1, 3, 2, 7, 5, 1, 3, 2, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40102() {
        int[] input = {1, 0, 7, 5, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 2, 3, 1, 5, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40103() {
        int[] input = {1, 7, 0, 5, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 3, 1, 5, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40104() {
        int[] input = {7, 1, 0, 5, 2, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 3, 1, 5, 2, 3, 1, 5, 7, 2, 3, 1, 5, 7, 3, 1, 4, 6, 7, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40105() {
        int[] input = {7, 1, 0, 5, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 3, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40106() {
        int[] input = {1, 7, 0, 5, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 2, 3, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40107() {
        int[] input = {1, 0, 7, 5, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40108() {
        int[] input = {1, 0, 5, 7, 2, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 5, 1, 7, 1, 5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40109() {
        int[] input = {1, 0, 5, 2, 7, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 7, 2, 1, 5, 3, 7, 4, 6, 1, 2, 4, 7, 5, 2, 1, 6, 7, 5, 3, 2, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40110() {
        int[] input = {1, 0, 5, 2, 3, 7, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40111() {
        int[] input = {1, 0, 5, 2, 3, 6, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40112() {
        int[] input = {1, 0, 5, 2, 3, 6, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 2, 5, 1, 6, 3, 7, 4, 5, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40113() {
        int[] input = {1, 0, 5, 2, 6, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 7, 3, 5, 2, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40114() {
        int[] input = {1, 0, 5, 2, 6, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 4, 7, 6, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40115() {
        int[] input = {1, 0, 5, 2, 6, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40116() {
        int[] input = {1, 0, 5, 2, 7, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 4, 3, 7, 6, 4, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40117() {
        int[] input = {1, 0, 5, 7, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 4, 6, 5, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40118() {
        int[] input = {1, 0, 7, 5, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40119() {
        int[] input = {1, 7, 0, 5, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40120() {
        int[] input = {7, 1, 0, 5, 2, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40121() {
        int[] input = {7, 1, 0, 5, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 1, 7, 2, 7, 1, 3, 4, 6, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40122() {
        int[] input = {1, 7, 0, 5, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 6, 5, 1, 7, 2, 7, 1, 3, 4, 6, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40123() {
        int[] input = {1, 0, 7, 5, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 6, 5, 1, 7, 2, 7, 1, 3, 4, 6, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40124() {
        int[] input = {1, 0, 5, 7, 6, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 2, 4, 3, 7, 1, 2, 4, 6, 1, 2, 5, 4, 6, 1, 2, 5, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40125() {
        int[] input = {1, 0, 5, 6, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 1, 6, 7, 2, 1, 5, 6, 5, 1, 4, 3, 7, 5, 6, 1, 4, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40126() {
        int[] input = {1, 0, 5, 6, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 7, 2, 6, 1, 7, 2, 6, 1, 3, 4, 6, 1, 3, 7, 5, 2, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40127() {
        int[] input = {1, 0, 5, 6, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40128() {
        int[] input = {1, 0, 5, 6, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 5, 1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40129() {
        int[] input = {1, 0, 6, 5, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 4, 5, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40130() {
        int[] input = {1, 0, 6, 5, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 3, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40131() {
        int[] input = {1, 0, 6, 5, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 4, 3, 5, 1, 7, 4, 2, 1, 5, 3, 2, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40132() {
        int[] input = {1, 0, 6, 5, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40133() {
        int[] input = {1, 0, 6, 7, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 4, 3, 7, 6, 1, 2, 4, 5, 6, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40134() {
        int[] input = {1, 0, 7, 6, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 6, 3, 4, 5, 6, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40135() {
        int[] input = {1, 7, 0, 6, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 6, 3, 4, 5, 6, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40136() {
        int[] input = {7, 1, 0, 6, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 6, 3, 4, 5, 6, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40137() {
        int[] input = {7, 1, 6, 0, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 6, 1, 5, 3, 4, 6, 1, 7, 5, 7, 1, 2, 3, 7, 5, 1, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40138() {
        int[] input = {1, 7, 6, 0, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 2, 4, 3, 7, 6, 1, 2, 4, 5, 6, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40139() {
        int[] input = {1, 6, 7, 0, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 6, 3, 4, 5, 6, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40140() {
        int[] input = {1, 6, 0, 7, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 7, 6, 1, 2, 4, 5, 6, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40141() {
        int[] input = {1, 6, 0, 5, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40142() {
        int[] input = {1, 6, 0, 5, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 7, 4, 3, 5, 1, 7, 4, 2, 1, 5, 3, 2, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40143() {
        int[] input = {1, 6, 0, 5, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 2, 3, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40144() {
        int[] input = {1, 6, 0, 5, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 7, 4, 5, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40145() {
        int[] input = {6, 1, 0, 5, 2, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 4, 5, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40146() {
        int[] input = {6, 1, 0, 5, 2, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 5, 2, 3, 6, 1, 5, 2, 7, 4, 6, 1, 5, 2, 5, 1, 3, 7, 5, 2, 1, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40147() {
        int[] input = {6, 1, 0, 5, 2, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 5, 1, 7, 4, 2, 1, 5, 3, 2, 1, 5, 7, 6, 4, 1, 2, 3, 7, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40148() {
        int[] input = {6, 1, 0, 5, 7, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 2, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40149() {
        int[] input = {6, 1, 0, 7, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 2, 4, 3, 7, 6, 1, 2, 4, 5, 6, 1, 2, 4, 2, 1, 6, 5, 2, 4, 1, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40150() {
        int[] input = {6, 1, 7, 0, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 4, 3, 1, 7, 6, 2, 4, 3, 1, 7, 6, 4, 3, 1, 7, 6, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40151() {
        int[] input = {6, 7, 1, 0, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 2, 1, 7, 3, 5, 1, 7, 6, 3, 5, 1, 7, 6, 5, 1, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40152() {
        int[] input = {7, 6, 1, 0, 5, 2, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 5, 6, 1, 7, 2, 7, 1, 3, 4, 5, 6, 3, 4, 5, 6, 7, 2, 1, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40153() {
        int[] input = {7, 6, 1, 0, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 1, 6, 3, 2, 1, 5, 4, 2, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40154() {
        int[] input = {6, 7, 1, 0, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 5, 2, 7, 1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40155() {
        int[] input = {6, 1, 7, 0, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 2, 1, 7, 5, 2, 4, 3, 7, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40156() {
        int[] input = {6, 1, 0, 7, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 2, 7, 1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40157() {
        int[] input = {6, 1, 0, 2, 7, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 5, 1, 2, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40158() {
        int[] input = {6, 1, 0, 2, 5, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40159() {
        int[] input = {6, 1, 0, 2, 5, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 3, 5, 2, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40160() {
        int[] input = {6, 1, 0, 2, 5, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 7, 3, 1, 2, 4, 5, 1, 2, 6, 4, 6, 2, 1, 5, 6, 4, 2, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40161() {
        int[] input = {1, 6, 0, 2, 5, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 4, 7, 5, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40162() {
        int[] input = {1, 6, 0, 2, 5, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40163() {
        int[] input = {1, 6, 0, 2, 5, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40164() {
        int[] input = {1, 6, 0, 2, 7, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 7, 5, 1, 2, 7, 5, 1, 2, 6, 7, 5, 1, 2, 6, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40165() {
        int[] input = {1, 6, 0, 7, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 5, 2, 7, 1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40166() {
        int[] input = {1, 6, 7, 0, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40167() {
        int[] input = {1, 7, 6, 0, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 6, 7, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40168() {
        int[] input = {7, 1, 6, 0, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 5, 2, 1, 7, 5, 2, 4, 3, 7, 5, 6, 2, 4, 1, 5, 6, 4, 1, 3, 7, 6, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40169() {
        int[] input = {7, 1, 0, 6, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 4, 5, 1, 6, 3, 2, 1, 5, 4, 2, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40170() {
        int[] input = {1, 7, 0, 6, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 3, 4, 5, 1, 6, 3, 2, 1, 5, 4, 2, 1, 5, 6, 7, 3, 1, 2, 4, 6, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40171() {
        int[] input = {1, 0, 7, 6, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 5, 7, 1, 6, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40172() {
        int[] input = {1, 0, 6, 7, 2, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 5, 2, 7, 1, 6, 5, 6, 1, 3, 4, 2, 6, 5, 1, 3, 4, 2, 6, 7, 4, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40173() {
        int[] input = {1, 0, 6, 2, 7, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 5, 7, 3, 2, 1, 6, 7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40174() {
        int[] input = {1, 0, 6, 2, 5, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 5, 7, 1, 6, 2, 6, 1, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40175() {
        int[] input = {1, 0, 6, 2, 5, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 2, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40176() {
        int[] input = {1, 0, 6, 2, 5, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 2, 4, 7, 5, 2, 4, 6, 1, 3, 2, 5, 7, 6, 1, 3, 2, 3, 1, 4, 5, 3, 2, 1, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40177() {
        int[] input = {1, 0, 2, 6, 5, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 3, 2, 1, 6, 4, 5, 2, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40178() {
        int[] input = {1, 0, 2, 6, 5, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 6, 5, 3, 1, 2, 6, 2, 1, 3, 5, 2, 6, 1, 3, 5, 2, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40179() {
        int[] input = {1, 0, 2, 6, 5, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 7, 4, 3, 5, 7, 4, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40180() {
        int[] input = {1, 0, 2, 6, 7, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 6, 2, 1, 5, 7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40181() {
        int[] input = {1, 0, 2, 7, 6, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 4, 3, 7, 6, 4, 3, 7, 6, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40182() {
        int[] input = {1, 0, 7, 2, 6, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 6, 2, 3, 4, 6, 5, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40183() {
        int[] input = {1, 7, 0, 2, 6, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 2, 3, 4, 6, 5, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40184() {
        int[] input = {7, 1, 0, 2, 6, 5, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 2, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40185() {
        int[] input = {7, 1, 0, 2, 5, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40186() {
        int[] input = {1, 7, 0, 2, 5, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40187() {
        int[] input = {1, 0, 7, 2, 5, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 6, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40188() {
        int[] input = {1, 0, 2, 7, 5, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 4, 3, 7, 2, 6, 4, 3, 7, 2, 6, 1, 4, 3, 5, 6, 1, 4, 3, 4, 1, 2, 7, 5, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40189() {
        int[] input = {1, 0, 2, 5, 7, 6, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 4, 3, 5, 1, 2, 6, 2, 1, 7, 4, 2, 6, 1, 6, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40190() {
        int[] input = {1, 0, 2, 5, 6, 7, 3, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 6, 5, 3, 4, 6, 7, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40191() {
        int[] input = {1, 0, 2, 5, 6, 3, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 4, 7, 6, 5, 1, 2, 4, 3, 5, 1, 2, 4, 2, 1, 5, 3, 2, 4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40192() {
        int[] input = {1, 0, 2, 5, 6, 3, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 6, 3, 2, 1, 5, 1, 2, 3, 6, 1, 5, 2, 5, 1, 4, 7, 3, 5, 2, 1, 4, 6, 5, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40193() {
        int[] input = {1, 0, 2, 5, 3, 6, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 3, 5, 1, 6, 3, 5, 1, 4, 7, 5, 1, 4, 6, 2, 3, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40194() {
        int[] input = {1, 0, 2, 5, 3, 6, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 4, 6, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40195() {
        int[] input = {1, 0, 2, 5, 3, 7, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 5, 3, 7, 1, 2, 5, 2, 1, 7, 3, 2, 5, 1, 7, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40196() {
        int[] input = {1, 0, 2, 5, 7, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 3, 2, 1, 5, 7, 3, 2, 1, 7, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40197() {
        int[] input = {1, 0, 2, 7, 5, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 5, 7, 1, 2, 3, 5, 7, 1, 2, 5, 7, 4, 6, 2, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40198() {
        int[] input = {1, 0, 7, 2, 5, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 5, 2, 6, 4, 5, 3, 1, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40199() {
        int[] input = {1, 7, 0, 2, 5, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 6, 4, 5, 3, 1, 7, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40200() {
        int[] input = {7, 1, 0, 2, 5, 3, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 6, 4, 5, 3, 1, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40201() {
        int[] input = {7, 1, 0, 2, 5, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40202() {
        int[] input = {1, 7, 0, 2, 5, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40203() {
        int[] input = {1, 0, 7, 2, 5, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40204() {
        int[] input = {1, 0, 2, 7, 5, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 7, 5, 3, 1, 2, 7, 5, 3, 1, 2, 5, 3, 1, 2, 5, 7, 3, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40205() {
        int[] input = {1, 0, 2, 5, 7, 3, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40206() {
        int[] input = {1, 0, 2, 5, 3, 7, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 5, 2, 1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40207() {
        int[] input = {1, 0, 2, 5, 3, 4, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 7, 6, 4, 2, 1, 5, 7, 3, 2, 1, 7, 3, 2, 1, 4, 6, 2, 1, 4, 7, 5, 3, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40208() {
        int[] input = {1, 0, 2, 5, 3, 4, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 3, 5, 1, 2, 4, 2, 1, 5, 3, 2, 4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40209() {
        int[] input = {1, 0, 2, 3, 5, 4, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 3, 5, 4, 1, 3, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 4, 1, 3, 2, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40210() {
        int[] input = {1, 0, 2, 3, 5, 4, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 3, 2, 4, 5, 6, 7, 2, 3, 6, 5, 4, 3, 2, 7, 5, 4, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40211() {
        int[] input = {1, 0, 2, 3, 5, 7, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40212() {
        int[] input = {1, 0, 2, 3, 7, 5, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 3, 4, 6, 7, 3, 4, 2, 1, 5, 3, 4, 2, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40213() {
        int[] input = {1, 0, 2, 7, 3, 5, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 3, 7, 1, 2, 5, 2, 1, 7, 3, 2, 5, 1, 5, 2, 3, 7, 5, 2, 3, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40214() {
        int[] input = {1, 0, 7, 2, 3, 5, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40215() {
        int[] input = {1, 7, 0, 2, 3, 5, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40216() {
        int[] input = {7, 1, 0, 2, 3, 5, 4, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 3, 5, 7, 1, 2, 3, 4, 6, 7, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40217() {
        int[] input = {7, 1, 0, 2, 3, 5, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40218() {
        int[] input = {1, 7, 0, 2, 3, 5, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40219() {
        int[] input = {1, 0, 7, 2, 3, 5, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40220() {
        int[] input = {1, 0, 2, 7, 3, 5, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 3, 7, 1, 2, 5, 3, 7, 1, 2, 5, 3, 7, 4, 6, 2, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40221() {
        int[] input = {1, 0, 2, 3, 7, 5, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 3, 2, 5, 7, 4, 6, 2, 3, 4, 7, 5, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40222() {
        int[] input = {1, 0, 2, 3, 5, 7, 6, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 5, 3, 2, 1, 7, 5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40223() {
        int[] input = {1, 0, 2, 3, 5, 6, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 3, 2, 6, 5, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40224() {
        int[] input = {1, 0, 2, 3, 5, 6, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 5, 3, 1, 2, 6, 2, 1, 4, 7, 5, 2, 6, 1, 6, 2, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40225() {
        int[] input = {1, 0, 2, 3, 6, 5, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 7, 4, 3, 2, 1, 5, 7, 6, 2, 1, 5, 7, 5, 1, 3, 4, 6, 5, 7, 1, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40226() {
        int[] input = {1, 0, 2, 3, 6, 5, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 6, 3, 1, 2, 5, 2, 1, 3, 6, 2, 5, 1, 3, 6, 2, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40227() {
        int[] input = {1, 0, 2, 3, 6, 7, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 3, 5, 4, 6, 3, 5, 2, 1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40228() {
        int[] input = {1, 0, 2, 3, 7, 6, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40229() {
        int[] input = {1, 0, 2, 7, 3, 6, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 3, 7, 2, 1, 6, 3, 7, 2, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40230() {
        int[] input = {1, 0, 7, 2, 3, 6, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 5, 4, 6, 3, 5, 2, 1, 7, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40231() {
        int[] input = {1, 7, 0, 2, 3, 6, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 5, 4, 6, 3, 5, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40232() {
        int[] input = {7, 1, 0, 2, 3, 6, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 4, 6, 3, 5, 2, 1, 3, 5, 2, 1, 7, 3, 7, 1, 2, 5, 7, 3, 1, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40233() {
        int[] input = {7, 1, 0, 2, 6, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 3, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40234() {
        int[] input = {1, 7, 0, 2, 6, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 6, 3, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40235() {
        int[] input = {1, 0, 7, 2, 6, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 6, 3, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40236() {
        int[] input = {1, 0, 2, 7, 6, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40237() {
        int[] input = {1, 0, 2, 6, 7, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 2, 1, 6, 7, 3, 2, 1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40238() {
        int[] input = {1, 0, 2, 6, 3, 7, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 3, 6, 1, 2, 7, 2, 1, 6, 3, 2, 7, 1, 7, 2, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40239() {
        int[] input = {1, 0, 2, 6, 3, 5, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 5, 4, 7, 6, 3, 4, 5, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40240() {
        int[] input = {1, 0, 2, 6, 3, 5, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 7, 5, 3, 4, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40241() {
        int[] input = {1, 0, 6, 2, 3, 5, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40242() {
        int[] input = {1, 0, 6, 2, 3, 5, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 5, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40243() {
        int[] input = {1, 0, 6, 2, 3, 7, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 7, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40244() {
        int[] input = {1, 0, 6, 2, 7, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 7, 2, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40245() {
        int[] input = {1, 0, 6, 7, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 4, 5, 7, 2, 4, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40246() {
        int[] input = {1, 0, 7, 6, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40247() {
        int[] input = {1, 7, 0, 6, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40248() {
        int[] input = {7, 1, 0, 6, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40249() {
        int[] input = {7, 1, 6, 0, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 3, 2, 1, 6, 7, 3, 2, 1, 6, 7, 2, 1, 4, 5, 7, 2, 3, 1, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40250() {
        int[] input = {1, 7, 6, 0, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 6, 3, 4, 5, 7, 2, 4, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40251() {
        int[] input = {1, 6, 7, 0, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40252() {
        int[] input = {1, 6, 0, 7, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 7, 2, 4, 3, 1, 6, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40253() {
        int[] input = {1, 6, 0, 2, 7, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 3, 7, 2, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40254() {
        int[] input = {1, 6, 0, 2, 3, 7, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 3, 7, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40255() {
        int[] input = {1, 6, 0, 2, 3, 5, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {5, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40256() {
        int[] input = {1, 6, 0, 2, 3, 5, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40257() {
        int[] input = {6, 1, 0, 2, 3, 5, 4, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 7, 5, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40258() {
        int[] input = {6, 1, 0, 2, 3, 5, 7, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 5, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40259() {
        int[] input = {6, 1, 0, 2, 3, 7, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 2, 3, 7, 6, 1, 2, 3, 5, 4, 6, 1, 2, 3, 2, 1, 7, 5, 2, 3, 1, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40260() {
        int[] input = {6, 1, 0, 2, 7, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 1, 6, 3, 6, 1, 2, 7, 6, 3, 1, 2, 5, 4, 6, 7, 5, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40261() {
        int[] input = {6, 1, 0, 7, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 5, 7, 2, 4, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40262() {
        int[] input = {6, 1, 7, 0, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 3, 2, 1, 6, 7, 3, 2, 1, 6, 7, 2, 1, 4, 5, 7, 2, 3, 1, 3, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40263() {
        int[] input = {6, 7, 1, 0, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 3, 4, 5, 7, 2, 4, 3, 1, 2, 4, 3, 1, 6, 2, 6, 1, 3, 4, 6, 2, 1, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40264() {
        int[] input = {7, 6, 1, 0, 2, 3, 5, 4};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 7, 1, 3, 2, 6, 7, 1, 3, 2, 4, 5, 7, 1, 3, 2, 3, 1, 6, 4, 3, 2, 1, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40265() {
        int[] input = {7, 6, 1, 0, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40266() {
        int[] input = {6, 7, 1, 0, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 1, 3, 5, 4, 7, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40267() {
        int[] input = {6, 1, 7, 0, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 6, 1, 2, 3, 6, 7, 1, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40268() {
        int[] input = {6, 1, 0, 7, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 3, 5, 4, 7, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40269() {
        int[] input = {6, 1, 0, 2, 7, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 2, 4, 5, 7, 3, 1, 4, 5, 7, 3, 1, 6, 4, 6, 1, 2, 5, 6, 4, 1, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40270() {
        int[] input = {6, 1, 0, 2, 3, 7, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40271() {
        int[] input = {6, 1, 0, 2, 3, 4, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40272() {
        int[] input = {6, 1, 0, 2, 3, 4, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 6, 4, 3, 2, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40273() {
        int[] input = {1, 6, 0, 2, 3, 4, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40274() {
        int[] input = {1, 6, 0, 2, 3, 4, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 4, 3, 2, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40275() {
        int[] input = {1, 6, 0, 2, 3, 7, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 1, 7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40276() {
        int[] input = {1, 6, 0, 2, 7, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 2, 7, 3, 5, 4, 7, 2, 6, 5, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40277() {
        int[] input = {1, 6, 0, 7, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 4, 7, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40278() {
        int[] input = {1, 6, 7, 0, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 1, 7, 1, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40279() {
        int[] input = {1, 7, 6, 0, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 3, 5, 4, 7, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40280() {
        int[] input = {7, 1, 6, 0, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 3, 6, 7, 1, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40281() {
        int[] input = {7, 1, 0, 6, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40282() {
        int[] input = {1, 7, 0, 6, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40283() {
        int[] input = {1, 0, 7, 6, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 6, 4, 5, 3, 1, 7, 6, 7, 1, 2, 4, 7, 6, 1, 2, 3, 5, 7, 6, 2, 3, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40284() {
        int[] input = {1, 0, 6, 7, 2, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 3, 5, 4, 7, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40285() {
        int[] input = {1, 0, 6, 2, 7, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 3, 5, 4, 7, 2, 6, 5, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40286() {
        int[] input = {1, 0, 6, 2, 3, 7, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40287() {
        int[] input = {1, 0, 6, 2, 3, 4, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 6, 4, 3, 2, 1, 4, 3, 2, 1, 4, 6, 3, 2, 1, 4, 6, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40288() {
        int[] input = {1, 0, 6, 2, 3, 4, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {6, 4, 3, 2, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40289() {
        int[] input = {1, 0, 2, 6, 3, 4, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 6, 5, 7, 4, 1, 2, 6, 2, 1, 3, 5, 2, 6, 1, 3, 5, 2, 6, 3, 5, 4, 7, 6, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40290() {
        int[] input = {1, 0, 2, 6, 3, 4, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 3, 6, 2, 1, 4, 3, 6, 2, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40291() {
        int[] input = {1, 0, 2, 6, 3, 7, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 5, 4, 6, 2, 1, 7, 5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40292() {
        int[] input = {1, 0, 2, 6, 7, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 5, 4, 6, 1, 2, 3, 5, 7, 1, 2, 5, 7, 4, 6, 2, 1, 4, 7, 5, 1, 2, 6, 7, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40293() {
        int[] input = {1, 0, 2, 7, 6, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 3, 5, 4, 7, 1, 3, 5, 6, 1, 3, 2, 5, 2, 3, 1, 6, 2, 5, 3, 1, 6, 2, 4, 7, 6, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40294() {
        int[] input = {1, 0, 7, 2, 6, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 3, 6, 2, 4, 5, 6, 3, 7, 4, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40295() {
        int[] input = {1, 7, 0, 2, 6, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 6, 2, 4, 5, 6, 3, 7, 4, 2, 3, 7, 1, 4, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40296() {
        int[] input = {7, 1, 0, 2, 6, 3, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 3, 5, 4, 6, 2, 1, 5, 4, 6, 2, 1, 7, 5, 7, 1, 3, 4, 7, 5, 1, 3, 2, 6, 7, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40297() {
        int[] input = {7, 1, 0, 2, 3, 6, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 1, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40298() {
        int[] input = {1, 7, 0, 2, 3, 6, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40299() {
        int[] input = {1, 0, 7, 2, 3, 6, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 6, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40300() {
        int[] input = {1, 0, 2, 7, 3, 6, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 5, 4, 7, 2, 6, 5, 3, 2, 6, 1, 5, 3, 4, 7, 6, 1, 5, 3, 5, 1, 2, 4, 5, 3, 1, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40301() {
        int[] input = {1, 0, 2, 3, 7, 6, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 7, 3, 2, 1, 6, 7, 5, 4, 2, 1, 6, 7, 6, 1, 3, 5, 6, 7, 1, 3, 2, 4, 6, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40302() {
        int[] input = {1, 0, 2, 3, 6, 7, 4, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 7, 6, 3, 4, 5, 6, 7, 2, 4, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40303() {
        int[] input = {1, 0, 2, 3, 6, 4, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 3, 6, 4, 1, 2, 3, 2, 1, 5, 7, 6, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40304() {
        int[] input = {1, 0, 2, 3, 6, 4, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 5, 7, 4, 2, 1, 3, 5, 6, 2, 1, 3, 5, 3, 1, 4, 7, 6, 3, 5, 1, 5, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40305() {
        int[] input = {1, 0, 2, 3, 4, 6, 5, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 6, 4, 3, 2, 6, 4, 3, 2, 5, 7, 3, 2, 5, 6, 4, 2, 3, 7, 6, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40306() {
        int[] input = {1, 0, 2, 3, 4, 6, 7, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 6, 2, 3, 4, 6, 2, 5, 7, 6, 2, 5, 3, 1, 4, 2, 5, 3, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40307() {
        int[] input = {1, 0, 2, 3, 4, 7, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 7, 4, 3, 1, 2, 7, 2, 1, 3, 4, 2, 7, 1, 3, 4, 2, 5, 6, 4, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40308() {
        int[] input = {1, 0, 2, 3, 7, 4, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {2, 4, 5, 6, 3, 2, 1, 4, 5, 7, 2, 1, 4, 5, 4, 1, 3, 6, 7, 4, 5, 1, 3, 2, 4, 5, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40309() {
        int[] input = {1, 0, 2, 7, 3, 4, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 6, 5, 4, 3, 6, 7, 2, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40310() {
        int[] input = {1, 0, 7, 2, 3, 4, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 1, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40311() {
        int[] input = {1, 7, 0, 2, 3, 4, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 7, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40312() {
        int[] input = {7, 1, 0, 2, 3, 4, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40313() {
        int[] input = {7, 1, 0, 2, 3, 4, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 1, 7, 4, 7, 1, 2, 3, 7, 1, 2, 5, 6, 7, 1, 4, 2, 4, 1, 3, 5, 4, 2, 1, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40314() {
        int[] input = {1, 7, 0, 2, 3, 4, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {4, 3, 2, 7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40315() {
        int[] input = {1, 0, 7, 2, 3, 4, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 4, 3, 2, 7, 1, 4, 3, 6, 5, 7, 1, 4, 3, 4, 1, 2, 6, 4, 3, 1, 2, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40316() {
        int[] input = {1, 0, 2, 7, 3, 4, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 3, 7, 1, 4, 3, 7, 1, 5, 6, 7, 1, 5, 4, 2, 3, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40317() {
        int[] input = {1, 0, 2, 3, 7, 4, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 4, 7, 3, 1, 2, 4, 2, 1, 5, 6, 7, 2, 4, 1, 4, 2, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40318() {
        int[] input = {1, 0, 2, 3, 4, 7, 5, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 4, 7, 2, 1, 3, 4, 7, 2, 1, 3, 4, 3, 1, 2, 7, 3, 4, 1, 2, 7, 3, 5, 6, 7, 3, 5, 4, 2, 3, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40319() {
        int[] input = {1, 0, 2, 3, 4, 5, 7, 6};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {3, 7, 6, 5, 2, 1, 3, 7, 4, 2, 1, 3, 7, 3, 1, 5, 6, 4, 3, 7, 1, 7, 3, 2, 5, 7, 3, 2, 4, 6, 7, 5};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void resolve40320() {
        int[] input = {1, 0, 2, 3, 4, 5, 6, 7};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {1, 2, 1, 3, 4, 5, 1, 2, 3, 2, 1, 5, 4, 2, 3, 1, 3, 2, 4};
        Assert.assertArrayEquals(actual,expected);
    }
}