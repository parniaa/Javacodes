import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        System.out.println(a);
        String b = new StringBuilder(a).reverse().toString();
        System.out.println(b);
        if (a==b)
            System.out.println("true");

    }
}
