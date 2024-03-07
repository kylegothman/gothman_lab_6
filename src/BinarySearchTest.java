public class BinarySearchTest {
    public static void main(String[] args) throws Exception {
        String[] strings = {"King Kong", "Mothra", "Rodan", "Ghidorah", "Godzilla", "Mechagodzilla"};

        //srt the array
        ObjectQuickSorter.sort(strings);
        System.out.println("Sorted array: ");
        for (String a: strings) {
            System.out.println(a);

        }

        // Search for an element
        String searchKey = "Godzilla";
        int resultIndex = ObjectBinarySearcher.search(strings, searchKey);

        if (resultIndex >= 0) {
            System.out.println("Found " + searchKey + " at index " + resultIndex);
        } else {
            System.out.println(searchKey + " not found in the array");
        }
    }
}
