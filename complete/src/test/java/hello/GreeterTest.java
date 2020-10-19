package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
	
	private StartAuth greeter = new StartAuth();

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.generateAccessToken(), containsString("hoho"));
	}

}
