package BusinessLogic;

import DataModels.Monomial;
import DataModels.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {
    @Test
    public void testAdd() {

        Polynomial polinom1 = new Polynomial();
        Polynomial polinom2 = new Polynomial();
        Polynomial polinom3 = new Polynomial();
        Monomial monom1 = new Monomial(1, 3);
        Monomial monom2 = new Monomial(4, 2);
        Monomial monom3 = new Monomial(5, 0);
        Monomial monom4 = new Monomial(1, 1);
        Monomial monom5 = new Monomial(-2, 0);
        Monomial monom6 = new Monomial(1, 3);
        Monomial monom7 = new Monomial(4, 2);
        Monomial monom8 = new Monomial(1, 1);
        Monomial monom9 = new Monomial(3, 0);
        polinom3.addMonoms(monom6);
        polinom3.addMonoms(monom7);
        polinom3.addMonoms(monom8);
        polinom3.addMonoms(monom9);
        polinom1.addMonoms(monom1);
        polinom1.addMonoms(monom2);
        polinom1.addMonoms(monom3);
        polinom2.addMonoms(monom4);
        polinom2.addMonoms(monom5);
        Operations operations = new Operations(polinom1, polinom2);
        assertEquals(polinom3.toString(), operations.addTwoPolynoms(polinom1, polinom2).toString());
    }
    @Test
    public void testSub() {

        Polynomial polinom1 = new Polynomial();
        Polynomial polinom2 = new Polynomial();
        Polynomial polinom3 = new Polynomial();
        Monomial monom1 = new Monomial(1, 3);
        Monomial monom2 = new Monomial(4, 2);
        Monomial monom3 = new Monomial(5, 0);
        Monomial monom4 = new Monomial(1, 1);
        Monomial monom5 = new Monomial(-2, 0);
        Monomial monom6 = new Monomial(1, 3);
        Monomial monom7 = new Monomial(4, 2);
        Monomial monom8 = new Monomial(-1, 1);
        Monomial monom9 = new Monomial(7, 0);
        polinom3.addMonoms(monom6);
        polinom3.addMonoms(monom7);
        polinom3.addMonoms(monom8);
        polinom3.addMonoms(monom9);
        polinom1.addMonoms(monom1);
        polinom1.addMonoms(monom2);
        polinom1.addMonoms(monom3);
        polinom2.addMonoms(monom4);
        polinom2.addMonoms(monom5);
        Operations operations = new Operations(polinom1, polinom2);
        assertEquals(polinom3.toString(), operations.substractTwoPolynoms(polinom1, polinom2).toString());
    }

    @Test
    public void testMul() {

        Polynomial polinom1 = new Polynomial();
        Polynomial polinom2 = new Polynomial();
        Polynomial polinom3 = new Polynomial();
        Monomial monom1 = new Monomial(1, 3);
        Monomial monom2 = new Monomial(4, 2);
        Monomial monom3 = new Monomial(5, 0);
        Monomial monom4 = new Monomial(1, 1);
        Monomial monom5 = new Monomial(-2, 0);
        Monomial monom6 = new Monomial(1, 4);
        Monomial monom7 = new Monomial(2, 3);
        Monomial monom8 = new Monomial(-8, 2);
        Monomial monom9 = new Monomial(5, 1);
        Monomial monom10 = new Monomial(-10, 0);
        polinom3.addMonoms(monom6);
        polinom3.addMonoms(monom7);
        polinom3.addMonoms(monom8);
        polinom3.addMonoms(monom9);
        polinom3.addMonoms(monom10);
        polinom1.addMonoms(monom1);
        polinom1.addMonoms(monom2);
        polinom1.addMonoms(monom3);
        polinom2.addMonoms(monom4);
        polinom2.addMonoms(monom5);
        Operations operations = new Operations(polinom1, polinom2);
        assertEquals(polinom3.toString(), operations.multiplyTwoPolynoms(polinom1, polinom2).toString());
    }

    @Test
    public void testDer() {

        Polynomial polinom1 = new Polynomial();
        Polynomial polinom2 = new Polynomial();
        Polynomial polinom3 = new Polynomial();
        Monomial monom1 = new Monomial(1, 3);
        Monomial monom2 = new Monomial(4, 2);
        Monomial monom3 = new Monomial(5, 0);
        Monomial monom4 = new Monomial(1, 1);
        Monomial monom5 = new Monomial(-2, 0);
        Monomial monom6 = new Monomial(3, 2);
        Monomial monom7 = new Monomial(8, 1);

        polinom3.addMonoms(monom6);
        polinom3.addMonoms(monom7);
        polinom1.addMonoms(monom1);
        polinom1.addMonoms(monom2);
        polinom1.addMonoms(monom3);
        polinom2.addMonoms(monom4);
        polinom2.addMonoms(monom5);
        Operations operations = new Operations(polinom1, polinom2);
        assertEquals(polinom3.toString(), operations.derivativePolynom(polinom1).toString());
    }

    @Test
    public void testInteg() {

        Polynomial polinom1 = new Polynomial();
        Polynomial polinom2 = new Polynomial();
        Polynomial polinom3 = new Polynomial();
        Monomial monom1 = new Monomial(1, 3);
        Monomial monom2 = new Monomial(4, 2);
        Monomial monom3 = new Monomial(5, 0);
        Monomial monom4 = new Monomial(1, 1);
        Monomial monom5 = new Monomial(-2, 0);
        Monomial monom6 = new Monomial(0.25, 4);
        Monomial monom7 = new Monomial(1.33, 3);
        Monomial monom8 = new Monomial(5, 1);
        polinom3.addMonoms(monom6);
        polinom3.addMonoms(monom7);
        polinom3.addMonoms(monom8);
        polinom1.addMonoms(monom1);
        polinom1.addMonoms(monom2);
        polinom1.addMonoms(monom3);
        polinom2.addMonoms(monom4);
        polinom2.addMonoms(monom5);
        Operations operations = new Operations(polinom1, polinom2);
        assertEquals(polinom3.toString(), operations.integralPolynom(polinom1).toString());
    }

}