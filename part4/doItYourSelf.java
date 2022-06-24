package JP2Lab7.part4;
import java.util.regex.*;
public class doItYourSelf {
    public static void main(String[] args) {
        String[] x = Pattern.compile("ian").split("she is the darwinian devonian explodian chicken");
        for (int i = 0;i< x.length;i++) {
            System.out.println(i + " " + x[i].replace("is", "was"));
        }
    }
}
