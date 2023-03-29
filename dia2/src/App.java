import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) throws Exception {
   
    //consumir dados da api

    String url = ("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json");
    URI endereco = URI.create(url);
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder(endereco).GET().build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    String body = response.body();

    //parsear os dados

    var parser = new JsonParser();
    List<Map<String, String>> listaDeFilmes = parser.parse(body);

    //manipular os dados

    for (Map<String, String> filme : listaDeFilmes) {
      System.out.println("Título: " + "\u001B[35m" + filme.get("title") + "\u001B[37m");
      System.out.println("Ano de Lançamento: " + "\u001B[36m" + filme.get("year") + "\u001B[37m");
      System.out.println("Nota:  " + "\u001B[34m" + filme.get("imDbRating") + "\033[32;1m" );
      float fNota = Float.parseFloat(filme.get("imDbRating"));
      int nota = (int) Math.floor(fNota);
      if (nota>=6){
        System.out.println("Recomendo👍");
      }
      else{
        System.out.println("Não Recomendo 👎");
      }

      }
    }
  }

