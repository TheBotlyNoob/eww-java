public class ScoresAverage {
  public static void main(String[] args) {
    int[] scores1 = {2, 2, 4, 4};
    assert scoresAverage(scores1) == 4;
    int[] scores2 = {4, 4, 4, 2, 2, 2};
    assert scoresAverage(scores2) == 4;
    int[] scores3 = {3, 4, 5, 1, 2, 3};
    assert scoresAverage(scores3) == 4;
    System.out.println("tests passed! :)");
  }

  public static int scoresAverage(int[] scores) {
    int half = scores.length / 2;

    int avg1 = average(scores, 0, half);
    int avg2 = average(scores, half, scores.length);

    return Math.max(avg1, avg2);
  }
  static int average(int[] scores, int start, int end) {
    int x = 0;
    for (int i = start; i < end; i++) {
      x += scores[i];
    }
    return x / (end - start);
  }
}
