from django.db import models

# Create your models here.
class Director(models.Model):
    nombre = models.CharField(max_length=30)

    def __str__(self):
        return self.nombre

class Peliculas(models.Model):
    director = models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)
    nombre = models.CharField(max_length=50)
    descripcion = models.CharField(max_length=200)

    def __str__(self):
        return self.nombre +" by "+ str(self.director)
