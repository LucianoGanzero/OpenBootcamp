class Alumno:
    _nombre = ""
    _nota = 0
    def __init__(self, nombre, nota):
        self._nombre = nombre
        self._nota = nota

    def get_nota(self):
        return self._nota

    def get_nombre(self):
        return self._nombre

    def aprobado(self):
        if (self._nota >= 6):
            return True
        else:
            return False


alumno = Alumno("Luciano", 7)
def aprobo(nota):
    if nota:
        return "aprobo"
    else:
        return "desaprobo"


print("El alumno", alumno.get_nombre(), "saco una nota con puntaje", alumno.get_nota(), "y por tanto", aprobo(alumno.aprobado))
