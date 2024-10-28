package View;

import br.edu.fateczl.Lista.Lista;

/*
 * 3 - 5 - 8 - 12 - 9 - 7 - 6 - 2 - 3 - 7 - 16
 *  
 * b) Fazer, em Java, um novo projeto que inicialize a lista L, com os dados acime e implemente 
operações que permitam determinar os 2 maiores valores da lista. O uso de bibliotecas de outros 
TADs é permitido
*/ 
public class Principal {

	public static <T> void main(String[] args)throws Exception  {
		
		Lista<Integer> l = new Lista<>();
		int [] vet= {3,5,8,12,9,7,6,2,3,7,16};
		
		int tamanho=vet.length;
		
		int maior ;
		int segMaior;
		
		l.addFirst(vet[0]);
		
		for(int i=1;i<tamanho;i++) {
			l.addLast(vet[i]);		
		}
		
		maior=l.get(0);
		segMaior=l.get(0);
		
		for(int i=0;i<tamanho;i++) {
		
			if(l.get(i)>maior) {
				segMaior=maior;
				maior=l.get(i);
			}
		}
	
		System.out.println("Maior nº da lista : "+maior);
		System.out.println("Segundo Maior nº da lista : "+segMaior);
	}

}
