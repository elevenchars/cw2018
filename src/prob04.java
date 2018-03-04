import java.util.*;
import java.io.*;
public class prob04 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("prob04.txt"));
        int C = sc.nextInt();
        while(C-- > 0){
            int G = sc.nextInt();
            int S = sc.nextInt();
            int B = sc.nextInt();
            if(B%5 == 0){
                S += (B/5-1);
                B = 5;
            }
            else{
                S += B/5;
                B %= 5;
            }
            if(S%10 == 0){
                G += (S/10-1);
                S = 10;
            }
            else{
                G += S/10;
                S %= 10;
            }
            System.out.println(G+" "+S+" "+B);
        }
    }
}
