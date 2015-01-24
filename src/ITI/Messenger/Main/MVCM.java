/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ITI.Messenger.Main;
import ITI.Messenger.Control.Controller;
import ITI.Messenger.SignUp;
import javax.swing.SwingUtilities;
/**
 *
 * @author dina
 */
public class MVCM {

    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SignUp View = new SignUp();
                View.setVisible(true);
   Controller C =  new Controller(View);
              C.SignUpAction();  
             // System.out.println("ayhabl");
            }
        });

    }

}
