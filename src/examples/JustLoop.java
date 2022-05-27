package examples;

import java.util.Random;

public class JustLoop {

    Random random = new Random();
    
    public JustLoop(){
        while(true){
            System.out.println(random.nextDouble());
        }
    }
    
public static void main(String args[]){
        JustLoop justLoop = new JustLoop();
}
    
}
