package gpay;

public class gpayapp {

	private int gpin;
	private int upipin;
	static gpayapp instance=null;
	
	private gpayapp(){
		
	}
	
	public static gpayapp getObject()
	{
		if(instance==null)
		{
			instance=new gpayapp();
		}
		return instance;
	}
	
	public void setgpin(int gpin)
	{
		this.gpin=gpin;
		
	}
	public void setupipin(int upipin)
	{
		this.upipin=upipin;
		
	}
	public int getupipin()
	{
		return upipin;
	}
	
	public int getgpin()
	{
		return gpin;
	}
}
