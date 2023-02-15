import java.util.Scanner;

class program {

    public static void main(String[] args) {
        int n = getNumber();
        int count;
        int sum_line = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("T" + i + " = ");            
            count = 0;
            sum_line = 0;
            for (int j = 1; j <= i; j++) {
                count += 1;
                sum_line += count;
                System.out.print(count + " ");
            }
            System.out.println("= " + sum_line);
        }
        System.out.println("Треугольное число = " + sum_line);
    }

    private static Scanner sc = new Scanner(System.in);

    private static Integer getNumber() {
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }



}