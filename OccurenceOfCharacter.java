import java.util.*;

public class OccurenceOfCharacter {
   public static void main(String[] args) {
      String str = "Hello Today is Wednesday";
      HashMap <Character, Integer> hMap = new HashMap<>();
      for (int i = 0; i<= str.length()-1; i++) {
         if (hMap.containsKey(str.charAt(i))) {
            int count = hMap.get(str.charAt(i));
			System.out.println(str.charAt(i),count);
            hMap.put(str.charAt(i), ++count);
         } else {
			 System.out.println(str.charAt(i));
            hMap.put(str.charAt(i),1);
         }
      }
      System.out.println(hMap);
   }
}