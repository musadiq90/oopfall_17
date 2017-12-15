package InputOutput;
import java.io.*;
public class CopyFile {

    public static void main(String args[]) throws IOException {
        File path = new File("hello.txt ");
        System.out.println("he got a file" + path);
// java file calss represent the apth but not the file/

        System.out.println("does it exist? " + path.exists());
        System.out.println("wat? " + path.isDirectory());

        String contenttoWrite = "hello world";
        OutputStream outstream = new FileOutputStream(path);
        outstream.write(contenttoWrite.getBytes());
        outstream.close();


      /*  FileReader filereader = new FileReader();
        int charASint = filereader.read();
  */
    }
}

/*
a stream is a pipe that either bytes go into and out.
file can be big, thats why java file clas is not suffieint for the stream use.

 */