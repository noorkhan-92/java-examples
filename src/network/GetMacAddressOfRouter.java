package network;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class GetMacAddressOfRouter {

public static void main(String args[]){
    try{
    InetAddress localhost = InetAddress.getByName("192.168.1.115");
    NetworkInterface ni = NetworkInterface.getByInetAddress(localhost);
    byte[] hardwareAddress = ni.getHardwareAddress();
    String hexadecimal[] = new String[hardwareAddress.length];
    for(int i = 0; i < hardwareAddress.length; i++){
        hexadecimal[i] = String.format("%02X", hardwareAddress[i]);
    }
    String macAddress = String.join("-", hexadecimal);
        System.out.println(macAddress);
    }catch(Exception e){
        System.out.println("Error: " + e.getCause() + e.getMessage());
    }
    
}
    
}
