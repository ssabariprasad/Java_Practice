package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array= {4,2,4,6,1,9,3,7};
      Optional<Integer> secondLargest=Arrays.stream(array).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
      if(secondLargest.isPresent())
      {
    	  
    	  System.out.println("Second Largest Element in array is:"+secondLargest.get());
      }
      else {
    	  System.out.println("No Unique elements present");
      }
      
      int sum=Arrays.stream(array).reduce(0, (a,b)-> a+b);
      System.out.println("Sum of Integers present in array is :"+sum);
      
      System.out.println("Even numbers from given in array is:");
      Arrays.stream(array).distinct().sorted().filter(num-> num%2==0).forEach(System.out::println);
      
      System.out.println("multiplying odd numbers in array by 2");
     List<Integer> list= Arrays.stream(array).distinct().sorted().filter(num-> num%2!=0).map(num-> num*2).boxed().collect(Collectors.toList());
	for (Integer integer : list) {
		System.out.println(integer);
	}
	
	String test ="sabari";
	test.chars().mapToObj(n-> (char)n).sorted().forEach(System.out::print);
	}

}
