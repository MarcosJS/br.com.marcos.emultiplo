//Program that shows whether one number is multiple of another "E Multiplo_v1.0.0"

package br.com.marcos.emultiplo;

public class Main {
	
	public static void main(String[] args) {
		int numero1 = 40;
		int numero2 = 5;
						
		if(EMultiplo.eMultiplo(numero1, numero2)) {
			System.out.println("É Multiplo!");
		} else {
			System.out.println("Não é Multiplo!");
		}
	}
}
