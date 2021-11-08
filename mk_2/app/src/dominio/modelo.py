import weka.core.jvm as jvm

try:
    jvm.start()
except:
    print("Error al iniciar la máquina virtual de JAVA")

class Modelo:
    def leer_instancias(ficheroArff):

