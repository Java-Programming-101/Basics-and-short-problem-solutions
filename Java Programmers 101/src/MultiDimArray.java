import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimArray {
	 public static void main(String[] args) {
		 
		 // An Multi dimensional array is an Array that contains 
	        String[][] names = {{"Mr. ", "Mrs. ", "Ms. "},{"Smith", "Jones"}};
	        //				   {   {Array of titles}        {Array of names}}
	        
	        
	        // Mr. Smith
	        System.out.println(names[0][0] + names[1][0]);
	        // Ms. Jones
	        System.out.println(names[0][2] + names[1][1]);
	        
	      
	        double [][] price = new double [2][3];
	        //			             
	        price[0][0]= 2.99;
	        price[0][1]= 2.50;
	        price[0][2]= 1.55;
	        price[1][0]= 1.65;
	        price[1][1]= 0.45;
	        price[1][2]= 0.98;


	        //Or if you know the values you wish to pass into the array you could pass it in like so. 
	        double [][] priceOfFuel =
	        	{
	        			{2.99,2.50},
	        			{1.55,1.65},
	        			{0.45,0.98}
	        	};
	        double [] news = {2.99,2.50};

	        System.out.println(news.toString());
	        System.out.println(price.toString());

	        System.out.println(price);
	        System.out.println(Arrays.deepToString(priceOfFuel));
	        
	        
	        
	        
	    }
	 
	 


}
