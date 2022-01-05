package Assignment;

public class Assignment2 {
    public static void main(String[] args) {
        Largest l1 = new Largest();
        l1.largeNum(51, 23, 100);
    }
}

class Largest {
    public void largeNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is largest number ");
        } else if (b > c) {
            System.out.println(b + " is largest number ");
        } else {
            System.out.println(c + " is largest number ");
        }
    }
}
