

public class Multplication_Table {
	
	/* 
	 * This class will create and print a multiplication table and format it in an easy to read table. 
	 * 
	 * Note that this mainly demonstrates how a combination of loops and statements can be combined to create
	 * and manipulate data quickly to help stop duplication of code.
	 */

	public static void main(String[] args) {
		for (int i=1;i<13;i++){    // outer for loop 
			for (int x = 1;x<13;x++){ // inner for loop 
			    if (x==1){            // else if statements 
			        System.out.print(x*i);
			    }
				else if (x==12){
					System.out.printf("%4d%n", x*i);
				}
				else {
				System.out.printf("%4d", x*i);
				}
			}
		
		}

	}

	/*
	 * try to recreate this programme without using this combination or using single for loops and see how much code it takes!!!
	 */
}
