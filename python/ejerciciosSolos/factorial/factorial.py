import math

def factorial(numero):
	assert isinstance (numero,int),"se debe pasar un numero"
	assert numero>=0,"numero no puede ser negativo"
	if numero == 0:
		return 1
	resultado = 1
	for multiplicador in range(1,numero,1):
		resultado = resultado * multiplicador
	resultado = resultado * numero
	return resultado
	

if name == "__main__":
	### casos test ###
	if factorial(0)!=1:
		print("0 no ok")

	if factorial(1)!=1:
		print("1 no ok")

	if factorial(2)!=2:
		print("2 no ok")

	if factorial(3)!=6:
		print("3 no ok")

	if factorial(4)!=24:
		print("no ok")

	if factorial(5)!=120:
		print("no ok")

	if factorial(6)!=720:
		print("no ok")
		
	if factorial(7)!=5040:
		print("no ok")

	if factorial(8)!=40320:
		print("no ok")

	if factorial(9)!=362880:
		print("no ok")

	if factorial(10)!=3628800:
		print("no ok")

	#caso test automatico
	print("--- automatico ---")	
	for i in range(1,1000):
		if math.factorial(i)!=factorial(i):
			print("no ok")
			