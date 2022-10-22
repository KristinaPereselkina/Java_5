import java.util.Arrays;

public class KthLargest {

    public static int kLargestElement(int[] array, int k) {
        if (array != null && k > 0) {
            int temp = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            return array[array.length - k];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 13, 5, 2, 9, 4, 12};

        System.out.println((kLargestElement(arr, 3)));
    }
}
