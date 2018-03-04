import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("prob03.txt"));
        while(in.hasNext()) {
            String num = in.nextLine();
            if(num.equals("0")) {
                System.exit(0);
            }
            boolean mag = true;
            for(int i = 1; i < num.length(); i++) {
                int n = Integer.parseInt(num.substring(0, i)) + Integer.parseInt(num.substring(i, num.length()));
                if(n == 1) {
                    mag = false;
                }
//                System.out.println(num.substring(0, i) + " + " + num.substring(i, num.length()) + " = " + n);
                for(int j = 2; j <= Math.sqrt(n); j++) {
                    if(n % j == 0) {
//                        System.out.println(n + " % " + i + " = " + n%i);
                        mag = false;
                    }
                }
            }
            System.out.println(num + (mag ? " MAGNANIMOUS" : " PETTY"));
        }
    }
}
