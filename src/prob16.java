import java.util.*;
import java.io.*;
public class prob16 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("prob16-2-in.txt"));
        int cases = sc.nextInt();
        ArrayList<String> digits = new ArrayList<>();
        String[] digs = {"0","1","2","3","4","5","6","7","8","9"};
        for(String s : digs){
            digits.add(s);
        }
        while(cases-- > 0){
            long sum = sc.nextLong();
            solve(sum,"",digits);
        }
    }
    public static void solve(long sum, String current, ArrayList<String> digits){
        if(current.length()==10){
            for(int i=1;i<=5;i++){
                if(Long.parseLong(current.substring(0,i))+Long.parseLong(current.substring(i))==sum && Long.parseLong(current.substring(0,i))<=Long.parseLong(current.substring(i))){
                    long product = Long.parseLong(current.substring(0,i))*Long.parseLong(current.substring(i));
                    if(zerothroughnine(product)){
                        System.out.println(sum+" : "+current.substring(0,i)+" * "+current.substring(i)+" = "+product);
                        return ;
                    }
                }
            }
        }
        else{
            //Have not yet formed a valid permutation of 0123456789, keep going
            for(int i=0;i<digits.size();i++){
                ArrayList<String> copy = (ArrayList<String>) digits.clone();
                String s = copy.remove(i);
                solve(sum, current+s, copy);
            }
        }
    }
    public static boolean zerothroughnine(long n){
        String digits = "0123456789";
        String s = Long.toString(n);
        for(int i=0;i<10;i++){
            if(s.indexOf(digits.charAt(i)) < 0){
                return false;
            }
        }
        return true;
    }
}
