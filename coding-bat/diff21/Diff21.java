public class Diff21 {
  public static void main(String[] args) {
    assert diff21(19) == 2;
    assert diff21(10) == 11;
    assert diff21(21) == 0;
    System.out.println("tests passed! :)");
  }

  public static int diff21(int n) {
    int diff = Math.abs(n - 21);
    if (n > 21) {
      return diff * 2;
    }
    return diff;
  }
}
