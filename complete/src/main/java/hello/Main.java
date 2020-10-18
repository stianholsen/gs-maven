package hello;
import models.auth.*;

import org.joda.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		StartAuth startAuth = new StartAuth();
		System.out.println(startAuth.startProcess("https://api.nordeaopenbanking.com"));
		setModel();
	}


	public static void setModel(){

		Auth_model setModel = new Auth_model();
		setModel.setData("3f063beb-bf33-4638-bcdd-e8f5a00716f8", "D0mN6vX8rF5sQ8vV7eI6hA5dW5mJ5bA6xU6qR2eY1cS2bF2kB3"); //clientID clientSecret

		System.out.println(setModel.getId());

	}
}