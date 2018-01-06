package com.ssbaez.separacion;

import java.util.Scanner;

public class SeparacionDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j,
		re01 = 10;
		
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Aplicación que recibe del usuario un número compuesto por cinco dígitos, que separa"
						+ " ese número en sus dígitos individuales\ny los imprime, cada uno separado de los "
						+ "demás por tres espacios\n");
	
	System.out.printf("Ingrese número de cinco dígitos: ");
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
		System.out.println("\n***NÚMERO INVÁLIDO***");
	}

	}

}
