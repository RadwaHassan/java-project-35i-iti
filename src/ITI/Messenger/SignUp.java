package ITI.Messenger;

import ITI.Messenger.Control.UserData;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import java.awt.Color;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author A7mady
 */
public class SignUp extends javax.swing.JFrame {

    
    
    public SignUp() {
        try
    {
      UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
        // UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");

        initComponents();
        
        setTitle("Sign Up");
        setLocationRelativeTo(null);
        setResizable(false);
//        nameRequiredLabel.setVisible(true);
//        userNameRequiredLabel.setVisible(true);
//        passwdRequiredLabel.setVisible(true);
//        genderRequiredLabel.setVisible(true);
//        YearRequiredLabel.setVisible(true);
   
//        PromptSupport.setPrompt(" First Name", firstNameText);
//        PromptSupport.setPrompt(" Last Name", lastNameText);
//        PromptSupport.setPrompt(" User Name", userNameText);
//        PromptSupport.setPrompt(" Password", passwordField);
//        PromptSupport.setPrompt(" Phone Number", phoneNoField);
//        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, firstNameText);
//        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, lastNameText);
//        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, userNameText);
//        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, passwordField);
//        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, phoneNoField);
        genderGroup = new ButtonGroup();
        genderGroup.add(MaleB);
        genderGroup.add(FemaleB);
        setLists();
        //signin = new SignIn();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpP = new javax.swing.JPanel();
        InnerSignUpP = new NewJPanel("MainBackgnd.jpg");
        NameP = new NewJPanel("MainBackgnd.jpg");
        lastNameText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SignUpL = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        BirthDayP = new NewJPanel("MainBackgnd.jpg");
        monthList = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        yearList = new javax.swing.JComboBox();
        dayList = new javax.swing.JComboBox();
        nameRequiredLabel = new javax.swing.JLabel();
        userNameRequiredLabel = new javax.swing.JLabel();
        passwdRequiredLabel = new javax.swing.JLabel();
        YearRequiredLabel = new javax.swing.JLabel();
        GenderP = new NewJPanel("MainBackgnd.jpg");
        MaleB = new javax.swing.JRadioButton();
        FemaleB = new javax.swing.JRadioButton();
        genderRequiredLabel = new javax.swing.JLabel();
        CountryP = new javax.swing.JPanel();
        countryKeyList = new javax.swing.JComboBox();
        phoneNoField = new javax.swing.JTextField();
        CreateAccountB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));
        setForeground(new java.awt.Color(102, 0, 102));
        setResizable(false);

        SignUpP.setBackground(new java.awt.Color(102, 0, 102));
        SignUpP.setLayout(new java.awt.BorderLayout());

