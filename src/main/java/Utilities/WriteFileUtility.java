package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WriteFileUtility {

    // Used for Writing to file with delimiter as '\n'
    public static void writeToFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String text;
        char delimiter = '\n';
        String end = "end"+delimiter;
        FileOutputStream fileOutputStream = new FileOutputStream("sample.txt", true);
        do{
            text = scanner.nextLine() + delimiter;
                fileOutputStream.write(text.getBytes(StandardCharsets.UTF_8));
        }while(!text.equals(end));
        fileOutputStream.close();
    }

}
