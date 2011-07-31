/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author diego.dba
 */

Long numero = 600851475143;

calculaFatoral(numero, 1)

def calculaFatoral(Long numero, Long maior){
	for(int i=3; i <= numero; i++){
		if(numero % i == 0){
			println i
			return calculaFatoral(numero.div(i).longValue(), i)
		}
	}
}