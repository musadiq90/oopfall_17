package practice;

public class Calculator extends javax.swing.JFrame {

    double firstNum;
    double secondNum;
    double result;
    String operations;

    public Calculator() {
        initComponents();
    }



    private void initComponents() {

        jTxtDisplay = new javax.swing.JTextField();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jB11 = new javax.swing.JButton();
        jB12 = new javax.swing.JButton();
        jB13 = new javax.swing.JButton();
        jB14 = new javax.swing.JButton();
        jB15 = new javax.swing.JButton();
        jB16 = new javax.swing.JButton();
        jB17 = new javax.swing.JButton();
        jB18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB9.setText("*");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB10.setText("+/-");
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });

        jB11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB11.setText(".");
        jB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB11ActionPerformed(evt);
            }
        });

        jB12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB12.setText("9");
        jB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB12ActionPerformed(evt);
            }
        });

        jB13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB13.setText("0");
        jB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB13ActionPerformed(evt);
            }
        });

        jB14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB14.setText("+");
        jB14.setToolTipText("");
        jB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB14ActionPerformed(evt);
            }
        });

        jB15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB15.setText("-");
        jB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB15ActionPerformed(evt);
            }
        });

        jB16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB16.setText("/");
        jB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB16ActionPerformed(evt);
            }
        });

        jB17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB17.setText("=");
        jB17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB17ActionPerformed(evt);
            }
        });

        jB18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB18.setText("c");
        jB18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jB15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jB18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jB16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jB11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jB17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jB16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jB18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB3.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB1.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB2.getText();
        jTxtDisplay.setText(enterNumber);
// TODO add your handling code here:
    }

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB4.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB5.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB6.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB7.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB8.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB12ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB12.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB13ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB13.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB14ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "+";
    }

    private void jB15ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "-";
    }

    private void jB16ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "/";
    }

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "*";
    }

    private void jB11ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB11.getText();
        jTxtDisplay.setText(enterNumber);
    }

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = ops * (-1);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jB17ActionPerformed(java.awt.event.ActionEvent evt) {
        String answer;
        secondNum = Double.parseDouble(jTxtDisplay.getText());
        if(operations == "+"){
            result= firstNum + secondNum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        else if(operations == "-"){
            result= firstNum - secondNum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        else if(operations == "/"){
            result= firstNum / secondNum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        else if(operations == "*"){
            result= firstNum * secondNum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        else if(operations == "%"){
            result= firstNum % secondNum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
    }

    private void jB18ActionPerformed(java.awt.event.ActionEvent evt) {
        String enterNumber = jTxtDisplay.getText() +jB18.getText();
        jTxtDisplay.setText("");
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB13;
    private javax.swing.JButton jB14;
    private javax.swing.JButton jB15;
    private javax.swing.JButton jB16;
    private javax.swing.JButton jB17;
    private javax.swing.JButton jB18;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JTextField jTxtDisplay;
    // End of variables declaration
}
