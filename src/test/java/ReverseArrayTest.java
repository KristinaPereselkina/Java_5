import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test
    public void reverseArrayHappyPath() {

        int[] expectedResult = {10, 3, 7, 2};
        int[] array = {2, 7, 3, 10};

        ReverseArray rAr = new ReverseArray();

        int[] actualResult = rAr.reverseArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void reverseArrayEqualsValuesHappyPath() {

        int[] expectedResult = {1, 1, 1};
        int[] array = {1, 1, 1};

        ReverseArray rAr = new ReverseArray();

        int[] actualResult = rAr.reverseArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void ReverseElementsOneElementInArrayHappyPath() {
        int[] array = {5};
        int[] expectedResult = {5};

        ReverseArray rAr = new ReverseArray();

        int[] actualResult = rAr.reverseArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void reverseArrayEmptyArrayNegativePath() {

        int[] expectedResult = {};
        int[] array = {};

        ReverseArray rAr = new ReverseArray();

        int[] actualResult = rAr.reverseArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void reverseArrayNullNegativePath() {

        int[] expectedResult = {};
        int[] array = {};

        ReverseArray rAr = new ReverseArray();

        int[] actualResult = rAr.reverseArrayAlgorytm(array);
        Assert.assertEquals(actualResult,expectedResult);
    }






    }
