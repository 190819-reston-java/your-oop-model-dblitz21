package com.revature.vehicles;

public class NegativeSpeedException extends RuntimeException {
	public NegativeSpeedException() {
		this("A vehicle's speed can't be negative");
	}

	public NegativeSpeedException(String message) {
		super(message);
	}
}
