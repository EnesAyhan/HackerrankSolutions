import java.util.Scanner;

public class Day07 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.

        Task
        Given a string, S, of length N that is indexed from 0 to N-1,
        print its even-indexed and odd-indexed characters
        as 2 space-separated strings on a single line (see the Sample below for more detail).

        Note: 0 is considered to be an even index */

        String S = "";
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {

            S = sc.nextLine();
            String even = "";
            String odd = "";
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0) {
                    even += S.charAt(j);
                } else {
                    odd += S.charAt(j);
                }
            }

            System.out.println(even + " " + odd);

        }


    }
}
