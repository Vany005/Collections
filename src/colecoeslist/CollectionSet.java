package colecoeslist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> setnumero = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int listar;
		
		
		while (contador < 10) {
			System.out.printf("\nDigite os valores inteiros: ", contador++);
			
			listar = scanner.nextInt();
			
			setnumero.add(listar);
			
			
		}

		Iterator<Integer> Numero = setnumero.iterator();

		while (Numero.hasNext()) {

			System.out.println(Numero.next());
		}
	}

}
