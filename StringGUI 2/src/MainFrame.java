import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 * CIT 111 Intro to Programming 
 * Assignment 11 
 * 11/30/2014 
 * Author: Garrett Cooper
 * String GUI Calculator v1.02
 */

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInputString = new javax.swing.JTextField();
        btnLength = new javax.swing.JButton();
        btnVowels = new javax.swing.JButton();
        btnUpCase = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("String GUI Calculator v1.02");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("String GUI Calculator v1.02");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Please enter a word: ");

        btnLength.setBackground(new java.awt.Color(255, 0, 0));
        btnLength.setText("# of Characters");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnVowels.setBackground(new java.awt.Color(0, 255, 51));
        btnVowels.setText("# of Vowels");
        btnVowels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVowelsActionPerformed(evt);
            }
        });

        btnUpCase.setBackground(new java.awt.Color(0, 255, 255));
        btnUpCase.setText("# of Upper Case");
        btnUpCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpCaseActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel3.setText("Counts the number of characters in word");

        txtBox.setColumns(20);
        txtBox.setRows(5);
        txtBox.setText("The String GUI Calculator provides you with the ability to count the number of characters in a \nword ('# of Characters'), the number of vowels in a word ('# of Vowels'), and the number of \nupper case letters in a word ('# of Upper Case'). \n\nWhen you have completed analyzing a word, please clear the word entered by selecting the \n'Clear' button and try analyzing another word. \n\nYou may also terminate the program at anytime by selecting the 'Quit' button. ");
        txtBox.setCaretPosition(0);
        jScrollPane1.setViewportView(txtBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnVowels, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnUpCase))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addGap(39, 39, 39)
                                .addComponent(btnQuit)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, 0, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtInputString, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLength, btnUpCase, btnVowels});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnQuit});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInputString, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVowels)
                        .addComponent(btnUpCase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLength, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnQuit))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLength, btnUpCase, btnVowels});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnQuit});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("null")
    private void btnUpCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpCaseActionPerformed
        // assigned to the '# of Upper Case' button 
        // private event handler class that counts the upper case letters in a string 

        // declares variables to be used in class
        String inputString; // variable that stores string input
        String trimInputString; // variable that holds trim version of 'inputString'
        String upperCase = ""; // variable that holds any/all upper case characters
        char tempChar; // temporary variable used in 'for loop' and to perform ASCII upper case test
        int indexInputString; // variable used to determine if there are any spaces in a string
        int countStringLength; // variable used to determine if there is a null value
        boolean allChar; // variable used to determine if there are any non-characters in string

        inputString = txtInputString.getText(); // passes user-entered string to 'inputString'
        trimInputString = inputString.trim(); // trims user-entered string
        allChar = trimInputString.matches("[a-zA-Z]+"); // assigns all plausible (true) character values to 'hasNonChar'
        indexInputString = trimInputString.indexOf(" "); // searches for any spaces in user-entered string
        countStringLength = inputString.length(); // counts length of user-entered string

        // try/catch block to handle possible exceptions...
        try {
            if (indexInputString != -1) { // more than one word...
                throw new InputMismatchException();
            } else if (countStringLength < 1) { // no string, or a null entry...
                throw new Exception();
            } else if (!allChar) { //any non-characters...
                throw new IllegalArgumentException();
            }
        } // if so, the following catches are thrown...  
          catch (InputMismatchException ime) {
            // catches any cases where more than one word is entered
            JOptionPane.showMessageDialog(null, "Please enter just one word.");
            // breaks out of the try/catch block
            return;
        } catch (IllegalArgumentException iae) {
            // catches any cases where a non-character was entered in the string
            JOptionPane.showMessageDialog(null, "Please enter a word with chracters-only.");
            // breaks out of the try/catch block
            return;
        } catch (Exception e) {
            // catches any cases where the user entered no string, or a null entry
            JOptionPane.showMessageDialog(null, "Please enter a word.");
            // breaks out of the try/catch block
            return;
        }

        // 'for loop' passes each character in the 'trimInputString' to 
        // 'tempChar' and passes any upper case characters to the 
        // 'upperCase' variable based on whether or not the characters
        //  are ASCII decimal values 65-90.  
        //  FYI: ASCII decimal values are capital letters A-Z.
        for (int i = 0; i < countStringLength; i++) {
            tempChar = trimInputString.charAt(i); 
            if (tempChar >= 65 && tempChar <= 90) {
                upperCase += tempChar;
            }
        }

        // outputs to the user the count [or length] of the 'upperCase' string, which gives
        // us the total number of upper case letters in the 'inputString'
        JOptionPane.showMessageDialog(null, "The number of upper case characters in '" + inputString
                + "' = " + upperCase.length(), "Upper Case Counter Result", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnUpCaseActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        // assigned to the '# of Characters' button 
        // private event handler class that counts the number of characters in a string 

        // declares variables to be used in class
        String inputString; // variable that stores string input
        String trimInputString; // variable that holds trim version of 'inputString'
        int indexInputString; // variable used to determine if there are any spaces in a string
        int countStringLength; // variable used to determine if there is a null value
        boolean allChar; // variable used to determine if there are any non-characters in string

        inputString = txtInputString.getText(); // passes user-entered string to 'inputString'
        trimInputString = inputString.trim(); // trims user-entered string
        allChar = trimInputString.matches("[a-zA-Z]+"); // assigns all plausible (true) character values to 'hasNonChar'
        indexInputString = trimInputString.indexOf(" "); // searches for any spaces in user-entered string
        countStringLength = inputString.length(); // counts length of user-entered string
        
        // try/catch block to handle possible exceptions...
        try {
            if (indexInputString != -1) { // more than one word...
                throw new InputMismatchException();
            } else if (countStringLength < 1) { // no string, or a null entry...
                throw new Exception();
            } else if (!allChar) { //any non-characters...
                throw new IllegalArgumentException();
            }
        } // if so, the following catches are thrown...  
          catch (InputMismatchException ime) {
            // catches any cases where more than one word is entered
            JOptionPane.showMessageDialog(null, "Please enter just one word.");
            // breaks out of the try/catch block
            return;
        } catch (IllegalArgumentException iae) {
            // catches any cases where a non-character was entered in the string
            JOptionPane.showMessageDialog(null, "Please enter a word with chracters-only.");
            // breaks out of the try/catch block
            return;
        } catch (Exception e) {
            // catches any cases where the user entered no string, or a null entry
            JOptionPane.showMessageDialog(null, "Please enter a word.");
            // breaks out of the try/catch block
            return;
        }
        
        // outputs to the user the count [or length] of chracters in the string
        JOptionPane.showMessageDialog(null, "The number of characters in '" + inputString
                + "' = " + countStringLength, "Character Counter Result", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // assigned to the 'Clear' button 
        // clears all user entered content/values if selected
        txtInputString.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // assigned to the 'Quit' button
        // exits the program, but only after confirming with the user
        int answer;
        // displays to the user a message asking if you want to exit the program
        // clicking 'Yes' will close the program; 'No' will continue running it
        answer = JOptionPane.showConfirmDialog(null, "Are you you want to exit?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (answer == JOptionPane.YES_OPTION) {
            this.dispose(); // gets rid of form
        }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnVowelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVowelsActionPerformed
        // assigned to the '# of Vowels' button 
        // private event handler class that counts the vowel letters in a string 

        // declares variables to be used in class
        String inputString; // variable that stores string input
        String trimInputString; // variable that holds trim version of 'inputString'
        int count = 0; // variable that is used to count the number of vowels in a string
        int indexInputString; // variable used to determine if there are any spaces in a string
        int countStringLength; // variable used to determine if there is a null value
        boolean allChar; // variable used to determine if there are any non-characters in string
        
        inputString = txtInputString.getText(); // passes user-entered string to 'inputString'
        trimInputString = inputString.trim(); // trims user-entered string
        allChar = trimInputString.matches("[a-zA-Z]+"); // assigns all plausible (true) character values to 'hasNonChar'
        indexInputString = trimInputString.indexOf(" "); // searches for any spaces in user-entered string
        countStringLength = inputString.length(); // counts length of user-entered string
        
        // try/catch block to handle possible exceptions...
        try {
            if (indexInputString != -1) { // more than one word...
                throw new InputMismatchException();
            } else if (countStringLength < 1) { // no string, or a null entry...
                throw new Exception();
            } else if (!allChar) { //any non-characters...
                throw new IllegalArgumentException();
            }
        } // if so, the following catches are thrown...  
          catch (InputMismatchException ime) {
            // catches any cases where more than one word is entered
            JOptionPane.showMessageDialog(null, "Please enter just one word.");
            // breaks out of the try/catch block
            return;
        } catch (IllegalArgumentException iae) {
            // catches any cases where a non-character was entered in the string
            JOptionPane.showMessageDialog(null, "Please enter a word with chracters-only.");
            // breaks out of the try/catch block
            return;
        } catch (Exception e) {
            // catches any cases where the user entered no string, or a null entry
            JOptionPane.showMessageDialog(null, "Please enter a word.");
            // breaks out of the try/catch block
            return;
        }
        
        // 'for loop' that increments the counter, 'count', if a character in the 
        // 'inputString' is a lower case or upper case vowel (A, E, I, O, and U)
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A') {
                count++;
            } else if (inputString.charAt(i) == 'e' || inputString.charAt(i) == 'E') {
                count++;
            } else if (inputString.charAt(i) == 'i' || inputString.charAt(i) == 'I') {
                count++;
            } else if (inputString.charAt(i) == 'o' || inputString.charAt(i) == 'O') {
                count++;
            } else if (inputString.charAt(i) == 'u' || inputString.charAt(i) == 'U') {
                count++;
            }
        }
        
        // outputs to the user the number of vowels [using 'count'] in a string
        JOptionPane.showMessageDialog(null, "The number of vowels in '" + inputString
                + "' = " + count, "Vowel Counter Result", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnVowelsActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLength;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnUpCase;
    private javax.swing.JButton btnVowels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBox;
    private javax.swing.JTextField txtInputString;
    // End of variables declaration//GEN-END:variables
}
