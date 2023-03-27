import java.awt.List;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import br.com.alura.omnistream.service.json.JsonParser;

public class App {
    public static void main(String[] args) throws Exception {
   
    //consumir dados da api
    
    String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
    URI endereco = URI.create(url);
    var client = HttpClient.newHttpClient(); 
    var request = HttpRequest.newBuilder(endereco).GET().build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    String body = response.body();
    System.out.println(body);

    var parser = new JsonParser();
    List<Map<String, String>> listaDeFilmes = parser.parse(body);

    for (Map<String, String> filme : listadefilmes) {
      System.out.println(filme);
    }
  }
}
