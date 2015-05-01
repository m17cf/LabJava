package tr1;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServidorApp   {
	
	private static ServerSocket srvSocket;
	private TCPBase tcpbase;
	
				
	
public static void main (String args[]){
		
	String msg_cliente;
	String msg_cliente_cx_alta;
	
	try {
			
	srvSocket = new ServerSocket(5000); 	
	System.out.println("Servidor iniciado na porta 5000");
			
	Socket cliente = srvSocket.accept(); 
	System.out.println("Cliente conectado do IP "+cliente.getInetAddress(). getHostAddress());
			
					
	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
	DataOutputStream outToClient = new DataOutputStream(cliente.getOutputStream());
			
	msg_cliente = inFromClient.readLine();
	System.out.println("Recebido: " + msg_cliente);
	msg_cliente_cx_alta = msg_cliente.toUpperCase() + '\n';
	outToClient.writeBytes(msg_cliente_cx_alta);

			
            try (Scanner entrada = new Scanner(cliente.getInputStream())) {
                while(entrada.hasNextLine()){
                    System.out.println(entrada.nextLine());
                }   }
            srvSocket.close();
             
        } catch (IOException ex) { 
	Logger.getLogger(ServidorApp.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    } 
}
