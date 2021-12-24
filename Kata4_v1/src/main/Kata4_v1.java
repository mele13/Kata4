package main;

import view.MailListReader_v1;
import view.MailHistogramBuilder_v1;
import view.HistogramDisplay_v1;
import model.Mail_v1;
import model.Histogram_v1;
import java.util.List;

/**
 * @author Mele13
 * 
 * Primera versión de Kata4.
 * Crea y muestra un histograma de dominios de una lista de correos electrónicos
 * almacenados en un archivo de texto.
 */
public class Kata4_v1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail_v1> mailList = MailListReader_v1.read(fileName);
        Histogram_v1<String> histogram = MailHistogramBuilder_v1.build(mailList);
        
        HistogramDisplay_v1 histogramDisplay = new HistogramDisplay_v1("Histogram", histogram);
        histogramDisplay.execute();        
    }
    
}
