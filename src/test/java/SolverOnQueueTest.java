import org.junit.Assert;
import org.junit.Test;

public class SolverOnQueueTest {
    @Test
    public void resolve0() {
        int[] input = {0, 7, 1, 2, 3, 4, 6, 5};
        int[] actual = new SolverOnQueue().resolve(input);
        int[] expected = {7, 2, 6, 5, 4, 1, 7, 2, 7, 1, 3, 6, 7, 2, 1, 3, 4, 5, 7, 6, 4, 5, 7, 6, 4};
        Assert.assertArrayEquals(actual,expected);
    }

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