        InnerSignUpP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        firstNameText.setToolTipText("");
        firstNameText.setToolTipText("first name");
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gisha", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        javax.swing.GroupLayout NamePLayout = new javax.swing.GroupLayout(NameP);
        NameP.setLayout(NamePLayout);
        NamePLayout.setHorizontalGroup(
            NamePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NamePLayout.createSequentialGroup()
                .addComponent(firstNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NamePLayout.setVerticalGroup(
            NamePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lastNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addGroup(NamePLayout.createSequentialGroup()
                .addGroup(NamePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SignUpL.setFont(new java.awt.Font("Gisha", 1, 36)); // NOI18N
        SignUpL.setForeground(new java.awt.Color(255, 255, 255));
        SignUpL.setText("Sign Up");

        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });

        monthList.setFocusable(false);
        monthList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthListActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Birthday");

        yearList.setFocusable(false);

        dayList.setFocusable(false);
        dayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BirthDayPLayout = new javax.swing.GroupLayout(BirthDayP);
        BirthDayP.setLayout(BirthDayPLayout);
        BirthDayPLayout.setHorizontalGroup(
            BirthDayPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BirthDayPLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monthList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dayList, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yearList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BirthDayPLayout.setVerticalGroup(
            BirthDayPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BirthDayPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(monthList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(yearList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dayList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nameRequiredLabel.setForeground(new java.awt.Color(204, 0, 0));
        nameRequiredLabel.setText("Your First Name Is Required");

        userNameRequiredLabel.setForeground(new java.awt.Color(204, 0, 0));
        userNameRequiredLabel.setText("Your User Name Is Required");
        userNameRequiredLabel.setToolTipText("");
        userNameRequiredLabel.setToolTipText("please enter your email");
        userNameRequiredLabel.setVisible(false);

        passwdRequiredLabel.setForeground(new java.awt.Color(204, 0, 0));
        passwdRequiredLabel.setText("Please Create A Password");
        passwdRequiredLabel.setVisible(false);

        YearRequiredLabel.setForeground(new java.awt.Color(204, 0, 0));
        YearRequiredLabel.setText("Year Is Required");
        YearRequiredLabel.setToolTipText("");
        YearRequiredLabel.setVisible(false);

        MaleB.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        MaleB.setText("Male");
        MaleB.setFocusable(false);
        MaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleBActionPerformed(evt);
            }
        });

        FemaleB.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        FemaleB.setText("Female");
        FemaleB.setFocusable(false);
        FemaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleBActionPerformed(evt);
            }
        });

        genderRequiredLabel.setFont(new java.awt.Font("Gisha", 1, 12)); // NOI18N
        genderRequiredLabel.setForeground(new java.awt.Color(255, 0, 0));
        genderRequiredLabel.setText("Gender Is Required");
        genderRequiredLabel.setVisible(false);

        javax.swing.GroupLayout GenderPLayout = new javax.swing.GroupLayout(GenderP);
        GenderP.setLayout(GenderPLayout);
        GenderPLayout.setHorizontalGroup(
            GenderPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenderPLayout.createSequentialGroup()
                .addGroup(GenderPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenderPLayout.createSequentialGroup()
                        .addComponent(MaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FemaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genderRequiredLabel))
                .addContainerGap())
        );
        GenderPLayout.setVerticalGroup(
            GenderPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenderPLayout.createSequentialGroup()
                .addGroup(GenderPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FemaleB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderRequiredLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        countryKeyList.setFocusable(false);

        javax.swing.GroupLayout CountryPLayout = new javax.swing.GroupLayout(CountryP);
        CountryP.setLayout(CountryPLayout);
        CountryPLayout.setHorizontalGroup(
            CountryPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountryPLayout.createSequentialGroup()
                .addComponent(countryKeyList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CountryPLayout.setVerticalGroup(
            CountryPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountryPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(countryKeyList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CreateAccountB.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        CreateAccountB.setText("Create Account");
        CreateAccountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        jLabel6.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name");

        jLabel7.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");

        jLabel10.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User Name");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("*");

        jLabel12.setFont(new java.awt.Font("Gisha", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*A Required Field");

        javax.swing.GroupLayout InnerSignUpPLayout = new javax.swing.GroupLayout(InnerSignUpP);
        InnerSignUpP.setLayout(InnerSignUpPLayout);
        InnerSignUpPLayout.setHorizontalGroup(
            InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerSignUpPLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(CreateAccountB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(InnerSignUpPLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerSignUpPLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(InnerSignUpPLayout.createSequentialGroup()
                        .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SignUpL, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthDayP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(passwdRequiredLabel)
                            .addComponent(nameRequiredLabel)
                            .addComponent(YearRequiredLabel)
                            .addGroup(InnerSignUpPLayout.createSequentialGroup()
                                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NameP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)))
                            .addComponent(jLabel10)
                            .addGroup(InnerSignUpPLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InnerSignUpPLayout.createSequentialGroup()
                                    .addComponent(CountryP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(GenderP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userNameRequiredLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(67, 67, 67))))
        );
        InnerSignUpPLayout.setVerticalGroup(
            InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerSignUpPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InnerSignUpPLayout.createSequentialGroup()
                        .addComponent(SignUpL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14))
                    .addGroup(InnerSignUpPLayout.createSequentialGroup()
                        .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(nameRequiredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(userNameRequiredLabel)
                .addGap(4, 4, 4)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwdRequiredLabel)
                .addGap(18, 18, 18)
                .addComponent(BirthDayP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YearRequiredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addGroup(InnerSignUpPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CountryP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addComponent(CreateAccountB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        nameRequiredLabel.setToolTipText("please enter your First name");
        nameRequiredLabel.setVisible(false);

        SignUpP.add(InnerSignUpP, java.awt.BorderLayout.CENTER);

        getContentPane().add(SignUpP, java.awt.BorderLayout.CENTER);

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
        
        this.dispose();
        SignIn signin = new SignIn();
        signin.show();
    }//GEN-LAST:event_CreateAccountBActionPerformed

    private void FemaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleBActionPerformed
     public static void main(String args[]) {
        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
          @Override
          public void run() {
              new SignUp().setVisible(true);
          }
     });
     }
    private javax.swing.ButtonGroup genderGroup;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
        for (int i = 2015; i >= 1900; i--) {
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
            "39", "58", "84", "681", "967", "260", "263"};

        String[] countryCodes = {"AF", "AL", "DZ", "AD", "AO",
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


        for (int i = 0; i < countryCodes.length; i++) {
            countryKeyList.addItem(countryCodes[i] + " +" + countryAreaCodes[i]);
        }


    }

    public String getFirstNameText() {
        return firstNameText.getText();
    }

    public String getLastNameText() {
        return lastNameText.getText();
    }

    public String getUserNameText() {
        return userNameText.getText();
    }

    public char[] getPassword() {
        return passwordField.getPassword();
    }

    public String getMonthList() {
        return (String) monthList.getSelectedItem();
    }

    public String getDayList() {
        return (String) dayList.getSelectedItem();
    }

    public String getYearList() {
        return (String) yearList.getSelectedItem();
    }

    public String getGender() {
        //return genderGroup.gets;
        if (MaleB.isSelected()) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public String getCountry() {
        return (String) countryKeyList.getSelectedItem();
    }

    public String getPhoneNo() {
        return phoneNoField.getText();
    }

    public JButton getCreateAccountButton() {
        return CreateAccountB;
    }

    public void setNameRequiredLabel(boolean b) {
        nameRequiredLabel.setVisible(b);
    }

    public void setUserNameRequiredLabel(boolean b, int mode) {
        userNameRequiredLabel.setVisible(b);
        if (mode == 1) {//mode 1 for null
            userNameRequiredLabel.setText("Your User Name Is Required");
        } else if (mode == 2) {//mode 2 for wrong input
            userNameRequiredLabel.setText("Invalid User name");
        }
    }

    public void setPasswordRequiredRequiredLabel(boolean b, int mode) {
        passwdRequiredLabel.setVisible(b);
        if (mode == 1) {//mode 1 for null
            passwdRequiredLabel.setText("Your Password Is Required");
        } else if (mode == 2) {//mode 2 for wrong input
            passwdRequiredLabel.setText("Invalid Password");
        }
    }

    public void setYearRequiredLabel(boolean b) {
        YearRequiredLabel.setVisible(b);
    }

    public void setGenderRequiredLabel(boolean b) {
        genderRequiredLabel.setVisible(b);
    }

    public UserData getAllData() {
        UserData obj = new UserData();
        obj.setFirstName(firstNameText.getText());
        obj.setLastName(lastNameText.getText());
        obj.setUserName(userNameText.getText());
        obj.setPassword(passwordField.getText());
        obj.setPhoneNumber(phoneNoField.getText());
        String BirthDate = (String) monthList.getSelectedItem() + dayList.getSelectedItem() + yearList.getSelectedItem();
        obj.setBirthDate(BirthDate);
        obj.setGender(this.getGender());
        return obj;
    }
}
