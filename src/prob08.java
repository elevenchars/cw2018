import java.io.*;
import java.util.*;

public class prob08 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("prob08.txt"));
        while (s.hasNext()) {
            int start = s.nextInt();
            int len = s.nextInt();
            String ans = start + "";
            if (start == 0 && len == 0) {
                System.exit(0);
            }
            s.nextLine();
            int j = 0;
            if (ans.length() <= len) {
                int num = 0;
                String temp = ans;
                j = start + 1;
                while (temp.length() <= len) {
                    temp += j;
                    j++;
                    if (temp.length() <= len) {
                        ans = temp;
                    }
                }
            } else {
                j = 2;
            }

            System.out.println(start + " " + len + " " + (j - 2));
        }
    }
}
