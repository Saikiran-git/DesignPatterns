
public class Main {

	public static void main(String[] args) 
	{
		//Throws error as the constructor is private
		//DBConn dbconn=new DBConn();
		
		DBConn dbconn=DBConn.getInstance();
		dbconn.showMessage();
	}
}
