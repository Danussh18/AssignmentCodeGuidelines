package ContentCopy;
import java.io.*;
import java.nio.charset.StandardCharsets;

import static Utilities.ReadFileUtility.readAFile;

public class HitachiCopy {

    public static void main(String[] args) throws IOException {
        fileCopyDemo();
        System.out.println(readAFile());
    }

    public static void fileCopyDemo() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("sample.txt"));
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        String textFromFileLine;
        char delimiter = '\n';

        while ( ( textFromFileLine = bufferedReader.readLine() )!= null )
            if (textFromFileLine.contains("Hitachi")){
                textFromFileLine = textFromFileLine + delimiter;
                fileOutputStream.write(textFromFileLine.getBytes(StandardCharsets.UTF_8));
            }
    }

}
