import java.util.stream.IntStream;

public class Check_Palindrome_String_Using_Streams_Java8 {

    public static void main(String[] args) {

        //Check if 'radar' is Palindrome
        System.out.println("Is radar a Palindrome? - " + isPalindrome("liril")); //true

        //Check if 'apple' is Palindrome
        System.out.println("Is apple a Palindrome? - " + isPalindrome("apple")); //false
    }

    public static boolean isPalindrome(String originalString) {

        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
		

        return IntStream.range(0, tempString.length() / 2)
            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

    }
}