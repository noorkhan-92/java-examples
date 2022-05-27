package examples;

import java.util.Date;

public class FLOPs {

    long a = 2;
    long t;
    long r = 101;

    public FLOPs() {
        System.out.println(flops());
    }
    
    private double flops() {
        t = new Date().getTime();
        for (int i = 0; i < 10000000; i++) {
            r = r*a;
        }
        System.out.println(new Date().getTime() - t);
        return r;
    }
    
    public static void main(String args[]){
        FLOPs floPs = new FLOPs();
    }

}
