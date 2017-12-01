package org.com5104.models;

public abstract class TermSimulator {
	protected TermEventListener listener;
	
	public TermSimulator(TermEventListener listener) {
		this.listener = listener;
	}
}
