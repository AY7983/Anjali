public class LinearSearchRec {
  static int linear_Search(int num[], int key) {
    for (int i = 0; i <= num.length-1; i++) {
      if (num[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 21;

    int index = linear_Search(numbers, key);
    if (index == -1) {
      System.out.println("Key is not found ");
    } 
    else {
      System.out.println("Key is at index : " + index);
    }

  }
}