import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
// ArrayLiists and collections to be discussed in a future Meetup. 
	
	  public double[] tribonacci(double[] s, int n) {
		  if (s.length<3){
		      return s;
		      }
		  if (s[0] == 0 && s[1] ==0 && s[0] == 0){
			  double[] fail = new double [n];
	          return fail;
	      }
	      int iteration = 3;
	      ArrayList <Double> trib = new ArrayList<Double>();
	      trib.add(s[0]);
	      trib.add(s[1]);
	      trib.add(s[2]);
	      
	      for (int i =iteration; i < n; i++){
	      trib.add(trib.get(i-3)+trib.get(i-2)+trib.get(i-1));
	      }
	      double [] ans = new double[trib.size()];
	      
	     for (int i = 0; i < trib.size()-1; i++) {
			ans[i]= trib.get(i);
		}
	      
	      
	      return ans;
	      
	  }
	public static void main(String[] args) {
		ArrayLists arrayLists = new ArrayLists();
		System.out.println(Arrays.toString(arrayLists.tribonacci(new double []{0,1,1},10)));

	}

	


}
