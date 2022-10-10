import java.util.Scanner;

public class Java02 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        String s;
        if(N%2==0){
            if(2<=N&& N<=5){s="Not Weird";}
            else if(N>20){s="Not Weird";}
            else s="Weird";
        }else s="Weird";
        System.out.println(s);


    }
}
