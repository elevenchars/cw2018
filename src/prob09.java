import java.io.*;
import java.util.*;

public class prob09 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("prob09.txt"));
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n == 0) {
                System.exit(0);
            }
            String temp = Integer.toString(n, 2);
            int count1 = 0;
            int count0 = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.substring(i, i + 1).equals("1")) {
                    count1++;
                } else if (temp.substring(i, i + 1).equals("0")) {
                    count0++;
                }
            }
            if (count1 == count0) {
                System.out.println(n + " BALANCED");
            } else if (count1 > count0) {
                System.out.println(n + " HEAVY");
            } else if (count1 < count0) {
                System.out.println(n + " LIGHT");
            }
        }
    }
}
