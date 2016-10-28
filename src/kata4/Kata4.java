package kata4;

import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {
    
    public static void main(String [] args) throws IOException{
        String fileName = "D:\\DOCUMENTOS\\MIO\\NetBeansProjects\\Kata4\\emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
        
    }
}
