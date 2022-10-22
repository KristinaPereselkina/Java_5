import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test
    public void oddIndexThreeOddValueHappyPass() {
         int[] expectedResult =  {590, 985, 68};
        int[] arr = {-45, 590, 234, 985, 12, 68};
        OddIndices oddIn = new OddIndices();

        int[] actualResult = oddIn.oddIndex(arr);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void oddIndexZeroOddValueHappyPass() {
        int[] expectedResult =  {};
        int[] arr = {2};
        OddIndices oddIn = new OddIndices();

        int[] actualResult = oddIn.oddIndex(arr);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void oddIndexEmptyArrayHappyPass() {
        int[] expectedResult =  {};
        int[] arr = {};
        OddIndices oddIn = new OddIndices();

        int[] actualResult = oddIn.oddIndex(arr);
        Assert.assertEquals(actualResult,expectedResult);
    }





}
