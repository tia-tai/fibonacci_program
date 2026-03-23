//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fibonacci generator = new Fibonacci(12, 0, 1);
        //generator.calculateIterative();
        generator.calculateRecursive(0, 1);
        System.out.println("Fibonacci Sequence:");
        for (Integer i : generator.getSequence()) {
            System.out.print(i + ", ");
        }
    }
}