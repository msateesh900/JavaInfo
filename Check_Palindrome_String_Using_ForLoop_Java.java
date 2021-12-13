public class Check_Palindrome_String_Using_ForLoop_Java {
 
    public static void main(String[] args) {
 
        //Check if 'radar' is Palindrome
        System.out.println("Is radar a Palindrome? - " + isPalindrome("radar")); //true
 
        //Check if 'apple' is Palindrome
        System.out.println("Is apple a Palindrome? - " + isPalindrome("apple")); //false
    }
 
    public static boolean isPalindrome(String orinalString) {
 
        String reversedString = "";
 
        for (int i = orinalString.length() - 1; i >= 0; i--)
            reversedString = reversedString + orinalString.charAt(i);
 
        return orinalString.equals(reversedString);
 
    }
}