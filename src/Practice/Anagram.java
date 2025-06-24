package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1="sabari";
	     String str2="irabass";
	     boolean flag=true;
	     char[] chr=str1.toCharArray();
	     char[] chr2=str2.toCharArray();
	     HashMap <Character, Integer> count= new HashMap<>();
	     
	     for (char c : chr2) {
			count.put(c, count.getOrDefault(c, 0)+1); 
		}
	     for (char c : chr) {
	 		count.put(c, count.getOrDefault(c, 0)-1); 
	 	}
	     
	   Iterator<Entry<Character,Integer>> it=count.entrySet().iterator();
	   while(it.hasNext())
	   {
		   
		   Entry<Character, Integer> cnt=it.next();
		   if(cnt.getValue()!=0) {
			   flag=false;
			   break;
		   }
		   else {
			   continue;
		   }
		   
	   }
	   System.out.println(flag? "Given Strings are Anagram":"Given Strings are not Anagram");
	   
	    
	   
		}
	    

}
