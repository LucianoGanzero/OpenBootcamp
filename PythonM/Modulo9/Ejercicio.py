
paises = input("Por favor, ingrese una lista de paises separados por coma: ").replace(' ', '').split(',')

print(','.join(sorted(set(paises))))