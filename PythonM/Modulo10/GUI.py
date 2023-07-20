import tkinter
import tkinter as tk
from tkinter import ttk

def imprimir(event):
    print(seleccionada.get())

def reinicio(event):
    seleccionada.set(None)

window = tk.Tk()
window.columnconfigure(0,weight=1)
window.columnconfigure(1,weight=1)
window.rowconfigure(0,weight=1)
window.rowconfigure(1,weight=1)
window.rowconfigure(2,weight=1)
window.rowconfigure(3,weight=1)

seleccionada = tkinter.StringVar()
etiqueta = tk.Label(window,text="Te gusta como juega Boca?",bg='yellow',fg='blue')
r1 = tk.Radiobutton(window, text="Si",value='1',variable=seleccionada)
r2 = tk.Radiobutton(window, text="No",value='2',variable=seleccionada)
r3 = tk.Radiobutton(window, text="Mas o menos",value='3',variable=seleccionada)
aceptar =ttk.Button(window,text='Aceptar')
reiniciar = ttk.Button(window, text="Reiniciar")
etiqueta.grid(column=0,row=0,sticky=tk.W)
r1.grid(column=0,row=1,sticky=tkinter.W)
r2.grid(column=0,row=2,sticky=tkinter.W)
r3.grid(column=0,row=3,sticky=tkinter.W)
aceptar.grid(column=0, row=4, sticky=tkinter.W)
reiniciar.grid(column=1,row=4,sticky=tkinter.E)

aceptar.bind('<Button-1>', imprimir)
reiniciar.bind('<Button-1>', reinicio)

window.mainloop()