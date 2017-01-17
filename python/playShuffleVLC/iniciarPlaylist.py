playList = {}

libreria = {"California_Uber_Alles.mp3": 
                {"track-number": 3, "artist": "Dead Kennedys", "album": "Dead Kennedys", "location": "./biblioteca/California_Uber_Alles.mp3"},
            "Seattle_Party": 
                {"track-number": 1, "artist": "Chastity Belt", "album": "No regrets", "location": "./biblioteca/Seattle_Party.flac"},
            "King_Kunta":
                {"track-number": 3, "artist": "Kendrick Lamar", "album": "To Pimp A Butterfly", "location": "./biblioteca/King_Kunta.mp3"}   
            }
			

def seleccionaCancionRandom(libreria):
	import random
	assert isinstance(libreria, dict),"la libreria no es diccionario"
	longitud = len(libreria)
	dict_keys = libreria.keys()
	tituloCancion = random.choice(list(dict_keys))
	assert len(libreria)==longitud,"longitud ha cambiado"
	assert tituloCancion in libreria,"la cancion no esta en la libreria"
	return tituloCancion


def iniciarPlaylist():
	for cancion in libreria:
		
		cancion = seleccionaCancionRandom(libreria)
		if cancion not in playList:
			playList[cancion]=libreria[cancion]
		else:
			iniciarPlaylist()
		
		if len(libreria)==len(playList):
			return playList
	
	#assert len(libreria)!=len(playList), " la longitud no es igual"
	
	
### CASOS TEST ###
#for i in range(1,11):
	#print(list(iniciarPlaylist().keys()))

print(list(iniciarPlaylist().keys()))
print(list(iniciarPlaylist().keys()))

