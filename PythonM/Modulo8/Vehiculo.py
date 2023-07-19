import pickle

class Vehiculo:
    nombre =""
    puertas= 0
    color=""

    def __init__(self,nombre,puertas,color):
        self.color=color
        self.nombre=nombre
        self.puertas=puertas

    def __str__(self):
        return f"El auto es un {self.nombre} color {self.color} {self.puertas} puertas"

auto = Vehiculo("Corsa",3,"Verde")

f = open('texto.txt', 'wb')
pickle.dump(auto, f)
f.close()
print(str(auto))

f =open('texto.txt')
otroAuto= pickle.load(f)
print(str(otroAuto))
f.close()
