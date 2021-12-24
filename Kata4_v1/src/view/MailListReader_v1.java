package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail_v1;

public class MailListReader_v1 {
    
    public static List<Mail_v1> read(String fileName) {
        List<Mail_v1> list = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                if(Mail_v1.isMail(line)){
                    list.add(new Mail_v1(line));
                }
            }
        } catch (FileNotFoundException exception){
            System.out.println("ERROR MailHistogramReader::read (FileNotFound)" + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("ERROR MailHistogramReader::read (FileNotFound)" + exception.getMessage());
        }
        
        return list;
    }
    
}
