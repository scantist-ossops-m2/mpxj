//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.20 at 11:29:36 PM GMT 
//


package net.sf.mpxj.phoenix.schema;

import java.util.UUID;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, UUID>
{


    public UUID unmarshal(String value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.parseUUID(value));
    }

    public String marshal(UUID value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.printUUID(value));
    }

}
