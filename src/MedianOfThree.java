import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MedianOfThree implements Implementation {
    private static int sortedNum;
    private static int testsCount;
    private static String input;
    private static String deleted = " ";

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        int[] numbersToCompare = new int[3];
        int[] sortedArray = new int[testsCount];

        for (int i = 0; i < testsCount; i++) {
            input = reader.readLine();
            String[] subStr = input.split(deleted);
            for (int j = 0; j < numbersToCompare.length; j++) {
                numbersToCompare[j] = Integer.parseInt(subStr[j]);
            }
            Arrays.sort(numbersToCompare);
            sortedNum = numbersToCompare[1];
            sortedArray[i] = sortedNum;
        }
        for(int sorted : sortedArray) {
            System.out.print(sorted + " ");
        }
    }
}
