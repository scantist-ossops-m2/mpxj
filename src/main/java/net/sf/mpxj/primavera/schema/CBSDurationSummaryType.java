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
 * <p>Java class for CBSDurationSummaryType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CBSDurationSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OriginalProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SummaryActualDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SummaryActualFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SummaryActualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SummaryPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SummaryPlannedDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SummaryPlannedFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SummaryPlannedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SummaryRemainingDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SummaryRemainingFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SummaryRemainingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "CBSDurationSummaryType", propOrder =
{
   "cbsObjectId",
   "originalProjectObjectId",
   "projectId",
   "projectName",
   "projectObjectId",
   "summaryActualDuration",
   "summaryActualFinishDate",
   "summaryActualStartDate",
   "summaryPercentComplete",
   "summaryPlannedDuration",
   "summaryPlannedFinishDate",
   "summaryPlannedStartDate",
   "summaryRemainingDuration",
   "summaryRemainingFinishDate",
   "summaryRemainingStartDate"
}) public class CBSDurationSummaryType
{

   @XmlElement(name = "CBSObjectId", nillable = true) protected Integer cbsObjectId;
   @XmlElement(name = "OriginalProjectObjectId", nillable = true) protected Integer originalProjectObjectId;
   @XmlElement(name = "ProjectId") @XmlJavaTypeAdapter(Adapter1.class) protected String projectId;
   @XmlElement(name = "ProjectName") @XmlJavaTypeAdapter(Adapter1.class) protected String projectName;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "SummaryActualDuration", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double summaryActualDuration;
   @XmlElement(name = "SummaryActualFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime summaryActualFinishDate;
   @XmlElement(name = "SummaryActualStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime summaryActualStartDate;
   @XmlElement(name = "SummaryPercentComplete", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double summaryPercentComplete;
   @XmlElement(name = "SummaryPlannedDuration", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double summaryPlannedDuration;
   @XmlElement(name = "SummaryPlannedFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime summaryPlannedFinishDate;
   @XmlElement(name = "SummaryPlannedStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime summaryPlannedStartDate;
   @XmlElement(name = "SummaryRemainingDuration", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double summaryRemainingDuration;
   @XmlElement(name = "SummaryRemainingFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime summaryRemainingFinishDate;
   @XmlElement(name = "SummaryRemainingStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime summaryRemainingStartDate;

   /**
    * Gets the value of the cbsObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getCBSObjectId()
   {
      return cbsObjectId;
   }

   /**
    * Sets the value of the cbsObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setCBSObjectId(Integer value)
   {
      this.cbsObjectId = value;
   }

   /**
    * Gets the value of the originalProjectObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getOriginalProjectObjectId()
   {
      return originalProjectObjectId;
   }

   /**
    * Sets the value of the originalProjectObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setOriginalProjectObjectId(Integer value)
   {
      this.originalProjectObjectId = value;
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
    * Gets the value of the summaryActualDuration property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getSummaryActualDuration()
   {
      return summaryActualDuration;
   }

   /**
    * Sets the value of the summaryActualDuration property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryActualDuration(Double value)
   {
      this.summaryActualDuration = value;
   }

   /**
    * Gets the value of the summaryActualFinishDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getSummaryActualFinishDate()
   {
      return summaryActualFinishDate;
   }

   /**
    * Sets the value of the summaryActualFinishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryActualFinishDate(LocalDateTime value)
   {
      this.summaryActualFinishDate = value;
   }

   /**
    * Gets the value of the summaryActualStartDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getSummaryActualStartDate()
   {
      return summaryActualStartDate;
   }

   /**
    * Sets the value of the summaryActualStartDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryActualStartDate(LocalDateTime value)
   {
      this.summaryActualStartDate = value;
   }

   /**
    * Gets the value of the summaryPercentComplete property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getSummaryPercentComplete()
   {
      return summaryPercentComplete;
   }

   /**
    * Sets the value of the summaryPercentComplete property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryPercentComplete(Double value)
   {
      this.summaryPercentComplete = value;
   }

   /**
    * Gets the value of the summaryPlannedDuration property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getSummaryPlannedDuration()
   {
      return summaryPlannedDuration;
   }

   /**
    * Sets the value of the summaryPlannedDuration property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryPlannedDuration(Double value)
   {
      this.summaryPlannedDuration = value;
   }

   /**
    * Gets the value of the summaryPlannedFinishDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getSummaryPlannedFinishDate()
   {
      return summaryPlannedFinishDate;
   }

   /**
    * Sets the value of the summaryPlannedFinishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryPlannedFinishDate(LocalDateTime value)
   {
      this.summaryPlannedFinishDate = value;
   }

   /**
    * Gets the value of the summaryPlannedStartDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getSummaryPlannedStartDate()
   {
      return summaryPlannedStartDate;
   }

   /**
    * Sets the value of the summaryPlannedStartDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryPlannedStartDate(LocalDateTime value)
   {
      this.summaryPlannedStartDate = value;
   }

   /**
    * Gets the value of the summaryRemainingDuration property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getSummaryRemainingDuration()
   {
      return summaryRemainingDuration;
   }

   /**
    * Sets the value of the summaryRemainingDuration property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryRemainingDuration(Double value)
   {
      this.summaryRemainingDuration = value;
   }

   /**
    * Gets the value of the summaryRemainingFinishDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getSummaryRemainingFinishDate()
   {
      return summaryRemainingFinishDate;
   }

   /**
    * Sets the value of the summaryRemainingFinishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryRemainingFinishDate(LocalDateTime value)
   {
      this.summaryRemainingFinishDate = value;
   }

   /**
    * Gets the value of the summaryRemainingStartDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getSummaryRemainingStartDate()
   {
      return summaryRemainingStartDate;
   }

   /**
    * Sets the value of the summaryRemainingStartDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSummaryRemainingStartDate(LocalDateTime value)
   {
      this.summaryRemainingStartDate = value;
   }

}
