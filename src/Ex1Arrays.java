import java.util.Scanner;

public class Ex1Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum+=arr[i];
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
