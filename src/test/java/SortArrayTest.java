import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    @Test
    public void SortArrayHappyPass() {
      int[] arr =   {4, 3, 7, 12, 5, 2, 9, 4, 12};

      int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};


        int[] actualResult = new SortArray().sortArrayAlgorytm(arr);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void SortArrayEmptyArrayNegativePass() {
        int[] arr =   {};

        int[] expectedResult = {};


        int[] actualResult = new SortArray().sortArrayAlgorytm(arr);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
