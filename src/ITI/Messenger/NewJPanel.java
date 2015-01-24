/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ITI.Messenger;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Radwa Hassan Salah
 */
class NewJPanel extends JPanel {

    

        private BufferedImage image;

        public NewJPanel(String imagePath) {
            try {
                image = ImageIO.read(new File(imagePath));
            } catch (IOException ex) {
                // handle exception...
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
        }
    
    
}
