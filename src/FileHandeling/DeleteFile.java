package FileHandeling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\rosha\\OneDrive\\Desktop\\source.txt");
        f.createNewFile();
        f.delete();
    }
}
