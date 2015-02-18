package ar.com.germanmr;

public class MavenAxis2WS {

	public String ping(String text) {
		if (text == null) {
			return "Service is up and available";
		}
		return "Service is up and available, message: " + text;
	}
}