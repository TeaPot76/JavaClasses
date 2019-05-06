public class Calculator {
    private int numberOne;
    private int numberTwo;

    public Calculator(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int add(){
        return numberOne + numberTwo;
    }

    public int substract(){
        return numberOne - numberTwo;
    }

    public int divide(){
        return numberOne / numberTwo;
    }

    public int multiply(){
        return numberOne * numberTwo;
    }

}
