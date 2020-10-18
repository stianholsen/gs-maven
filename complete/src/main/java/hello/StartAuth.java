package hello;

public class StartAuth {
	public String startProcess(String targetURL) {

		URL url = new URL(targetURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");


		con.setRequestProperty("Content-Type", "application/json");

		return "hoho";
	}
}
