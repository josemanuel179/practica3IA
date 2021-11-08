package dominio;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class Modelo {

    private Instances leerInstancias(String ficherArff) {
        try {
            Instances inst = new Instances(new BufferedReader(new FileReader(ficherArff)));
            inst.setClassIndex(inst.numAttributes() - 1);

            return inst;
        } 
        catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void aprenderModelo() {
        try {
            Classifier cls = new MultilayerPerceptron();

            Instances inst = leerInstancias("./training_data/atpData.arff");
            cls.buildClassifier(inst);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./models/objetoMultilayerPerceptronAtpData.model"));
            oos.writeObject(cls);
            oos.flush();
            oos.close();
        } 
        catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String aplicarModelo(Consulta consulta) {
        try{
            String[] valoresAtributos = {"player0","player1"};
            TransformacionFichero f = new TransformacionFichero();
            f.copiarFile("./test_data/modeloTest.arff");
            f.copiarFileStr("./test_data/test.arff", consulta.toString());
            
            Classifier clasificador = (Classifier) weka.core.SerializationHelper.read("./models/objetoMultilayerPerceptronAtpData.model");
            Instances data = leerInstancias("./test_data/test.arff");
            f.borrarFile("./test_data/test.arff");
            
            return valoresAtributos[(int) clasificador.classifyInstance(data.instance(0))];
        }
        catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return "Error al intentar leer el modelo";
        }
    }
}
