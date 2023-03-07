public class bai3 {
    public static void main(String[] args) {
        Nhietdo nhietdo = new Nhietdo(22);
        System.out.println("Độ F: " + nhietdo.chuyenthanh_C_F());
        System.out.println("Độ Cê:" + nhietdo.chuyenthanh_C_Cê());
    }
}

    class Nhietdo {
        double chuyenthanh;

        public Nhietdo(double chuyenthanh) {
            this.chuyenthanh = chuyenthanh;
        }

        public double chuyenthanh_C_F() {
            double fahrenheit = (9.0 / 5) * chuyenthanh + 32;
            return fahrenheit;
        }

        public double chuyenthanh_C_Cê() {
            double Cê = chuyenthanh + 273.15;
            return Cê;
        }
}

