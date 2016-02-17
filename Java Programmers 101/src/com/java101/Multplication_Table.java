package com.java101;

public class Multplication_Table {

	public static void main(String[] args) {
		for (int i=1;i<13;i++){
			for (int x = 1;x<13;x++){
			    if (x==1){
			        System.out.printf("%-4d", x*i);
			    }
				else if (x==12){
					System.out.println(x*i);
				}
				else {
				System.out.printf("%-4d", x*i);
				}
			}
		
		}

	}

}
