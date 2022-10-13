import java.util.Scanner;

public class Java07_Loop2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int top = 0;


            for (int j = 0; j < n; j++) {
                top += Math.pow(2, j) * b;

                System.out.print(top + a + " ");

            }
            System.out.println();
        }


        in.close();
    }
}
