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
 * <p>Java class for RoleCodeAssignmentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RoleCodeAssignmentType"&gt;
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
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoleCodeDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoleCodeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoleCodeTypeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoleCodeTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoleCodeValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoleId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoleName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoleObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RoleCodeAssignmentType", propOrder =
{
   "createDate",
   "createUser",
   "lastUpdateDate",
   "lastUpdateUser",
   "roleCodeDescription",
   "roleCodeObjectId",
   "roleCodeTypeName",
   "roleCodeTypeObjectId",
   "roleCodeValue",
   "roleId",
   "roleName",
   "roleObjectId"
}) public class RoleCodeAssignmentType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "RoleCodeDescription") @XmlJavaTypeAdapter(Adapter1.class) protected String roleCodeDescription;
   @XmlElement(name = "RoleCodeObjectId") protected Integer roleCodeObjectId;
   @XmlElement(name = "RoleCodeTypeName") @XmlJavaTypeAdapter(Adapter1.class) protected String roleCodeTypeName;
   @XmlElement(name = "RoleCodeTypeObjectId") protected Integer roleCodeTypeObjectId;
   @XmlElement(name = "RoleCodeValue") @XmlJavaTypeAdapter(Adapter1.class) protected String roleCodeValue;
   @XmlElement(name = "RoleId") @XmlJavaTypeAdapter(Adapter1.class) protected String roleId;
   @XmlElement(name = "RoleName") @XmlJavaTypeAdapter(Adapter1.class) protected String roleName;
   @XmlElement(name = "RoleObjectId") protected Integer roleObjectId;

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
    * Gets the value of the roleCodeDescription property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRoleCodeDescription()
   {
      return roleCodeDescription;
   }

   /**
    * Sets the value of the roleCodeDescription property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRoleCodeDescription(String value)
   {
      this.roleCodeDescription = value;
   }

   /**
    * Gets the value of the roleCodeObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRoleCodeObjectId()
   {
      return roleCodeObjectId;
   }

   /**
    * Sets the value of the roleCodeObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRoleCodeObjectId(Integer value)
   {
      this.roleCodeObjectId = value;
   }

   /**
    * Gets the value of the roleCodeTypeName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRoleCodeTypeName()
   {
      return roleCodeTypeName;
   }

   /**
    * Sets the value of the roleCodeTypeName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRoleCodeTypeName(String value)
   {
      this.roleCodeTypeName = value;
   }

   /**
    * Gets the value of the roleCodeTypeObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRoleCodeTypeObjectId()
   {
      return roleCodeTypeObjectId;
   }

   /**
    * Sets the value of the roleCodeTypeObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRoleCodeTypeObjectId(Integer value)
   {
      this.roleCodeTypeObjectId = value;
   }

   /**
    * Gets the value of the roleCodeValue property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRoleCodeValue()
   {
      return roleCodeValue;
   }

   /**
    * Sets the value of the roleCodeValue property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRoleCodeValue(String value)
   {
      this.roleCodeValue = value;
   }

   /**
    * Gets the value of the roleId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRoleId()
   {
      return roleId;
   }

   /**
    * Sets the value of the roleId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRoleId(String value)
   {
      this.roleId = value;
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

}
