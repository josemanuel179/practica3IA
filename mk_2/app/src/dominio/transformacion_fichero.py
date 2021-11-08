import shutil
import os

def copiar_file_str(file_name, string):
    try:
        f = open(file_name, "a")
        f.write(string)
    except:
        print("Error al copiar string en el fichero")

def copiar_file(file_name):
    try:
        shutil.copyfile(file_name, "../test_data/test.arff")
    except:
        print("Error al copiar el fichero en './test_data/test.arff'")

def borrar_file(file_name):
    try:
        os.remove(file_name)
    except:
        print("Error al eliminar fichero")
