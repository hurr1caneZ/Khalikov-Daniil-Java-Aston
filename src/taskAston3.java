import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class taskAston3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                System.out.println(arr[i]);
            }
        }

    }
}
