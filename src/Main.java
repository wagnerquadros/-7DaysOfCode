import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main{
    
	public static void main(String[]args) throws URISyntaxException, IOException, InterruptedException{
		
		String apiKey ="k_d76v5vs5";
    	
    	HttpClient client = HttpClient.newHttpClient();
    	HttpRequest request = HttpRequest
        		.newBuilder()
        		.uri(new URI("https://imdb-api.com/en/API/Top250Movies/" + apiKey))
        		.build();
        
    	HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        
        String responseJson = response.body();
        
        System.out.println(responseJson);

    }
}