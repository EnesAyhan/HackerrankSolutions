import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("bir sayi giriniz");

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        String s="";
        if(N%2==0){
            if (2<=N && N<5) {s="Not Weird";}
            else if(N>20){s="Not Weird";}
            else s="Weird";
        }else s="Weird";
        System.out.println(s);



        bufferedReader.close();
    }


}
