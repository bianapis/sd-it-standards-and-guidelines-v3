package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTestingandDeploymentMechanismsUpdateOutputModel
 */
public class BQProductTestingandDeploymentMechanismsUpdateOutputModel   {
  private String productTestingandDeploymentMechanismsPreconditions = null;

  private String productTestingandDeploymentMechanismsSpecificationSchedule = null;

  private String productTestingandDeploymentMechanismsVersionNumber = null;

  private String productTestingandDeploymentMechanisms = null;

  private String productTestingandDeploymentMechanismsServiceType = null;

  private String productTestingandDeploymentMechanismsServiceDescription = null;

  private String productTestingandDeploymentMechanismsServiceInputsandOuputs = null;

  private String productTestingandDeploymentMechanismsServiceWorkProduct = null;

  private String productTestingandDeploymentMechanismsServiceName = null;

  private String productTestingandDeploymentMechanismsUpdateActionTaskReference = null;

  private Object productTestingandDeploymentMechanismsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return productTestingandDeploymentMechanismsPreconditions
  **/

  public String getProductTestingandDeploymentMechanismsPreconditions() {
    return productTestingandDeploymentMechanismsPreconditions;
  }

  public void setProductTestingandDeploymentMechanismsPreconditions(String productTestingandDeploymentMechanismsPreconditions) {
    this.productTestingandDeploymentMechanismsPreconditions = productTestingandDeploymentMechanismsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return productTestingandDeploymentMechanismsSpecificationSchedule
  **/

  public String getProductTestingandDeploymentMechanismsSpecificationSchedule() {
    return productTestingandDeploymentMechanismsSpecificationSchedule;
  }

  public void setProductTestingandDeploymentMechanismsSpecificationSchedule(String productTestingandDeploymentMechanismsSpecificationSchedule) {
    this.productTestingandDeploymentMechanismsSpecificationSchedule = productTestingandDeploymentMechanismsSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return productTestingandDeploymentMechanismsVersionNumber
  **/

  public String getProductTestingandDeploymentMechanismsVersionNumber() {
    return productTestingandDeploymentMechanismsVersionNumber;
  }

  public void setProductTestingandDeploymentMechanismsVersionNumber(String productTestingandDeploymentMechanismsVersionNumber) {
    this.productTestingandDeploymentMechanismsVersionNumber = productTestingandDeploymentMechanismsVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Technology Standards Specification specific Business Service 
   * @return productTestingandDeploymentMechanisms
  **/

  public String getProductTestingandDeploymentMechanisms() {
    return productTestingandDeploymentMechanisms;
  }

  public void setProductTestingandDeploymentMechanisms(String productTestingandDeploymentMechanisms) {
    this.productTestingandDeploymentMechanisms = productTestingandDeploymentMechanisms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return productTestingandDeploymentMechanismsServiceType
  **/

  public String getProductTestingandDeploymentMechanismsServiceType() {
    return productTestingandDeploymentMechanismsServiceType;
  }

  public void setProductTestingandDeploymentMechanismsServiceType(String productTestingandDeploymentMechanismsServiceType) {
    this.productTestingandDeploymentMechanismsServiceType = productTestingandDeploymentMechanismsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return productTestingandDeploymentMechanismsServiceDescription
  **/

  public String getProductTestingandDeploymentMechanismsServiceDescription() {
    return productTestingandDeploymentMechanismsServiceDescription;
  }

  public void setProductTestingandDeploymentMechanismsServiceDescription(String productTestingandDeploymentMechanismsServiceDescription) {
    this.productTestingandDeploymentMechanismsServiceDescription = productTestingandDeploymentMechanismsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return productTestingandDeploymentMechanismsServiceInputsandOuputs
  **/

  public String getProductTestingandDeploymentMechanismsServiceInputsandOuputs() {
    return productTestingandDeploymentMechanismsServiceInputsandOuputs;
  }

  public void setProductTestingandDeploymentMechanismsServiceInputsandOuputs(String productTestingandDeploymentMechanismsServiceInputsandOuputs) {
    this.productTestingandDeploymentMechanismsServiceInputsandOuputs = productTestingandDeploymentMechanismsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return productTestingandDeploymentMechanismsServiceWorkProduct
  **/

  public String getProductTestingandDeploymentMechanismsServiceWorkProduct() {
    return productTestingandDeploymentMechanismsServiceWorkProduct;
  }

  public void setProductTestingandDeploymentMechanismsServiceWorkProduct(String productTestingandDeploymentMechanismsServiceWorkProduct) {
    this.productTestingandDeploymentMechanismsServiceWorkProduct = productTestingandDeploymentMechanismsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return productTestingandDeploymentMechanismsServiceName
  **/

  public String getProductTestingandDeploymentMechanismsServiceName() {
    return productTestingandDeploymentMechanismsServiceName;
  }

  public void setProductTestingandDeploymentMechanismsServiceName(String productTestingandDeploymentMechanismsServiceName) {
    this.productTestingandDeploymentMechanismsServiceName = productTestingandDeploymentMechanismsServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productTestingandDeploymentMechanismsUpdateActionTaskReference
  **/

  public String getProductTestingandDeploymentMechanismsUpdateActionTaskReference() {
    return productTestingandDeploymentMechanismsUpdateActionTaskReference;
  }

  public void setProductTestingandDeploymentMechanismsUpdateActionTaskReference(String productTestingandDeploymentMechanismsUpdateActionTaskReference) {
    this.productTestingandDeploymentMechanismsUpdateActionTaskReference = productTestingandDeploymentMechanismsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productTestingandDeploymentMechanismsUpdateActionTaskRecord
  **/

  public Object getProductTestingandDeploymentMechanismsUpdateActionTaskRecord() {
    return productTestingandDeploymentMechanismsUpdateActionTaskRecord;
  }

  public void setProductTestingandDeploymentMechanismsUpdateActionTaskRecord(Object productTestingandDeploymentMechanismsUpdateActionTaskRecord) {
    this.productTestingandDeploymentMechanismsUpdateActionTaskRecord = productTestingandDeploymentMechanismsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

