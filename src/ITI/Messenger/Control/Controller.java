/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ITI.Messenger.Control;

import ITI.Messenger.SignUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author dina
 */
public class Controller{

    SignUp SignUpV;

    public Controller(SignUp V)
    {
        this.SignUpV = V;
    }


    public void SignUpAction(){

      SignUpV.getCreateAccountButton().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println(SignUpV.getFirstNameText());
            }
        });
    }



}
