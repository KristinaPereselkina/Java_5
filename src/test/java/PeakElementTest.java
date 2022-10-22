import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test
    public void peakElementsThreeValueHappyPath() {

        int[] expectedResult = {3, 7, 23};
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};

        PeakElement pE = new PeakElement();

        int[] actualResult = pE.peakerElement(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void peakElementsFourValueHappyPath() {

        int[] expectedResult = {3, 7, 60, 90};
        int[] array = {3, 2, 7, 5, 1, 9, 23, 60, 11, 80, 90};

        PeakElement pE = new PeakElement();

        int[] actualResult = pE.peakerElement(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void peakElementsZeroPeakElementsValueHappyPath() {

        int[] expectedResult = {};
        int[] array = {1,1,1};

        PeakElement pE = new PeakElement();

        int[] actualResult = pE.peakerElement(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void peakElementsTwoPeakElementsFirstAnsLastIndexHappyPath() {

        int[] a = {3, 2, 3};
        int[] expectedResult = {3, 3};

        PeakElement pE = new PeakElement();

        int[] actualResult = pE.peakerElement(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void peakElementsEmptyArrayNegativePath() {

        int[] expectedResult = {};
        int[] array = {};

        PeakElement pE = new PeakElement();

        int[] actualResult = pE.peakerElement(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void peakElementsTwoPeakElementsHappyPath() {

        int[] a = {3, 2, 3};
        int[] expectedResult = {3, 3};

        PeakElement pE = new PeakElement();

        int[] actualResult = pE.peakerElement(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void PeakElementNegativeValueOnePeakElementNegativePath() {
        int[] a = {-3, -2, -1};

        int[] expectedResult = {-1};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakerElement(a);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
