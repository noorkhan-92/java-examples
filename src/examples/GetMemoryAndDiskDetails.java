package examples;

import java.io.File;

public class GetMemoryAndDiskDetails {

public static void main(String args[]) {
    
    File diskPartition = new File("/");
    System.out.println(diskPartition.getTotalSpace());
    System.out.println(Runtime.getRuntime().freeMemory());
    System.out.println(Runtime.getRuntime().totalMemory());
    
}
    
}
