package hello;
import models.auth.*;

import org.joda.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		StartAuth startAuth = new StartAuth();
		System.out.println(startAuth.startProcess("https://api.nordeaopenbanking.com"));
	}


	public static void setModel(){

	}
}