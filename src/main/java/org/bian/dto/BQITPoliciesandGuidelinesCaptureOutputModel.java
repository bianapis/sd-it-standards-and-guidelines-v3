package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITPoliciesandGuidelinesCaptureOutputModel
 */
public class BQITPoliciesandGuidelinesCaptureOutputModel   {
  private String iTPoliciesandGuidelinesPreconditions = null;

  private String iTPoliciesandGuidelinesSpecificationSchedule = null;

  private String iTPoliciesandGuidelinesVersionNumber = null;

  private String iTPoliciesandGuidelines = null;

  private String iTPoliciesandGuidelinesServiceType = null;

  private String iTPoliciesandGuidelinesServiceDescription = null;

  private String iTPoliciesandGuidelinesServiceInputsandOuputs = null;

  private String iTPoliciesandGuidelinesServiceWorkProduct = null;

  private String iTPoliciesandGuidelinesServiceName = null;

  private String iTPoliciesandGuidelinesCaptureActionTaskReference = null;

  private Object iTPoliciesandGuidelinesCaptureActionTaskRecord = null;

  private String iTPoliciesandGuidelinesCaptureRecordReference = null;

  private Object captureResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ITPolicies and Guidelines instance capture service call 
   * @return iTPoliciesandGuidelinesCaptureActionTaskReference
  **/

  public String getITPoliciesandGuidelinesCaptureActionTaskReference() {
    return iTPoliciesandGuidelinesCaptureActionTaskReference;
  }

  public void setITPoliciesandGuidelinesCaptureActionTaskReference(String iTPoliciesandGuidelinesCaptureActionTaskReference) {
    this.iTPoliciesandGuidelinesCaptureActionTaskReference = iTPoliciesandGuidelinesCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return iTPoliciesandGuidelinesCaptureActionTaskRecord
  **/

  public Object getITPoliciesandGuidelinesCaptureActionTaskRecord() {
    return iTPoliciesandGuidelinesCaptureActionTaskRecord;
  }

  public void setITPoliciesandGuidelinesCaptureActionTaskRecord(Object iTPoliciesandGuidelinesCaptureActionTaskRecord) {
    this.iTPoliciesandGuidelinesCaptureActionTaskRecord = iTPoliciesandGuidelinesCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ITPolicies and Guidelines structured input transaction/record 
   * @return iTPoliciesandGuidelinesCaptureRecordReference
  **/

  public String getITPoliciesandGuidelinesCaptureRecordReference() {
    return iTPoliciesandGuidelinesCaptureRecordReference;
  }

  public void setITPoliciesandGuidelinesCaptureRecordReference(String iTPoliciesandGuidelinesCaptureRecordReference) {
    this.iTPoliciesandGuidelinesCaptureRecordReference = iTPoliciesandGuidelinesCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

