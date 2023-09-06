//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.08.28 at 11:58:29 PM BST
//

package net.sf.mpxj.ganttproject.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 * <p>Java class for date complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="date"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="month" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@SuppressWarnings("all") @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "date", propOrder =
{
   "value"
}) public class Date
{

   @XmlValue protected String value;
   @XmlAttribute(name = "year") protected String year;
   @XmlAttribute(name = "month") protected Integer month;
   @XmlAttribute(name = "date") protected Integer date;
   @XmlAttribute(name = "type") protected String type;

   /**
    * Gets the value of the value property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getValue()
   {
      return value;
   }

   /**
    * Sets the value of the value property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue(String value)
   {
      this.value = value;
   }

   /**
    * Gets the value of the year property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getYear()
   {
      return year;
   }

   /**
    * Sets the value of the year property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setYear(String value)
   {
      this.year = value;
   }

   /**
    * Gets the value of the month property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getMonth()
   {
      return month;
   }

   /**
    * Sets the value of the month property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setMonth(Integer value)
   {
      this.month = value;
   }

   /**
    * Gets the value of the date property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setDate(Integer value)
   {
      this.date = value;
   }

   /**
    * Gets the value of the type property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getType()
   {
      return type;
   }

   /**
    * Sets the value of the type property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setType(String value)
   {
      this.type = value;
   }

}
