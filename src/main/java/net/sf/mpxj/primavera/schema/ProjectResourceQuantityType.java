//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.12 at 08:36:06 AM GMT
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for ProjectResourceQuantityType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProjectResourceQuantityType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CommittedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="FinancialPeriod1ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FinancialPeriod1Quantity" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="FinancialPeriod2ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FinancialPeriod2Quantity" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="FinancialPeriodTmplId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="MonthStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Quantity" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RoleObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WeekStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectResourceQuantityType", propOrder =
{
   "committedFlag",
   "createDate",
   "createUser",
   "financialPeriod1ObjectId",
   "financialPeriod1Quantity",
   "financialPeriod2ObjectId",
   "financialPeriod2Quantity",
   "financialPeriodTmplId",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "monthStartDate",
   "projectObjectId",
   "projectResourceObjectId",
   "quantity",
   "resourceObjectId",
   "roleObjectId",
   "wbsObjectId",
   "weekStartDate"
}) public class ProjectResourceQuantityType
{

   @XmlElement(name = "CommittedFlag", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean committedFlag;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "FinancialPeriod1ObjectId", nillable = true) protected Integer financialPeriod1ObjectId;
   @XmlElement(name = "FinancialPeriod1Quantity", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) protected Double financialPeriod1Quantity;
   @XmlElement(name = "FinancialPeriod2ObjectId", nillable = true) protected Integer financialPeriod2ObjectId;
   @XmlElement(name = "FinancialPeriod2Quantity", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) protected Double financialPeriod2Quantity;
   @XmlElement(name = "FinancialPeriodTmplId") protected Integer financialPeriodTmplId;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "MonthStartDate", type = String.class) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date monthStartDate;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "ProjectResourceObjectId") protected Integer projectResourceObjectId;
   @XmlElement(name = "Quantity", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) protected Double quantity;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "RoleObjectId", nillable = true) protected Integer roleObjectId;
   @XmlElement(name = "WBSObjectId", nillable = true) protected Integer wbsObjectId;
   @XmlElement(name = "WeekStartDate", type = String.class) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date weekStartDate;

   /**
    * Gets the value of the committedFlag property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isCommittedFlag()
   {
      return committedFlag;
   }

   /**
    * Sets the value of the committedFlag property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCommittedFlag(Boolean value)
   {
      this.committedFlag = value;
   }

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
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
   public void setCreateDate(Date value)
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
    * Gets the value of the financialPeriod1ObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getFinancialPeriod1ObjectId()
   {
      return financialPeriod1ObjectId;
   }

   /**
    * Sets the value of the financialPeriod1ObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setFinancialPeriod1ObjectId(Integer value)
   {
      this.financialPeriod1ObjectId = value;
   }

   /**
    * Gets the value of the financialPeriod1Quantity property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getFinancialPeriod1Quantity()
   {
      return financialPeriod1Quantity;
   }

   /**
    * Sets the value of the financialPeriod1Quantity property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFinancialPeriod1Quantity(Double value)
   {
      this.financialPeriod1Quantity = value;
   }

   /**
    * Gets the value of the financialPeriod2ObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getFinancialPeriod2ObjectId()
   {
      return financialPeriod2ObjectId;
   }

   /**
    * Sets the value of the financialPeriod2ObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setFinancialPeriod2ObjectId(Integer value)
   {
      this.financialPeriod2ObjectId = value;
   }

   /**
    * Gets the value of the financialPeriod2Quantity property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getFinancialPeriod2Quantity()
   {
      return financialPeriod2Quantity;
   }

   /**
    * Sets the value of the financialPeriod2Quantity property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFinancialPeriod2Quantity(Double value)
   {
      this.financialPeriod2Quantity = value;
   }

   /**
    * Gets the value of the financialPeriodTmplId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getFinancialPeriodTmplId()
   {
      return financialPeriodTmplId;
   }

   /**
    * Sets the value of the financialPeriodTmplId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setFinancialPeriodTmplId(Integer value)
   {
      this.financialPeriodTmplId = value;
   }

   /**
    * Gets the value of the isBaseline property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the isTemplate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsTemplate()
   {
      return isTemplate;
   }

   /**
    * Sets the value of the isTemplate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsTemplate(Boolean value)
   {
      this.isTemplate = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
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
   public void setLastUpdateDate(Date value)
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
    * Gets the value of the monthStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getMonthStartDate()
   {
      return monthStartDate;
   }

   /**
    * Sets the value of the monthStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setMonthStartDate(Date value)
   {
      this.monthStartDate = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the projectResourceObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectResourceObjectId()
   {
      return projectResourceObjectId;
   }

   /**
    * Sets the value of the projectResourceObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectResourceObjectId(Integer value)
   {
      this.projectResourceObjectId = value;
   }

   /**
    * Gets the value of the quantity property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getQuantity()
   {
      return quantity;
   }

   /**
    * Sets the value of the quantity property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setQuantity(Double value)
   {
      this.quantity = value;
   }

   /**
    * Gets the value of the resourceObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getResourceObjectId()
   {
      return resourceObjectId;
   }

   /**
    * Sets the value of the resourceObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setResourceObjectId(Integer value)
   {
      this.resourceObjectId = value;
   }

   /**
    * Gets the value of the roleObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRoleObjectId()
   {
      return roleObjectId;
   }

   /**
    * Sets the value of the roleObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRoleObjectId(Integer value)
   {
      this.roleObjectId = value;
   }

   /**
    * Gets the value of the wbsObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getWBSObjectId()
   {
      return wbsObjectId;
   }

   /**
    * Sets the value of the wbsObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setWBSObjectId(Integer value)
   {
      this.wbsObjectId = value;
   }

   /**
    * Gets the value of the weekStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getWeekStartDate()
   {
      return weekStartDate;
   }

   /**
    * Sets the value of the weekStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setWeekStartDate(Date value)
   {
      this.weekStartDate = value;
   }

}
