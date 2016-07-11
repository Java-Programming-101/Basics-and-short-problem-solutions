package builderpatten; 

public abstract class burger implements Item{
 
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
	
	
}
