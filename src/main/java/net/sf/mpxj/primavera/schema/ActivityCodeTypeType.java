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
 * <p>Java class for ActivityCodeTypeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityCodeTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EPSCodeTypeHierarchy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EPSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSecureCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Length" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RefProjectObjectIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Scope" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Global"/&gt;
 *               &lt;enumeration value="EPS"/&gt;
 *               &lt;enumeration value="Project"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityCodeTypeType", propOrder =
{
   "createDate",
   "createUser",
   "epsCodeTypeHierarchy",
   "epsObjectId",
   "isBaseline",
   "isSecureCode",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "length",
   "name",
   "objectId",
   "projectObjectId",
   "refProjectObjectIds",
   "scope",
   "sequenceNumber"
}) public class ActivityCodeTypeType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "EPSCodeTypeHierarchy") @XmlJavaTypeAdapter(Adapter1.class) protected String epsCodeTypeHierarchy;
   @XmlElement(name = "EPSObjectId", nillable = true) protected Integer epsObjectId;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsSecureCode", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isSecureCode;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "Length") protected Integer length;
   @XmlElement(name = "Name") @XmlJavaTypeAdapter(Adapter1.class) protected String name;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "RefProjectObjectIds") @XmlJavaTypeAdapter(Adapter1.class) protected String refProjectObjectIds;
   @XmlElement(name = "Scope") @XmlJavaTypeAdapter(Adapter1.class) protected String scope;
   @XmlElement(name = "SequenceNumber") protected Integer sequenceNumber;

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
    * Gets the value of the epsCodeTypeHierarchy property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getEPSCodeTypeHierarchy()
   {
      return epsCodeTypeHierarchy;
   }

   /**
    * Sets the value of the epsCodeTypeHierarchy property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setEPSCodeTypeHierarchy(String value)
   {
      this.epsCodeTypeHierarchy = value;
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
    * Gets the value of the isSecureCode property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Boolean isIsSecureCode()
   {
      return isSecureCode;
   }

   /**
    * Sets the value of the isSecureCode property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setIsSecureCode(Boolean value)
   {
      this.isSecureCode = value;
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
    * Gets the value of the length property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getLength()
   {
      return length;
   }

   /**
    * Sets the value of the length property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setLength(Integer value)
   {
      this.length = value;
   }

   /**
    * Gets the value of the name property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setName(String value)
   {
      this.name = value;
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
    * Gets the value of the refProjectObjectIds property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRefProjectObjectIds()
   {
      return refProjectObjectIds;
   }

   /**
    * Sets the value of the refProjectObjectIds property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRefProjectObjectIds(String value)
   {
      this.refProjectObjectIds = value;
   }

   /**
    * Gets the value of the scope property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getScope()
   {
      return scope;
   }

   /**
    * Sets the value of the scope property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setScope(String value)
   {
      this.scope = value;
   }

   /**
    * Gets the value of the sequenceNumber property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getSequenceNumber()
   {
      return sequenceNumber;
   }

   /**
    * Sets the value of the sequenceNumber property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setSequenceNumber(Integer value)
   {
      this.sequenceNumber = value;
   }

}
