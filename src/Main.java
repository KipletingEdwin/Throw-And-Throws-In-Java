import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args)  throws  IOException{
        write();

    }


    public  static  void write() throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter("text.txt"));
        w.write("test");
        w.close();

    }


}