package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFileUtility {

    // Used for Reading Characters from a File from the filename of sample.txt
    public static String readAFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"));

        String str;
        char delimiter = '\n';
        StringBuilder result = new StringBuilder();
        while((str = bufferedReader.readLine()) != null){
            result.append(str);
            result.append(delimiter);
        }
        return result.toString();
    }
}
