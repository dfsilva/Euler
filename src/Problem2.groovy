def upperBound = 4000000
def fibPrevious = 1, fib = 2
def sum = 0

while (fib < upperBound) {
	if (fib % 2 == 0){
		sum = sum + fib
		println sum
	}

	def tmp = fib
	fib = fibPrevious + fib
	fibPrevious = tmp
}

print sum
