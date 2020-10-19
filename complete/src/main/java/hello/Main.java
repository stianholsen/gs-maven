package hello;
import models.auth.*;

import org.joda.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		setAuthModel();
		StartAuth startAuth = new StartAuth();
		System.out.println(startAuth.generateAccessToken());
	}


	public static void setAuthModel(){

		Auth_model setModel = new Auth_model();
		setModel.setData("3f063beb-bf33-4638-bcdd-e8f5a00716f8", "D0mN6vX8rF5sQ8vV7eI6hA5dW5mJ5bA6xU6qR2eY1cS2bF2kB3", "https://api.nordeaopenbanking.com", "https://www.google.com"); //clientID clientSecret
		Endpoints setAccessUri = new Endpoints();
		setAccessUri.setURIs("v1/authentication", "v1/authentication/access_token");
	}
}