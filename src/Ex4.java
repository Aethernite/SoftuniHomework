import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beg = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for(int i=beg; i<=end; i++){
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
