package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

public class ServerChat implements Runnable{
    private JTextArea txa;

    public ServerChat(JTextArea txa) {
        this.txa = txa;
    }

    @Override
    public void run() {
        try (ServerSocket ss=new ServerSocket(6000)){
            while(true){
                try (
                        Socket so=ss.accept();
                        BufferedReader in=new BufferedReader(
                                new InputStreamReader(so.getInputStream()))
               ) {
                    String mensaje=in.readLine();
                    String ip=so.getInetAddress().getHostAddress();
                    String nombre="";
                    for(String k:Direcciones.getMapa().keySet()){
                        if(Direcciones.getMapa().get(k).equals(ip)) nombre=k;
                    }
                    txa.append(nombre+": "+mensaje+"\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
}
