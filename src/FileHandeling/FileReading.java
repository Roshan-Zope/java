package FileHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\rosha\\OneDrive\\Desktop\\source.txt");

        // using buffer reader class
        BufferedReader br = new BufferedReader(new FileReader(f));
        String str = br.readLine();
        System.out.println(str);

        // using file reader class
        FileReader fr = new FileReader("C:\\Users\\rosha\\OneDrive\\Desktop\\source.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char)i);
        }

        // using scanner class
        System.out.println();
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
