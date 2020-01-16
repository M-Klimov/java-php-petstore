import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpRequest {

	private String baseUrl;
	private String urlConnection;

	public HttpRequest(String baseUrl) throws MalformedURLException {
		this.baseUrl = baseUrl;
	}
	
	public String request(String url) throws MalformedURLException, IOException {
		URLConnection conn = this.getUrl(url).openConnection();
		
		BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
		
		String inputLine;
		
		String result = br.readLine();
		br.close();
		
		return result;
	}
	
	private URL getUrl(String url) throws MalformedURLException {
		return new URL(this.baseUrl + url);
	}
}
