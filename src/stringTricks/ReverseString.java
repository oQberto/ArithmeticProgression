package stringTricks;

import Interface.*;
import java.io.*;

public class ReverseString implements Implementation {

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer(reader.readLine());
        buffer.reverse();
        System.out.println(buffer);
    }
}
