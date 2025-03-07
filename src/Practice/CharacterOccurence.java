package Practice;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String a="hello";
	char[] b=a.toCharArray();
	Map <Character,Integer> map= new HashMap<Character,Integer>();
	
    for(char i:b)
    {
    	map.put(i,map.getOrDefault(i,0)+1);
    }
	
    for(Map.Entry<Character,Integer> test:map.entrySet())
    {
    	System.out.println(test.getKey()+":"+test.getValue());
    }
	
	}

}
