package FileHandeling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteInFile {
    public static void main(String[] args) throws Exception{
        // using write string method
//        Path fileName = Path.of("C:\\Users\\rosha\\OneDrive\\Desktop\\source.txt");
//        String str = "My name is roshan";
//        Files.writeString(fileName, str);

        // using file writer class
        String text = "I am iron man";
        FileWriter fw = new FileWriter("C:\\Users\\rosha\\OneDrive\\Desktop\\source.txt",true);
        fw.write(text);
        fw.close();

        // using buffer writer class
//        String txt = "using buffer reader class";
//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\rosha\\OneDrive\\Desktop\\source.txt"));
//        bw.write(txt);
//        bw.close();
    }
}
