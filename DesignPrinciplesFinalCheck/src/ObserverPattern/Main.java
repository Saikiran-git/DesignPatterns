package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Observer Name1=new Admin("Name1");
		Observer Name2=new Admin("Name2");
		Observer Name3=new Admin("Name3");
		Observer Name4=new Admin("Name4");
		
		INotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(Name1);
		notificationService.addSubscriber(Name2);
		notificationService.addSubscriber(Name3);
		notificationService.addSubscriber(Name4);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(Name3);
		
	}
}
