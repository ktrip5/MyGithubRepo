package com.pratice.uzio;

public class PraticeDemo {

	int practiceID;

	public PraticeDemo() {
		super();
	}

	public int getPracticeID() {
		return practiceID;
	}

	public void setPracticeID(int practiceID) {
		this.practiceID = practiceID;
	}

	@Override
	public int hashCode() {
		return this.practiceID;
	}

}
