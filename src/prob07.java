import java.util.*;
import java.io.*;
public class prob07 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("prob07.txt"));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(!line.equals("0")){
                String[] arr  = line.split(" ");
                long[] arr2 = new long[arr.length-1];
                for(int i=1;i<arr.length;i++){
                    arr2[i-1] = Long.parseLong(arr[i]);
                }
                long maxproduct = Long.MIN_VALUE;
                for(int i=2;i<arr2.length;i++){
                    for(int j=0;j<i;j++){
                        for(int k=0;k<j;k++){
                            maxproduct = Math.max(maxproduct,arr2[i]*arr2[j]*arr2[k]);
                        }
                    }
                }
                System.out.println(maxproduct);
            }
        }
    }
}
