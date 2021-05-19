
import java.util.List;

public class ChatMediator implements IChatMediator {

	List<IUser> users;
	
	public List<IUser> getUsers() {
		return users;
	}

	public void setUsers(List<IUser> users) {
		this.users = users;
	}

	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String msg) {
		for(IUser user:users)
		{
			user.recieveMessage(msg);
		}
	}

}
