import java.util.*;
import java.io.*;
public class prob10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("prob10.txt"));
        int cases = sc.nextInt();
        while(cases-- > 0){
            int n = (int)Math.sqrt(sc.nextInt());
            int k = sc.nextInt();
            System.out.println((n+k-1)*(n+k-1)+2*k*(2*n+k-1)+" liters");
        }
    }
}
