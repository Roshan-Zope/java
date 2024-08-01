package FileHandeling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;

public class CreateFile {
    public void fun() {
        String path;
        String name;

        try {
            BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Enter file name: ");
            name = br.readLine();
            System.out.println("Enter file path: ");
            path = br.readLine();

            File f1 = new File(path+name+".txt");
            f1.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        CreateFile obj = new CreateFile();
        obj.fun();
    }
}
