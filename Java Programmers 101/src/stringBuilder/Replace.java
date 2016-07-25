package stringBuilder;

public class Replace {

	public static void main(String[] args) {
	
		
	StringBuilder sBuilder = new StringBuilder("How to replace letters.");
	
	/*
	 * 
	 *
	 *	[H][o][w][ ][t][o][ ][r][e][p][l][a][c][e][ ][l][e][t][t][e][r][s][.]
	 *   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23
	 *					     ^--------------------^
	 */

	
	System.out.println();
	sBuilder.replace(7, 14, "change");
	
	System.out.println(sBuilder);
	}

}
