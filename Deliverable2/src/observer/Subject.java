package observer;

public interface Subject {
	
	public void attachObserver(Observer ob); 
	public void notifyAllObservers();

}
