import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		chatMediator.setUsers(new ArrayList<>());
		BasicUser bUser=new BasicUser(chatMediator,"BUser");
		PremiumUser pUser=new PremiumUser(chatMediator,"PUser");
		BasicUser user1=new BasicUser(chatMediator, "user1");
		
		chatMediator.addUser(bUser);
		chatMediator.addUser(pUser);
		user1.sendMessage("Hi All,My name is User1");
	}
}
