package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITPoliciesandGuidelinesInitiateOutputModel
 */
public class BQITPoliciesandGuidelinesInitiateOutputModel   {
  private String iTPoliciesandGuidelinesInstanceReference = null;

  private String iTPoliciesandGuidelinesInitiateActionReference = null;

  private Object iTPoliciesandGuidelinesInitiateActionRecord = null;

  private String iTPoliciesandGuidelinesInstanceStatus = null;

  private String iTPoliciesandGuidelinesPreconditions = null;

  private String iTPoliciesandGuidelinesSpecificationSchedule = null;

  private String iTPoliciesandGuidelinesVersionNumber = null;

  private String iTPoliciesandGuidelines = null;

  private String iTPoliciesandGuidelinesServiceType = null;

  private String iTPoliciesandGuidelinesServiceDescription = null;

  private String iTPoliciesandGuidelinesServiceInputsandOuputs = null;

  private String iTPoliciesandGuidelinesServiceWorkProduct = null;

  private String iTPoliciesandGuidelinesServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ITPolicies and Guidelines instance 
   * @return iTPoliciesandGuidelinesInstanceReference
  **/

  public String getITPoliciesandGuidelinesInstanceReference() {
    return iTPoliciesandGuidelinesInstanceReference;
  }

  public void setITPoliciesandGuidelinesInstanceReference(String iTPoliciesandGuidelinesInstanceReference) {
    this.iTPoliciesandGuidelinesInstanceReference = iTPoliciesandGuidelinesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return iTPoliciesandGuidelinesInitiateActionReference
  **/

  public String getITPoliciesandGuidelinesInitiateActionReference() {
    return iTPoliciesandGuidelinesInitiateActionReference;
  }

  public void setITPoliciesandGuidelinesInitiateActionReference(String iTPoliciesandGuidelinesInitiateActionReference) {
    this.iTPoliciesandGuidelinesInitiateActionReference = iTPoliciesandGuidelinesInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return iTPoliciesandGuidelinesInitiateActionRecord
  **/

  public Object getITPoliciesandGuidelinesInitiateActionRecord() {
    return iTPoliciesandGuidelinesInitiateActionRecord;
  }

  public void setITPoliciesandGuidelinesInitiateActionRecord(Object iTPoliciesandGuidelinesInitiateActionRecord) {
    this.iTPoliciesandGuidelinesInitiateActionRecord = iTPoliciesandGuidelinesInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the ITPolicies and Guidelines instance (e.g. initialised, pending, active) 
   * @return iTPoliciesandGuidelinesInstanceStatus
  **/

  public String getITPoliciesandGuidelinesInstanceStatus() {
    return iTPoliciesandGuidelinesInstanceStatus;
  }

  public void setITPoliciesandGuidelinesInstanceStatus(String iTPoliciesandGuidelinesInstanceStatus) {
    this.iTPoliciesandGuidelinesInstanceStatus = iTPoliciesandGuidelinesInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return iTPoliciesandGuidelinesPreconditions
  **/

  public String getITPoliciesandGuidelinesPreconditions() {
    return iTPoliciesandGuidelinesPreconditions;
  }

  public void setITPoliciesandGuidelinesPreconditions(String iTPoliciesandGuidelinesPreconditions) {
    this.iTPoliciesandGuidelinesPreconditions = iTPoliciesandGuidelinesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return iTPoliciesandGuidelinesSpecificationSchedule
  **/

  public String getITPoliciesandGuidelinesSpecificationSchedule() {
    return iTPoliciesandGuidelinesSpecificationSchedule;
  }

  public void setITPoliciesandGuidelinesSpecificationSchedule(String iTPoliciesandGuidelinesSpecificationSchedule) {
    this.iTPoliciesandGuidelinesSpecificationSchedule = iTPoliciesandGuidelinesSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return iTPoliciesandGuidelinesVersionNumber
  **/

  public String getITPoliciesandGuidelinesVersionNumber() {
    return iTPoliciesandGuidelinesVersionNumber;
  }

  public void setITPoliciesandGuidelinesVersionNumber(String iTPoliciesandGuidelinesVersionNumber) {
    this.iTPoliciesandGuidelinesVersionNumber = iTPoliciesandGuidelinesVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Technology Standards Specification specific Business Service 
   * @return iTPoliciesandGuidelines
  **/

  public String getITPoliciesandGuidelines() {
    return iTPoliciesandGuidelines;
  }

  public void setITPoliciesandGuidelines(String iTPoliciesandGuidelines) {
    this.iTPoliciesandGuidelines = iTPoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return iTPoliciesandGuidelinesServiceType
  **/

  public String getITPoliciesandGuidelinesServiceType() {
    return iTPoliciesandGuidelinesServiceType;
  }

  public void setITPoliciesandGuidelinesServiceType(String iTPoliciesandGuidelinesServiceType) {
    this.iTPoliciesandGuidelinesServiceType = iTPoliciesandGuidelinesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return iTPoliciesandGuidelinesServiceDescription
  **/

  public String getITPoliciesandGuidelinesServiceDescription() {
    return iTPoliciesandGuidelinesServiceDescription;
  }

  public void setITPoliciesandGuidelinesServiceDescription(String iTPoliciesandGuidelinesServiceDescription) {
    this.iTPoliciesandGuidelinesServiceDescription = iTPoliciesandGuidelinesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return iTPoliciesandGuidelinesServiceInputsandOuputs
  **/

  public String getITPoliciesandGuidelinesServiceInputsandOuputs() {
    return iTPoliciesandGuidelinesServiceInputsandOuputs;
  }

  public void setITPoliciesandGuidelinesServiceInputsandOuputs(String iTPoliciesandGuidelinesServiceInputsandOuputs) {
    this.iTPoliciesandGuidelinesServiceInputsandOuputs = iTPoliciesandGuidelinesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return iTPoliciesandGuidelinesServiceWorkProduct
  **/

  public String getITPoliciesandGuidelinesServiceWorkProduct() {
    return iTPoliciesandGuidelinesServiceWorkProduct;
  }

  public void setITPoliciesandGuidelinesServiceWorkProduct(String iTPoliciesandGuidelinesServiceWorkProduct) {
    this.iTPoliciesandGuidelinesServiceWorkProduct = iTPoliciesandGuidelinesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return iTPoliciesandGuidelinesServiceName
  **/

  public String getITPoliciesandGuidelinesServiceName() {
    return iTPoliciesandGuidelinesServiceName;
  }

  public void setITPoliciesandGuidelinesServiceName(String iTPoliciesandGuidelinesServiceName) {
    this.iTPoliciesandGuidelinesServiceName = iTPoliciesandGuidelinesServiceName;
  }


}

