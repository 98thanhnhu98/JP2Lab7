package JP2Lab7.part1.Ex2;

import java.util.regex.*;

public class Split {
    public static void main(String[] args) {
        String[] x = Pattern.compile("ian").split("she is the darwinian devonian explodian chicken");
        for (int i = 0;i< x.length;i++){
            System.out.println(i + " \" " + x[i] + "\"");
        }
    }
}
