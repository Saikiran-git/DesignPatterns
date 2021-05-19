package ObserverPattern;

public interface INotificationService {

	void addSubscriber(Observer observer);
	void removeSubscriber(Observer observer);
	void notifySubscriber();
}
