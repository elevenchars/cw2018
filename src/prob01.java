import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob01 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("prob01.txt"));
        System.out.println("Greetings, " + input.next() + "! We are team 1 from Cedar Park High School!");
    }
}
