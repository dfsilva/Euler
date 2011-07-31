/**
 * A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91  99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
def num1 = 0
def num2 = 0

999.downto(1) {n1 ->
	999.downto(1) {n2 ->
		res = (n1*n2)
		if(res.toString().equals(res.toString().reverse()) && n1*n2>num1*num2){
			num1 = n1
			num2 = n2
		}
	}
}

println num1
println num2
println num1*num2