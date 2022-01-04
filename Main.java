import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền VND: ");
        double vnd = sc.nextDouble();
        double usd = vnd / rate;
        System.out.printf("Quy đổi ra thành: %.3f USD", usd);

    }

}
