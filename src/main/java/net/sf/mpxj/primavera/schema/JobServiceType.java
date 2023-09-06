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
 * <p>Java class for JobServiceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="JobServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddProjectInfo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CopyOptions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExportFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExportPlfFileNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExportXMLByte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportXMLByte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobDataX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobRecurringType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="Enabled"/&gt;
 *               &lt;enumeration value="Disabled"/&gt;
 *               &lt;enumeration value="WebASAP"/&gt;
 *               &lt;enumeration value="None"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JobStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Pending"/&gt;
 *               &lt;enumeration value="Running"/&gt;
 *               &lt;enumeration value="Complete"/&gt;
 *               &lt;enumeration value="Failed"/&gt;
 *               &lt;enumeration value="Cancelled"/&gt;
 *               &lt;enumeration value="Delegated"/&gt;
 *               &lt;enumeration value="Completed With Errors"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JobType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Schedule"/&gt;
 *               &lt;enumeration value="Summarize"/&gt;
 *               &lt;enumeration value="Apply Actuals"/&gt;
 *               &lt;enumeration value="Store Period Performance"/&gt;
 *               &lt;enumeration value="Sync Actual This Period"/&gt;
 *               &lt;enumeration value="Level"/&gt;
 *               &lt;enumeration value="Recalculate Assignment Costs"/&gt;
 *               &lt;enumeration value="Send To Unifier"/&gt;
 *               &lt;enumeration value="Update Baseline"/&gt;
 *               &lt;enumeration value="Import Project"/&gt;
 *               &lt;enumeration value="Schedule Check"/&gt;
 *               &lt;enumeration value="Export Project"/&gt;
 *               &lt;enumeration value="Project CBS Service"/&gt;
 *               &lt;enumeration value="Copy Project Service"/&gt;
 *               &lt;enumeration value="Preview Update Baseline Service"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JobTypeKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LastRunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlfDirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectInfo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TargetWbsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "JobServiceType", propOrder =
{
   "addProjectInfo",
   "copyOptions",
   "exportFilePath",
   "exportPlfFileNames",
   "exportXMLByte",
   "fileName",
   "importXMLByte",
   "jobData",
   "jobDataX",
   "jobRecurringType",
   "jobStatus",
   "jobType",
   "jobTypeKey",
   "lastRunDate",
   "name",
   "objectId",
   "plfDirName",
   "projectInfo",
   "targetWbsId",
   "userId"
}) public class JobServiceType
{

   @XmlElement(name = "AddProjectInfo") @XmlJavaTypeAdapter(Adapter1.class) protected String addProjectInfo;
   @XmlElement(name = "CopyOptions") @XmlJavaTypeAdapter(Adapter1.class) protected String copyOptions;
   @XmlElement(name = "ExportFilePath") @XmlJavaTypeAdapter(Adapter1.class) protected String exportFilePath;
   @XmlElement(name = "ExportPlfFileNames", nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected String exportPlfFileNames;
   @XmlElement(name = "ExportXMLByte", nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected String exportXMLByte;
   @XmlElement(name = "FileName") @XmlJavaTypeAdapter(Adapter1.class) protected String fileName;
   @XmlElement(name = "ImportXMLByte") @XmlJavaTypeAdapter(Adapter1.class) protected String importXMLByte;
   @XmlElement(name = "JobData") @XmlJavaTypeAdapter(Adapter1.class) protected String jobData;
   @XmlElement(name = "JobDataX") @XmlJavaTypeAdapter(Adapter1.class) protected String jobDataX;
   @XmlElement(name = "JobRecurringType") @XmlJavaTypeAdapter(Adapter1.class) protected String jobRecurringType;
   @XmlElement(name = "JobStatus") @XmlJavaTypeAdapter(Adapter1.class) protected String jobStatus;
   @XmlElement(name = "JobType") @XmlJavaTypeAdapter(Adapter1.class) protected String jobType;
   @XmlElement(name = "JobTypeKey") @XmlJavaTypeAdapter(Adapter1.class) protected String jobTypeKey;
   @XmlElement(name = "LastRunDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastRunDate;
   @XmlElement(name = "Name") @XmlJavaTypeAdapter(Adapter1.class) protected String name;
   @XmlElement(name = "ObjectId", nillable = true) protected Integer objectId;
   @XmlElement(name = "PlfDirName") @XmlJavaTypeAdapter(Adapter1.class) protected String plfDirName;
   @XmlElement(name = "ProjectInfo") @XmlJavaTypeAdapter(Adapter1.class) protected String projectInfo;
   @XmlElement(name = "TargetWbsId", nillable = true) protected Integer targetWbsId;
   @XmlElement(name = "UserId", nillable = true) protected Integer userId;

   /**
    * Gets the value of the addProjectInfo property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getAddProjectInfo()
   {
      return addProjectInfo;
   }

   /**
    * Sets the value of the addProjectInfo property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setAddProjectInfo(String value)
   {
      this.addProjectInfo = value;
   }

   /**
    * Gets the value of the copyOptions property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCopyOptions()
   {
      return copyOptions;
   }

   /**
    * Sets the value of the copyOptions property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCopyOptions(String value)
   {
      this.copyOptions = value;
   }

   /**
    * Gets the value of the exportFilePath property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getExportFilePath()
   {
      return exportFilePath;
   }

   /**
    * Sets the value of the exportFilePath property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExportFilePath(String value)
   {
      this.exportFilePath = value;
   }

   /**
    * Gets the value of the exportPlfFileNames property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getExportPlfFileNames()
   {
      return exportPlfFileNames;
   }

   /**
    * Sets the value of the exportPlfFileNames property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExportPlfFileNames(String value)
   {
      this.exportPlfFileNames = value;
   }

   /**
    * Gets the value of the exportXMLByte property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getExportXMLByte()
   {
      return exportXMLByte;
   }

   /**
    * Sets the value of the exportXMLByte property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExportXMLByte(String value)
   {
      this.exportXMLByte = value;
   }

   /**
    * Gets the value of the fileName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getFileName()
   {
      return fileName;
   }

   /**
    * Sets the value of the fileName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setFileName(String value)
   {
      this.fileName = value;
   }

   /**
    * Gets the value of the importXMLByte property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getImportXMLByte()
   {
      return importXMLByte;
   }

   /**
    * Sets the value of the importXMLByte property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setImportXMLByte(String value)
   {
      this.importXMLByte = value;
   }

   /**
    * Gets the value of the jobData property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobData()
   {
      return jobData;
   }

   /**
    * Sets the value of the jobData property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobData(String value)
   {
      this.jobData = value;
   }

   /**
    * Gets the value of the jobDataX property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobDataX()
   {
      return jobDataX;
   }

   /**
    * Sets the value of the jobDataX property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobDataX(String value)
   {
      this.jobDataX = value;
   }

   /**
    * Gets the value of the jobRecurringType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobRecurringType()
   {
      return jobRecurringType;
   }

   /**
    * Sets the value of the jobRecurringType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobRecurringType(String value)
   {
      this.jobRecurringType = value;
   }

   /**
    * Gets the value of the jobStatus property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobStatus()
   {
      return jobStatus;
   }

   /**
    * Sets the value of the jobStatus property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobStatus(String value)
   {
      this.jobStatus = value;
   }

   /**
    * Gets the value of the jobType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobType()
   {
      return jobType;
   }

   /**
    * Sets the value of the jobType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobType(String value)
   {
      this.jobType = value;
   }

   /**
    * Gets the value of the jobTypeKey property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobTypeKey()
   {
      return jobTypeKey;
   }

   /**
    * Sets the value of the jobTypeKey property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobTypeKey(String value)
   {
      this.jobTypeKey = value;
   }

   /**
    * Gets the value of the lastRunDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public LocalDateTime getLastRunDate()
   {
      return lastRunDate;
   }

   /**
    * Sets the value of the lastRunDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastRunDate(LocalDateTime value)
   {
      this.lastRunDate = value;
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
    * Gets the value of the plfDirName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getPlfDirName()
   {
      return plfDirName;
   }

   /**
    * Sets the value of the plfDirName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPlfDirName(String value)
   {
      this.plfDirName = value;
   }

   /**
    * Gets the value of the projectInfo property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectInfo()
   {
      return projectInfo;
   }

   /**
    * Sets the value of the projectInfo property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectInfo(String value)
   {
      this.projectInfo = value;
   }

   /**
    * Gets the value of the targetWbsId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getTargetWbsId()
   {
      return targetWbsId;
   }

   /**
    * Sets the value of the targetWbsId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setTargetWbsId(Integer value)
   {
      this.targetWbsId = value;
   }

   /**
    * Gets the value of the userId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getUserId()
   {
      return userId;
   }

   /**
    * Sets the value of the userId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setUserId(Integer value)
   {
      this.userId = value;
   }

}
