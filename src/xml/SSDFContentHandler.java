/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 *
 * @author Christopher
 */
public class SSDFContentHandler implements ContentHandler{

    public void setDocumentLocator(Locator locator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startDocument() throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endDocument() throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endPrefixMapping(String prefix) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void processingInstruction(String target, String data) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void skippedEntity(String name) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
