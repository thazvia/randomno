package random;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		 
		 int n=0;
		 
		int numbers[] = new int[500]; //(max-min+1)+min;
		
		 Random rnum = new Random();
		 System.out.println("Random Numbers\n****************");
		     for(int counter=100;counter<=599;counter++)
		 {
		 int c = n++;
		 numbers[c]= 100+rnum.nextInt(900);
		 System.out.println(numbers[c]);
		  }
		     int size=numbers.length;
				System.out.println("array length: " +size);
  
		     
		 int smallest = numbers[0];
		 
		               for(int i=1; i< numbers.length; i++)
		               {
		                       
		                         if (numbers[i] < smallest)
		                               smallest = numbers[i];
		               }
		              
		               System.out.println("Smallest Number is : " + smallest);
		}
		
	}


