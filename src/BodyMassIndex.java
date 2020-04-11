import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BodyMassIndex implements Implementation {
    private static int testsCount;
    private static int weight;
    private static double height;
    private static double BMI;
    private static String humanIndex;

    private static double UNDER_WEIGHT = 18.5;
    private static double NORMAL_WEIGHT = 18.5;
    private static double OVER_WEIGHT = 25.0;
    private static double OBESITY = 30.0;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        String[] index = new String[testsCount];

        for (int i = 0; i < testsCount; i++) {
            String input = reader.readLine();
            String[] subStr = input.split(" ");

            weight = Integer.parseInt(subStr[0]);
            height = Double.parseDouble(subStr[1]);

            BMI = weight / Math.pow(height, 2);

            if (BMI < UNDER_WEIGHT ) {
                humanIndex = "under";
                index[i] = humanIndex;
            }
            if (BMI >= NORMAL_WEIGHT && BMI < OVER_WEIGHT) {
                humanIndex = "normal";
                index[i] = humanIndex;
            }
            if (BMI > OVER_WEIGHT && BMI < OBESITY) {
                humanIndex = "over";
                index[i] = humanIndex;
            }
            if (BMI > OBESITY) {
                humanIndex = "obese";
                index[i] = humanIndex;
            }
        }
        for (String array : index) {
            System.out.print(array + " ");
        }
    }
}