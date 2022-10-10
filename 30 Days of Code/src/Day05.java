import java.util.Scanner;

public class Day05 {


    private int age;


    public Day05(int initialAge) {
        // Add some more code to run some checks on initialAge
        String s="";

        if(initialAge<0){s="Age is not valid, setting age to 0.";}
        else if (initialAge<13){s="You are young";}
        else if(13<=initialAge & initialAge<=18){s="You are teenager.";}
        else s="Your are old.";

    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:

        System.out.println(/*Insert correct print statement here*/);
    }

    public void yearPasses() {
        // Increment this person's age.

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day05 p = new Day05(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }




}
