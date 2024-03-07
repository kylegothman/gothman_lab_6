public class ObjectBinarySearcher {
  public static int search(Comparable[] array, Comparable key) {
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      Comparable midVal = array[mid];
      int cmp = midVal.compareTo(key);


      if (cmp < 0) {
        low = mid + 1;
      } else if (cmp > 0) {
        high = mid - 1;
      } else {
        return mid; // key found
      }
    }
    return -(low + 1); // key not found
  }
}
