package com.ssbaez.separacion;

import java.util.Scanner;

public class SeparacionDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j,
		re01 = 10;
		
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Aplicaci�n que recibe del usuario un n�mero compuesto por cinco d�gitos, que separa"
						+ " ese n�mero en sus d�gitos individuales\ny los imprime, cada uno separado de los "
						+ "dem�s por tres espacios\n");
	
	System.out.printf("Ingrese n�mero de cinco d�gitos: ");
	j = input.nextInt(); //se lee numero
	
	int re02 = j/10%re01,
		re03 = j/100%re01,
		re04 = j/1000%re01,
		re05 = j/10000%re01,
		linf = 9999,
		lsup = 100000;
	
	if(j > linf && j < lsup){
		System.out.printf("%d   %d   %d   %d   %d", re05, re04, re03, re02, j%re01);
	}
	else{
		System.out.println("\n***N�MERO INV�LIDO***");
	}

	}

}
