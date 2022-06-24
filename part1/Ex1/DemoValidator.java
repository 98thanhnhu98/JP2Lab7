package JP2Lab7.part1.Ex1;

public class DemoValidator {
    public static void main(String[] args) {
        Validator sp  = new Validator("\\w+@\\w+(\\.\\w+)+");
        System.out.println(sp.validate("abc@gmail.com"));
        System.out.println(sp.validate("abccde.com"));
    }
}
