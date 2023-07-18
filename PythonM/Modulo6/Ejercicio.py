class Vehiculo:
    color ="Verde"
    ruedas=4
    puertas=2

class Coche(Vehiculo):
    velocidad =120
    cilindrada = 8

coche = Coche()
print("El coche es de color ", coche.color)
print("El coche tiene ", coche.ruedas, " ruedas")
print("El coche tiene ", coche.puertas, " puertas")
print("El coche alcanza una velocidad de ", coche.velocidad)
print("El coche tiene una cilindrada de ", coche.cilindrada)