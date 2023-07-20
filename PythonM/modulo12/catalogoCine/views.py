from django.shortcuts import render
from .models import Director, Peliculas
# Create your views here.
def home(request):
    directores = Director.objects.all()
    peliculas = Peliculas.objects.all()
    return render(request, 'home.html',{'directores':directores, 'peliculas':peliculas})