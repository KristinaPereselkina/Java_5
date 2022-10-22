import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void SumPositiveNumbersHappyPass() {
        int expectedResult = 15;
        int[] array = {0, 1, 2, 3, 4, 5};

        SumArray sum = new SumArray();

        int actualResult = sum.summArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void SumNegativeNumbersHappyPass() {
        int expectedResult = -10;
        int[] array = {-7, -3};

        SumArray sum = new SumArray();

        int actualResult = sum.summArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void SumArrayEmptyArrayNegativePass() {
        int expectedResult = 0;
        int[] array = {};

        SumArray sum = new SumArray();

        int actualResult = sum.summArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
