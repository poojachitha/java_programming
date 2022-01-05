package Assignment;

/**
 * Assignment1
 */
public class Assignment1 {

    public static void main(String[] args) {
        Arithmetic a1 = new Arithmetic();
        a1.add();
        a1.sub();
        a1.mul();
        a1.div();
    }
}

class Arithmetic {
    int a = 4;
    int b = 2;

    public void add() {
        System.out.println("Addition of two numbers is " + (a + b));
    }

    public void sub() {
        System.out.println("Subtraction of two numbers is " + (a - b));
    }

    public void mul() {
        System.out.println("Multiplication of two numbers is " + (a * b));
    }

    public void div() {
        System.out.println("Division of two numbers is " + (a / b));
    }
}