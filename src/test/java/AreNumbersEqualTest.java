import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void NumbersAreEqualHappyPath() {
        int expectedResult = 0;
        int a = 1;
        int b = 1;

        AreNumbersEqual bv = new AreNumbersEqual();

        int actualResult = bv.areNumEquals(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void AreNumbersEquaAlessBlHappyPath() {
        int expectedResult = -1;
        int a = 0;
        int b = 88;

        AreNumbersEqual bv = new AreNumbersEqual();

        int actualResult = bv.areNumEquals(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void AreNumbersEquaAbiggerBlHappyPath() {
        int expectedResult = 1;
        int a = 15;
        int b = 1;

        AreNumbersEqual bv = new AreNumbersEqual();

        int actualResult = bv.areNumEquals(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
