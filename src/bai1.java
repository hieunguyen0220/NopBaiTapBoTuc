import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập chiều rộng: ");
        double width = sc.nextDouble();
        System.out.print("Mời nhập chiều cao: ");
        double height = sc.nextDouble();

        bai_1 hinhchunhat = new bai_1(width, height);
        System.out.println("Diện tích hình chữ nhật: " + hinhchunhat.RectangularArea());
        System.out.println("Chu vi hình chữ nhật: " + hinhchunhat.Perimeter_of_a_rectangle());
    }

    public static class bai_1 {
        double width, height;
        public bai_1 (double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double RectangularArea() {double Acreage = this.width * this.height; return Acreage;}
        public double Perimeter_of_a_rectangle() {double Perimeter = (this.width + this.height) * 2; return Perimeter;}
    }
}
