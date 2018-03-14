package br.com.marcos.emultiplo;

public class EMultiplo {
	
	//Function returns true or false if 'multiple' is really multiple of number
	static boolean eMultiplo(int multiplo, int numero) {
		boolean resultado = false;
		
		if(multiplo%numero == 0) {
			resultado = true;
		}
		
		return resultado;
	}
}
