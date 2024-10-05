package tam;

@SuppressWarnings("serial")
public class MinimunAccountBalalnce extends Exception
{
	
	 String message;
	
	public MinimunAccountBalalnce( String message)
	{
		this.message=message;
	}
	public String toString()
	{
		return message;
	}
     
}
