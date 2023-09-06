//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.08.28 at 11:58:30 PM BST
//

package net.sf.mpxj.conceptdraw.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryUnits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrimaryAlign" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SecondaryUnits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SecondaryAlign" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SecondaryCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "primaryUnits",
   "primaryAlign",
   "secondaryUnits",
   "secondaryAlign",
   "secondaryCount"
}) @XmlRootElement(name = "TimeScale") public class TimeScale
{

   @XmlElement(name = "PrimaryUnits", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer primaryUnits;
   @XmlElement(name = "PrimaryAlign", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer primaryAlign;
   @XmlElement(name = "SecondaryUnits", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer secondaryUnits;
   @XmlElement(name = "SecondaryAlign", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer secondaryAlign;
   @XmlElement(name = "SecondaryCount", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer secondaryCount;

   /**
    * Gets the value of the primaryUnits property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Integer getPrimaryUnits()
   {
      return primaryUnits;
   }

   /**
    * Sets the value of the primaryUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPrimaryUnits(Integer value)
   {
      this.primaryUnits = value;
   }

   /**
    * Gets the value of the primaryAlign property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Integer getPrimaryAlign()
   {
      return primaryAlign;
   }

   /**
    * Sets the value of the primaryAlign property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPrimaryAlign(Integer value)
   {
      this.primaryAlign = value;
   }

   /**
    * Gets the value of the secondaryUnits property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Integer getSecondaryUnits()
   {
      return secondaryUnits;
   }

   /**
    * Sets the value of the secondaryUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSecondaryUnits(Integer value)
   {
      this.secondaryUnits = value;
   }

   /**
    * Gets the value of the secondaryAlign property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Integer getSecondaryAlign()
   {
      return secondaryAlign;
   }

   /**
    * Sets the value of the secondaryAlign property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSecondaryAlign(Integer value)
   {
      this.secondaryAlign = value;
   }

   /**
    * Gets the value of the secondaryCount property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Integer getSecondaryCount()
   {
      return secondaryCount;
   }

   /**
    * Sets the value of the secondaryCount property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSecondaryCount(Integer value)
   {
      this.secondaryCount = value;
   }

}
