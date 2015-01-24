/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChatPage.java
 *
 * Created on Jan 18, 2015, 12:41:26 AM
 */
package ITI.Messenger;


import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jdesktop.xswingx.PromptSupport;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;

import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Radwa Hassan Salah
 */
public class ChatPage extends JFrame {

    /** Creates new form ChatPage */
    public ChatPage() {
        initComponents();
        try {
            UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);

        ChatTextArea.setEditable(false);

        ImageIcon sendFileIcon = new ImageIcon("envelope4.png");
        SendFileButton.setIcon(sendFileIcon);

        ImageIcon formatIcon = new ImageIcon("font2.png");
        FormatButton.setIcon(formatIcon);

        ImageIcon sendIcon = new ImageIcon("share14.png");
        SendButton.setIcon(sendIcon);

        ImageIcon FriendProfilePic = new ImageIcon("FriendProfilePic.jpg");
        FriendProfilePicLabel.setIcon(FriendProfilePic);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new NewJPanel("MainBackgnd.jpg");
        FriendNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChatTextArea = new javax.swing.JTextArea();
        FriendProfilePicLabel = new javax.swing.JLabel();
        FormatButton = new javax.swing.JButton();
        SendFileButton = new javax.swing.JButton();
        ChatTextField = new javax.swing.JTextField();
        SendButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Page");

        FriendNameLabel.setFont(new java.awt.Font("Gisha", 1, 24));
        FriendNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FriendNameLabel.setText("Christina");

        ChatTextArea.setColumns(20);
        ChatTextArea.setRows(5);
        ChatTextArea.setName(""); // NOI18N
        ChatTextArea.setPreferredSize(new java.awt.Dimension(50, 50));
        jScrollPane1.setViewportView(ChatTextArea);

        FormatButton.setFont(new java.awt.Font("Gisha", 1, 14));
        FormatButton.setText("Format");

        SendFileButton.setFont(new java.awt.Font("Gisha", 1, 14));
        SendFileButton.setText("Send File");

        SendButton.setFont(new java.awt.Font("Gisha", 1, 14));
        SendButton.setText("Send");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(FriendNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(ChatTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SendButton))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(FormatButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SendFileButton)
                                        .addGap(153, 153, 153))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(FriendProfilePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(FriendNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FriendProfilePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FormatButton)
                    .addComponent(SendFileButton))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SendButton)
                    .addComponent(ChatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Conversation");

        jMenuItem8.setText("New");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Close");
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Cut");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Copy");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Paste");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Delete");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Select All");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        jMenuItem10.setText("Display Friend Image");
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Actions");

        jMenuItem7.setText("Send File");
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        jMenuItem6.setText("About Messenger");
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SendButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ChatPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ChatTextArea;
    private javax.swing.JTextField ChatTextField;
    private javax.swing.JButton FormatButton;
    private javax.swing.JLabel FriendNameLabel;
    private javax.swing.JLabel FriendProfilePicLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton SendButton;
    private javax.swing.JButton SendFileButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}