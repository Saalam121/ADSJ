import java.util.Scanner;

public class Main3 {
    public interface StringHandler {
        String reveString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str = sc.nextLine();

        StringHandler obj = () -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };
        System.out.println(obj.reveString());

        sc.close();
    }
}
