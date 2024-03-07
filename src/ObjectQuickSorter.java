public class ObjectQuickSorter {
  public static void sort(Comparable[] array) {
    quickSort(array, 0, array.length - 1);
  }
 
  private static void quickSort(Comparable[] array, int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(array, begin, end);

        quickSort(array, begin, partitionIndex -1);
        quickSort(array, partitionIndex + 1, end);
    }
  }
  private static int partition(Comparable[] array, int begin, int end) {
    Comparable pivot = array[end];
    int i = (begin -1);

    for (int j = begin; j < end; j++) {
      if (array[j].compareTo(pivot) <= 0) {
        i++;
        Comparable swapTemp = array[i];
        array[i] = array[j];
        array[j] = swapTemp;
      }
    }
    Comparable swapTemp = array[i + 1];
    array[i + 1] = array[end];
    array[end] = swapTemp;

    return i + 1;


  }
}


