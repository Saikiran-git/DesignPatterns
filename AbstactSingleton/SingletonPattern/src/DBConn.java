
public class DBConn 
{
	private static DBConn instance=new DBConn();
	
	private DBConn() {}
	
	public static DBConn getInstance()
	{
		return instance;
	}
	
	public void showMessage()
	{
		System.out.println("From inside DBConn");
	}
}
