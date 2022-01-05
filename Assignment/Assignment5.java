package Assignment;

public class Assignment5 {
    public static void main(String[] args) {
        int arr[] = { 12, 5, 3, 88, 45 };
        LargestArr l1 = new LargestArr();
        int num = l1.maxArr(arr);
        System.out.println("The largest number present in the array is: " + num);

    }

}

class LargestArr {
    public int maxArr(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;

    }
}
