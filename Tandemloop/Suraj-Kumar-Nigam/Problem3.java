import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i <= limit * 2 - 1; i += 2) {
            System.out.print(i + (i < limit * 2 - 1 ? ", " : ""));
        }

        sc.close();
    }
}
