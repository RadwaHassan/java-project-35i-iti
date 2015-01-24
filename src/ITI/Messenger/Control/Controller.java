/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ITI.Messenger.Control;

import ITI.Messenger.Control.UserData;
import ITI.Messenger.SignUp;
import ITI.Model.MessengerModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author dina
 */
public class Controller{

    SignUp SignUpV;

    MessengerModel ModelV;

    public Controller(SignUp V,MessengerModel M)
    {
        this.SignUpV = V;
        this.ModelV = M;
    }


    public void SignUpAction(){
      
      SignUpV.getCreateAccountButton().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                boolean UserFlag,PassFlag;
                String PassV,UserNameV;
                
                UserData UD = SignUpV.getAllData(); // return object contains all user data

                UserNameV = UD.getUserName();
                PassV = UD.getPassword();
                if(UserNameV.isEmpty() || UD.getFirstName().isEmpty() || PassV.isEmpty() || UD.getGender().isEmpty())
                {
                   if(UserNameV.isEmpty())
                   {
                       SignUpV.setUserNameRequiredLabel(true,1);
                   }
                   if(UD.getFirstName().isEmpty())
                    SignUpV.setNameRequiredLabel(true);
                   if(PassV.isEmpty())
                    SignUpV.setPasswordRequiredRequiredLabel(true,1);
                  if (UD.getGender().isEmpty())
                      SignUpV.setGenderRequiredLabel(true);
                }
                else {

                      UserFlag = ModelV.checkUsrExistedOrNot(UserNameV);
                   // System.out.print(UserFlag);
                         if(UserFlag == false)
                             SignUpV.setUserNameRequiredLabel(true,2);
                         else
                         {
                                PassFlag = ModelV.checkPassValidOrNot(PassV);
                                
                                if(PassFlag == false)
                                    SignUpV.setPasswordRequiredRequiredLabel(PassFlag,2);
                                else
                                {
                                    
                                    ModelV.addNewUser(UD);
                                    SignUpV.dispose();
                             }
                            }
                         }
                      
            }
        });
    }



}
