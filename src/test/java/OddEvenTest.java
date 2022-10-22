import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void oddEvenNumIsEvenHappyPass() {
        String  expectedResult = "Even";
        int num = 2;
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgorytm(num);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void oddEvenNumIsOddHappyPass() {
        String  expectedResult = "Odd";
        int num = 5;
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgorytm(num);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void oddEvenNumIsZeroHappyPass() {
        String  expectedResult = "Even";
        int num = 0;
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgorytm(num);
        Assert.assertEquals(actualResult,expectedResult);
    }








}
