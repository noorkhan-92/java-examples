package websocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Websocket {

public static void main(String args[]) throws IOException{
    ServerSocket server = new ServerSocket(80);
    try{
        System.out.println("Server has started on localhost:80./r/n waiting for a connection...");
        Socket client = server.accept();
        System.out.println("A client connected.");
    }catch(Exception e){
        
    }
}
    
}
