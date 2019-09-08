import java.util.Scanner;

public class findUSCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        int c,d;
        c = Math.abs(a);
        d = Math.abs(b);
        if (c == 0 || d == 0) {
            System.out.println("No greatest common factor");
        } else {
            while (c != d) {
                if (c > d) {
                    c = c - d;
                } else {
                    d = d - c;
                }
            }
            System.out.println("Greatest common factor "+ c);
        }

    }
}
