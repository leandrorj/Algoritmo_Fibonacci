/*Exercício
 * 
 * Escreva um código fonte que soma todos os números IMPARES de 
 * uma sequência de Fibonacci onde o maior valor da sequência 
 * deve ser menor que UM MILHÃO. 
 * 
 * Seu código deve imprimir o valor no final da execução.
 * 
 */
public class testeFibonacci {

	public static void main(String[] args) {

		long ultimoNumero = 1;
		long penultimoNumero = 0;
		long auxilar;
		long resultado = 0;
		
		for(int i=0; i<100; i++){
			
			if(ultimoNumero %2 != 0 && ultimoNumero > 0  && ultimoNumero < 1000000){  //selecionando os numeros impares
				resultado = resultado + ultimoNumero;
			}
						
			//calculo fibonacci
			auxilar = ultimoNumero;
			ultimoNumero = ultimoNumero + penultimoNumero;
			penultimoNumero = auxilar;
		}
		System.out.println(resultado);  //imprimindo a soma da sequencia dos numeros impares 
	}
}