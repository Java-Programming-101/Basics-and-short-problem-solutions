package stringBuilder;

import java.util.ArrayList;

public class SBuilder_Demo {

	public static void main(String[] args) {
		
		// The string builder provides something that a normal string dosen't strings don't They are Mutable (can be changed)
		
		StringBuilder sBuilder1 = new StringBuilder("Hello String Builder!");
		
		String immutable = "Goodbye Strings!";
		
		
		System.out.println(sBuilder1);
		System.out.println(immutable);
		
		/*
		 * for instance, can you remove bye from immutable? 
		 * 
		 * what about like this?
		 */
		
		immutable = immutable.replace("bye", "");
		
		/*
		 * what does this change immutable to? 
		 */
		
		System.out.println(immutable);
		
		/*
		 * this looks like we got what we wanted right? 
		 * 
		 * but what we actually did was create a new string and moved the reference.
		 * 
		 * before 
		 * immutable ----------> "Goodbye Strings"
		 * 
		 * after 
		 * immutable ----		 "Goodbye Strings"
		 * 			     \
		 * 				  -----> "Good Strings"
		 * 
		 * Now the "Goodbye strings" is still in the memory until the garbage collector comes to visit and removes it.  * 
		 */
		
		
		/*
		 * Now say we want to change "Hello String Builder!" to "Hello Builder!" how could we do this? 
		 * 
		 * The String builder provides a huge amount of methods to allow you to manipulate Strings one of these is the delete(start,end) method. 
		 * 
		 * now what do we put in start and end ? well first we need to realize that sBuilder does not contain a STRING per say it contains an array of chars.
		 * that are indexed from 0 
		 * 
		 * so "Hello string builder!" is actually 
		 * 
		 * [H][e][l][l][o][ ][S][t][r][i][n][g][ ][B][u][i][l][d][e][r][!]
		 *  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 
		 *  			 ^---------------------^
		 *  
		 *  so to  remove string we need to get rid of points FROM 5 UPTO 12
		 *  
		 */
		
		sBuilder1.delete(5, 12);
		
		
		System.out.println(sBuilder1);
		
		
		
	}

}
