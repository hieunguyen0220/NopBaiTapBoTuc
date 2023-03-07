import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập a:");
        a = scanner.nextInt();
        System.out.println("Nhập b:");
        b = scanner.nextInt();
        System.out.println("Nhập c:");
        c = scanner.nextInt();
        QuadraticEquation phuongTrinh1 = new QuadraticEquation(a, b, c);
        if (phuongTrinh1.getDelta() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt là:");
            System.out.println("Nghiệm x1 = " + phuongTrinh1.getRoot1() +
                    " va x2 = " + phuongTrinh1.getRoot2());
        } else if (phuongTrinh1.getDelta() == 0) {
            System.out.println("Phương trình có nghiệm kép");
            System.out.println("x1 = x2 = " + phuongTrinh1.getRoot());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

class QuadraticEquation {
    public int a;
    public int b;
    public int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot() {
        return -b / (2 * a);
    }

    public double getRoot1() {
        double delta = getDelta();

        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDelta();

        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
