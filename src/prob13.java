import java.util.*;
import java.io.*;
public class prob13 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("prob13.txt"));
        int sites = Integer.parseInt(sc.nextLine());
        int initial = 1;
        while(sites-- > 0){
            int spots = Integer.parseInt(sc.nextLine());
            ArrayList<int[]> hotspots = new ArrayList<>();
            for(int i=0;i<spots;i++){
                String[] line = sc.nextLine().split(" ");
                int[] arr = new int[3];
                for(int j=0;j<3;j++){
                    arr[j] = Integer.parseInt(line[j]);
                }
                hotspots.add(arr);
            }
            int L = sc.nextInt();
            int W = sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[L][W];
            for(int i=0;i<L;i++){
                String line = sc.nextLine();
                for(int j=0;j<W;j++){
                    grid[i][j] = line.charAt(j);
                }
            }
            //debug statement
            for(int[] arr : hotspots){
                for(int i=0;i<L;i++){
                    for(int j=0;j<W;j++){
                        if(grid[i][j]=='#' && distance(arr[0],arr[1],i,j) < arr[2]){
                            grid[i][j] = '$';
                            //System.out.println(i+" "+j+" "+arr[0]+" "+arr[1]+" "+arr[2]);
                        }
                    }
                }
            }
            int count = 0;
            for(char[] arr : grid){
                for(char c : arr){
                    if(c=='$'){
                        count++;
                    }
                }
            }
            System.out.println("Site "+(initial++)+": "+count+" students get coverage");
        }
    }
    public static double distance(int x1,int y1, int x2, int y2){
        return Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
    }
}
