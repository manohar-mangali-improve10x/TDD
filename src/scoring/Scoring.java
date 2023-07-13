package scoring;

import java.util.Arrays;

public class Scoring {
    public static void main(String[] args) {
       int[] array = caluculateScore("AAABBCCBCA");
        System.out.println(Arrays.toString(array));
    }

    public static int[] caluculateScore(String score) {
        int[] scores = new int[3];
        if (score != null) {
            for (int i = 0;i<score.length();i++) {
                char c = score.charAt(i);
                if (c == 'A') {
                   scores[0] ++;
                } else if (c == 'B') {
                    scores[1] ++;
                } else if (c == 'C') {
                  scores[2] ++;
                }
            }
        }
        return scores;
    }
}
