import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {

    public int[] sortArrayAlgorytm(int[] array) {
        if (array.length != 0) {
            int number = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        number = array[i];
                        array[i] = array[j];
                        array[j] = number;
                    }
                }
            }

            return array;
        }
        return new int[0];
    }
}