/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ITI.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import ITI.Messenger.Control.UserData;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author A7mady
 */
public class MessengerModel {

    Connection con;
    PreparedStatement stmt ;
    public MessengerModel(){

    try {
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection("jdbc:mysql://10.145.193.246/message","root","1234");
            //10.145.193.246
            System.out.println("connected");
            //10.145.193.246
        } catch (SQLException ex) {
            Logger.getLogger(MessengerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addNewUser(UserData userData){
        try {
            PreparedStatement stmt = con.prepareStatement("insert into users(FIRSTNAME,LASTNAME,USERID,PASSWORD,GENDER,BIRTHDATE) values (? , ? , ? , ?,? ,? )");
            stmt.setString(1, userData.getFirstName());
            stmt.setString(2, userData.getLastName());
            stmt.setString(3, userData.getUserName());
            stmt.setString(4, userData.getPassword());
            stmt.setString(5, userData.getGender());
            stmt.setString(6, userData.getBirthDate());
//            stmt.setString(7 ,userData.getPhoneNumber());
//            stmt.setString(8 , userData.getStatus());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessengerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addNewUser(){
        try {
           PreparedStatement stmt = con.prepareStatement
              ("insert into users(FIRSTNAME,LASTNAME,USERID,PASSWORD,GENDER,BIRTHDATE) values (?,?,?,?,?,?)");
            stmt.setString(1,"20");
            stmt.setString(2,"20");
            stmt.setString(3,"20");
            stmt.setString(4,"20");
            stmt.setString(5,"20");
            stmt.setString(6,"20");
stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MessengerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public boolean checkPassValidOrNot (String password){
    //(?=.*[0-9]) a digit must occur at least once
    //(?=.*[a-z]) a lower case letter must occur at least once
    //(?=.*[A-Z]) an upper case letter must occur at least once
    //(?=.*[@#$%^&+=]) a special character must occur at least once
    //(?=\\S+$) no whitespace allowed in the entire string
    //.{8,} at least 8 characters

        String Pass_pattern = "(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{5,10}";
        Pattern pattern = Pattern.compile(Pass_pattern);
        Matcher Match = pattern.matcher(password);
        if(Match.matches()){
                   System.out.print(true);
               return true;
              }
              else {
             System.out.print(false);
                  return false;
              }

   }
   
   
   
   public UserData retrievUserData (String userName){
       UserData userData = new UserData();
        try {
            
            Statement myst = con.createStatement();
            String QuerStr= "select * from users where userId ='"+ userName +"'";
            ResultSet rs = myst.executeQuery(QuerStr);
            while(rs.next()){
              userData.setUserName(rs.getString(1));
              userData.setFirstName(rs.getString(2));
              userData.setLastName(rs.getString(3));
              userData.setGender(rs.getString(5));
              userData.setBirthDate(rs.getString(6));
              userData.setPhoneNumber(rs.getString(7)); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MessengerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userData;
   }
    public boolean checkUsrExistedOrNot(String userName) {
        boolean flag = false;
        try {
            Statement stmt = con.createStatement();
            String Querstr = "select * from users where userId like '"+userName+"'";
            ResultSet rs = stmt.executeQuery(Querstr);
            
            if (!rs.next())
            {
               flag = true;
              
            }
               else
               flag = false;
 
        } catch (SQLException ex) {
            Logger.getLogger(MessengerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       return flag;
  }

//    public static void main(String[] args) {
//       MessengerModel M = new MessengerModel();
//        M.addNewUser();
//    }
//

}


