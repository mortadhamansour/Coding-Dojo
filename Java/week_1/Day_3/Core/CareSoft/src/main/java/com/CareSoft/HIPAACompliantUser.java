package com.CareSoft;

public interface HIPAACompliantUser {
	abstract boolean assignPin(int pin);

	abstract boolean accessAuthorized(Integer confirmedAuthID);
}
