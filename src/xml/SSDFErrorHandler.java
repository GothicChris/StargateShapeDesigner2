/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import javax.swing.JOptionPane;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 *
 * @author Christopher
 */
public class SSDFErrorHandler implements ErrorHandler{

    public void warning(SAXParseException exception) throws SAXException {
        System.out.println("Warning: " + exception.getMessage());
    }

    public void error(SAXParseException exception) throws SAXException {
        System.out.println("Error: " + exception.getMessage());
        JOptionPane.showMessageDialog(null, 
                "Error beim parsen der SSDF.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
    }

    public void fatalError(SAXParseException exception) throws SAXException {
        System.out.println("FatalError: " + exception.getMessage());
        JOptionPane.showMessageDialog(null, 
                "FatalError beim parsen der SSDF.", 
                "FatalError", 
                JOptionPane.ERROR_MESSAGE);
    }
    
}
