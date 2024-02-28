package DataModels;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {
    public TreeMap<Integer,Double> monomials ;

    public Polynomial(){
        monomials=new TreeMap<>(Comparator.reverseOrder());
    }


    public void addMonoms(Monomial m){

            this.monomials.put(m.getPower(), m.getCoefficient());

    }

    public static Polynomial stringToPoly(String str){

        int i=0;
        int check=0;
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(c == '^')
                check++;
        }

        Polynomial pol = new Polynomial();
        Pattern p = Pattern.compile("(-?\\b\\d+)x\\^(\\d+\\b)");
        Matcher m = p.matcher(str);
        while(m.find()){
            Monomial mon = new Monomial(0,0);
            try{
                mon.setCoefficient(Float.parseFloat(m.group
                        (1)));

            }catch(NumberFormatException pop){
                System.out.println("Error");
            }
            try{
                mon.setPower(Integer.parseInt(m.group(2)));
            }catch(NumberFormatException pop){
                System.out.println("Error");
            }
            pol.addMonoms(mon);
            i++;
        }
       if(i != check || (i == 0 && !str.isEmpty()))
            System.out.println("Error");
        return pol;
    }

    @Override
    public String toString() {
        String polinomWriting="";
        for(Map.Entry<Integer,Double> poli: monomials.entrySet()){
            if(poli.getValue()>0) {
                if(poli.getKey() != 0) {
                    polinomWriting = polinomWriting + ("+" + String.format("%.2f", poli.getValue()) + "x^" + poli.getKey());
                }
                else if(poli.getKey()== 0){
                    polinomWriting = polinomWriting + ("+" + String.format("%.2f", poli.getValue()) );
                }
            }
            else if(poli.getValue()<0){
                if(poli.getKey() != 0) {
                    polinomWriting = polinomWriting + (String.format("%.2f", poli.getValue()) + "x^" + poli.getKey());
                }
                else if(poli.getKey()== 0){
                    polinomWriting = polinomWriting + (String.format("%.2f", poli.getValue()) );
                }
            }

        }

        return polinomWriting;
    }


}
