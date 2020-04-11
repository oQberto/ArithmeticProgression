import java.io.*;
import java.util.Arrays;

public class Triangles implements Implementation {
    private static int testsCount;
    private static String input;

    private static int VALUE;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        int[] answers = new int[testsCount];
        int[] sides = new int[3];

        for (int i = 0; i < testsCount; i++) {
            input = reader.readLine();
            String[] subStr = input.split(" ");
            sides[0] = Integer.parseInt(subStr[0]);
            sides[1] = Integer.parseInt(subStr[1]);
            sides[2] = Integer.parseInt(subStr[2]);
            Arrays.sort(sides);

            if (sides[0] + sides[1] > sides[2]) {
                VALUE = 1;
                answers[i] = VALUE;
            }
            else {
                VALUE = 0;
                answers[i] = VALUE;
            }

        }
        for (int array : answers) {
            System.out.print(array + " ");
        }
    }
}

