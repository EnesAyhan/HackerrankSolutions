import java.util.Scanner;

public class Java11 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Paralel kenarın uzunluklarını giriniz");
        int b=0;
        int h=0;

        b=sc.nextInt();
        h=sc.nextInt();

        if(b>0 & h>0){
            System.out.println(b*h);
        }else System.out.println( "java.lang.Exception: Breadth and height must be positive");

    }
}
