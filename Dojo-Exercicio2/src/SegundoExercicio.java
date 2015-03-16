public class SegundoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = {0,1,2,3,4,5,6,7,8,9};
		int vetoraux[] = new int[10];
		int vetoraux2 [] = new int [10];
		int posicao = 0;
		int posicaoimpar = 9;
		for (int i = 0; i < 10; i++) {
		
			if (vetor[i] % 2 == 0) {
				vetoraux[posicao] = vetor[i];
				posicao ++;
			}
			else if (vetor[i] % 2 != 0)
			{
			 vetoraux2[posicaoimpar] = vetor [i];
			 posicaoimpar--;
			}
			
		}
		
		posicao = 0;
		posicaoimpar = 9;
		for (int j = 0; j < 10; j++) {
		
			if (j < 5){
			vetor [j] = vetoraux[posicao];
			posicao ++;
		
			}
			
			else if (j > 5)
			{
				vetor [j] = vetoraux2 [posicaoimpar];
				posicaoimpar--;
			}
		
		}
		
		for (int k = 0; k < 10; k++) {
			System.out.println("Vetor auxilar: "+vetor[k]);
			
		}
		

	
	}
}
