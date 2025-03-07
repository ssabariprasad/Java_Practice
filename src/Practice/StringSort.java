package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello";
		char[] b=a.toCharArray();
		List<Short> sortedList=new ArrayList<Short>();
		for(int i=0;i<b.length;i++)
		{
			sortedList.add((short)b[i]);
		}
		
		Collections.sort(sortedList);
	System.out.println(Collections.max(sortedList));
	 for (Short short1 : sortedList) {
		System.out.print((char)(short)short1);
	}
		
		

	}

}
