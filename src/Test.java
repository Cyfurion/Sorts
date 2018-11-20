public class Test {
    public static void main(String args[]) {
        int[] intArray = {23, 195, 85, 1049, 105, 477, 1983, 458, 123, 541, 83, 819, 293};
        Sorts.printArr(intArray);
        System.out.println();
        System.out.println();
        Sorts.ascendingSort(intArray);
        Sorts.printArr(intArray);
        System.out.println();
        System.out.println();
        Sorts.decendingSort(intArray);
        Sorts.printArr(intArray);
    }
}
