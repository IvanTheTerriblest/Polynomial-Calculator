package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private JTextField t1 = new JTextField();
   private JTextField t2 = new JTextField();

  private JButton add= new JButton();
    private JButton sub= new JButton();
    private  JButton mul= new JButton();
    private JButton div= new JButton();
    private JButton der= new JButton();
    private JButton integ= new JButton();

    private JLabel resultText = new JLabel();

    private JTextField result = new JTextField();

        public CalculatorView(){
            JLabel title = new JLabel();
            title.setText("Polynomial calculator");

            JLabel p1 = new JLabel();
            p1.setText("First polynom");

            JLabel p2 = new JLabel();
            p2.setText("Second polynom");


            resultText.setText("Result:");


            add.setText("Addition");


            sub.setText("Substract");


            mul.setText("Multiply");


            div.setText("Divide");


            der.setText("Derivative");


            integ.setText("Integrate");


            JPanel polinoame = new JPanel();
            polinoame.setBounds(0,40,300,60);
            polinoame.setLayout(new GridLayout(2,2,0,0));
            polinoame.add(p1);
            polinoame.add(t1);
            polinoame.add(p2);
            polinoame.add(t2);

            JPanel titlePanel = new JPanel();
            titlePanel.setBounds(0,0,500,60);
            titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            titlePanel.add(title);

            JPanel resultPanel = new JPanel();
            JScrollPane sp = new JScrollPane(result);
            sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            resultPanel.setBounds(0,130,350,40);
            resultPanel.setLayout(new GridLayout(1,1,0,0));
            resultPanel.add(resultText);
            resultPanel.add(sp);

            JPanel buttonsPanel = new JPanel();
            buttonsPanel.setBounds(0,200,500,250);
            buttonsPanel.setLayout(new GridLayout(3,3,0,0));
            buttonsPanel.add(add);
            buttonsPanel.add(sub);
            buttonsPanel.add(mul);
            buttonsPanel.add(div);
            buttonsPanel.add(der);
            buttonsPanel.add(integ);


            JFrame frame= new JFrame();

            JPanel window = new JPanel(new GridLayout(2,1));
            JPanel input = new JPanel(new GridLayout(3,2));
            //input.add()

            frame.setTitle("Polynomial Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setSize(500,500);
            frame.setVisible(true);
            frame.add(polinoame);
            frame.add(titlePanel);
            frame.add(resultPanel);
            frame.add(buttonsPanel);
            frame.setLocationRelativeTo(null);

        }

      public String getex1() {
        return t1.getText();
         }

    public String getex2() {
        return t2.getText();
    }

    void addAddListener(ActionListener aal) {
        add.addActionListener(aal);
    }

    void addSubListener(ActionListener aal) {
        sub.addActionListener(aal);
    }

    void addMulListener(ActionListener aal) {
        mul.addActionListener(aal);
    }

    void addDerListener(ActionListener aal) {
        der.addActionListener(aal);
    }

    void addIntegListener(ActionListener aal) {
        integ.addActionListener(aal);
    }

    void setTotal(String newTotal) {
        result.setText(newTotal);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
}
