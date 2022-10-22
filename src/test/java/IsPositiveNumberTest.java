import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void isPositiveNumberPositiveHappyPath() {
        boolean expectedResult = true;
        int a = 1;


        IsPositiveNumber bv = new IsPositiveNumber();

        boolean actualResult = bv.isPositive(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void isPositiveNumberZeroHappyPath() {
        boolean expectedResult = true;
        int a = 0;


        IsPositiveNumber bv = new IsPositiveNumber();

        boolean actualResult = bv.isPositive(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void isPositiveNumberNegativeHappyPath() {
        boolean expectedResult = false;
        int a = -1;


        IsPositiveNumber bv = new IsPositiveNumber();

        boolean actualResult = bv.isPositive(a);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
