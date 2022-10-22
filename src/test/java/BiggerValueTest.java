import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void bigValueFirtsNumberHappyPath() {
        int expectedResult = 9999;
        int a = 9999;
        int b = 3333;

        BiggerValue bv = new BiggerValue();

        int actualResult = bv.biggerValueAlgorytm(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void bigValueSecondNumberHappyPath() {
        int expectedResult = 55;
        int a = 1;
        int b = 55;

        BiggerValue bv = new BiggerValue();

        int actualResult = bv.biggerValueAlgorytm(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
