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
 * &lt;p&gt;Java class for TimesheetAuditType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="TimesheetAuditType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ApproverUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ApproverUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AuditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverheadHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverheadOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingOverheadHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingOverheadOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingProjectHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingProjectOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimesheetActivityStatus" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="Submitted"/&amp;gt;
 *               &amp;lt;enumeration value="Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Resource Manager Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Project Manager Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Active"/&amp;gt;
 *               &amp;lt;enumeration value="Rejected"/&amp;gt;
 *               &amp;lt;enumeration value="Resubmitted"/&amp;gt;
 *               &amp;lt;enumeration value="Reopened"/&amp;gt;
 *               &amp;lt;enumeration value="Submitted for RM"/&amp;gt;
 *               &amp;lt;enumeration value="Resubmitted for RM"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TimesheetApprovingAs" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="Project Manager"/&amp;gt;
 *               &amp;lt;enumeration value="Resource Manager"/&amp;gt;
 *               &amp;lt;enumeration value="Project Manager Delegate"/&amp;gt;
 *               &amp;lt;enumeration value="Resource Manager Delegate"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TimesheetPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimesheetPeriodObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimesheetPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimesheetStatus" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="Submitted"/&amp;gt;
 *               &amp;lt;enumeration value="Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Resource Manager Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Project Manager Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Active"/&amp;gt;
 *               &amp;lt;enumeration value="Rejected"/&amp;gt;
 *               &amp;lt;enumeration value="Not Started"/&amp;gt;
 *               &amp;lt;enumeration value="Resubmitted"/&amp;gt;
 *               &amp;lt;enumeration value="Reopened"/&amp;gt;
 *               &amp;lt;enumeration value="Submitted for RM"/&amp;gt;
 *               &amp;lt;enumeration value="Resubmitted for RM"/&amp;gt;
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "TimesheetAuditType", propOrder =
{
   "approverUserName",
   "approverUserObjectId",
   "auditDate",
   "objectId",
   "overheadHours",
   "overheadOvertimeHours",
   "pendingOverheadHours",
   "pendingOverheadOvertimeHours",
   "pendingProjectHours",
   "pendingProjectOvertimeHours",
   "projectHours",
   "projectId",
   "projectObjectId",
   "projectOvertimeHours",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "timesheetActivityStatus",
   "timesheetApprovingAs",
   "timesheetPeriodEndDate",
   "timesheetPeriodObjectId",
   "timesheetPeriodStartDate",
   "timesheetStatus"
}) public class TimesheetAuditType
{

   @XmlElement(name = "ApproverUserName") protected String approverUserName;
   @XmlElement(name = "ApproverUserObjectId", nillable = true) protected Integer approverUserObjectId;
   @XmlElement(name = "AuditDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date auditDate;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "OverheadHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double overheadHours;
   @XmlElement(name = "OverheadOvertimeHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double overheadOvertimeHours;
   @XmlElement(name = "PendingOverheadHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double pendingOverheadHours;
   @XmlElement(name = "PendingOverheadOvertimeHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double pendingOverheadOvertimeHours;
   @XmlElement(name = "PendingProjectHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double pendingProjectHours;
   @XmlElement(name = "PendingProjectOvertimeHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double pendingProjectOvertimeHours;
   @XmlElement(name = "ProjectHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double projectHours;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "ProjectOvertimeHours", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "double") protected Double projectOvertimeHours;
   @XmlElement(name = "ResourceId") protected String resourceId;
   @XmlElement(name = "ResourceName") protected String resourceName;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "TimesheetActivityStatus") protected String timesheetActivityStatus;
   @XmlElement(name = "TimesheetApprovingAs") protected String timesheetApprovingAs;
   @XmlElement(name = "TimesheetPeriodEndDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date timesheetPeriodEndDate;
   @XmlElement(name = "TimesheetPeriodObjectId", nillable = true) protected Integer timesheetPeriodObjectId;
   @XmlElement(name = "TimesheetPeriodStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date timesheetPeriodStartDate;
   @XmlElement(name = "TimesheetStatus") protected String timesheetStatus;

   /**
    * Gets the value of the approverUserName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getApproverUserName()
   {
      return approverUserName;
   }

   /**
    * Sets the value of the approverUserName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setApproverUserName(String value)
   {
      this.approverUserName = value;
   }

   /**
    * Gets the value of the approverUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getApproverUserObjectId()
   {
      return approverUserObjectId;
   }

   /**
    * Sets the value of the approverUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setApproverUserObjectId(Integer value)
   {
      this.approverUserObjectId = value;
   }

   /**
    * Gets the value of the auditDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getAuditDate()
   {
      return auditDate;
   }

   /**
    * Sets the value of the auditDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAuditDate(Date value)
   {
      this.auditDate = value;
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
    * Gets the value of the overheadHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getOverheadHours()
   {
      return overheadHours;
   }

   /**
    * Sets the value of the overheadHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverheadHours(Double value)
   {
      this.overheadHours = value;
   }

   /**
    * Gets the value of the overheadOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getOverheadOvertimeHours()
   {
      return overheadOvertimeHours;
   }

   /**
    * Sets the value of the overheadOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverheadOvertimeHours(Double value)
   {
      this.overheadOvertimeHours = value;
   }

   /**
    * Gets the value of the pendingOverheadHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPendingOverheadHours()
   {
      return pendingOverheadHours;
   }

   /**
    * Sets the value of the pendingOverheadHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingOverheadHours(Double value)
   {
      this.pendingOverheadHours = value;
   }

   /**
    * Gets the value of the pendingOverheadOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPendingOverheadOvertimeHours()
   {
      return pendingOverheadOvertimeHours;
   }

   /**
    * Sets the value of the pendingOverheadOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingOverheadOvertimeHours(Double value)
   {
      this.pendingOverheadOvertimeHours = value;
   }

   /**
    * Gets the value of the pendingProjectHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPendingProjectHours()
   {
      return pendingProjectHours;
   }

   /**
    * Sets the value of the pendingProjectHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingProjectHours(Double value)
   {
      this.pendingProjectHours = value;
   }

   /**
    * Gets the value of the pendingProjectOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPendingProjectOvertimeHours()
   {
      return pendingProjectOvertimeHours;
   }

   /**
    * Sets the value of the pendingProjectOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingProjectOvertimeHours(Double value)
   {
      this.pendingProjectOvertimeHours = value;
   }

   /**
    * Gets the value of the projectHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getProjectHours()
   {
      return projectHours;
   }

   /**
    * Sets the value of the projectHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectHours(Double value)
   {
      this.projectHours = value;
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
    * Gets the value of the projectOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getProjectOvertimeHours()
   {
      return projectOvertimeHours;
   }

   /**
    * Sets the value of the projectOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectOvertimeHours(Double value)
   {
      this.projectOvertimeHours = value;
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
    * Gets the value of the timesheetActivityStatus property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimesheetActivityStatus()
   {
      return timesheetActivityStatus;
   }

   /**
    * Sets the value of the timesheetActivityStatus property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetActivityStatus(String value)
   {
      this.timesheetActivityStatus = value;
   }

   /**
    * Gets the value of the timesheetApprovingAs property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimesheetApprovingAs()
   {
      return timesheetApprovingAs;
   }

   /**
    * Sets the value of the timesheetApprovingAs property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetApprovingAs(String value)
   {
      this.timesheetApprovingAs = value;
   }

   /**
    * Gets the value of the timesheetPeriodEndDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getTimesheetPeriodEndDate()
   {
      return timesheetPeriodEndDate;
   }

   /**
    * Sets the value of the timesheetPeriodEndDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetPeriodEndDate(Date value)
   {
      this.timesheetPeriodEndDate = value;
   }

   /**
    * Gets the value of the timesheetPeriodObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getTimesheetPeriodObjectId()
   {
      return timesheetPeriodObjectId;
   }

   /**
    * Sets the value of the timesheetPeriodObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setTimesheetPeriodObjectId(Integer value)
   {
      this.timesheetPeriodObjectId = value;
   }

   /**
    * Gets the value of the timesheetPeriodStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getTimesheetPeriodStartDate()
   {
      return timesheetPeriodStartDate;
   }

   /**
    * Sets the value of the timesheetPeriodStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetPeriodStartDate(Date value)
   {
      this.timesheetPeriodStartDate = value;
   }

   /**
    * Gets the value of the timesheetStatus property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimesheetStatus()
   {
      return timesheetStatus;
   }

   /**
    * Sets the value of the timesheetStatus property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetStatus(String value)
   {
      this.timesheetStatus = value;
   }

}
