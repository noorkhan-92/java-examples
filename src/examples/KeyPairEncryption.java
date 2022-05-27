package examples;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import javax.crypto.Cipher;

public class KeyPairEncryption {

    Cipher cipher;
    KeyPair pair;
    
    public KeyPairEncryption() throws Exception{
        Signature sign = Signature.getInstance("SHA256withRSA");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        pair = keyPairGenerator.genKeyPair();
        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }
    
    private byte[] encrypt(String data) throws Exception {
        
        cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
        System.out.println(pair.getPublic());
        System.out.println(pair.getPrivate());
        byte input[] = data.getBytes();
        cipher.update(input);
        byte[] encryptedData = cipher.doFinal();
        return encryptedData;
    }
    
    private String decrypt(byte[] data) throws Exception{
        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
        byte[] decryptedData = cipher.doFinal(data);
        return new String(decryptedData);
    }
    
public static void main(String args[]) throws Exception{
    KeyPairEncryption kpe = new KeyPairEncryption();
    byte[] encrypted = kpe.encrypt("Welcome to Talkkia!. Hello to the key pair generator encryptor.");
    System.out.println(encrypted);
    System.out.println(new String(encrypted, "UTF-16"));
    String decrypted = kpe.decrypt(encrypted);
    System.out.println(decrypted);
}
}
