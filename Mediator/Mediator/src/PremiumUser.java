
public class PremiumUser implements IUser {
	
	private ChatMediator chatMediator;
	private String name;

	public PremiumUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void recieveMessage(String msg) {
		System.out.println(name+" recieved : "+msg);
	}

	@Override
	public void sendMessage(String msg) {
		chatMediator.sendMessage(msg);
	}
}
