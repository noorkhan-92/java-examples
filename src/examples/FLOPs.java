package examples;

public class FLOPs {

    public FLOPs() {
        System.out.println(flops(1.021, 3.102));
    }

    private long flops(double a, double b) {
        long t1 = System.currentTimeMillis();
        long count = 0;
        while ((System.currentTimeMillis() - t1) < 1000) {
            b = a * b;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        FLOPs floPs = new FLOPs();
    }

}
