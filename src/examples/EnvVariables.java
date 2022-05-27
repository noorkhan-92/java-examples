package examples;

public class EnvVariables {

public EnvVariables(){
    System.out.println(System.getenv("TALKKIA_SECRET")); 
}

public static void main(String args[]){
    new EnvVariables();
}
    
}
