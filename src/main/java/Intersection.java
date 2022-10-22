public class Intersection {

    public int[] intersectionArrays(int[] arr1, int[] arr2) {

        if (arr1.length != 0 && arr2.length != 0) {
            int countIntesection = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        countIntesection++;
                    }
                }
            }
            int[] returnIntersection = new int[countIntesection];

            int num = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        returnIntersection[num++] = arr1[i];
                    }
                }
            }
            return returnIntersection;
        }
        return new int[0];
    }
}