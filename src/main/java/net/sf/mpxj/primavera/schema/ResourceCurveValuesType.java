//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.08.28 at 11:58:23 PM BST
//

package net.sf.mpxj.primavera.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for ResourceCurveValuesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResourceCurveValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value5"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value10"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value15"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value20"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value25"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value30"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value35"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value40"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value45"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value50"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value55"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value60"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value65"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value70"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value75"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value80"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value85"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value90"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value95"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value100"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ResourceCurveValuesType", propOrder =
{
   "value0",
   "value5",
   "value10",
   "value15",
   "value20",
   "value25",
   "value30",
   "value35",
   "value40",
   "value45",
   "value50",
   "value55",
   "value60",
   "value65",
   "value70",
   "value75",
   "value80",
   "value85",
   "value90",
   "value95",
   "value100"
}) public class ResourceCurveValuesType
{

   @XmlElement(name = "Value0", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value0;
   @XmlElement(name = "Value5", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value5;
   @XmlElement(name = "Value10", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value10;
   @XmlElement(name = "Value15", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value15;
   @XmlElement(name = "Value20", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value20;
   @XmlElement(name = "Value25", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value25;
   @XmlElement(name = "Value30", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value30;
   @XmlElement(name = "Value35", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value35;
   @XmlElement(name = "Value40", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value40;
   @XmlElement(name = "Value45", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value45;
   @XmlElement(name = "Value50", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value50;
   @XmlElement(name = "Value55", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value55;
   @XmlElement(name = "Value60", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value60;
   @XmlElement(name = "Value65", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value65;
   @XmlElement(name = "Value70", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value70;
   @XmlElement(name = "Value75", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value75;
   @XmlElement(name = "Value80", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value80;
   @XmlElement(name = "Value85", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value85;
   @XmlElement(name = "Value90", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value90;
   @XmlElement(name = "Value95", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value95;
   @XmlElement(name = "Value100", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter3.class) protected Double value100;

   /**
    * Gets the value of the value0 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue0()
   {
      return value0;
   }

   /**
    * Sets the value of the value0 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue0(Double value)
   {
      this.value0 = value;
   }

   /**
    * Gets the value of the value5 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue5()
   {
      return value5;
   }

   /**
    * Sets the value of the value5 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue5(Double value)
   {
      this.value5 = value;
   }

   /**
    * Gets the value of the value10 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue10()
   {
      return value10;
   }

   /**
    * Sets the value of the value10 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue10(Double value)
   {
      this.value10 = value;
   }

   /**
    * Gets the value of the value15 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue15()
   {
      return value15;
   }

   /**
    * Sets the value of the value15 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue15(Double value)
   {
      this.value15 = value;
   }

   /**
    * Gets the value of the value20 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue20()
   {
      return value20;
   }

   /**
    * Sets the value of the value20 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue20(Double value)
   {
      this.value20 = value;
   }

   /**
    * Gets the value of the value25 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue25()
   {
      return value25;
   }

   /**
    * Sets the value of the value25 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue25(Double value)
   {
      this.value25 = value;
   }

   /**
    * Gets the value of the value30 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue30()
   {
      return value30;
   }

   /**
    * Sets the value of the value30 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue30(Double value)
   {
      this.value30 = value;
   }

   /**
    * Gets the value of the value35 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue35()
   {
      return value35;
   }

   /**
    * Sets the value of the value35 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue35(Double value)
   {
      this.value35 = value;
   }

   /**
    * Gets the value of the value40 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue40()
   {
      return value40;
   }

   /**
    * Sets the value of the value40 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue40(Double value)
   {
      this.value40 = value;
   }

   /**
    * Gets the value of the value45 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue45()
   {
      return value45;
   }

   /**
    * Sets the value of the value45 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue45(Double value)
   {
      this.value45 = value;
   }

   /**
    * Gets the value of the value50 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue50()
   {
      return value50;
   }

   /**
    * Sets the value of the value50 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue50(Double value)
   {
      this.value50 = value;
   }

   /**
    * Gets the value of the value55 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue55()
   {
      return value55;
   }

   /**
    * Sets the value of the value55 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue55(Double value)
   {
      this.value55 = value;
   }

   /**
    * Gets the value of the value60 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue60()
   {
      return value60;
   }

   /**
    * Sets the value of the value60 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue60(Double value)
   {
      this.value60 = value;
   }

   /**
    * Gets the value of the value65 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue65()
   {
      return value65;
   }

   /**
    * Sets the value of the value65 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue65(Double value)
   {
      this.value65 = value;
   }

   /**
    * Gets the value of the value70 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue70()
   {
      return value70;
   }

   /**
    * Sets the value of the value70 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue70(Double value)
   {
      this.value70 = value;
   }

   /**
    * Gets the value of the value75 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue75()
   {
      return value75;
   }

   /**
    * Sets the value of the value75 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue75(Double value)
   {
      this.value75 = value;
   }

   /**
    * Gets the value of the value80 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue80()
   {
      return value80;
   }

   /**
    * Sets the value of the value80 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue80(Double value)
   {
      this.value80 = value;
   }

   /**
    * Gets the value of the value85 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue85()
   {
      return value85;
   }

   /**
    * Sets the value of the value85 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue85(Double value)
   {
      this.value85 = value;
   }

   /**
    * Gets the value of the value90 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue90()
   {
      return value90;
   }

   /**
    * Sets the value of the value90 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue90(Double value)
   {
      this.value90 = value;
   }

   /**
    * Gets the value of the value95 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue95()
   {
      return value95;
   }

   /**
    * Sets the value of the value95 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue95(Double value)
   {
      this.value95 = value;
   }

   /**
    * Gets the value of the value100 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getValue100()
   {
      return value100;
   }

   /**
    * Sets the value of the value100 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setValue100(Double value)
   {
      this.value100 = value;
   }

}
