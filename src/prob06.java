import java.util.*;
import java.io.*;
public class prob06 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("prob06.txt"));
        int cases = Integer.parseInt(sc.nextLine());
        String numbers = "0123456789";
        while(cases-- > 0){
            String line = sc.nextLine();
            String digits = "";
            for(int i=0;i<line.length();i++){
                if(numbers.indexOf(line.charAt(i))>=0){
                    digits += line.charAt(i);
                }
            }
            boolean valid = true;
            if(Integer.parseInt(digits.substring(0,1)) == 1){
                valid = false;
            }
            if(Integer.parseInt(digits.substring(1,2)) == 9){
                valid = false;
            }
            if(Integer.parseInt(digits.substring(3,4))==0 || Integer.parseInt(digits.substring(3,4))==1){
                valid = false;
            }
            if(Integer.parseInt(digits.substring(4,6)) == 11){
                valid = false;
            }
            if(valid){
                System.out.println(line+" VALID");
            }
            else{
                System.out.println(line+" INVALID");
            }
        }
    }
}
