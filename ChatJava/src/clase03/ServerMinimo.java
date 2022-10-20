package clase03;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMinimo {
    public static void main(String[] args) {
        
//        String mensaje="<h1>Servidor de Carlos!!</h1>";
//        mensaje=    "HTTP/1.1 200 OK\n"+ //Aqui se le agrega Protocolo http para q lo lea cualquier explorador
//                    "Content-Length: "+mensaje.length()+"\n\n"
//                    +mensaje;
        
        /*--Esto muestra toda la info de nuestra pc--*/
//        String mensaje=System.getProperties()+"\n"+System.getenv();
//        mensaje=    "HTTP/1.1 200 OK\n"+
//                    "Content-Length: "+mensaje.length()+"\n\n"
//                    +mensaje;

        
        
        String mensaje1="";
        mensaje1+="Lunes.\n";
        mensaje1+="Martes.\n";
        mensaje1+="Miércoles.\n";
        mensaje1+="Jueves.\n";
        mensaje1+="Viernes.\n";
        mensaje1+="Sábado.\n";
        mensaje1+="Domingo.\n";
        mensaje1+="Primavera.\n";
        mensaje1+="Verano.\n";
        mensaje1+="Otoño.\n";
        mensaje1+="Invierno.\n";
        mensaje1+="Lunes.\n";
        mensaje1+="Lunes.\n";
        mensaje1+="Lunes.\n";
        mensaje1+="Lunes.\n";
        mensaje1+="Lunes.\n";
        try (ServerSocket ss=new ServerSocket(5000)) { //try with resources JDK 7 sup.
            while(true){
                System.out.println("Esperando conexión de cliente............");
                try(
                    Socket so=ss.accept();      //se detiene el hilo de ejecución a la espera de un cliente
                    OutputStream out=so.getOutputStream();
                ){
                    System.out.println("Se conecto: "+so.getInetAddress());
                    //out.write(mensaje.getBytes());
                    out.write(mensaje1.getBytes());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
