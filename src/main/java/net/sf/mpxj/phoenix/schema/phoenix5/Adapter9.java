//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.02.20 at 04:38:17 PM GMT
//

package net.sf.mpxj.phoenix.schema.phoenix5;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9 extends XmlAdapter<String, Date>
{

   @Override public Date unmarshal(String value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.parseFinishDateTime(value));
   }

   @Override public String marshal(Date value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.printFinishDateTime(value));
   }

}
