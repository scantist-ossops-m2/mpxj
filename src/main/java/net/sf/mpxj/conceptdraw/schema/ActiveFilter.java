//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.06.16 at 11:06:06 AM BST
//

package net.sf.mpxj.conceptdraw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for anonymous complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="IsFilterInverted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="ShowHighlightFilteredTasks"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="RowVisible"/&amp;gt;
 *               &amp;lt;enumeration value="RowHighlight"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ShowPhasesOfFilteredTasks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "id",
   "isFilterInverted",
   "showHighlightFilteredTasks",
   "showPhasesOfFilteredTasks"
}) @XmlRootElement(name = "ActiveFilter") public class ActiveFilter
{

   @XmlElement(name = "ID", required = true) protected String id;
   @XmlElement(name = "IsFilterInverted") protected boolean isFilterInverted;
   @XmlElement(name = "ShowHighlightFilteredTasks", required = true) protected String showHighlightFilteredTasks;
   @XmlElement(name = "ShowPhasesOfFilteredTasks") protected boolean showPhasesOfFilteredTasks;

   /**
    * Gets the value of the id property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getID()
   {
      return id;
   }

   /**
    * Sets the value of the id property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setID(String value)
   {
      this.id = value;
   }

   /**
    * Gets the value of the isFilterInverted property.
    *
    */
   public boolean isIsFilterInverted()
   {
      return isFilterInverted;
   }

   /**
    * Sets the value of the isFilterInverted property.
    *
    */
   public void setIsFilterInverted(boolean value)
   {
      this.isFilterInverted = value;
   }

   /**
    * Gets the value of the showHighlightFilteredTasks property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getShowHighlightFilteredTasks()
   {
      return showHighlightFilteredTasks;
   }

   /**
    * Sets the value of the showHighlightFilteredTasks property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setShowHighlightFilteredTasks(String value)
   {
      this.showHighlightFilteredTasks = value;
   }

   /**
    * Gets the value of the showPhasesOfFilteredTasks property.
    *
    */
   public boolean isShowPhasesOfFilteredTasks()
   {
      return showPhasesOfFilteredTasks;
   }

   /**
    * Sets the value of the showPhasesOfFilteredTasks property.
    *
    */
   public void setShowPhasesOfFilteredTasks(boolean value)
   {
      this.showPhasesOfFilteredTasks = value;
   }

}
