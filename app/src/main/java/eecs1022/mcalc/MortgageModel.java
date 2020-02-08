package eecs1022.mcalc;

public class MortgageModel {

    private String p;
    private String a;
    private String i;

    public MortgageModel(String p, String a, String i) {
        this.p = p;
        this.a = a;
        this.i = i;
    }

    public String computePayment() {
        Double result;
        Double monthly_rate=Double.valueOf(this.i)/100/12;
        int amortization=Integer.valueOf(this.a)*12;
        result=(monthly_rate*Double.valueOf(this.p))/(1-Math.pow(1+monthly_rate,-amortization));
        return String.format("$%,.2f", result);
    }
}
