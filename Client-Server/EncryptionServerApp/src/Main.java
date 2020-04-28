import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.*; 
import java.io.*; 
import java.util.*; 
import java.net.InetAddress;

/*
 * @author salih
 */
public class Main {

    ServerSocket server;
    Socket socket;
    int port = 5400; // My port number. This is Random number but this value must be 1000 and 65000. 1000<port<65000 
    int counter = 1;
    InetAddress localhost;
    
    public static void main(String[] args) throws UnknownHostException {
        Main main = new Main(); // We create access Main class reference
        //main.runServer();   
        System.out.println(encrypt("Selam"));
        System.out.println(decrypt("Q_jgf?ASP"));
        System.out.println(decrypt(encrypt("Selam")));
        String deneme = encrypt("Selam");
        System.out.println(deneme);
        
    }
    
    void runServer() throws UnknownHostException{
        localhost = InetAddress.getLocalHost(); 
        System.out.println("System IP Address : " + (localhost.getHostAddress()).trim());
        try {
            System.out.println("Encryption Server Created...");
            server = new ServerSocket(port);            
            while (true) {         
                
                socket = server.accept();
                int i = counter++;
                InputStream inputStream = socket.getInputStream();
                DataInputStream dis = new DataInputStream(inputStream);// This class convert (byte to String)
                String inComingData = dis.readUTF();
                System.out.println();
                
                String encryptedData = encrypt(inComingData);
                System.out.print("Coming Data to the Server from "+i+".Person. -> "+inComingData + "\n");
                System.out.print("Server Send the Encrypted Data to "+i+".Person -> "+" "+encryptedData + "\n");
                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(outputStream);
                dos.writeUTF(encryptedData);
                System.out.println("Server is running..."+socket.getLocalSocketAddress());
            }
            
        } catch (Exception e) {
            System.out.println("Cryption Except..."+e);
        }
    }
    
    static String encrypt(String data){
        String encryptedString = ""; 
        char[] crypt = data.toCharArray();
        for (char c : crypt) {
            encryptedString += (char)(c-2);
        }
        return encryptedString;
    }
    static String decrypt(String data){
        String encryptedString = ""; 
        char[] crypt = data.toCharArray();
        for (char c : crypt) {
            encryptedString += (char)(c+2);
        }
        return encryptedString;
    }
}
