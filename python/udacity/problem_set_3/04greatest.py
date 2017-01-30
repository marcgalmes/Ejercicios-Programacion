# Define a procedure, greatest,
# that takes as input a list
# of positive numbers, and
# returns the greatest number
# in that list. If the input
# list is empty, the output
# should be 0.

def greatest(lista):
	if lista == []:
		return 0
	numeroMayor = lista[0]
	for numero in lista:
		if numero > numeroMayor:
			numeroMayor = numero
	return numeroMayor



print greatest([4,23,1])
#>>> 23
print greatest([])
#>>> 0