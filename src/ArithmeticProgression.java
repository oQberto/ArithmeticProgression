import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArithmeticProgression implements Implementation {
    private static int testsCount;
    private static int startValue;
    private static int step;
    private static int terms;
    private static int isArithmeticProgression;
    private static int progressionSum;
    private static String input;
    private static String deleted = " ";

    @Override
    public void Decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        int[] answers = new int[testsCount];

        for (int j = 0; j < testsCount; j++) {
            input = reader.readLine();
            String[] subStr = input.split(deleted);

            startValue = Integer.parseInt(subStr[0]);
            step = Integer.parseInt(subStr[1]);
            terms = Integer.parseInt(subStr[2]);

            int[] array = new int[terms];
            for (int i = 0; i < terms; i++) {
                isArithmeticProgression = startValue + i * step;
                array[i] = isArithmeticProgression;
            }
            progressionSum = ((array[0] + array[terms - 1]) / 2) * terms;
            answers[j] = progressionSum;
        }
        System.out.println(Arrays.toString(answers));
    }
}

