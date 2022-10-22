public class MinMaxAve {

    public int[] minMaxAvg(int[] arr, int startIndex, int endIndex) {
        if (arr.length != 0 && startIndex <= endIndex) {
            int min = arr[startIndex];
            int max = arr[startIndex];

            int sum = arr[startIndex];

            for (int i = startIndex + 1; i <= endIndex; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
                if (max < arr[i]) {
                    max = arr[i];
                }

                sum += arr[i];
            }

            int avg = sum / (endIndex - startIndex + 1);
            int[] minMaxAvgArray = {min, max, avg};

            return minMaxAvgArray;
        }
        return new int[0];
    }
}
