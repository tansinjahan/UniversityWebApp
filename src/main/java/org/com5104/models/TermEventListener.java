package org.com5104.models;

public interface TermEventListener {
	void onCreate();
	void onRegistrationPossible();
	void onTermProperlyStarted();
	void onTermEnded();
	void onTwoWeekPassedTillTermStarted();
}
