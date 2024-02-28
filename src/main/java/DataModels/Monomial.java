package DataModels;

public class Monomial {
    private Double coefficient;
    private Integer power;

    public Monomial(double coefficient, int power){
        this.coefficient=coefficient;
        this.power=power;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {

        return coefficient + "x" + power;

    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
