import time

def horas_trabajo():
    return 19-tiempo.tm_hour


tiempo = time.localtime(time.time())

if tiempo.tm_hour>=19:
    print("Hora de irse a casa")
else:
    print("Quedan", horas_trabajo(), "horas mas de trabajo")