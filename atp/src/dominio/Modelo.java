package dominio;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class Modelo {

    private Instances leerInstancias(String ficherArff) {
        try {
            Instances inst = new Instances(new BufferedReader(new FileReader("./training_data/atpData.arff")));
            inst.setClassIndex(inst.numAttributes() - 1);

            return inst;
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void aprenderModelo()
    {
        try {
            Classifier cls = new M5P();

            Instances inst = leerInstancias("./training_data/atpData.arff");
            cls.buildClassifier(inst);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./models/objetoJ48AtpData.model"));
            oos.writeObject(cls);
            oos.flush();
            oos.close();
        } catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String aplicarModelo() {
        try{
            int valoresAtributos;
            Classifier clasificador = (Classifier) weka.core.SerializationHelper.read("./models/objetoJ48AtpData.model");
            Instances data = leerInstancias("./test_data/test.arff")
            return valoresAtributos[clasificador.classifyInstance(data.instance(0))];
        }catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return "Error al intentar leer el modelo";
        }
    }
}
