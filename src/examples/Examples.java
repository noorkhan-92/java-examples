package examples;

public class Examples {

    public Examples(){
        long t1 = System.currentTimeMillis();
        System.out.println(flops(1.010, 1.201, 10000000000.0));
        System.out.println(System.currentTimeMillis() - t1);
    }
    
    private double flops(double a, double b, double i){
        double result = b;
        while(i > 0){
            result = result * a;
            if(result == Double.POSITIVE_INFINITY)
                result = b;
            i--;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Examples examples = new Examples();
    }
    
}
