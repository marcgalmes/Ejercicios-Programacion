playList = {}

libreria = {"California_Uber_Alles.mp3": 
                {"track-number": 3, "artist": "Dead Kennedys", "album": "Dead Kennedys", "location": "./biblioteca/California_Uber_Alles.mp3"},
            "Seattle_Party": 
                {"track-number": 1, "artist": "Chastity Belt", "album": "No regrets", "location": "./biblioteca/Seattle_Party.flac"},
            "King_Kunta":
                {"track-number": 3, "artist": "Kendrick Lamar", "album": "To Pimp A Butterfly", "location": "./biblioteca/King_Kunta.mp3"}   
            }
			

			## UTILIDADES DE DEPURACION ## 


def checkSeleccionaCancionRandom(cancion, libreria):
	assert isinstance(libreria, dict)
	if cancion not in libreria:
		return False
	return True

		
def checkPlaySuffle(playList):
	assert isinstance(playList, dict)
	listaCanciones = list(playList.keys())
	for item in listaCanciones:
		if listaCanciones.count(item)>1:
			return False
	return True

			
def seleccionaCancionRandom(libreria):
	import random
	assert isinstance(libreria, dict),"libreria no es diccionario"
	libreriaAntes = libreria.copy()
	dict_keys = libreria.keys()
	tituloCancion = random.choice(list(dict_keys))
	assert libreria==libreriaAntes,"libreria ha cambiado"
	assert tituloCancion in libreria,"tituloCancion no esta en libreria"
	return tituloCancion


def iniciarPlaylist():
	#agrega la cancion de libreria a playlist
	playList = {}#resetear playList :D q x eso se repetia siempre lo mismo
	while len(libreria)!=len(playList):
		cancion = seleccionaCancionRandom(libreria)#selecciona cancion random
		if cancion not in playList.values():#q no este ya en playlist! cuidado las claves-valores i tal, da mucho x s***
			playList[len(playList)]=cancion
			
		
	return playList
	
	assert len(libreria)==len(playList), " la longitud no es igual"
	


## RUTINAS DE UTILIDADES ## 


def imprimirCancionesReproducidas(playList):
    #muestra lista de canciones en consola
	for clave in playList.keys():#waring! keys devuelve las claves no los nombres i tal por eso imprimia 1 2 3 etc, tiene q obtener valor con el dic[clave]
		print(playList[clave])#ahora playList[clave] es ok

def lanzarVLC(libreria, playList):

    import subprocess
    import shlex
    import os

    linuxPathVLC = "/usr/bin/vlc"
    lineaComandoVLC = linuxPathVLC
    separador = " "

    for numeroCancion in sorted(playList.keys()):
        tituloCancion = playList[numeroCancion]
        try:
            rutaAccesoFichero = libreria[tituloCancion]["location"]
        except KeyError:
            print("la cancion " + str(tituloCancion) + " no se encuentra en la biblioteca")
        else:
            if os.path.exists(str(rutaAccesoFichero)):
                lineaComandoVLC = lineaComandoVLC + separador + str(rutaAccesoFichero)
            else:
                pass

    # Popen necesita una lista de string
    args = shlex.split(lineaComandoVLC)

    try:
        procesoVLC = subprocess.Popen(args)
        # procesoVLC = subprocess.Popen(["/usr/bin/vlc", "California_Uber_Alles.mp3", "Seattle_Party.flac"])
    except OSError:
        print("el fichero no existe")
    except ValueError:
        print("argumentos invalidos")
    else:
        print("lanzando VLC con lista aleatoria")


## FUNCION PRINCIPAL ## 


def playSuffle(libreria, playList):
    #genera la lista aleatoria de canciones a partir de la libreria
	playList.clear()
	pararBucle = False
	while not pararBucle:
		if len(libreria)==len(playList):
			pararBucle = True
			#break#no use break no es necesario
		#if pararBucle:
			#break
		cancionRandom = seleccionaCancionRandom(libreria)
		if cancionRandom not in playList.values():
			playList[len(playList)]=cancionRandom
	return True
		



## PROGRAMA PRINCIPAL ##

playList = {}

libreria = {"California_Uber_Alles.mp3": 
                {"track-number": 3, "artist": "Dead Kennedys", "album": "Dead Kennedys", "location": "./biblioteca/California_Uber_Alles.mp3"},
            "Seattle_Party": 
                {"track-number": 1, "artist": "Chastity Belt", "album": "No regrets", "location": "./biblioteca/Seattle_Party.flac"},
            "King_Kunta":
                {"track-number": 3, "artist": "Kendrick Lamar", "album": "To Pimp A Butterfly", "location": "./biblioteca/King_Kunta.mp3"}   
            }

# for i in range(1,1001):
print("---- prueba programa principal ----")
print(" (playshuffle i luego imprimirCancionesReproducidas i lanzarvlc")
print("----")
assert playSuffle(libreria, playList)

# libreriaLista = []
# assert playSuffle(libreriaLista)

imprimirCancionesReproducidas(playList)

lanzarVLC(libreria, playList)
	
### CASOS TEST ###
print("")#ctrlD duplica la linea xD
print("")
print("--- casos test ---")
print("")
print("iniciarplaylist 11 veces:")
for i in range(1,11):
	print(iniciarPlaylist())

print("")
print("inicpar playlist 1 vez:")
print(iniciarPlaylist())

print("")
print("")
print("--- checks ---")
print("")
print("check ")

for i in range(1,1000):
	cancion = seleccionaCancionRandom(libreria)
	assert checkSeleccionaCancionRandom(cancion,libreria)
	playList = {}
	playSuffle(libreria,playList)
	assert checkPlaySuffle(playList)
	
print("1000 checks pasados ?)")
print("--- fin del programa ---")
