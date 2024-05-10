package colecoeslist;

import java.util.ArrayList;
import java.util.Scanner;

public class ColleçõesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		int contador;
	
		for( contador = 0; contador <= 5; contador++) {
			System.out.println("Digite uma cor: ");
			cores.add(leia.nextLine());
			
		
		} System.out.println(cores);	
		cores.sort(null);
		
		System.out.println(cores);	
		
		
		
	
		

	}

}
