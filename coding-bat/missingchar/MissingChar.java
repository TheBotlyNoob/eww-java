public class MissingChar {
  public static void main(String[] args) {
    assert missingChar("kitten", 1) == "ktten";
    assert missingChar("kitten", 0) == "itten";
    assert missingChar("kitten", 4) == "kittn";
    System.out.println("tests passed! :)");
  }

  public static String missingChar(String str, int n) {
    String front = str.substring(0, n);
    String back = str.substring(n + 1);
    return front + back;
  }
}
