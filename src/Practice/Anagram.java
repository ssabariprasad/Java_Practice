package Practice;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String a="madam";
	        String b="daamm";
	         a=a.toLowerCase();
	         b=b.toLowerCase();
	        // Create a hashmap to store character frequencies
	        HashMap <Character, Integer> charCount = new HashMap<>();
	        
	        // Count frequency of each character in string s1
	        for (char ch : a.toCharArray()) 
	            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
	  
	        // Count frequency of each character in string s2
	        for (char ch : b.toCharArray()) 
	            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
	  
	        // Check if all frequencies are zero
	        for (Map.Entry<Character,Integer> pair : charCount.entrySet()) {
	            if (pair.getValue() != 0) {
	                System.out.println("Not an Anagram");	            }
	        }
	        
	        // If all conditions satisfied, they are anagrams
	        System.out.println("Anagram");

	}

}
