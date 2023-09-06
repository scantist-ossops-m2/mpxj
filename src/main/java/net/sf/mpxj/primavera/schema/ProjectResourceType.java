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
 * <p>Java class for ProjectResourceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProjectResourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommittedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LifeOfProjectFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectResourceCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectResourceCategoryObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoleObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="Planned"/&gt;
 *               &lt;enumeration value="Active"/&gt;
 *               &lt;enumeration value="Inactive"/&gt;
 *               &lt;enumeration value="What-If"/&gt;
 *               &lt;enumeration value="Requested"/&gt;
 *               &lt;enumeration value="Template"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WBSCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResourceRequest" type="{http://xmlns.oracle.com/Primavera/P6/V22.12/API/BusinessObjects}ResourceRequestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectResourceType", propOrder =
{
   "committedFlag",
   "createDate",
   "createUser",
   "finishDate",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "lifeOfProjectFlag",
   "objectId",
   "projectId",
   "projectObjectId",
   "projectResourceCategoryName",
   "projectResourceCategoryObjectId",
   "resourceName",
   "resourceObjectId",
   "roleName",
   "roleObjectId",
   "startDate",
   "status",
   "totalUnits",
   "wbsCode",
   "wbsObjectId",
   "resourceRequest"
}) public class ProjectResourceType
{

   @XmlElement(name = "CommittedFlag", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean committedFlag;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "FinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime finishDate;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "LifeOfProjectFlag", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean lifeOfProjectFlag;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProjectId") @XmlJavaTypeAdapter(Adapter1.class) protected String projectId;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "ProjectResourceCategoryName") @XmlJavaTypeAdapter(Adapter1.class) protected String projectResourceCategoryName;
   @XmlElement(name = "ProjectResourceCategoryObjectId", nillable = true) protected Integer projectResourceCategoryObjectId;
   @XmlElement(name = "ResourceName") @XmlJavaTypeAdapter(Adapter1.class) protected String resourceName;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "RoleName") @XmlJavaTypeAdapter(Adapter1.class) protected String roleName;
   @XmlElement(name = "RoleObjectId", nillable = true) protected Integer roleObjectId;
   @XmlElement(name = "StartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime startDate;
   @XmlElement(name = "Status") @XmlJavaTypeAdapter(Adapter1.class) protected String status;
   @XmlElement(name = "TotalUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double totalUnits;
   @XmlElement(name = "WBSCode") @XmlJavaTypeAdapter(Adapter1.class) protected String wbsCode;
   @XmlElement(name = "WBSObjectId", nillable = true) protected Integer wbsObjectId;
   @XmlElement(name = "ResourceRequest", nillable = true) protected ResourceRequestType resourceRequest;

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
    * Gets the value of the finishDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getFinishDate()
   {
      return finishDate;
   }

   /**
    * Sets the value of the finishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setFinishDate(LocalDateTime value)
   {
      this.finishDate = value;
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
    * Gets the value of the lifeOfProjectFlag property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Boolean isLifeOfProjectFlag()
   {
      return lifeOfProjectFlag;
   }

   /**
    * Sets the value of the lifeOfProjectFlag property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLifeOfProjectFlag(Boolean value)
   {
      this.lifeOfProjectFlag = value;
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
    * Gets the value of the projectId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
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
    * Gets the value of the projectResourceCategoryName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectResourceCategoryName()
   {
      return projectResourceCategoryName;
   }

   /**
    * Sets the value of the projectResourceCategoryName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectResourceCategoryName(String value)
   {
      this.projectResourceCategoryName = value;
   }

   /**
    * Gets the value of the projectResourceCategoryObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getProjectResourceCategoryObjectId()
   {
      return projectResourceCategoryObjectId;
   }

   /**
    * Sets the value of the projectResourceCategoryObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setProjectResourceCategoryObjectId(Integer value)
   {
      this.projectResourceCategoryObjectId = value;
   }

   /**
    * Gets the value of the resourceName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceName()
   {
      return resourceName;
   }

   /**
    * Sets the value of the resourceName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceName(String value)
   {
      this.resourceName = value;
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
    * Gets the value of the roleName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRoleName()
   {
      return roleName;
   }

   /**
    * Sets the value of the roleName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRoleName(String value)
   {
      this.roleName = value;
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
    * Gets the value of the startDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getStartDate()
   {
      return startDate;
   }

   /**
    * Sets the value of the startDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setStartDate(LocalDateTime value)
   {
      this.startDate = value;
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

   /**
    * Gets the value of the totalUnits property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getTotalUnits()
   {
      return totalUnits;
   }

   /**
    * Sets the value of the totalUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setTotalUnits(Double value)
   {
      this.totalUnits = value;
   }

   /**
    * Gets the value of the wbsCode property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getWBSCode()
   {
      return wbsCode;
   }

   /**
    * Sets the value of the wbsCode property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setWBSCode(String value)
   {
      this.wbsCode = value;
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
    * Gets the value of the resourceRequest property.
    * 
    * @return
    *     possible object is
    *     {@link ResourceRequestType }
    *     
    */
   public ResourceRequestType getResourceRequest()
   {
      return resourceRequest;
   }

   /**
    * Sets the value of the resourceRequest property.
    * 
    * @param value
    *     allowed object is
    *     {@link ResourceRequestType }
    *     
    */
   public void setResourceRequest(ResourceRequestType value)
   {
      this.resourceRequest = value;
   }

}
