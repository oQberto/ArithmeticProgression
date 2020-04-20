package beginnersProblems;

import Interface.*;

import java.io.*;

public class SumsInLoop implements Implementation {

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pairsCount = Integer.parseInt(reader.readLine());

        int result;
        for (int j = 0; j < pairsCount; j++) {
            String str = reader.readLine();
            String[] subStr = str.split(" ");

            int firstNum = Integer.parseInt(subStr[0]);
            int secondNum = Integer.parseInt(subStr[1]);

            result = firstNum + secondNum;
            System.out.println(result);
        }
    }
}