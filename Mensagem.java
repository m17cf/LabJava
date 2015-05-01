package tr1;

import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Mensagem extends ClienteApp{
	private int id;
	private String msg;
	
	public void setID(int id){this.id = id;	}
        public void setMensagem(String msg){this. msgs = msg;	}
	
        public int getID(){return id;}
        public String getMensagem(){return msgs;}
        
	public static String readLine() {return null;}
	public OutputStream getOutputStream() {return null;}
}
