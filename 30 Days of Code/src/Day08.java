import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer>newArr=new ArrayList<>();


        for (int i = 0; i < arr.size(); i++) {

            newArr.add(0);

            newArr.set(i, arr.get((arr.size()-1)-i));

            System.out.print(newArr.get(i)+" ");
        }




        bufferedReader.close();
    }
}
