import java.util.Arrays;

public class PeakElement {

    public static int[] peakerElement(int[] array) {

        if (array.length != 0) {
            int countPeak = 0;
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    countPeak++;
                }
            }

            if (array[0] > array[1]) {
                countPeak++;
            }

            if (array[array.length - 1] > array[array.length - 2]) {
                countPeak++;
            }


            int num = 0;
            int[] peakElements = new int[countPeak];

            if (array[0] > array[1]) {
                peakElements[num++] = array[0];
            }
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    peakElements[num++] = array[i];
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                peakElements[num++] = array[array.length - 1];
            }

            return peakElements;
        }

        return new int[0];
    }
}