package BusinessLogic;

import DataModels.Monomial;
import DataModels.Polynomial;
import java.util.Map;

public class Operations {
    private Polynomial p1;
    private Polynomial p2;

    public Operations(Polynomial p1, Polynomial p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public Monomial addTwoMonoms(Monomial m1, Monomial  m2){
        Monomial monom;
        if(m1 == null){
            monom=new Monomial(m2.getCoefficient(), m2.getPower());
        }
        if (m1.getPower() == m2.getPower()){
            monom=new Monomial(m1.getCoefficient()+m2.getCoefficient(),m1.getPower()) ;

        }else {
            return null;
        }
        return monom;
    }

    public Monomial substractTwoMonoms(Monomial m1, Monomial  m2){
        Monomial monom;
        if(m1 == null){
            monom=new Monomial(m2.getCoefficient(), m2.getPower());
        }
        if (m1.getPower() == m2.getPower()){
            monom=new Monomial(m1.getCoefficient()-m2.getCoefficient(),m1.getPower()) ;

        }else {
            return null;
        }
        return monom;
    }

    public Polynomial addTwoPolynoms(Polynomial p1, Polynomial p2){
        Polynomial polinom = new Polynomial();
        Monomial monom = new Monomial(0,0);
        for(Map.Entry<Integer, Double> m : p1.monomials.entrySet()){
            if(m.getValue() != null) {
                if(p2.monomials.get(m.getKey())!=null) {
                    monom.setCoefficient(m.getValue() + p2.monomials.get(m.getKey()));
                    monom.setPower(m.getKey());
                    polinom.addMonoms(monom);
                }
                else{
                    monom.setCoefficient(m.getValue());
                    monom.setPower(m.getKey());
                    polinom.addMonoms(monom);
                }
            }
        }
        for(Map.Entry<Integer, Double> m2 : p2.monomials.entrySet()){
            if(p1.monomials.get(m2.getKey()) == null){
                monom.setCoefficient(m2.getValue());
                monom.setPower(m2.getKey());
                polinom.addMonoms(monom);
            }
        }
        return polinom;
    }

    public Polynomial substractTwoPolynoms(Polynomial p1, Polynomial p2){
        Polynomial polinom = new Polynomial();
        Monomial monom = new Monomial(0,0);
        for(Map.Entry<Integer, Double> m : p1.monomials.entrySet()){
            if(m.getValue() != null) {
                if(p2.monomials.get(m.getKey())!=null) {
                    monom.setCoefficient(m.getValue() - p2.monomials.get(m.getKey()));
                    monom.setPower(m.getKey());
                    polinom.addMonoms(monom);
                }
                else{
                    monom.setCoefficient(m.getValue());
                    monom.setPower(m.getKey());
                    polinom.addMonoms(monom);
                }
            }
        }
        for(Map.Entry<Integer, Double> m2 : p2.monomials.entrySet()){
            if(p1.monomials.get(m2.getKey()) == null){
                monom.setCoefficient(-m2.getValue());
                monom.setPower(m2.getKey());
                polinom.addMonoms(monom);
            }
        }
        return polinom;
    }

    public Polynomial multiplyTwoPolynoms(Polynomial p1, Polynomial p2){
        Polynomial polinom = new Polynomial();
        Monomial m1= new Monomial(0,0);
        Monomial m2= new Monomial(0,0);
        Monomial m3= new Monomial(0,0);
        for(Map.Entry<Integer, Double> poli1 : p1.monomials.entrySet()){
            m1.setCoefficient(poli1.getValue());
            m1.setPower(poli1.getKey());

            for(Map.Entry<Integer, Double> poli2 : p2.monomials.entrySet()){
                m3.setCoefficient(m2.getCoefficient());
                m3.setPower(m2.getPower());
                m2.setPower(m1.getPower()+poli2.getKey());
                m2.setCoefficient(m1.getCoefficient()*poli2.getValue());
                if(m3.getPower() == m2.getPower()){
                    m2.setCoefficient(m2.getCoefficient()+m3.getCoefficient());
                }
                polinom.addMonoms(m2);

            }
        }

        return polinom;
    }

    public Polynomial derivativePolynom(Polynomial p1){
        Polynomial polinom = new Polynomial();
        Monomial m1= new Monomial(0,0);
        for(Map.Entry<Integer,Double> poli : p1.monomials.entrySet()){
            if(poli.getKey()!=0) {
                m1.setCoefficient(poli.getValue() * poli.getKey());
                m1.setPower(poli.getKey() - 1);
                polinom.addMonoms(m1);
            }

        }
        return polinom;
    }
    public Polynomial integralPolynom(Polynomial p1){
        Polynomial polinom = new Polynomial();
        Monomial m1= new Monomial(0,0);
        for(Map.Entry<Integer,Double> poli : p1.monomials.entrySet()){
            m1.setCoefficient(poli.getValue()/(poli.getKey()+1));
            m1.setPower(poli.getKey()+1);
            polinom.addMonoms(m1);

        }
        return polinom;
    }


}
