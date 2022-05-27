package examples;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {

    public void generateToken() {
        for (int i = 0; i < 10; i++) {
            System.out.println(toHexString(getSHA256("03023519552")));
        }
    }

    public static byte[] getSHA256(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return md.digest(data.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            return "error".getBytes();
        }
    }

    public String toHexString(byte[] hash) {
        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));

        while (hexString.length() < 32) {
            hexString.insert(0, '0');
        }
        return hexString.toString();
    }
    
    public static void main(String args[]){
        new SHA256().generateToken();
    }

}
