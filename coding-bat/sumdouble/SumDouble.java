public class SumDouble {
  public static void main(String[] args) {
    assert sumDouble(1, 2) == 3;
    assert sumDouble(3, 2) == 5;
    assert sumDouble(2, 2) == 8;
    System.out.println("tests passed! :)");
  }

  /** 
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
  */
  public static int sumDouble(int a, int b) {
    int sum = a + b;

    if (a == b) {
      return sum * 2;
    }

    return sum;
  }
}
