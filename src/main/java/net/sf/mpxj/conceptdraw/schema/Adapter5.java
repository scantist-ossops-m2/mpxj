//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.08.28 at 11:58:30 PM BST
//

package net.sf.mpxj.conceptdraw.schema;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5 extends XmlAdapter<String, Integer>
{

   @Override
   public Integer unmarshal(String value)
   {
      return (net.sf.mpxj.conceptdraw.DatatypeConverter.parseInteger(value));
   }

   @Override
   public String marshal(Integer value)
   {
      return (net.sf.mpxj.conceptdraw.DatatypeConverter.printInteger(value));
   }

}
