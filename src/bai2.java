public class bai2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Vàng");
        System.out.println("Bán kính của hình tròn: " + circle.getRadius());
        System.out.println("Diện tích của hình tròn: " + circle.Acreage());
        System.out.println("Màu hình tròn: " + circle.getColor());

    }
}

    class Circle {
        double radius;
        String color;

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return this.radius;
        }

        public String getColor() {
            return color;
        }

        public double Acreage() {
            return Math.PI * radius * radius;
        }
    }

