import java.util.ArrayList;

public class Pin2_home {

	public static void main(String[] args) {
		ArrayList<String> pinNumbers = new ArrayList<String>();
		
		for (int i = 0 ; i<100; i++){
			String pin = null;
			for (int u = 0 ; u<4; u++){
				
				int digit = (int) (Math.random()*10);
				
				if (pin == null){
					pin = Integer.toString(digit);
				}else{
					pin = pin + Integer.toString(digit);
				}
			}
			pinNumbers.add(pin);
		}
		
		for(String pString: pinNumbers){
			System.out.println(pString);
		}
		System.out.println(pinNumbers.size());

	}

}
