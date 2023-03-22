package br.senai.sp.jandira;

import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------");
		System.out.println("             CONSUMO DE COMBUSTÍVEL             ");
		System.out.println("------------------------------------------------");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Modelo do carro? ");
		String carro = teclado.next();
		
		System.out.print("Autonomia do carro? ");
		int auto = teclado.nextInt();
		
		System.out.print("Distância da viagem? ");
		int distancia = teclado.nextInt();
		
		System.out.print("Preço do combustível? ");
		double preco = teclado.nextDouble();
		
		System.out.println("");
		
		System.out.println("------------------------------------------------");
		System.out.println("               R E S U L T A D O                ");
		System.out.println("------------------------------------------------");
		
		System.out.println("Modelo do veículo: "+ carro +" ");
		System.out.println("Autonomia do veículo: "+ auto +" Km/l");
		System.out.println("Diastância percorrida: "+ distancia +" Km");
		System.out.println("Valor do combustível: R$ "+ preco +" ");
		System.out.println("");
		
		System.out.println("------------------------------------------------");
		System.out.println("Quantidade de combustível utilizado: "+ distancia / auto +" l");
		System.out.println("Total gasto com a viagem: R$ "+ (distancia / auto) * preco +" ");
		System.out.println("------------------------------------------------");
		System.out.println("");

	}

}
