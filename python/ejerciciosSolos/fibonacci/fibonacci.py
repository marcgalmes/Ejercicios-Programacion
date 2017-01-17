def fibonacci(numero):
	assert isinstance(numero,int)
	actual = 0
	proximo = 1
	for i in range(0, numero):
		actual, proximo = proximo, actual + proximo
	return actual

if name == "__main__":
	print(fibonacci(0))
	print(fibonacci(1))
	print(fibonacci(2))
	print(fibonacci(3))
	print(fibonacci(5))
	print(fibonacci(33))
	print(fibonacci(36))
	print(fibonacci(60))
	