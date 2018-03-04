import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("prob02.txt"));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(!line.equals("0 0 0")){
                String[] stuff = line.split(" ");
                double v = Double.parseDouble(stuff[0]);
                double a = Double.parseDouble(stuff[1]);
                double t = Double.parseDouble(stuff[2]);
                System.out.printf("%.3f",v*t+0.5*a*t*t);
                System.out.println();
            }
        }
    }
}