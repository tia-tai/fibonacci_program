import java.util.ArrayList;

public class Fibonacci implements FibonacciLike{
    public int amountofNumbersInSequence;
    public int number1;
    public int number2;
    public ArrayList<Integer> sequence = new ArrayList<>();

    public Fibonacci(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }

    // Methods
    public void calculate() {
        sequence.add(number1);
        sequence.add(number2);
        for (int i = 0; i < amountofNumbersInSequence-2; i++) {
            sequence.add(sequence.get(i) + sequence.get(i+1));
        }
    };

    public int getAmountofNumbersInSequence() {
        return amountofNumbersInSequence;
    }

    public void setAmountofNumbersInSequence(int amountofNumbersInSequence) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<Integer> sequence) {
        this.sequence = sequence;
    }
}
