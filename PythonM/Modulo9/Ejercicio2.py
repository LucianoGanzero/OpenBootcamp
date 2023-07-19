from functools import reduce

numeros = [1,5,8,5,3,5,7,8,3,2,4,5]

suma_impares =reduce(lambda x, y: x+y, filter(lambda x: x % 2 != 0, numeros))

print(suma_impares)