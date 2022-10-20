package clase03;
public class Clase03 {
    public static void main(String[] args) {
        /*
        Protocolo TCP/IP            
        
        Server                                          Client
        ----------------                                ----------------
        new ServerSocket(int port)                      new Socket(String ip, int port);
        .accept()
        ----------------                                ----------------
        OutputStream        -------------------->       InputStream
        InputStream         <--------------------       OutputStream
        ----------------                                ----------------
        .close()                                        .close()
        
        "40000"            --------------------->       int peso=Integer.parseInt("40000");
        40000              --------------------->       int peso=40000;              
        
        BufferedOutputStream BufferedInputStream:       Stream de buffers.
        DataOutputStream DataInputStream:               Stream de datos primitivos de java.
        ObjectOutputStream  ObjectInputStream:          Stream de Objetos de java.
        */
        
        /*
        Distribución del JAR
        
        */
        
    }
    
}
