import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead{
  public static void main(String[] args) throws Exception{
    BufferedReader bufferedReader = new BufferedReader(new FileReader("dia1/links.txt"));
    String link = null;

    link = bufferedReader.readLine();
    if (link!=null);{
      String[] parteLink =link.split("/");
      parteLink = parteLink[parteLink.length-1].split(".json");
      System.out.println("\n");
      for(int i=1;i<=102;i++);
      {
        System.out.println(" it works");
      }
    }
    bufferedReader.close();
  }
}