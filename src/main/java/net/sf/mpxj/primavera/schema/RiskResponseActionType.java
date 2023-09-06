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
 * <p>Java class for RiskResponseActionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RiskResponseActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RemainingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ResourceId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResourceName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RiskId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RiskObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RiskResponsePlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskResponsePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskResponsePlanObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ScoreColor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="#[A-Fa-f0-9]{6}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ScoreText" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Proposed"/&gt;
 *               &lt;enumeration value="Sanctioned"/&gt;
 *               &lt;enumeration value="Rejected"/&gt;
 *               &lt;enumeration value="In Progress"/&gt;
 *               &lt;enumeration value="Complete"/&gt;
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RiskResponseActionType", propOrder =
{
   "activityId",
   "activityName",
   "activityObjectId",
   "actualCost",
   "createDate",
   "createUser",
   "finishDate",
   "id",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "name",
   "objectId",
   "plannedCost",
   "plannedFinishDate",
   "plannedStartDate",
   "projectId",
   "projectName",
   "projectObjectId",
   "remainingCost",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "riskId",
   "riskObjectId",
   "riskResponsePlanId",
   "riskResponsePlanName",
   "riskResponsePlanObjectId",
   "score",
   "scoreColor",
   "scoreText",
   "startDate",
   "status"
}) public class RiskResponseActionType
{

   @XmlElement(name = "ActivityId") @XmlJavaTypeAdapter(Adapter1.class) protected String activityId;
   @XmlElement(name = "ActivityName") @XmlJavaTypeAdapter(Adapter1.class) protected String activityName;
   @XmlElement(name = "ActivityObjectId", nillable = true) protected Integer activityObjectId;
   @XmlElement(name = "ActualCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double actualCost;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "FinishDate", type = String.class) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime finishDate;
   @XmlElement(name = "Id") @XmlJavaTypeAdapter(Adapter1.class) protected String id;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "Name") @XmlJavaTypeAdapter(Adapter1.class) protected String name;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "PlannedCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double plannedCost;
   @XmlElement(name = "PlannedFinishDate", type = String.class) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime plannedFinishDate;
   @XmlElement(name = "PlannedStartDate", type = String.class) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime plannedStartDate;
   @XmlElement(name = "ProjectId") @XmlJavaTypeAdapter(Adapter1.class) protected String projectId;
   @XmlElement(name = "ProjectName") @XmlJavaTypeAdapter(Adapter1.class) protected String projectName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RemainingCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double remainingCost;
   @XmlElement(name = "ResourceId") @XmlJavaTypeAdapter(Adapter1.class) protected String resourceId;
   @XmlElement(name = "ResourceName") @XmlJavaTypeAdapter(Adapter1.class) protected String resourceName;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "RiskId") @XmlJavaTypeAdapter(Adapter1.class) protected String riskId;
   @XmlElement(name = "RiskObjectId") protected Integer riskObjectId;
   @XmlElement(name = "RiskResponsePlanId") @XmlJavaTypeAdapter(Adapter1.class) protected String riskResponsePlanId;
   @XmlElement(name = "RiskResponsePlanName") @XmlJavaTypeAdapter(Adapter1.class) protected String riskResponsePlanName;
   @XmlElement(name = "RiskResponsePlanObjectId") protected Integer riskResponsePlanObjectId;
   @XmlElement(name = "Score", nillable = true) protected Integer score;
   @XmlElement(name = "ScoreColor", nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected String scoreColor;
   @XmlElement(name = "ScoreText") @XmlJavaTypeAdapter(Adapter1.class) protected String scoreText;
   @XmlElement(name = "StartDate", type = String.class) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime startDate;
   @XmlElement(name = "Status") @XmlJavaTypeAdapter(Adapter1.class) protected String status;

   /**
    * Gets the value of the activityId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getActivityId()
   {
      return activityId;
   }

   /**
    * Sets the value of the activityId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setActivityId(String value)
   {
      this.activityId = value;
   }

   /**
    * Gets the value of the activityName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getActivityName()
   {
      return activityName;
   }

   /**
    * Sets the value of the activityName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setActivityName(String value)
   {
      this.activityName = value;
   }

   /**
    * Gets the value of the activityObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getActivityObjectId()
   {
      return activityObjectId;
   }

   /**
    * Sets the value of the activityObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setActivityObjectId(Integer value)
   {
      this.activityObjectId = value;
   }

   /**
    * Gets the value of the actualCost property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getActualCost()
   {
      return actualCost;
   }

   /**
    * Sets the value of the actualCost property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setActualCost(Double value)
   {
      this.actualCost = value;
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
    * Gets the value of the id property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getId()
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
   public void setId(String value)
   {
      this.id = value;
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
    * Gets the value of the plannedCost property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getPlannedCost()
   {
      return plannedCost;
   }

   /**
    * Sets the value of the plannedCost property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPlannedCost(Double value)
   {
      this.plannedCost = value;
   }

   /**
    * Gets the value of the plannedFinishDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getPlannedFinishDate()
   {
      return plannedFinishDate;
   }

   /**
    * Sets the value of the plannedFinishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPlannedFinishDate(LocalDateTime value)
   {
      this.plannedFinishDate = value;
   }

   /**
    * Gets the value of the plannedStartDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getPlannedStartDate()
   {
      return plannedStartDate;
   }

   /**
    * Sets the value of the plannedStartDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPlannedStartDate(LocalDateTime value)
   {
      this.plannedStartDate = value;
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
    * Gets the value of the projectName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectName()
   {
      return projectName;
   }

   /**
    * Sets the value of the projectName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectName(String value)
   {
      this.projectName = value;
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
    * Gets the value of the remainingCost property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getRemainingCost()
   {
      return remainingCost;
   }

   /**
    * Sets the value of the remainingCost property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRemainingCost(Double value)
   {
      this.remainingCost = value;
   }

   /**
    * Gets the value of the resourceId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceId()
   {
      return resourceId;
   }

   /**
    * Sets the value of the resourceId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceId(String value)
   {
      this.resourceId = value;
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
    * Gets the value of the riskId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRiskId()
   {
      return riskId;
   }

   /**
    * Sets the value of the riskId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRiskId(String value)
   {
      this.riskId = value;
   }

   /**
    * Gets the value of the riskObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRiskObjectId()
   {
      return riskObjectId;
   }

   /**
    * Sets the value of the riskObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRiskObjectId(Integer value)
   {
      this.riskObjectId = value;
   }

   /**
    * Gets the value of the riskResponsePlanId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRiskResponsePlanId()
   {
      return riskResponsePlanId;
   }

   /**
    * Sets the value of the riskResponsePlanId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRiskResponsePlanId(String value)
   {
      this.riskResponsePlanId = value;
   }

   /**
    * Gets the value of the riskResponsePlanName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRiskResponsePlanName()
   {
      return riskResponsePlanName;
   }

   /**
    * Sets the value of the riskResponsePlanName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRiskResponsePlanName(String value)
   {
      this.riskResponsePlanName = value;
   }

   /**
    * Gets the value of the riskResponsePlanObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRiskResponsePlanObjectId()
   {
      return riskResponsePlanObjectId;
   }

   /**
    * Sets the value of the riskResponsePlanObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRiskResponsePlanObjectId(Integer value)
   {
      this.riskResponsePlanObjectId = value;
   }

   /**
    * Gets the value of the score property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getScore()
   {
      return score;
   }

   /**
    * Sets the value of the score property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setScore(Integer value)
   {
      this.score = value;
   }

   /**
    * Gets the value of the scoreColor property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getScoreColor()
   {
      return scoreColor;
   }

   /**
    * Sets the value of the scoreColor property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setScoreColor(String value)
   {
      this.scoreColor = value;
   }

   /**
    * Gets the value of the scoreText property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getScoreText()
   {
      return scoreText;
   }

   /**
    * Sets the value of the scoreText property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setScoreText(String value)
   {
      this.scoreText = value;
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

}
