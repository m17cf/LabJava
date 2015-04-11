import javax.swing.*;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



public class Cadastrar {
	
	public static void main(String[] args) throws Exception{
	
     	String nome;
		int idade;
		int qnt = 0;
		Alunos cadastro = null;
		
	    qnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos você deseja cadastrar ? : "));

	    for(int i=0; i < qtde; i++){
	    	
			nome = JOptionPane.showInputDialog(null,"Nome do aluno: ");
		    idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade do aluno: "));
		
		    cadastro = new Alunos(qnt,nome,idade);
		    cadastro.incluirRegistro(cadastro);
		    
		    List<Alunos> cadastrar = new ArrayList<Alunos>();
		    Alunos novos = cadastro;
		    cadastrar.add(novos);
		    
		   Alunos ver;
			
			for (int h = 0; h < cadastrar.size(); h++){
			
				ver = cadastrar.get(h);
				
				System.out.Println("Alunos Cadastrados:  ("+(h+1)+")" +ver);
				ver.exibirDados();
			   	ver.salvarDados();
				}
			
			cadastrar.clear();
		    
		  }
	

	  }	
		
}
