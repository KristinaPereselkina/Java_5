import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void MinMaxIndexFiveLengthHappyPass() {
        int[] expectedResult = {3, 7, 5};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;

        MinMaxAve minmaxavg = new MinMaxAve();

        int[] actualResult = minmaxavg.minMaxAvg(array, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void MinMaxIndexFourHappyPass() {
        int[] expectedResult = {2, 5, 3};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 1;
        int end = 4;

        MinMaxAve minmaxavg = new MinMaxAve();

        int[] actualResult = minmaxavg.minMaxAvg(array, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void MinMaxIndexThreeLengthHappyPass() {
        int[] expectedResult = {1, 3, 2};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = 2;

        MinMaxAve minmaxavg = new MinMaxAve();

        int[] actualResult = minmaxavg.minMaxAvg(array, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void MinMaxIndexTwoLengthHappyPass() {
        int[] expectedResult = {7, 8, 7};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 6;
        int end = 7;

        MinMaxAve minmaxavg = new MinMaxAve();

        int[] actualResult = minmaxavg.minMaxAvg(array, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void MinMaxIndexOneLengthHappyPass() {

        int[] array = {1, 9, 3, 4, 2, 6, 9, 1};
        int start = 1;
        int end = 4;

        int[] expectedResult = {2, 9, 4};

        MinMaxAve minmaxavg = new MinMaxAve();

        int[] actualResult = minmaxavg.minMaxAvg(array, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void MinMaxIndexEmptyArrayNegativePass() {
        int[] expectedResult = {};
        int[] array = {};
        int start = 4;
        int end = 4;

        MinMaxAve minmaxavg = new MinMaxAve();

        int[] actualResult = minmaxavg.minMaxAvg(array, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void MinMaxIndexEndBiggerStartNegativePass() {
        int[] expectedResult = {};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 4;
        int end = 1;

        MinMaxAve minmaxavg = new MinMaxAve();

        int[] actualResult = minmaxavg.minMaxAvg(array, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }














}

