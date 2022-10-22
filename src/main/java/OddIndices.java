public class OddIndices {

    public int[] oddIndex(int[] array) {
        if (array.length != 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    count++;
                }
            }
            int oddNum = 0;
            int[] oddInx = new int[count];
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    oddInx[oddNum++] = array[i];
                }
            }
            return oddInx;
        }
        return new int[0];
    }
}