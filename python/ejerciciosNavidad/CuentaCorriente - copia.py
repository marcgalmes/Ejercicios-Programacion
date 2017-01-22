class CuentaCorriente:

	#Constructor al que se le pasen como argumentos todas las propiedades que tiene la clase.
	def __init__(self, nombre, apellidos, direccion, telefono, nif, saldo):
		self.nombre = nombre
		self.apellidos = apellidos
		self.direccion = direccion
		self.telefono = telefono
		self.nif = nif
		self.saldo = saldo

	#Constructor que por defecto inicializa las propiedades de la clase (programación defensiva).
	def __init__(self):
		self.nombre = ""
		self.apellidos = ""
		self.direccion = ""
		self.telefono = ""
		self.nif = ""
		self.saldo = 0

	#set() y get() para todas las propiedades de la clase [Abstracción y encapsulamiento].

	def setNombre(self, nombre):
		self.nombre = nombre
		
	def setApellidos(self, apellidos):
		self.apellidos = apellidos
		
	def setDireccion(self, direccion):
		self.direccion = direccion
		
	def setTelefono(self, telefono):
		self.telefono = telefono
		
	def setNif(self, nif):
		self.nif = nif
		
	def setSaldo(self, saldo):
		self.saldo = saldo
		
		
	def getNombre(self):
		return self.nombre
		
	def getApellidos(self):
		return self.apellidos
		
	def getDireccion(self):
		return self.direccion
		
	def getTelefono(self):
		return self.telefono
		
	def getNif(self):
		return self.nif
		
	def getSaldo(self):
		return self.saldo
		
		
		
		
	#retirarDinero(): resta al saldo una cantidad de dinero pasada como argumento.

	def retirarDinero(self,cantidad):
		self.saldo -= cantidad

	#ingresarDinero(): añade al saldo una cantidad de dinero.
	def ingresarDinero(self,cantidad):
		self.saldo += cantidad

	#consultarCuenta(): visualizará los datos de la cuenta.
	def consultarCuenta(self):
		print("Nombre: " 	+ self.nombre)
		print("Apellidos: " + self.apellidos)
		print("NIF: " 		+ self.nif)
		print("Saldo: "			+ str(self.saldo))

	 #saldoNegativo(): devolverá un valor lógico indicando si la cuenta está o no en números rojos
	def saldoNegativo(self):
		return self.saldo<0
