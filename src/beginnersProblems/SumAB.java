package beginnersProblems;
import Interface.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumAB implements Implementation {
    private static String input;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        input = reader.readLine();
        int[] terms = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = terms[0] + terms[1];
        System.out.println(sum);
    }
}
