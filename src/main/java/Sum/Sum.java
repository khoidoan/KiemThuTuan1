package Sum;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số a từ người dùng
        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();

        // Nhập số b từ người dùng
        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();

        // Tính tổng của a và b
        double sum = a + b;

        // In ra kết quả
        System.out.println("Tong cua " + a + " va " + b + " la: " + sum);

        // Đóng Scanner
        scanner.close();
    }

    // Định nghĩa phương thức calculateSum để tính tổng của hai số
    public static double calculateSum(double v, double v1) {
        return v + v1;
    }
}
