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
 * &lt;p&gt;Java class for RelationshipType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="RelationshipType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Aref" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Arls" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Comments" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="250"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Driving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsPredecessorBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsPredecessorTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsSuccessorBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsSuccessorTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Lag" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="-9.9999999999E10"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorActivityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorActivityType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Task Dependent"/&amp;gt;
 *               &amp;lt;enumeration value="Resource Dependent"/&amp;gt;
 *               &amp;lt;enumeration value="Level of Effort"/&amp;gt;
 *               &amp;lt;enumeration value="Start Milestone"/&amp;gt;
 *               &amp;lt;enumeration value="Finish Milestone"/&amp;gt;
 *               &amp;lt;enumeration value="WBS Summary"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PredecessorFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PredecessorWbsName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="SuccessorActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuccessorActivityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuccessorActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuccessorActivityType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Task Dependent"/&amp;gt;
 *               &amp;lt;enumeration value="Resource Dependent"/&amp;gt;
 *               &amp;lt;enumeration value="Level of Effort"/&amp;gt;
 *               &amp;lt;enumeration value="Start Milestone"/&amp;gt;
 *               &amp;lt;enumeration value="Finish Milestone"/&amp;gt;
 *               &amp;lt;enumeration value="WBS Summary"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="SuccessorFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuccessorProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuccessorProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuccessorStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuccessorWbsName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Type" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Finish to Start"/&amp;gt;
 *               &amp;lt;enumeration value="Finish to Finish"/&amp;gt;
 *               &amp;lt;enumeration value="Start to Start"/&amp;gt;
 *               &amp;lt;enumeration value="Start to Finish"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RelationshipType", propOrder =
{
   "aref",
   "arls",
   "comments",
   "createDate",
   "createUser",
   "driving",
   "isPredecessorBaseline",
   "isPredecessorTemplate",
   "isSuccessorBaseline",
   "isSuccessorTemplate",
   "lag",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "predecessorActivityId",
   "predecessorActivityName",
   "predecessorActivityObjectId",
   "predecessorActivityType",
   "predecessorFinishDate",
   "predecessorProjectId",
   "predecessorProjectObjectId",
   "predecessorStartDate",
   "predecessorWbsName",
   "successorActivityId",
   "successorActivityName",
   "successorActivityObjectId",
   "successorActivityType",
   "successorFinishDate",
   "successorProjectId",
   "successorProjectObjectId",
   "successorStartDate",
   "successorWbsName",
   "type"
}) public class RelationshipType
{

   @XmlElement(name = "Aref", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date aref;
   @XmlElement(name = "Arls", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date arls;
   @XmlElement(name = "Comments") protected String comments;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "Driving", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean driving;
   @XmlElement(name = "IsPredecessorBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isPredecessorBaseline;
   @XmlElement(name = "IsPredecessorTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isPredecessorTemplate;
   @XmlElement(name = "IsSuccessorBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isSuccessorBaseline;
   @XmlElement(name = "IsSuccessorTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isSuccessorTemplate;
   @XmlElement(name = "Lag", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) protected Double lag;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "PredecessorActivityId") protected String predecessorActivityId;
   @XmlElement(name = "PredecessorActivityName") protected String predecessorActivityName;
   @XmlElement(name = "PredecessorActivityObjectId") protected Integer predecessorActivityObjectId;
   @XmlElement(name = "PredecessorActivityType") protected String predecessorActivityType;
   @XmlElement(name = "PredecessorFinishDate", type = String.class) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date predecessorFinishDate;
   @XmlElement(name = "PredecessorProjectId") protected String predecessorProjectId;
   @XmlElement(name = "PredecessorProjectObjectId", nillable = true) protected Integer predecessorProjectObjectId;
   @XmlElement(name = "PredecessorStartDate", type = String.class) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date predecessorStartDate;
   @XmlElement(name = "PredecessorWbsName") protected String predecessorWbsName;
   @XmlElement(name = "SuccessorActivityId") protected String successorActivityId;
   @XmlElement(name = "SuccessorActivityName") protected String successorActivityName;
   @XmlElement(name = "SuccessorActivityObjectId") protected Integer successorActivityObjectId;
   @XmlElement(name = "SuccessorActivityType") protected String successorActivityType;
   @XmlElement(name = "SuccessorFinishDate", type = String.class) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date successorFinishDate;
   @XmlElement(name = "SuccessorProjectId") protected String successorProjectId;
   @XmlElement(name = "SuccessorProjectObjectId", nillable = true) protected Integer successorProjectObjectId;
   @XmlElement(name = "SuccessorStartDate", type = String.class) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date successorStartDate;
   @XmlElement(name = "SuccessorWbsName") protected String successorWbsName;
   @XmlElement(name = "Type") protected String type;

   /**
    * Gets the value of the aref property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getAref()
   {
      return aref;
   }

   /**
    * Sets the value of the aref property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAref(Date value)
   {
      this.aref = value;
   }

   /**
    * Gets the value of the arls property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getArls()
   {
      return arls;
   }

   /**
    * Sets the value of the arls property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setArls(Date value)
   {
      this.arls = value;
   }

   /**
    * Gets the value of the comments property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getComments()
   {
      return comments;
   }

   /**
    * Sets the value of the comments property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setComments(String value)
   {
      this.comments = value;
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
    * Gets the value of the driving property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isDriving()
   {
      return driving;
   }

   /**
    * Sets the value of the driving property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDriving(Boolean value)
   {
      this.driving = value;
   }

   /**
    * Gets the value of the isPredecessorBaseline property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsPredecessorBaseline()
   {
      return isPredecessorBaseline;
   }

   /**
    * Sets the value of the isPredecessorBaseline property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsPredecessorBaseline(Boolean value)
   {
      this.isPredecessorBaseline = value;
   }

   /**
    * Gets the value of the isPredecessorTemplate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsPredecessorTemplate()
   {
      return isPredecessorTemplate;
   }

   /**
    * Sets the value of the isPredecessorTemplate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsPredecessorTemplate(Boolean value)
   {
      this.isPredecessorTemplate = value;
   }

   /**
    * Gets the value of the isSuccessorBaseline property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsSuccessorBaseline()
   {
      return isSuccessorBaseline;
   }

   /**
    * Sets the value of the isSuccessorBaseline property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsSuccessorBaseline(Boolean value)
   {
      this.isSuccessorBaseline = value;
   }

   /**
    * Gets the value of the isSuccessorTemplate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsSuccessorTemplate()
   {
      return isSuccessorTemplate;
   }

   /**
    * Sets the value of the isSuccessorTemplate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsSuccessorTemplate(Boolean value)
   {
      this.isSuccessorTemplate = value;
   }

   /**
    * Gets the value of the lag property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getLag()
   {
      return lag;
   }

   /**
    * Sets the value of the lag property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLag(Double value)
   {
      this.lag = value;
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
    * Gets the value of the predecessorActivityId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPredecessorActivityId()
   {
      return predecessorActivityId;
   }

   /**
    * Sets the value of the predecessorActivityId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorActivityId(String value)
   {
      this.predecessorActivityId = value;
   }

   /**
    * Gets the value of the predecessorActivityName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPredecessorActivityName()
   {
      return predecessorActivityName;
   }

   /**
    * Sets the value of the predecessorActivityName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorActivityName(String value)
   {
      this.predecessorActivityName = value;
   }

   /**
    * Gets the value of the predecessorActivityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getPredecessorActivityObjectId()
   {
      return predecessorActivityObjectId;
   }

   /**
    * Sets the value of the predecessorActivityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setPredecessorActivityObjectId(Integer value)
   {
      this.predecessorActivityObjectId = value;
   }

   /**
    * Gets the value of the predecessorActivityType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPredecessorActivityType()
   {
      return predecessorActivityType;
   }

   /**
    * Sets the value of the predecessorActivityType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorActivityType(String value)
   {
      this.predecessorActivityType = value;
   }

   /**
    * Gets the value of the predecessorFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getPredecessorFinishDate()
   {
      return predecessorFinishDate;
   }

   /**
    * Sets the value of the predecessorFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorFinishDate(Date value)
   {
      this.predecessorFinishDate = value;
   }

   /**
    * Gets the value of the predecessorProjectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPredecessorProjectId()
   {
      return predecessorProjectId;
   }

   /**
    * Sets the value of the predecessorProjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorProjectId(String value)
   {
      this.predecessorProjectId = value;
   }

   /**
    * Gets the value of the predecessorProjectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getPredecessorProjectObjectId()
   {
      return predecessorProjectObjectId;
   }

   /**
    * Sets the value of the predecessorProjectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setPredecessorProjectObjectId(Integer value)
   {
      this.predecessorProjectObjectId = value;
   }

   /**
    * Gets the value of the predecessorStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getPredecessorStartDate()
   {
      return predecessorStartDate;
   }

   /**
    * Sets the value of the predecessorStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorStartDate(Date value)
   {
      this.predecessorStartDate = value;
   }

   /**
    * Gets the value of the predecessorWbsName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPredecessorWbsName()
   {
      return predecessorWbsName;
   }

   /**
    * Sets the value of the predecessorWbsName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorWbsName(String value)
   {
      this.predecessorWbsName = value;
   }

   /**
    * Gets the value of the successorActivityId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSuccessorActivityId()
   {
      return successorActivityId;
   }

   /**
    * Sets the value of the successorActivityId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSuccessorActivityId(String value)
   {
      this.successorActivityId = value;
   }

   /**
    * Gets the value of the successorActivityName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSuccessorActivityName()
   {
      return successorActivityName;
   }

   /**
    * Sets the value of the successorActivityName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSuccessorActivityName(String value)
   {
      this.successorActivityName = value;
   }

   /**
    * Gets the value of the successorActivityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSuccessorActivityObjectId()
   {
      return successorActivityObjectId;
   }

   /**
    * Sets the value of the successorActivityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSuccessorActivityObjectId(Integer value)
   {
      this.successorActivityObjectId = value;
   }

   /**
    * Gets the value of the successorActivityType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSuccessorActivityType()
   {
      return successorActivityType;
   }

   /**
    * Sets the value of the successorActivityType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSuccessorActivityType(String value)
   {
      this.successorActivityType = value;
   }

   /**
    * Gets the value of the successorFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getSuccessorFinishDate()
   {
      return successorFinishDate;
   }

   /**
    * Sets the value of the successorFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSuccessorFinishDate(Date value)
   {
      this.successorFinishDate = value;
   }

   /**
    * Gets the value of the successorProjectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSuccessorProjectId()
   {
      return successorProjectId;
   }

   /**
    * Sets the value of the successorProjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSuccessorProjectId(String value)
   {
      this.successorProjectId = value;
   }

   /**
    * Gets the value of the successorProjectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSuccessorProjectObjectId()
   {
      return successorProjectObjectId;
   }

   /**
    * Sets the value of the successorProjectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSuccessorProjectObjectId(Integer value)
   {
      this.successorProjectObjectId = value;
   }

   /**
    * Gets the value of the successorStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getSuccessorStartDate()
   {
      return successorStartDate;
   }

   /**
    * Sets the value of the successorStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSuccessorStartDate(Date value)
   {
      this.successorStartDate = value;
   }

   /**
    * Gets the value of the successorWbsName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSuccessorWbsName()
   {
      return successorWbsName;
   }

   /**
    * Sets the value of the successorWbsName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSuccessorWbsName(String value)
   {
      this.successorWbsName = value;
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
