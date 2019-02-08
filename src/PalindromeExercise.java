public class PalindromeExercise {
    public static void main(String[] args) {
        String str1 = "kajak";
        String str2 = "potop";
        String str3 = "radar";
        String str4 = "owocowo";
        String str5 = "A to kanapa pana Kota";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
        System.out.println(isPalindrome(str5));

    }

    private static boolean isPalindrome(String str) {

        return str.toLowerCase().replaceAll("\\s+","").equals
                (new StringBuffer(str.toLowerCase().replaceAll("\\s+","")).reverse().toString());

    }
}
