import java.util.*;
import java.io.*;

public class prob12 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("prob12.txt"));
        int n = s.nextInt();
        s.nextLine();
        String[] asdf = new String[n];
        ArrayList<String[]> orig = new ArrayList<String[]>();
        for (int i = 0; i < n; i++) {
            String qwerty = s.nextLine();
            asdf[i] = qwerty;
        }
        Arrays.sort(asdf);
        for (String foo : asdf) {
            String[] temp = foo.replaceAll(" ", "").split("");
            orig.add(temp);
        }
        for (int i = 0; i < orig.size(); i++) {
            Arrays.sort(orig.get(i));
        }
        int x = s.nextInt();
        s.nextLine();
        for (int i = 0; i < x; i++) {
            String current = s.nextLine();
            String[] temp = current.replaceAll(" ", "").split("");
            Arrays.sort(temp);
            boolean m = false;
            for (int j = 0; j < orig.size(); j++) {
                if (Arrays.equals(orig.get(j), temp)) {
                    System.out.println("Yes: " + asdf[j]);
                    m = true;
                    break;
                }
            }
            if (!m) {
                System.out.println("No: No matching case");
            }
        }
    }
}
