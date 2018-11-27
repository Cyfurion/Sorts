import java.util.ArrayList;

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
    public static void ascendingSort(ArrayList<String> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int lowestIndex = i;
            for (int x = i + 1; x < arr.size(); x++) {
                if (arr.get(x).compareTo(arr.get(lowestIndex)) < 0) { lowestIndex = x; }
            }
            arr.set(i, arr.set(lowestIndex, arr.get(i)));
        }
    }
    public static void descendingSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int highestIndex = i;
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[x] > arr[highestIndex]) { highestIndex = x; }
            }
            swap(i, highestIndex, arr);
        }
    }
    public static void ascendingSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[x].compareTo(arr[lowestIndex]) < 0) { lowestIndex = x; }
            }
            swap(i, lowestIndex, arr);
        }
    }
    public static void descendingSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int highestIndex = i;
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[x].compareTo(arr[highestIndex]) > 0) { highestIndex = x; }
            }
            swap(i, highestIndex, arr);
        }
    }
    public static ArrayList<String> removeLongerThan(int lenMax, ArrayList<String> arr) {
        ArrayList<String> removedItems = new ArrayList<>();
        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i).length() > lenMax) { removedItems.add(arr.remove(i)); }
            else { i++; }
        }
        return removedItems;
    }

    private static void swap(int indexA, int indexB, int[] arr) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
    private static void swap(int indexA, int indexB, String[] arr) {
        String temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArr(int[] arr) { for (int x : arr) { System.out.print(x + " "); } }
    public static void printArr(String[] arr) { for (String s : arr) { System.out.print(s + " "); } }
    public static void printArr(ArrayList<String> arr) { for (String s : arr) { System.out.print(s + " "); } }
}
