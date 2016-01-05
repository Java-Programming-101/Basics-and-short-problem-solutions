
public class OneHundred_Doors {

	public static void main(String[] args) {
		
		
		boolean[] doors = new boolean[101];
		
		
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                if(j % i == 0) doors[j] = !doors[j];
            }
        }
		
		for(int i = 1 ; i < doors.length ; i++){
			System.out.println("Door "+ (i) +" is open " + doors[i]);
		}

	}

}
