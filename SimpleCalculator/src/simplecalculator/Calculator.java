/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simplecalculator;

/**
 *
 * @author nadim
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
        
    public void enable(){
        ScreenField.setText("");
        Label.setText("Previous Number:");
        num1=0;
        num2=0;
        action=' ';
        
        OffButton.setEnabled(true);
        OnButton.setEnabled(false);
        
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        Button8.setEnabled(true);
        Button9.setEnabled(true);
        Button0.setEnabled(true);
        
        ButtonMul.setEnabled(true);
        ButtonDiv.setEnabled(true);
        ButtonAdd.setEnabled(true);
        ButtonSub.setEnabled(true);
        ButtonEqual.setEnabled(true);
        ButtonDot.setEnabled(true);
        ButtonDel.setEnabled(true);
        ButtonC.setEnabled(true);
        ButtonPercent.setEnabled(true);
    }
    public void disable(){
        ScreenField.setText("");
        Label.setText("Previous Number:");
        num1=0;
        num2=0;
        action=' ';
        
        OnButton.setEnabled(true);
        OffButton.setEnabled(false);
        
        Button1.setEnabled(false);
        Button2.setEnabled(false);
        Button3.setEnabled(false);
        Button4.setEnabled(false);
        Button5.setEnabled(false);
        Button6.setEnabled(false);
        Button7.setEnabled(false);
        Button8.setEnabled(false);
        Button9.setEnabled(false);
        Button0.setEnabled(false);
        
        ButtonMul.setEnabled(false);
        ButtonDiv.setEnabled(false);
        ButtonAdd.setEnabled(false);
        ButtonSub.setEnabled(false);
        ButtonEqual.setEnabled(false);
        ButtonDot.setEnabled(false);
        ButtonDel.setEnabled(false);
        ButtonC.setEnabled(false);
        ButtonPercent.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Button4 = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        ButtonDel = new javax.swing.JButton();
        ButtonMul = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        Button9 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        ButtonSub = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ScreenField = new javax.swing.JTextField();
        Button1 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        ButtonEqual = new javax.swing.JButton();
        ButtonDiv = new javax.swing.JButton();
        ButtonDot = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        OnButton = new javax.swing.JRadioButton();
        OffButton = new javax.swing.JRadioButton();
        ButtonPercent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        setFont(new java.awt.Font("PT Mono", 1, 18)); // NOI18N
        setForeground(java.awt.Color.cyan);
        setLocation(new java.awt.Point(500, 200));
        setName("Calculator"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 204, 0));

        Button4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button4.setText("4");
        Button4.setPreferredSize(new java.awt.Dimension(80, 30));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        ButtonAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ButtonAdd.setText("+");
        ButtonAdd.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button6.setText("6");
        Button6.setPreferredSize(new java.awt.Dimension(80, 30));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        ButtonC.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ButtonC.setText("C");
        ButtonC.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button5.setText("5");
        Button5.setPreferredSize(new java.awt.Dimension(80, 30));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        ButtonDel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ButtonDel.setText("DEL");
        ButtonDel.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelActionPerformed(evt);
            }
        });

        ButtonMul.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ButtonMul.setText("*");
        ButtonMul.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMulActionPerformed(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button7.setText("7");
        Button7.setPreferredSize(new java.awt.Dimension(80, 30));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Label.setBackground(new java.awt.Color(0, 204, 153));
        Label.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Label.setForeground(new java.awt.Color(0, 204, 204));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label.setText("Previous Number:");

        Button9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button9.setText("9");
        Button9.setPreferredSize(new java.awt.Dimension(80, 30));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button8.setText("8");
        Button8.setPreferredSize(new java.awt.Dimension(80, 30));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        ButtonSub.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ButtonSub.setText("-");
        ButtonSub.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubActionPerformed(evt);
            }
        });

        Button0.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button0.setText("0");
        Button0.setPreferredSize(new java.awt.Dimension(80, 30));
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        ScreenField.setEditable(false);
        ScreenField.setBackground(new java.awt.Color(0, 153, 153));
        ScreenField.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        ScreenField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ScreenField.setCaretColor(new java.awt.Color(153, 255, 153));
        ScreenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScreenFieldActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button1.setText("1");
        Button1.setPreferredSize(new java.awt.Dimension(80, 30));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button3.setText("3");
        Button3.setPreferredSize(new java.awt.Dimension(80, 30));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Button2.setText("2");
        Button2.setPreferredSize(new java.awt.Dimension(80, 30));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        ButtonEqual.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ButtonEqual.setText("=");
        ButtonEqual.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualActionPerformed(evt);
            }
        });

        ButtonDiv.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ButtonDiv.setText("/");
        ButtonDiv.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivActionPerformed(evt);
            }
        });

        ButtonDot.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ButtonDot.setText(".");
        ButtonDot.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDotActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        buttonGroup1.add(OnButton);
        OnButton.setText("ON");
        OnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(OffButton);
        OffButton.setText("OFF");
        OffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OffButton)
                    .addComponent(OnButton))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(OffButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OnButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonPercent.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ButtonPercent.setText("%");
        ButtonPercent.setPreferredSize(new java.awt.Dimension(80, 30));
        ButtonPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPercentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScreenField)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScreenField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButtonDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(ButtonC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonMul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ButtonAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double num1,num2;
    char action;
    
    public void calculate(){
        switch(action){
            case '+':
                ScreenField.setText(Double.toString(num1+num2));
                break;
            case '-':
                ScreenField.setText(Double.toString(num1-num2));
                break;
            case '*':
                ScreenField.setText(Double.toString(num1*num2));
                break;
            case '/':
                if(num1==0)
                    ScreenField.setText("0");
                else
                    ScreenField.setText(Double.toString(num1/num2));
                break;
            case '=':
                ScreenField.setText(Double.toString(num1+num2));
                break;
            case '%':
                ScreenField.setText(Double.toString((num1*num2)*0.01));
                //num2% of num1=result;
                break;
        }
        
    }
        
    private void ButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelActionPerformed
        // TODO add your handling code here:
        if(ScreenField.getText().length()>0){
            StringBuilder s=new StringBuilder(ScreenField.getText());
            s.deleteCharAt(ScreenField.getText().length()-1);
            ScreenField.setText(s.toString());
        }
    }//GEN-LAST:event_ButtonDelActionPerformed

    private void ScreenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScreenFieldActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(" ");
    }//GEN-LAST:event_ScreenFieldActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"1");
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"2");
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"3");
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"4");
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"5");
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"6");
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"7");
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"8");
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"0");
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDotActionPerformed
        // TODO add your handling code here:
        if(ScreenField.getText().length()!=0)
            ScreenField.setText(ScreenField.getText()+".");
        else if(ScreenField.getText().length()==0)
            ScreenField.setText("0.");
    }//GEN-LAST:event_ButtonDotActionPerformed

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        // TODO add your handling code here:
        ScreenField.setText("");
        Label.setText("Previous Number:");
        num1=0;
        num2=0;
        action=' ';
    }//GEN-LAST:event_ButtonCActionPerformed

    private void OffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffButtonActionPerformed
        // TODO add your handling code here:
        disable();
    }//GEN-LAST:event_OffButtonActionPerformed

    private void OnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnButtonActionPerformed
        // TODO add your handling code here:
        enable();
    }//GEN-LAST:event_OnButtonActionPerformed

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(ScreenField.getText());
        Label.setText("Previous Number:  "+ScreenField.getText());
        action='+';
        ScreenField.setText("");
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void ButtonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMulActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(ScreenField.getText());
        Label.setText("Previous Number:  "+ScreenField.getText());
        action='*';
        ScreenField.setText("");
    }//GEN-LAST:event_ButtonMulActionPerformed

    private void ButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(ScreenField.getText());
        Label.setText("Previous Number:  "+ScreenField.getText());
        action='/';
        ScreenField.setText("");
    }//GEN-LAST:event_ButtonDivActionPerformed

    private void ButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(ScreenField.getText());
        Label.setText("Previous Number:  "+ScreenField.getText());
        action='-';
        ScreenField.setText("");
    }//GEN-LAST:event_ButtonSubActionPerformed

    private void ButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEqualActionPerformed
        // TODO add your handling code here:
        num2=Double.parseDouble(ScreenField.getText());
        if(num1==0 && (action=='/'))
            ScreenField.setText("0");
        else
            calculate();
        Label.setText("Result:");
        
    }//GEN-LAST:event_ButtonEqualActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        ScreenField.setText(ScreenField.getText()+"9");
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPercentActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(ScreenField.getText());
        Label.setText("Previous Number:  "+ScreenField.getText());
        action='%';
        ScreenField.setText("");
    }//GEN-LAST:event_ButtonPercentActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonDel;
    private javax.swing.JButton ButtonDiv;
    private javax.swing.JButton ButtonDot;
    private javax.swing.JButton ButtonEqual;
    private javax.swing.JButton ButtonMul;
    private javax.swing.JButton ButtonPercent;
    private javax.swing.JButton ButtonSub;
    private javax.swing.JLabel Label;
    private javax.swing.JRadioButton OffButton;
    private javax.swing.JRadioButton OnButton;
    private javax.swing.JTextField ScreenField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
