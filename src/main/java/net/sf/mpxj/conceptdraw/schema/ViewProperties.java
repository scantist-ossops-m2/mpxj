//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.08.28 at 11:58:30 PM BST
//

package net.sf.mpxj.conceptdraw.schema;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;all&gt;
 *         &lt;element name="GridColumns"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Column" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TextBoxVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowCriticalPath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPlannedComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowCompleteChangeValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowCompleteChangeRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GridTextWrap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}ActiveFilter" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder = {

}) @XmlRootElement(name = "ViewProperties") public class ViewProperties
{

   @XmlElement(name = "GridColumns", required = true) protected ViewProperties.GridColumns gridColumns;
   @XmlElement(name = "TextBoxVisible") protected Boolean textBoxVisible;
   @XmlElement(name = "ShowCriticalPath") protected Boolean showCriticalPath;
   @XmlElement(name = "ShowPlannedComplete") protected Boolean showPlannedComplete;
   @XmlElement(name = "ShowCompleteChangeValue") protected Boolean showCompleteChangeValue;
   @XmlElement(name = "ShowCompleteChangeRate") protected Boolean showCompleteChangeRate;
   @XmlElement(name = "GridTextWrap") protected Boolean gridTextWrap;
   @XmlElement(name = "ActiveFilter") protected ActiveFilter activeFilter;

   /**
    * Gets the value of the gridColumns property.
    * 
    * @return
    *     possible object is
    *     {@link ViewProperties.GridColumns }
    *     
    */
   public ViewProperties.GridColumns getGridColumns()
   {
      return gridColumns;
   }

   /**
    * Sets the value of the gridColumns property.
    * 
    * @param value
    *     allowed object is
    *     {@link ViewProperties.GridColumns }
    *     
    */
   public void setGridColumns(ViewProperties.GridColumns value)
   {
      this.gridColumns = value;
   }

   /**
    * Gets the value of the textBoxVisible property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isTextBoxVisible()
   {
      return textBoxVisible;
   }

   /**
    * Sets the value of the textBoxVisible property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setTextBoxVisible(Boolean value)
   {
      this.textBoxVisible = value;
   }

   /**
    * Gets the value of the showCriticalPath property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isShowCriticalPath()
   {
      return showCriticalPath;
   }

   /**
    * Sets the value of the showCriticalPath property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setShowCriticalPath(Boolean value)
   {
      this.showCriticalPath = value;
   }

   /**
    * Gets the value of the showPlannedComplete property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isShowPlannedComplete()
   {
      return showPlannedComplete;
   }

   /**
    * Sets the value of the showPlannedComplete property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setShowPlannedComplete(Boolean value)
   {
      this.showPlannedComplete = value;
   }

   /**
    * Gets the value of the showCompleteChangeValue property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isShowCompleteChangeValue()
   {
      return showCompleteChangeValue;
   }

   /**
    * Sets the value of the showCompleteChangeValue property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setShowCompleteChangeValue(Boolean value)
   {
      this.showCompleteChangeValue = value;
   }

   /**
    * Gets the value of the showCompleteChangeRate property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isShowCompleteChangeRate()
   {
      return showCompleteChangeRate;
   }

   /**
    * Sets the value of the showCompleteChangeRate property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setShowCompleteChangeRate(Boolean value)
   {
      this.showCompleteChangeRate = value;
   }

   /**
    * Gets the value of the gridTextWrap property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isGridTextWrap()
   {
      return gridTextWrap;
   }

   /**
    * Sets the value of the gridTextWrap property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setGridTextWrap(Boolean value)
   {
      this.gridTextWrap = value;
   }

   /**
    * Gets the value of the activeFilter property.
    * 
    * @return
    *     possible object is
    *     {@link ActiveFilter }
    *     
    */
   public ActiveFilter getActiveFilter()
   {
      return activeFilter;
   }

   /**
    * Sets the value of the activeFilter property.
    * 
    * @param value
    *     allowed object is
    *     {@link ActiveFilter }
    *     
    */
   public void setActiveFilter(ActiveFilter value)
   {
      this.activeFilter = value;
   }

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
    *         &lt;element name="Column" maxOccurs="unbounded"&gt;
    *           &lt;complexType&gt;
    *             &lt;complexContent&gt;
    *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
    *                 &lt;sequence&gt;
    *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
    *                   &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
    *                   &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
    *                 &lt;/sequence&gt;
    *               &lt;/restriction&gt;
    *             &lt;/complexContent&gt;
    *           &lt;/complexType&gt;
    *         &lt;/element&gt;
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
      "column"
   }) public static class GridColumns
   {

      @XmlElement(name = "Column", required = true) protected List<ViewProperties.GridColumns.Column> column;

      /**
       * Gets the value of the column property.
       * 
       * <p>
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the Jakarta XML Binding object.
       * This is why there is not a <CODE>set</CODE> method for the column property.
       * 
       * <p>
       * For example, to add a new item, do as follows:
       * <pre>
       *    getColumn().add(newItem);
       * </pre>
       * 
       * 
       * <p>
       * Objects of the following type(s) are allowed in the list
       * {@link ViewProperties.GridColumns.Column }
       * 
       * 
       */
      public List<ViewProperties.GridColumns.Column> getColumn()
      {
         if (column == null)
         {
            column = new ArrayList<>();
         }
         return this.column;
      }

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
       *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
       *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
       *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
         "id",
         "index",
         "width"
      }) public static class Column
      {

         @XmlElement(name = "ID", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer id;
         @XmlElement(name = "Index", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer index;
         @XmlElement(name = "Width", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer width;

         /**
          * Gets the value of the id property.
          * 
          * @return
          *     possible object is
          *     {@link String }
          *     
          */
         public Integer getID()
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
         public void setID(Integer value)
         {
            this.id = value;
         }

         /**
          * Gets the value of the index property.
          * 
          * @return
          *     possible object is
          *     {@link String }
          *     
          */
         public Integer getIndex()
         {
            return index;
         }

         /**
          * Sets the value of the index property.
          * 
          * @param value
          *     allowed object is
          *     {@link String }
          *     
          */
         public void setIndex(Integer value)
         {
            this.index = value;
         }

         /**
          * Gets the value of the width property.
          * 
          * @return
          *     possible object is
          *     {@link String }
          *     
          */
         public Integer getWidth()
         {
            return width;
         }

         /**
          * Sets the value of the width property.
          * 
          * @param value
          *     allowed object is
          *     {@link String }
          *     
          */
         public void setWidth(Integer value)
         {
            this.width = value;
         }

      }

   }

}
