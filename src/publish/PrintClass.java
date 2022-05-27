package publish;

public class PrintClass implements Print {


    @Override
    public Object print(Object t) {
        return t;
    }
    
    public static void main(String args[]){
        System.out.println(new PrintClass().print("hell world!"));
    }
    
}
