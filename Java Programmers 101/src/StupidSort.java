import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StupidSort {


	public int[] ChangetoIntArray(String aStringArray) {
		
		String numbersToSort[] = aStringArray.split("\\s+");
		int IntArray[] = new int [numbersToSort.length-1];
		
		for(int i = 0 ; i < numbersToSort.length ;i++){
			if(numbersToSort[i].isEmpty() || numbersToSort[i].contains("|")){
				//do nothing
			}else if (i == (numbersToSort.length-1)){
				IntArray[i-1]=Integer.parseInt(numbersToSort[i]);
			}else {
				IntArray[i]=Integer.parseInt(numbersToSort[i]);
			}
		}
		return IntArray;
	}
	
	
	
	public int numberOfIterations(int[] IntArray){
		return IntArray[IntArray.length];
	}
	
	

	public int[] SortArray (int[]numbersArray) {	
		int iterations = numbersArray[numbersArray.length-1];
		for (int i = 0; i < iterations; i++) {
			
			for (int j = 0 ; j < numbersArray.length-2 ; j++){
				if (numbersArray[j] > numbersArray[j+1]){
					int first = numbersArray[j];
					int second = numbersArray[j+1];
					numbersArray[j] = second;
					numbersArray[j+1]= first;
					break;
				}
			}
			
		}
		return numbersArray;
	}
	
	public void printSortedArray (int[] sortedarray){
		for (int i = 0; i < sortedarray.length-1; i++) {
			System.out.print(sortedarray[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		StupidSort sort = new StupidSort();
		try {
			File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\StupidSort.txt");
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				int[] IntArray = sort.ChangetoIntArray(line);
				int [] SortedArray = sort.SortArray(IntArray);
				
				sort.printSortedArray(SortedArray);
			}
		} catch (Exception e) {
			System.out.print("no file found");
			e.printStackTrace();
		}
			
		}

	}



