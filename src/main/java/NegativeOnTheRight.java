import java.util.Arrays;

public class NegativeOnTheRight {

    public static int[] negativeOnTheRight(int[] array) {

        int[] negativeToRight = new int[array.length];

        int positiveValue = 0;
        int negativeValue = array.length - 1;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeToRight[negativeValue] = array[i];
                negativeValue--;
            }
            if (array[i] > 0) {
                negativeToRight[positiveValue] = array[i];
                positiveValue++;
            }
        }
        return negativeToRight;
    }

    public static void main(String[] args) {
        int[] arr = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        System.out.println(Arrays.toString(negativeOnTheRight(arr)));
    }
}