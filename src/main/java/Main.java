import BusinessLogic.Operations;
import DataModels.Monomial;
import DataModels.Polynomial;
import GUI.CalculatorView;
import GUI.Controller;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Polynomial polinom1 = new Polynomial();
        Polynomial polinom2 = new Polynomial();
        Monomial monom1 = new Monomial(1,3);
        Monomial monom2 = new Monomial(4,2);
        Monomial monom3 = new Monomial(5,0);
        Monomial monom4= new Monomial(1,1);
        Monomial monom5= new Monomial(-2,0);
        Monomial monom6= new Monomial(-2,9);
        polinom1.addMonoms(monom1);
        polinom1.addMonoms(monom2);
        polinom1.addMonoms(monom3);
        polinom2.addMonoms(monom4);
        polinom2.addMonoms(monom5);
        // polinom2.addMonoms(monom3);
        //  polinom1.addMonoms(monom6);

        // System.out.println(polinom);
        Operations adunare= new Operations(polinom1,polinom2);
        System.out.println("Polinomul 1: " + polinom1);
        System.out.println("Polinomul 2: " + polinom2);
        System.out.println("Adunarea este " + adunare.addTwoPolynoms(polinom1,polinom2));
        System.out.println("Scaderea este " + adunare.substractTwoPolynoms(polinom1,polinom2));
        System.out.println("Inmultirea este " + adunare.multiplyTwoPolynoms(polinom1,polinom2));
        System.out.println("Derivarea este: " + adunare.derivativePolynom(polinom1));
        System.out.println("Integrarea este: " + adunare.integralPolynom(polinom1));
        CalculatorView calculatorView = new CalculatorView();
        Controller controller = new Controller(calculatorView);
    }
}