

/* Criando vetores a partir da quantidade que o usu�rios digitar
 * 
 * */


import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n =scanner.nextInt(); // Aqui o usu�rio ir� digitar a quantidade que ele quer
		
		double[] vect =new double[n]; /*Aqui estamos criando um vetor de acordo o valor que o usu�rios informar
		 								, � mesma estrutura da cria��o de qualquer vetor, sendo que a quantidade
		 								ser� informada pela vari�vel n*/
		
		/*para o preenchimento dos vetores iremos utilizar o FOR*/
		
		for (int i = 0; i < n; i++) { /*i<n - o la�o ir� se repetir at� que i seja MENOR que n*/
			
			vect[i]=scanner.nextDouble(); /*Ent�o, vect na posi��o 0, depois volta para o for com o
			 								i valendo 1, depois volta para o for com o i valendo 2
			 								e por �ltimo novamente para o for com o i valendo 3*/
			
		}
		

		scanner.close();

	}

}
