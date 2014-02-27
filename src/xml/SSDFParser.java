/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 *
 * @author Christopher
 */
public class SSDFParser {
    
    private XMLReader reader;
    private SSDFContentHandler contenthandler;
    private SSDFErrorHandler errorhandler;

    public SSDFParser() throws SAXNotRecognizedException, SAXNotSupportedException {
        
        contenthandler = new SSDFContentHandler();
        errorhandler = new SSDFErrorHandler();
        reader = new SAXParser();
        reader.setContentHandler(contenthandler);
        reader.setErrorHandler(errorhandler);
        reader.setFeature("http://xml.org/sax/features/validation", true);
    }
    
    public void parse(String filepath) {
        try {
            reader.parse(filepath);
        } catch (IOException ex) {
            System.out.println("Fehler, konnte Datei nicht finden.");
            JOptionPane.showMessageDialog(null, 
                "Konnte Datei nicht finden.", 
                "Fehler", 
                JOptionPane.ERROR_MESSAGE);
        } catch (SAXException ex) {
            System.out.println("Parse Fehler.");
            JOptionPane.showMessageDialog(null, 
                "Fehler beim parsen.", 
                "Parsefehler", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
