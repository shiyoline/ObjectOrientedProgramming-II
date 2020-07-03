/**
 * This program demonstrates writing to files
 * @author  Thang Cao
 * @since   07/01/2020
 * */

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
}
