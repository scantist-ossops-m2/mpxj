//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.02.20 at 04:38:15 PM GMT
//

package net.sf.mpxj.phoenix.schema.phoenix4;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.Duration;

public class Adapter3 extends XmlAdapter<String, Duration>
{

   @Override public Duration unmarshal(String value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.parseDuration(value));
   }

   @Override public String marshal(Duration value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.printDuration(value));
   }

}
