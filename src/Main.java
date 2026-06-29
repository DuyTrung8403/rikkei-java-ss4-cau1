import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 1; i <= n; i++) {
            System.out.printf("Phần tử thứ %d: ", i);
            arr[i - 1] = Integer.parseInt(sc.nextLine());
        }
        selectionSort(arr);
        System.out.println("Mảng sắp xếp sau khi giảm dần");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            int maxValue = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxValue) {
                    maxIndex = j;
                    maxValue = arr[j];
                }
            }
            if (maxIndex != i) {
                arr[maxIndex] = arr[i];
                arr[i] = maxValue;
            }
        }
    }
}

