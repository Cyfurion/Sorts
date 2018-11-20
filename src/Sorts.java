public class Sorts {
    public static void ascendingSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[x] < arr[lowestIndex]) { lowestIndex = x; }
            }
            swap(i, lowestIndex, arr);
        }
    }
    public static void decendingSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int highestIndex = i;
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[x] > arr[highestIndex]) { highestIndex = x; }
            }
            swap(i, highestIndex, arr);
        }
    }

    private static void swap(int indexA, int indexB, int[] arr) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArr(int[] arr) {
        for (int x : arr) { System.out.print(x + " "); }
    }
}