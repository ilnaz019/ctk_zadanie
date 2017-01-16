import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ikadyrov on 16/01/2017.
 */
public class Project1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line1 = reader.readLine();
            String line2 = reader.readLine();
            int d1 = line1.lastIndexOf(".");
            int d2 = line2.lastIndexOf(".");
            int start = 0;
            int end = d1;
            char[] dst1 = new char[end - start];
            line1.getChars(start, end, dst1, 0);
            String dst11 = String.valueOf(dst1);
            String dot1 = line1.substring(d1 + 1);
            String dot2 = line2.substring(d2 + 1);
            Integer n1 = Integer.valueOf(dot1);
            Integer n2 = Integer.valueOf(dot2);
            for (int i = n1 + 1; i < n2; i++) {
                System.out.println(dst11 + "." + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}