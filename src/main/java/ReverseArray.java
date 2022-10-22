import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArrayAlgorytm(int[] array) {

        if (array.length != 0) {
            int[] reverseArray = new int[array.length];
            int num = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                reverseArray[num++] = array[i];
            }

            return reverseArray;
        }
        return new int[0];
    }
}