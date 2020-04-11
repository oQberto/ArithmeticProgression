import java.io.*;

public class DiceRolling implements Implementation {
    private static int cubesCount;
    private static double input;

    private static int CUBE_MAX_VALUE = 6;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        cubesCount = Integer.parseInt(reader.readLine());

        int[] cubeValues = new int[cubesCount];

        for (int i = 0; i < cubesCount; i++) {
            input = Double.parseDouble(reader.readLine());
            cubeValues[i] = (int) Math.floor(input * CUBE_MAX_VALUE) + 1;
        }
        for (int array :
                cubeValues) {
            System.out.print(array + " ");
        }
    }
}
