import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CurrencyConverter {
    public static void converter() {
        String[] Options1 = { "01. GBP (Pound Sterling £)", "02. CAD (Canadian Dollar $)", "03. CNY (Chinese Yuan ¥)",
                              "04. EUR (Euro €)", "05. INR (Indian Rupee ₹)", "06. KWD (Kuwaiti Dinar د.ك)",
                              "07. RUB (Russian Rubel ₽)", "08. SAR (Saudi Riyal ر.س)", "09. SGD (Singapore Dollar $)",
                              "10. KRW (South Korean Won ₩)", "11. CHF (Swiss Franc ₣)", "12. USD (US Dollar $)" };
        String[] Options2 = { "01. GBP (Pound Sterling £)", "02. CAD (Canadian Dollar $)", "03. CNY (Chinese Yuan ¥)",
                              "04. EUR (Euro €)", "05. INR (Indian Rupee ₹)", "06. KWD (Kuwaiti Dinar د.ك)",
                              "07. RUB (Russian Rubel ₽)", "08. SAR (Saudi Riyal ر.س)", "09. SGD (Singapore Dollar $)",
                              "10. KRW (South Korean Won ₩)", "11. CHF (Swiss Franc ₣)", "12. USD (US Dollar $)" };
        JFrame f = new JFrame("CONVERTER");
        JLabel l1, l2, l3;
        l1 = new JLabel("From", SwingConstants.CENTER);
        l1.setBounds(25, 20, 200, 40);
        l2 = new JLabel("To", SwingConstants.CENTER);
        l2.setBounds(275, 20, 200, 40);
        l3 = new JLabel("Exchange Rates as of 26/12/2022");
        l3.setBounds(300, 235, 200, 40);
        JTextField t1, t2;
        t1 = new JTextField("0");
        t1.setBounds(25, 110, 200, 40);
        t2 = new JTextField("0");
        t2.setBounds(275, 110, 200, 40);
        t2.setEditable(false);
        JButton b;
        b = new JButton("Convert");
        b.setBounds(200, 175, 100, 40);
        JComboBox<String> jComboBox1 = new JComboBox<>(Options1);
        jComboBox1.setBounds(25, 60, 200, 40);
        JComboBox<String> jComboBox2 = new JComboBox<>(Options2);
        jComboBox2.setBounds(275, 60, 200, 40);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str1 = t1.getText();
                double d = Double.parseDouble(str1);
                if (jComboBox1.getSelectedIndex() == 0) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 1.64;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 8.4;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 1.13;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 99.83;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.37;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 82.5;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 4.54;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 1.63;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 1539.09;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 1.13;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 1.21;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 1) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.61;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 5.12;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.69;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 60.9;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.23;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 50.32;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 2.77;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 0.99;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 937.93;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.69;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 0.74;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 2) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.12;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 0.19;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.14;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 11.88;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.044;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 9.82;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 0.54;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 0.19;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 183.2;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.13;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 0.14;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                }
                }
                else if (jComboBox1.getSelectedIndex() == 3) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.88;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 1.44;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 7.42;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 87.91;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.33;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 72.68;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 4;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 1.43;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 1355.87;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.99;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 1.06;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 4) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.01;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 0.016;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 0.084;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.011;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.0037;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 0.83;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 0.045;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 0.016;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 15.42;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.011;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 0.012;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 5) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 2.71;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 4.43;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 22.73;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 3.07;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 269.93;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 223.16;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 12.27;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 4.4;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 4163.37;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 3.04;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 3.26;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 6) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.012;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 0.02;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 0.1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.014;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 1.21;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.0045;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 0.055;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 0.02;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 18.66;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.014;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 0.015;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 7) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.22;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 0.36;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 1.85;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.25;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 22.01;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.081;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 18.18;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 0.36;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 339.19;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.25;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 0.27;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 8) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.62;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 1.01;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 5.17;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.7;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 61.35;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.23;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 50.72;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 2.79;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 946.39;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.69;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 0.74;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 9) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.00065;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 0.0011;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 0.0055;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.00074;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 0.065;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.00024;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 0.054;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 0.0029;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 0.0011;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.00073;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 0.00078;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 10) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.89;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 1.46;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 7.47;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 1.01;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 88.67;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.33;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 73.31;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 4.03;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 1.45;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 1367.78;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 1.07;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
                else if (jComboBox1.getSelectedIndex() == 11) {
                    if (jComboBox2.getSelectedIndex() == 0) {
                        double d1 = d * 0.83;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 1) {
                        double d1 = d * 1.36;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 2) {
                        double d1 = d * 6.96;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 3) {
                        double d1 = d * 0.94;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 4) {
                        double d1 = d * 82.7;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 5) {
                        double d1 = d * 0.31;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 6) {
                        double d1 = d * 68.37;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 7) {
                        double d1 = d * 3.76;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 8) {
                        double d1 = d * 1.35;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 9) {
                        double d1 = d * 1275.45;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 10) {
                        double d1 = d * 0.93;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                    else if (jComboBox2.getSelectedIndex() == 11) {
                        double d1 = d * 1;
                        String str2 = Double.toString(d1);
                        t2.setText(str2);
                    }
                }
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(jComboBox1);
        f.add(jComboBox2);
        f.setLayout(null);
        f.setSize(500,300);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        converter();
    }
}