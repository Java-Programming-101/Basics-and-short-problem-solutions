package stringBuilder;

public class delete {

	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder("I'm tooooo lonkg!");
		
		System.out.println(sBuilder);
		
		sBuilder.deleteCharAt(14);
		
		System.out.println(sBuilder);
		
		sBuilder.delete(5, 8);
		
		System.out.println(sBuilder);

		
	}

}
