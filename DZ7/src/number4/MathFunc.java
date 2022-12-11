package number4;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(int a, int b) {
        if(b == 1) return a;
        return a * pow(a, b - 1);
    }

    @Override
    public double absComplex(int real, int img) {
        return Math.sqrt(this.pow(real, 2) + this.pow(img, 2));
    }

    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        System.out.println(mathFunc.PI);
        System.out.println(mathFunc.pow(2, 3));
        System.out.println(mathFunc.absComplex(1, 1));
    }
}
