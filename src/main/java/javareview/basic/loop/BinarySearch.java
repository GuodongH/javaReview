package javareview.basic.loop;

public class BinarySearch {

  /**
   * Searches element k in a sorted array.
   *
   * @param arr a sorted array
   * @param k the element to search
   * @return index in arr where k is. -1 if not found.
   */
  public int binarySearch(int[] arr, int k) {
    int left = 0;
    int right = arr.length;
    // Loop invariant: [left, right) is left valid range. (left <= right)
    // k may only be within range [left, right).
    while (left < right) {
      //      if(left==right) return -1;
      // (left + right) may overflow!
      int mid = left + (right - left) / 2;
      // left == right: mid = left and mid = right
      // right == left + 1: mid = left
      // right == left + 2: mid = left + 1
      if (k < arr[mid]) {
        right = mid;
      } else if (k > arr[mid]) {
        left = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();
    System.out.println(bs.binarySearch(new int[] {1, 2, 10, 15, 100}, 15));
    System.out.println(bs.binarySearch(new int[] {1, 2, 10, 15, 100}, -2));
    System.out.println(bs.binarySearch(new int[] {1, 2, 10, 15, 100}, 200));
    System.out.println(bs.binarySearch(new int[] {1, 2, 10, 15, 100}, 13));
    System.out.println("=============");

    System.out.println(bs.binarySearch(new int[] {}, 13));
    System.out.println(bs.binarySearch(new int[] {12}, 13));
    System.out.println(bs.binarySearch(new int[] {13}, 13));
    System.out.println("=============");

    System.out.println(bs.binarySearch(new int[] {12, 13}, 13));
    System.out.println(bs.binarySearch(new int[] {12, 13}, 12));
  }
}
