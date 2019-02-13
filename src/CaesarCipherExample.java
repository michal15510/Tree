import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CaesarCipherExample {


    public static void main(String[] args) {


        String input = inputFromUser();
        System.out.println(encrypt(input));
        System.out.println(decrypt(input));


    }

    public static String inputFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your message to encrypt/decrypt: ");
        String result = in.nextLine();
        in.close();
        return result;
    }

    public static String encrypt(String textOne) {
        String[] alphabetTab = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        List<String> alphabet = Arrays.asList(alphabetTab);
        String message = textOne.toUpperCase();
        String encrypting = "";
        StringBuilder sb = new StringBuilder(encrypting);
        for (int i = 0; i < message.length(); i++) {
            int a = alphabet.indexOf(message.substring(i, i + 1));
            if (message.substring(i, i + 1).equals(" ")) {
                sb.append(" ");
            } else if (a >= alphabet.size() - 3) {
                sb.append(alphabet.get(a - 23));
            } else {
                sb.append(alphabet.get(a + 3));
            }
        }
        return sb.toString();
    }

    public static String decrypt(String textTwo) {
        String[] alphabetTab = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        List<String> alphabet = Arrays.asList(alphabetTab);
        String message = textTwo.toUpperCase();
        String decoding = "";
        StringBuilder sb = new StringBuilder(decoding);
        for (int i = 0; i < message.length(); i++) {
            int a = alphabet.indexOf(message.substring(i, i + 1));
            if (message.substring(i, i + 1).equals(" ")) {
                sb.append(" ");
            } else if (a <= 2) {
                sb.append(alphabet.get(a + 23));
            } else {
                sb.append(alphabet.get(a - 3));
            }
        }
        return sb.toString();
    }


}
