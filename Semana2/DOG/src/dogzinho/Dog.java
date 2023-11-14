package dogzinho;

public class Dog {
	private int _legs;
	private boolean _bark;
	private String _dogSize, _earType;
	
	public Dog()
	   {
	      _legs = 4;
	      _bark = true;
	   }

	   public void setDogSize(String type)
	   {
	      _dogSize = type;
	   }
	   public void setEars(String type)      // virtual function
	   {
	      _earType = type;
	   }
	   public void setLegs(int type) {
		   _legs = type;
	   }
	   public int getLegs(){
		   return _legs;
	   }
	   
	   
}
