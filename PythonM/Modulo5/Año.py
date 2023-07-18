def es_bisiesto(año):
    if (año % 4==0):
        return True
    else:
        return False

print ("Es "+str(es_bisiesto(2014))+" que el año 2014 es bisiesto")