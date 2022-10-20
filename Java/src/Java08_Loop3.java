import java.util.NoSuchElementException;
import java.util.Scanner;

public class Java08_Loop3 {
    public static void main(String[] args) {

        System.out.println("Math.pow(2,7) = " + Math.pow(2, 7));

        Scanner in=new Scanner(System.in);
        String str="";
        int x=1;


        for (int i = 1; i <=x; i++) {

            try{str=in.nextLine();
                System.out.println("bir cümle giriniz");

            } catch(NoSuchElementException e) {
                System.out.print("");
                break;
            }

            if(!str.isEmpty()){
                System.out.println(i+" "+str);

                x+=1;
            }else System.out.print("");

        }

        /*2.yol
          Scanner input = new Scanner(System.in);
        int lineNo = 0;
        while (input.hasNextLine()) {
            lineNo++;
            System.out.println(lineNo+" "+input.nextLine());
        }
         */

        /*3.yol
         Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNextLine()) {
            System.out.println(i++ +" "+sc.nextLine());
        }
         */

        /*
        4. yol
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.println(String.format("%d %s", i++, scanner.nextLine()));
            }


        }*/


    }
}
