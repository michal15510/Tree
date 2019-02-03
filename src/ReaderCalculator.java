import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderCalculator {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new ArrayList<Integer>();
        File file = new File("zadanie1_5.txt");
        BufferedReader reader = null;



        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }

//print out the list
        System.out.println(list);
        sumOfNumbers(list);
    }

    private static void sumOfNumbers(List<Integer> nums) {
        List<Integer> b = new ArrayList<>();
        b.add(0, -10);
        System.out.print(b.get(0) + ", ");
        for (int i = 1; i < nums.size(); i++) {
            b.add(i, (b.get(i - 1) + nums.get(i)));
            System.out.print(b.get(i) + ", ");
        }
    }
}
