import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GeradoraDeFigurinhas {
    void create(String urlImagem, String textoImagem, String nomeSaida){
        try {
            InputStream inputStream = new URL(urlImagem).openStream();
            BufferedImage originalImage = ImageIO.read(inputStream);

            int largura = originalImage.getWidth();
            int altura = originalImage.getHeight();
            double percent = 0.08;
            int novaAlutra = (int) Math.floor(altura * percent + altura);
            var novaImagem = new BufferedImage(largura, novaAlutra, BufferedImage.TRANSLUCENT);

            Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
            graphics.drawImage(originalImage, null, 0, 0);

            var fonte = new Font("Consolas", Font.BOLD, largura / 20);
            graphics.setFont(fonte);
            graphics.setColor(Color.YELLOW);

            int posicaoTexto = novaAlutra - (int) Math.floor(altura *(percent /2));
            graphics.drawString(textoImagem, 0, posicaoTexto);

            ImageIO.write(novaImagem, "png", new File("imagens/", nomeSaida + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cria(InputStream inputStream, String nomeArquivo) {
    }
}