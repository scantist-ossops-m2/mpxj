//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.10.08 at 06:22:34 PM BST
//

package net.sf.mpxj.phoenix.schema.phoenix5;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.TimeUnit;

public class Adapter6 extends XmlAdapter<String, TimeUnit>
{

   @Override public TimeUnit unmarshal(String value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.parseTimeUnits(value));
   }

   @Override public String marshal(TimeUnit value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.printTimeUnits(value));
   }

}