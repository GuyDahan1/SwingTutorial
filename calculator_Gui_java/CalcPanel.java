package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class CalcPanel extends JPanel implements ActionListener {

    private final String backspaceString = "<html><font color=red>Backspace</font></html>";
    private OperatorPanel operatorPanel;
    private JButton backspaceBtn;
    private OperandPanel operandPanel;
    private JTextField ansTextField;
    boolean firstOprand = false;
    boolean secondOprand = false;
    boolean vaildOp = false;
    boolean oneOp = false;
    boolean ansTrue = false;
    String ansString, op, firstOprandString, secondOprandString;
    double x, y, ans;
    boolean firstOprandNeg = false;
    boolean secondOprandNeg = false;

    public void restCalc() {
        firstOprand = false;
        secondOprand = false;
        vaildOp = false;
        oneOp = false;
        op = "";
        firstOprandString = "";
        secondOprandString = "";
        x = 0;
        y = 0;
    }


    public CalcPanel() {
        x = 0;
        y = 0;
        operatorPanel = new OperatorPanel();
        operandPanel = new OperandPanel();
        backspaceBtn = new JButton(backspaceString);
        ansTextField = new JTextField(25);
        setLayout(new GridBagLayout());
        initAction();
        GridBagConstraints gc = new GridBagConstraints();
        ansString = "";
        firstOprandString = "";
        secondOprandString = "";


        /////////TextField///////////
        gc.weightx = 0;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.NORTH;
        gc.insets = new Insets(5, 0, 0, 0);
        add(ansTextField, gc);
        /////////BackspaceBtn///////////
        gc.gridx = 0;

        gc.gridy = 1;
        //gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(backspaceBtn, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(-26, -210, 0, 0);
        add(operatorPanel, gc);


        gc.gridx = 0;
        gc.gridy = 2;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(operandPanel, gc);


    }


    public OperandPanel getOperandPanel() {
        return operandPanel;
    }

    public OperatorPanel getOperatorPanel() {
        return operatorPanel;
    }

    public JButton getBackspaceBtn() {
        return backspaceBtn;
    }


    public JTextField getAnsTextField() {
        return ansTextField;
    }

    public void initAction() {
        backspaceBtn.addActionListener(this);
        ansTextField.addActionListener(this);
        for (int i = 0; i < 12; i++) {
            if (i < 10) {
                operatorPanel.getOperatorBtn(i).addActionListener(this);
            }
            operandPanel.getOperandBtn(i).addActionListener(this);
        }
    }


    // YOUR CODINGS HEAR PLZ

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            if ((JButton) e.getSource() == backspaceBtn) {
                try {
                    ansString = ansString.substring(0, ansString.length() - 1);
                    ansTextField.setText(ansString);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } else {
                try {
                    String Click = ((JButton) e.getSource()).getText();
                    switch (Click) {
                        case ".":
                            if (!firstOprand) {
                                if (!firstOprandString.contains(".")) {
                                    firstOprandString = firstOprandString + Click;
                                    ansString = ansString + Click;
                                    ansTextField.setText(ansString);
                                } else {
                                    ansTextField.setText("Syntax Error");
                                }
                            } else if (!secondOprand) {
                                if (!secondOprandString.contains(".")) {
                                    secondOprandString = secondOprandString + Click;
                                    ansString = ansString + Click;
                                    ansTextField.setText(ansString);
                                } else {
                                    ansTextField.setText("Syntax Error");
                                }

                            }
                            break;
                        case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9":
                            if (x == 0 && Click == "0" && firstOprandString == "" || firstOprand && secondOprandString == "" && Click == "0") {
                                break;
                            } else {
                                if (!firstOprand) {
                                    if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
                                        ansTextField.setText("Overflow");
                                    }
                                    firstOprandString = firstOprandString + Click;
                                    ansString = ansString + Click;
                                    ansTextField.setText(ansString);
                                } else if (firstOprand && !secondOprand) {
                                    if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
                                        ansTextField.setText("Overflow");
                                    }
                                    secondOprandString = secondOprandString + Click;
                                    ansString = ansString + Click;
                                    ansTextField.setText(ansString);
                                }
                                break;

                            }
                        case "C", "CE":
                            restCalc();
                            ansString = "";
                            ansTextField.setText(ansString);
                            break;
                        case "=":
                            if (op == "sqrt" && oneOp) {
                                y = Double.parseDouble(secondOprandString);
                                ans = Math.sqrt(y);
                                ansString = String.valueOf(ans);
                                ansTextField.setText(ansString);
                                restCalc();
                                break;
                            } else if (op == "1/x" && oneOp) {
                                y = Double.parseDouble(secondOprandString);
                                ans = 1 / y;
                                ansTextField.setText(String.valueOf(ans));
                                restCalc();
                                break;
                            }
                            if (firstOprand && vaildOp) {
                                secondOprand = true;
                                y = Double.parseDouble(secondOprandString);
                                vaildExp();
                                ansTextField.setText(ansString);
                                restCalc();

                            } else {
                                ansString = "";
                                ansTextField.setText("Syntax Error");
                            }
                            break;
                        case "sqrt":
                            ansString = "sqrt>";
                            ansTextField.setText(ansString);
                            op = "sqrt";
                            oneOp = true;
                            firstOprand = true;
                            break;
                        case "1/x":
                            ansString = "1/x>";
                            ansTextField.setText(ansString);
                            op = "1/x";
                            oneOp = true;
                            firstOprand = true;
                            break;
                        case "*", "+", "%", "/", "-":
                            if (vaildOp) {
                                if (firstOprandString != "" && secondOprandString != "") {
                                    secondOprand = true;
                                    y = Double.parseDouble(secondOprandString);
                                    vaildExp();
                                    ansTextField.setText(ansString);
                                    restCalc();
                                }
                            }
                            if (ansTrue) {
                                x = ans;
                                firstOprand = true;
                                firstOprandString = String.valueOf(x);
                            }
                            if (firstOprandString != "") {
                                firstOprand = true;
                                x = Double.parseDouble(firstOprandString);
                                op = Click;
                                vaildOp = true;
                                ansString = ansString + op;
                                ansTextField.setText(ansString);
                            } else {
                                ansTextField.setText("Syntax Error");
                                restCalc();
                            }
                            break;
                        case "+/-":
                            if (!firstOprand) {
                                if (!firstOprandNeg) {
                                    firstOprandString = "-" + firstOprandString;
                                    ansString = "-" + ansString;
                                    firstOprandNeg = true;

                                    ansTextField.setText(ansString);
                                } else {
                                    firstOprandString = firstOprandString.substring(1);
                                    ansString = ansString.substring(1);
                                    firstOprandNeg = false;
                                    ansTextField.setText(ansString);
                                }
                            }else{
                                if (!secondOprandNeg) {
                                    secondOprandString = "-" + secondOprandString;
                                    ansString = firstOprandString + op + secondOprandString;
                                    secondOprandNeg = true;
                                    ansTextField.setText(ansString);
                                } else {
                                    secondOprandString = secondOprandString.substring(1);
                                    ansString = firstOprandString + op + secondOprandString;
                                    secondOprandNeg = false;
                                    ansTextField.setText(ansString);
                                }
                            }

                    }

                } catch (Exception ex) {
                    ansTextField.setText("Error");
                }
            }
        }

    }

    public void vaildExp() {
        switch (op) {
            case "+":
                ans = x + y;
                ansString = String.valueOf(ans);
                ansTrue = true;
                break;
            case "-":
                ans = x - y;
                ansString = String.valueOf(ans);
                ansTrue = true;
                break;
            case "*":
                ans = x * y;
                ansString = String.valueOf(ans);
                ansTrue = true;
                break;
            case "/":
                if (y == 0) {
                    ansTextField.setText("Syntax Error");
                } else {
                    ans = x / y;
                    ansString = String.valueOf(ans);
                    ansTrue = true;
                    break;
                }
            case "%":
                ans = x % y;
                ansString = String.valueOf(ans);
                ansTrue = true;
                break;
            default:
                ansTextField.setText("Syntax Error");

        }
    }

}
