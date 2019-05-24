package com.mayab.desarrollo.sage;

public interface Observable {
	public String[] getState();
	public void addObserverToList(Observer foo);
	public void deleteObserverFromList(Observer foo);
	public void notifyObservers();
}
