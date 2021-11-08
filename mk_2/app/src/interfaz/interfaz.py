class Interfaz():
    def __init__(self):
        raiz = Tk()
        raiz.geometry('300x200')
        raiz.configure(bg = 'white')
        raiz.title('Weka')
        ttk.Button(raiz, text='Salir', command=raiz.destroy).pack(side=BOTTOM)
        raiz.mainloop()
