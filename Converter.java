import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Converter {
    void layout() {
        JLabel label = new JLabel();
        label.setText("TEMPERATURE CONVERTER");
        label.setBounds(300, 50, 350, 30);
        label.setOpaque(true);
        label.setFont(new Font("Gotham", Font.PLAIN, 20));
        JLabel label1=new JLabel();
        label1.setBounds(150,120,150,50);
        label1.setText("CelsiusToFahrenhit");
        label1.setOpaque(true);
        label1.setFont(new Font("Gotham",Font.PLAIN,10));
        JLabel label2=new JLabel();
        label2.setBounds(150,230,150,50);
        label2.setText("FahrenheitToCelsius");
        label2.setOpaque(true);
        label2.setFont(new Font("Gotham",Font.PLAIN,10));
        JLabel label3=new JLabel();
        label3.setText("Simple GUI temperature converter");
        label3.setBounds(750,500,250,50);
        label3.setFont(new Font("Georgia",Font.PLAIN,10));
        label3.setOpaque(true);



        JTextField field = new JTextField(10);
        field.setBounds(300, 125, 300, 50);
        field.setBackground(new Color(244, 239, 232));
        field.setVisible(true);
        JTextField field1 = new JTextField(10);
        field1.setBounds(615, 125, 300, 50);
        field1.setBackground(new Color(244, 239, 232));
        field1.setVisible(true);
        JTextField field2 = new JTextField(10);
        field2.setBounds(300, 225, 300, 50);
        field2.setBackground(new Color(244, 239, 232));
        field2.setVisible(true);
        JTextField field3 = new JTextField(10);
        field3.setBounds(615, 225, 300, 50);
        field3.setBackground(new Color(244, 239, 232));
        field3.setVisible(true);

        JButton button = new JButton();
        button.setBounds(565, 180, 80, 30);
        button.setBackground(new Color(174, 214, 220));
        button.setText("Convert");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button)
                {
                    double ctemp,ftemp;
                    if (field.isValid()) {
                        ctemp = Double.parseDouble(field.getText());
                        double CelciusToFahrenhit = (ctemp * 9 / 5) + 32;
                        field1.setText(String.valueOf(CelciusToFahrenhit));
                    }
                }
            }
        });

        JButton button1 = new JButton();
        button1.setBounds(565, 280, 80, 30);
        button1.setBackground(new Color(174, 214, 220));
        button1.setText("Convert");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button1)
                {
                    double ctemp,ftemp;
                    if (field2.isValid()) {
                        ftemp = Double.parseDouble(field2.getText());
                        double FahrenheitToCelsius = (ftemp-32)*5/9;
                        field3.setText(String.valueOf(FahrenheitToCelsius));
                    }
                }
            }
        });
        


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        frame.add(button);
        frame.add(button1);
        frame.add(field);
        frame.add(field1);
        frame.add(field2);
        frame.add(field3);
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
    }
}
