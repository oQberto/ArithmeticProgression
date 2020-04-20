package beginnersProblems;
import Interface.*;

import java.io.*;

public class FahrenheitToCelsius implements Implementation {
    private static double division;

    private static final double FIRST = 5.0;
    private static final double SECOND = 9.0;

    @Override
    public void decision() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String string = reader.readLine();
            String deleted = " ";
            String[] subStr = string.split(deleted);
            int arraySize = Integer.parseInt(subStr[0]);
            division = FIRST / SECOND;

            int[] array = new int[arraySize];

            for (int i = 0; i < arraySize; i++) {
                double arrayNumber = Integer.parseInt(subStr[i + 1]);
                double celsius = (arrayNumber - 32) * division;
                celsius = Math.round(celsius);
                array[i] = (int) celsius;
            }
            for (int answers : array) {
                System.out.println(answers);
            }
    }
}
