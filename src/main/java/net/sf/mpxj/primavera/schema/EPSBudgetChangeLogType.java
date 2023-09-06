//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.08.28 at 11:58:23 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for EPSBudgetChangeLogType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EPSBudgetChangeLogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="-1.0E14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChangeNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EPSId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EPSName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EPSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Reason" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="130"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Responsible" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="Pending"/&gt;
 *               &lt;enumeration value="Approved"/&gt;
 *               &lt;enumeration value="Not Approved"/&gt;
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "EPSBudgetChangeLogType", propOrder =
{
   "amount",
   "changeNumber",
   "createDate",
   "createUser",
   "date",
   "epsId",
   "epsName",
   "epsObjectId",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "reason",
   "responsible",
   "status"
}) public class EPSBudgetChangeLogType
{

   @XmlElement(name = "Amount", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double amount;
   @XmlElement(name = "ChangeNumber") @XmlJavaTypeAdapter(Adapter1.class) protected String changeNumber;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "Date", type = String.class) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime date;
   @XmlElement(name = "EPSId") @XmlJavaTypeAdapter(Adapter1.class) protected String epsId;
   @XmlElement(name = "EPSName") @XmlJavaTypeAdapter(Adapter1.class) protected String epsName;
   @XmlElement(name = "EPSObjectId") protected Integer epsObjectId;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "Reason") @XmlJavaTypeAdapter(Adapter1.class) protected String reason;
   @XmlElement(name = "Responsible") @XmlJavaTypeAdapter(Adapter1.class) protected String responsible;
   @XmlElement(name = "Status") @XmlJavaTypeAdapter(Adapter1.class) protected String status;

   /**
    * Gets the value of the amount property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getAmount()
   {
      return amount;
   }

   /**
    * Sets the value of the amount property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setAmount(Double value)
   {
      this.amount = value;
   }

   /**
    * Gets the value of the changeNumber property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getChangeNumber()
   {
      return changeNumber;
   }

   /**
    * Sets the value of the changeNumber property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setChangeNumber(String value)
   {
      this.changeNumber = value;
   }

   /**
    * Gets the value of the createDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateDate(LocalDateTime value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the date property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDate(LocalDateTime value)
   {
      this.date = value;
   }

   /**
    * Gets the value of the epsId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getEPSId()
   {
      return epsId;
   }

   /**
    * Sets the value of the epsId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setEPSId(String value)
   {
      this.epsId = value;
   }

   /**
    * Gets the value of the epsName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getEPSName()
   {
      return epsName;
   }

   /**
    * Sets the value of the epsName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setEPSName(String value)
   {
      this.epsName = value;
   }

   /**
    * Gets the value of the epsObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getEPSObjectId()
   {
      return epsObjectId;
   }

   /**
    * Sets the value of the epsObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setEPSObjectId(Integer value)
   {
      this.epsObjectId = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateDate(LocalDateTime value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the objectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the reason property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getReason()
   {
      return reason;
   }

   /**
    * Sets the value of the reason property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setReason(String value)
   {
      this.reason = value;
   }

   /**
    * Gets the value of the responsible property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResponsible()
   {
      return responsible;
   }

   /**
    * Sets the value of the responsible property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResponsible(String value)
   {
      this.responsible = value;
   }

   /**
    * Gets the value of the status property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

}
