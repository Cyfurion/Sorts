import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
//        int[] intArray = {23, 195, 85, 1049, 105, 477, 1983, 458, 123, 541, 83, 819, 293};
        String[] stringArray = {"Blue", "Green", "Red", "Orange", "Yellow", "Purple", "Lime", "Cyan"};
        ArrayList<String> stringListArray = new ArrayList<>();
        for (String s : stringArray) { stringListArray.add(s); }
//        Sorts.printArr(intArray);
//        System.out.println();
//        System.out.println();
//        Sorts.ascendingSort(intArray);
//        Sorts.printArr(intArray);
//        System.out.println();
//        System.out.println();
//        Sorts.printArr(stringArray);
//        Sorts.descendingSort(stringArray);
//        System.out.println();
//        System.out.println();
//        Sorts.printArr(stringArray);
//        System.out.println();
//        System.out.println();
        Sorts.printArr(stringListArray);
        System.out.println();
        System.out.println();
        Sorts.printArr(Sorts.removeLongerThan(4, stringListArray));
        System.out.println();
        System.out.println();
        Sorts.printArr(stringListArray);
    }
}
