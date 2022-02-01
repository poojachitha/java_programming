package Practice;

public class Victory {
    public static void main(String[] args) {
        int n = 22;
        for (int i = 0; i < n; i++) {
            System.out.print("/");
            if (i == (n - 1)) {
                System.out.println();
                System.out.print("||      Victory     ||");
            }
        }
    }
}
