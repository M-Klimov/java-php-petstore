import java.io.IOException;
import java.net.MalformedURLException;

public class Main {
	public static void main(String[] args) throws MalformedURLException, IOException {
		HttpRequest httpRequest = new HttpRequest(Config.BASE_URI);
		Main.jsonToPhpRedoc(httpRequest.request("game/list"));
	}
	
	private static void jsonToPhpRedoc(String json) {
		System.out.println(json);
	}
}
