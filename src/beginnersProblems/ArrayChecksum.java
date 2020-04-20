package beginnersProblems;
import Interface.*;
import java.io.*;

public class ArrayChecksum implements Implementation {

    private static int startArrayLength;
    private static String startArray;
    private static final int LIMIT = 10000007;
    private static final int SEED = 113;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        startArrayLength = Integer.parseInt(reader.readLine());
        startArray = reader.readLine();
        String[] subStr = startArray.split(" ");

        long result = 0;
        for (int i = 0; i < startArrayLength; i++) {
                result = (result + Integer.parseInt(subStr[i])) * SEED;
                result = result % LIMIT;
        }
        System.out.println(result);
    }
}
