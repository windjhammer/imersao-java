import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

public class GeradoraDeFigurinhas {
    public void criar(InputStream input, String nome, int nota) throws Exception {
        BufferedImage originalImage = ImageIO.read(input);

        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        int newHeight = height+200;
        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

        Graphics2D graphic = (Graphics2D) newImage.getGraphics();
        graphic.drawImage(originalImage, 0, 0, null);

        Font font = new Font("Consolas", Font.BOLD, 64);
        graphic.setFont(font);
        graphic.setColor(Color.BLUE);
        String review;

        if (nota == 10) {
            review = "Impecável.";
        } else if (nota < 10 && nota > 7) {
            review = "Bom.";
        } else if (nota <= 7 && nota > 5) {
            review = "Dá pra ver.";
        } else if (nota <= 5 && nota > 2) {
            review = "Ruim.";
        } else {
            review = "Não veja.";
        }
        
        FontMetrics fontMetrics = graphic.getFontMetrics();
        Rectangle2D rectangle = fontMetrics.getStringBounds(review, graphic);
        int textWidth = (int) rectangle.getWidth();
        int newWidth = (width - textWidth) / 2;

        graphic.drawString(review, newWidth, newHeight-100);

        File dir = new File("pronto");
        if (!(dir.exists())) {
            new File("pronto").mkdir();
        }
        
        ImageIO.write(newImage, "png", new File("pronto/"+nome));

    }
}
