package Quiz;

public class Q15Weight {
    private double weight;

    public Q15Weight(double weight){
        this.weight = weight;
    }

    public double getpound(){
        return weight;
    }

    public double getkilo(){
        return weight * 0.45359237;
    }
}
