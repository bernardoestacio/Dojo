
public class TerceiroExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra ="teste";
		int num = 2;
		String novaPalavra;
		
		
		novaPalavra = palavra.substring(palavra.length()-num, palavra.length()); 
		
		for (int i = 0; i< palavra.length(); i++) { 
	    System.out.print(novaPalavra);
		}
		
	}

}
