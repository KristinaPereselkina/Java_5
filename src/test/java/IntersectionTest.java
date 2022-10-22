import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    @Test
    public void IntersectionTwoDigitsHappyPath() {
        int[] expectedResult = {2, 4};
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2};

        Intersection in = new Intersection();

        int[] actualResult = in.intersectionArrays(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void Intersection2DigitsHappyPath() {
        int[] expectedResult = {8, 9};
        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};

        Intersection in = new Intersection();

        int[] actualResult = in.intersectionArrays(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void IntersectionNoIntersectionHappyPath() {
        int[] expectedResult = {};
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};

        Intersection in = new Intersection();

        int[] actualResult = in.intersectionArrays(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void IntersectionEmptyFirstArrayNegativePath() {
        int[] expectedResult = {};
        int[] arr1 = {};
        int[] arr2 = {8, 9, 45};

        Intersection in = new Intersection();

        int[] actualResult = in.intersectionArrays(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
