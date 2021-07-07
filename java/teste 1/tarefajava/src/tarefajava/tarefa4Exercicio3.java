/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

package tarefajava;

public class tarefa4Exercicio3 {

	public static void main(String[] args) {

		int matriz1[][] = new int[4][6];
		int matriz2[][] = new int[4][6];
		int matrizSoma [][] = new int[4][6];
		int matrizDiferenca[][] = new int[4][6];

		for (int i = 0; i < 4; i++){
			for (int y = 0; y < 6; y++){
				matriz1[i][y] = (int) Math.round(Math.random() * 10);
				matriz2[i][y] = (int) Math.round(Math.random() * 10);
						
				matrizSoma[i][y] = matriz1[i][y] + matriz2[i][y];
				
				if (matriz1[i][y] > matriz2[i][y]){
					matrizDiferenca[i][y] = matriz1[i][y] - matriz2[i][y];
				}
				else{
					matrizDiferenca[i][y] =  matriz2[i][y] - matriz1[i][y];
				}
			}
		}
		System.out.println("Primeira matriz:");
		for (int i = 0; i < 4; i++){
			for (int y = 0; y < 6; y++){
				System.out.print(matriz1[i][y] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\nSegunda matriz: ");
		for (int i = 0; i < 4; i++){
			for (int y = 0; y < 6; y++){
				System.out.print(matriz2[i][y] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\nSoma de cada posição da matriz");
		for (int i = 0; i < 4; i++){
			for (int y = 0; y < 6; y++){
				System.out.print(matrizSoma[i][y] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\nDiferença de cada posição da matriz");
		for (int i = 0; i < 4; i++){
			for (int y = 0; y < 6; y++){
				System.out.print(matrizDiferenca[i][y] + "\t");
			}
			System.out.println();
		}
		
	}

}
 