#leer xml: w3 schools (el de las commidas con <food> <breakfast_menu>)
#Q: mostrar lista de comidas y el precio
#PQ: para elegir plato
#QN: El usuario

#http://docs.python.org/3/library/xml.etree.elementtree.html

#We can import this data by reading from a file:

#import xml.etree.ElementTree as ET
#tree = ET.parse('country_data.xml')
#root = tree.getroot()

#getroot: no menterao
# 3 tokens, 17:10 empesamohh

#1: mostrar lista de comidas y el precio
#2: crear diccionario python: clave=nombre del plato, valor=precio

def getElementoRoot(ficheroXml):
    import xml.etree.ElementTree as ET
    tree = ET.parse(ficheroXml)
    root = tree.getroot()
    return root

def imprimirLista(ficheroXml):
    root = getElementoRoot(ficheroXml)
    #print(root.tag)
    for food in root:
        #print(child.tag, child.attrib)
        nombreComida = food[0].text
        precio = food[1].text
        imprimir = nombreComida + ": " + precio
        print(imprimir)

    
def crearDiccionario(ficheroXml):
    diccionario = {}
    root = getElementoRoot(ficheroXml)
    
    for food in root:
        
        nombreComida = food[0].text
        precio = food[1].text
        diccionario[nombreComida] = precio
    
    return diccionario

if __name__ == "__main__":
    #Casos test :D
    imprimirLista("breakfastMenu.xml")
    diccionario = crearDiccionario("breakfastMenu.xml")
    #La longitud del diccionario tiene q ser 5 xq hay 5 platos
    print(len(diccionario)==5)
