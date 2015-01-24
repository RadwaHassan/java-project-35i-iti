
package ITI.Messenger;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.xswingx.PromptSupport;
//import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author A7mady
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            // UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
           // UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");
        
        initComponents();
        setTitle("Sign Up");
        setLocationRelativeTo(null);
        setResizable(false);
        //nameRequiredLabel.setVisible(false);
        //userNameRequiredLabel.setVisible(false);
        //passwdRequiredLabel.setVisible(false);
        //genderRequiredLabel.setVisible(false);
       // YearRequiredLabel.setVisible(false);
     
        PromptSupport.setPrompt("First Name", firstNameText);
        PromptSupport.setPrompt("Last Name", lastNameText);
        PromptSupport.setPrompt("User Name", userNameText);
        PromptSupport.setPrompt("Password", passwordField);
        PromptSupport.setPrompt("Phone Number", phoneNoField);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, firstNameText);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, lastNameText);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, userNameText);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, passwordField);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, phoneNoField);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(MaleB);
        genderGroup.add(FemaleB);
        setLists();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpP = new javax.swing.JPanel();
        InnerSignUpP = new javax.swing.JPanel();
        NameP = new javax.swing.JPanel();
        lastNameText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        SignUpL = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        BirthDayP = new javax.swing.JPanel();
        dayList = new javax.swing.JComboBox();
        monthList = new javax.swing.JComboBox();
        yearList = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameRequiredLabel = new javax.swing.JLabel();
        userNameRequiredLabel = new javax.swing.JLabel();
        passwdRequiredLabel = new javax.swing.JLabel();
        YearRequiredLabel = new javax.swing.JLabel();
        GenderP = new javax.swing.JPanel();
        MaleB = new javax.swing.JRadioButton();
        FemaleB = new javax.swing.JRadioButton();
        CountryP = new javax.swing.JPanel();
        countryKeyList = new javax.swing.JComboBox();
        phoneNoField = new javax.swing.JTextField();
        genderRequiredLabel = new javax.swing.JLabel();
        CreateAccountB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));
        setForeground(new java.awt.Color(102, 0, 102));

        SignUpP.setBackground(new java.awt.Color(102, 0, 102));

        InnerSignUpP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        firstNameText.setToolTipText("");
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NamePLayout = new javax.swing.GroupLayout(NameP);
        NameP.setLayout(NamePLayout);
        NamePLayout.setHorizontalGroup(
            NamePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NamePLayout.createSequentialGroup()
                .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NamePLayout.setVerticalGroup(
            NamePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(lastNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        SignUpL.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        SignUpL.setText("Sign Up");

        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });

        dayList.setFocusable(false);
        dayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayListActionPerformed(evt);
            }
        });

        monthList.setFocusable(false);
        monthList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthListActionPerformed(evt);
            }
        });

        yearList.setFocusable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Birthday");

        javax.swing.GroupLayout BirthDayPLayout = new javax.swing.GroupLayout(BirthDayP);
        BirthDayP.setLayout(BirthDayPLayout);
        BirthDayPLayout.setHorizontalGroup(
            BirthDayPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BirthDayPLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dayList, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(yearList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        BirthDayPLayout.setVerticalGroup(
            BirthDayPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BirthDayPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dayList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(monthList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(yearList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nameRequiredLabel.setText("Your First Name Is Required");

        userNameRequiredLabel.setText("Your User Name Is Required");
        userNameRequiredLabel.setToolTipText("");

        passwdRequiredLabel.setText("Please Create A Password");

        YearRequiredLabel.setText("Year Is Required");
        YearRequiredLabel.setToolTipText("");

        MaleB.setText("Male");
        MaleB.setFocusable(false);
        MaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleBActionPerformed(evt);
            }
        });

        FemaleB.setText("Female");
        FemaleB.setFocusable(false);

        javax.swing.GroupLayout GenderPLayout = new javax.swing.GroupLayout(GenderP);
        GenderP.setLayout(GenderPLayout);
        GenderPLayout.setHorizontalGroup(
            GenderPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenderPLayout.createSequentialGroup()
                .addComponent(MaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(FemaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        GenderPLayout.setVerticalGroup(
            GenderPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenderPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(FemaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        countryKeyList.setFocusable(false);

        javax.swing.GroupLayout CountryPLayout = new javax.swing.GroupLayout(CountryP);
        CountryP.setLayout(CountryPLayout);
        CountryPLayout.setHorizontalGroup(
            CountryPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountryPLayout.createSequentialGroup()
                .addComponent(countryKeyList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        CountryPLayout.setVerticalGroup(
            CountryPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountryPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(countryKeyList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        genderRequiredLabel.setText("This Information Is Required");

        CreateAccountB.setText("Create Account");
        CreateAccountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InnerSignUpPLayout = new javax.swing.GroupLayout(InnerSignUpP);
        InnerSignUpP.setLayout(InnerSignUpPLayout);
        InnerSignUpPLayout.setHorizontalGroup(
            InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerSignUpPLayout.createSequentialGroup()
                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerSignUpPLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderRequiredLabel)
                            .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordField)
                                .addComponent(userNameText)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameRequiredLabel)
                                    .addComponent(YearRequiredLabel)
                                    .addComponent(passwdRequiredLabel)
                                    .addComponent(NameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameRequiredLabel))
                                .addComponent(BirthDayP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(CountryP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InnerSignUpPLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(CreateAccountB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerSignUpPLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(SignUpL, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InnerSignUpPLayout.setVerticalGroup(
            InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerSignUpPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignUpL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameRequiredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameRequiredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwdRequiredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BirthDayP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(YearRequiredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genderRequiredLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CountryP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(CreateAccountB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout SignUpPLayout = new javax.swing.GroupLayout(SignUpP);
        SignUpP.setLayout(SignUpPLayout);
        SignUpPLayout.setHorizontalGroup(
            SignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(InnerSignUpP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        SignUpPLayout.setVerticalGroup(
            SignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpPLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(InnerSignUpP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextActionPerformed

    private void MaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleBActionPerformed

    private void monthListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthListActionPerformed

    private void dayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayListActionPerformed

    private void CreateAccountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateAccountBActionPerformed

 
    
   // public static void main(String args[]) {
        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(new Runnable() {
      //      @Override
      //      public void run() {
      //          new SignUp().setVisible(true);
      //      }
      //  });
   // }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BirthDayP;
    private javax.swing.JPanel CountryP;
    private javax.swing.JButton CreateAccountB;
    private javax.swing.JRadioButton FemaleB;
    private javax.swing.JPanel GenderP;
    private javax.swing.JPanel InnerSignUpP;
    private javax.swing.JRadioButton MaleB;
    private javax.swing.JPanel NameP;
    private javax.swing.JLabel SignUpL;
    private javax.swing.JPanel SignUpP;
    private javax.swing.JLabel YearRequiredLabel;
    private javax.swing.JComboBox countryKeyList;
    private javax.swing.JComboBox dayList;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel genderRequiredLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JComboBox monthList;
    private javax.swing.JLabel nameRequiredLabel;
    private javax.swing.JLabel passwdRequiredLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JLabel userNameRequiredLabel;
    private javax.swing.JTextField userNameText;
    private javax.swing.JComboBox yearList;
    // End of variables declaration//GEN-END:variables

    private void setLists() {
         //set Months List
        String[] months = new DateFormatSymbols().getMonths();
        for (int i = 0; i < 12; i++) {
            monthList.addItem(months[i]);
        }

          //set Years List
        ArrayList<String> years = new ArrayList<String>();
        for (int i = 2015 ; i >= 1900 ; i--) {
            years.add(Integer.toString(i));
        }
        for (String year : years) {
            yearList.addItem(year);
        }

        
          //set Days List
        ArrayList<String> days = new ArrayList<String>();
        for (int i = 1; i < 32; i++) {
            days.add(Integer.toString(i));
        }
        for (String day : days) {
            dayList.addItem(day);
        }    
    
          String[] countryAreaCodes = {"93", "355", "213",
            "376", "244", "672", "54", "374", "297", "61", "43", "994", "973",
            "880", "375", "32", "501", "229", "975", "591", "387", "267", "55",
            "673", "359", "226", "95", "257", "855", "237", "1", "238", "236",
            "235", "56", "86", "61", "61", "57", "269", "242", "682", "506",
            "385", "53", "357", "420", "45", "253", "670", "593", "20", "503",
            "240", "291", "372", "251", "500", "298", "679", "358", "33",
            "689", "241", "220", "995", "49", "233", "350", "30", "299", "502",
            "224", "245", "592", "509", "504", "852", "36", "91", "62", "98",
            "964", "353", "44", "972", "39", "225", "1876", "81", "962", "7",
            "254", "686", "965", "996", "856", "371", "961", "266", "231",
            "218", "423", "370", "352", "853", "389", "261", "265", "60",
            "960", "223", "356", "692", "222", "230", "262", "52", "691",
            "373", "377", "976", "382", "212", "258", "264", "674", "977",
            "31", "687", "64", "505", "227", "234", "683", "850", "47", "968",
            "92", "680", "507", "675", "595", "51", "63", "870", "48", "351",
            "1", "974", "40", "7", "250", "590", "685", "378", "239", "966",
            "221", "381", "248", "232", "65", "421", "386", "677", "252", "27",
            "82", "34", "94", "290", "508", "249", "597", "268", "46", "41",
            "963", "886", "992", "255", "66", "228", "690", "676", "216", "90",
            "993", "688", "971", "256", "44", "380", "598", "1", "998", "678",
            "39", "58", "84", "681", "967", "260", "263" };

     String[] countryCodes = { "AF", "AL", "DZ", "AD", "AO",
            "AQ", "AR", "AM", "AW", "AU", "AT", "AZ", "BH", "BD", "BY", "BE",
            "BZ", "BJ", "BT", "BO", "BA", "BW", "BR", "BN", "BG", "BF", "MM",
            "BI", "KH", "CM", "CA", "CV", "CF", "TD", "CL", "CN", "CX", "CC",
            "CO", "KM", "CG", "CK", "CR", "HR", "CU", "CY", "CZ", "DK", "DJ",
            "TL", "EC", "EG", "SV", "GQ", "ER", "EE", "ET", "FK", "FO", "FJ",
            "FI", "FR", "PF", "GA", "GM", "GE", "DE", "GH", "GI", "GR", "GL",
            "GT", "GN", "GW", "GY", "HT", "HN", "HK", "HU", "IN", "ID", "IR",
            "IQ", "IE", "IM", "IL", "IT", "CI", "JM", "JP", "JO", "KZ", "KE",
            "KI", "KW", "KG", "LA", "LV", "LB", "LS", "LR", "LY", "LI", "LT",
            "LU", "MO", "MK", "MG", "MW", "MY", "MV", "ML", "MT", "MH", "MR",
            "MU", "YT", "MX", "FM", "MD", "MC", "MN", "ME", "MA", "MZ", "NA",
            "NR", "NP", "NL", "NC", "NZ", "NI", "NE", "NG", "NU", "KP", "NO",
            "OM", "PK", "PW", "PA", "PG", "PY", "PE", "PH", "PN", "PL", "PT",
            "PR", "QA", "RO", "RU", "RW", "BL", "WS", "SM", "ST", "SA", "SN",
            "RS", "SC", "SL", "SG", "SK", "SI", "SB", "SO", "ZA", "KR", "ES",
            "LK", "SH", "PM", "SD", "SR", "SZ", "SE", "CH", "SY", "TW", "TJ",
            "TZ", "TH", "TG", "TK", "TO", "TN", "TR", "TM", "TV", "AE", "UG",
            "GB", "UA", "UY", "US", "UZ", "VU", "VA", "VE", "VN", "WF", "YE",
            "ZM", "ZW"

    };
    
    
    for (int i = 0 ; i < countryCodes.length ; i++) {
            countryKeyList.addItem(countryCodes[i]+" +"+countryAreaCodes[i]);
        }
    
    
    }
    
 public String getFirstNameText()
    {
        return firstNameText.getText();
 }

 public String getLastNameText()
    {
        return lastNameText.getText();
 }

 public String getUserNameText()
    {
        return userNameText.getText();
    }

  public char[] getPassword()
    {
        return passwordField.getPassword();
    }

  public JButton getCreateAccountButton()
    {
      return CreateAccountB;
    }


}
