package view;

import java.util.List;
import model.Histogram_v1;
import model.Mail_v1;

public class MailHistogramBuilder_v1 {
    
    /**
     * Método que lee los emails del fichero de texto. Los correos válidos se
     * guardan en una lista.
     * 
     * @param mailList
     * @return histogram
     */
    public static Histogram_v1<String> build(List<Mail_v1> mailList) {
        
        Histogram_v1<String> histogram = new Histogram_v1<>();
        
        for(Mail_v1 mail: mailList) {
            histogram.increment(mail.getDomain());
        }
        
        return histogram;        
    }
}
