package GUI;

import BusinessLogic.Operations;
import DataModels.Polynomial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private CalculatorView  m_view;


public Controller(CalculatorView view) {

        m_view = view;
        view.addAddListener(new AddListener());
        view.addSubListener(new SubListener());
        view.addMulListener(new MulListener());
        view.addDerListener(new DerListener());
        view.addIntegListener(new IntegListener());

    }

    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInput1 = "";
            String userInput2 = "";
            Polynomial p1 = new Polynomial();
            Polynomial p2 = new Polynomial();
            Operations op = new Operations(p1,p2);
            Polynomial res = new Polynomial();

            try {
                userInput1 = m_view.getex1();
                userInput2 = m_view.getex2();
                p1= Polynomial.stringToPoly(userInput1);
                p2 = Polynomial.stringToPoly(userInput2);
                res = op.addTwoPolynoms(p1,p2);
                m_view.setTotal(res.toString());

            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput1 + "'");
            }
        }
    }


    class SubListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInput1 = "";
            String userInput2 = "";
            Polynomial p1 = new Polynomial();
            Polynomial p2 = new Polynomial();
            Operations op = new Operations(p1,p2);
            Polynomial res = new Polynomial();

            try {
                userInput1 = m_view.getex1();
                userInput2 = m_view.getex2();
                p1= Polynomial.stringToPoly(userInput1);
                p2 = Polynomial.stringToPoly(userInput2);
                res = op.substractTwoPolynoms(p1,p2);
                m_view.setTotal(res.toString());

            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput1 + "'");
            }
        }
    }

    class MulListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInput1 = "";
            String userInput2 = "";
            Polynomial p1 = new Polynomial();
            Polynomial p2 = new Polynomial();
            Operations op = new Operations(p1,p2);
            Polynomial res = new Polynomial();

            try {
                userInput1 = m_view.getex1();
                userInput2 = m_view.getex2();
                p1= Polynomial.stringToPoly(userInput1);
                p2 = Polynomial.stringToPoly(userInput2);
                res = op.multiplyTwoPolynoms(p1,p2);
                m_view.setTotal(res.toString());

            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput1 + "'");
            }
        }
    }


    class DerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInput1 = "";

            Polynomial p1 = new Polynomial();
            Polynomial p2 = new Polynomial();
            Operations op = new Operations(p1,p2);
            Polynomial res = new Polynomial();

            try {
                userInput1 = m_view.getex1();

                p1= Polynomial.stringToPoly(userInput1);

                res = op.derivativePolynom(p1);
                m_view.setTotal(res.toString());

            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput1 + "'");
            }
        }
    }

    class IntegListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInput1 = "";

            Polynomial p1 = new Polynomial();
            Polynomial p2 = new Polynomial();
            Operations op = new Operations(p1,p2);
            Polynomial res = new Polynomial();

            try {
                userInput1 = m_view.getex1();

                p1= Polynomial.stringToPoly(userInput1);

                res = op.integralPolynom(p1);
                m_view.setTotal(res.toString());

            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput1 + "'");
            }
        }
    }

}

