import java.util.Scanner;

/**
 * IO
 * https://tinyl.co/4m4f
 */
public class IO {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int n) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        double gpa = sc.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);

        sc.close();
    }
}