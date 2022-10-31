package src.sockets;

import java.net.*;
import java.io.*;

public class Server {
   private Socket socket = null;
   private ServerSocket server = null;
   private DataInputStream in = null;


   public Server(int port) throws IOException {
       try{
           server = new ServerSocket(port);
           System.out.format("Server started running on port: %d%n", port);

           System.out.println("----------");
           System.out.println("Waiting for client connection...");

           socket = server.accept();
           System.out.println("Client accepted");

           in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

           String line = "";
           System.out.println("Client message:");
           System.out.println("------------------------------------------");
           while(!line.equals("Over")){
               try{
                   line = in.readUTF();
                   System.out.println(line);
               }catch (IOException ioException){
                   ioException.printStackTrace();
               }
           }
       }catch (IOException ioException){
            ioException.printStackTrace();
       }
       System.out.println("Closing connection");
       socket.close();
       in.close();
   }

    public static void main(String[] args) throws IOException {
        Server server = new Server(3000);

    }
}
