package stringTricks;

import Interface.*;
import java.io.*;

public class VowelCount implements Implementation {
    private static int testsCount;
    private static String input;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        int count = 0;
        int[] finalArray = new int[testsCount];

        String[] vowels = new String[]{"a", "o", "u", "i", "e", "y"};

        for (int i = 0; i < testsCount; i++) {
            input = reader.readLine();

            if (input.equals("")) {
                break;
            }

            String[] intermediateArray = input.split("");
            for (String array1 : vowels) {
                for (String array2 : intermediateArray) {
                    if (array1.equals(array2)) {
                        count++;
                    }
                }
            }
            finalArray[i] = count;
            count = 0;
        }
        for (int array : finalArray) {
            System.out.print(array + " ");
        }
    }
}
