package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTechnologyStandardsSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRTechnologyStandardsSpecificationRequestInputModel
 */
public class CRTechnologyStandardsSpecificationRequestInputModel   {
  private String iTStandardsAndGuidelinesServicingSessionReference = null;

  private String technologyStandardsSpecificationInstanceReference = null;

  private String technologyStandardsSpecificationParameterType = null;

  private String technologyStandardsSpecificationSelectedOption = null;

  private String technologyStandardsSpecificationDescription = null;

  private String technologyStandardsSpecificationVersion = null;

  private String technologyStandardsSpecificationStatus = null;

  private String technologyStandardsSpecificationUsageLog = null;

  private String technologyStandardsSpecificationFeedback = null;

  private String technologyStandardsSpecificationServiceProviderReference = null;

  private Object technologyStandardsSpecificationRequestActionTaskRecord = null;

  private CRTechnologyStandardsSpecificationRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return iTStandardsAndGuidelinesServicingSessionReference
  **/

  public String getITStandardsAndGuidelinesServicingSessionReference() {
    return iTStandardsAndGuidelinesServicingSessionReference;
  }

  public void setITStandardsAndGuidelinesServicingSessionReference(String iTStandardsAndGuidelinesServicingSessionReference) {
    this.iTStandardsAndGuidelinesServicingSessionReference = iTStandardsAndGuidelinesServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Technology Standards Specification instance 
   * @return technologyStandardsSpecificationInstanceReference
  **/

  public String getTechnologyStandardsSpecificationInstanceReference() {
    return technologyStandardsSpecificationInstanceReference;
  }

  public void setTechnologyStandardsSpecificationInstanceReference(String technologyStandardsSpecificationInstanceReference) {
    this.technologyStandardsSpecificationInstanceReference = technologyStandardsSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between designs according to the type of business services and/or aspect within Technology Standards Specification . Eg Product Design, Campaign Design, Risk Model Design etc.  
   * @return technologyStandardsSpecificationParameterType
  **/

  public String getTechnologyStandardsSpecificationParameterType() {
    return technologyStandardsSpecificationParameterType;
  }

  public void setTechnologyStandardsSpecificationParameterType(String technologyStandardsSpecificationParameterType) {
    this.technologyStandardsSpecificationParameterType = technologyStandardsSpecificationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of design 
   * @return technologyStandardsSpecificationSelectedOption
  **/

  public String getTechnologyStandardsSpecificationSelectedOption() {
    return technologyStandardsSpecificationSelectedOption;
  }

  public void setTechnologyStandardsSpecificationSelectedOption(String technologyStandardsSpecificationSelectedOption) {
    this.technologyStandardsSpecificationSelectedOption = technologyStandardsSpecificationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Technology Standards Specification 
   * @return technologyStandardsSpecificationDescription
  **/

  public String getTechnologyStandardsSpecificationDescription() {
    return technologyStandardsSpecificationDescription;
  }

  public void setTechnologyStandardsSpecificationDescription(String technologyStandardsSpecificationDescription) {
    this.technologyStandardsSpecificationDescription = technologyStandardsSpecificationDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version of Technology Standards Specification 
   * @return technologyStandardsSpecificationVersion
  **/

  public String getTechnologyStandardsSpecificationVersion() {
    return technologyStandardsSpecificationVersion;
  }

  public void setTechnologyStandardsSpecificationVersion(String technologyStandardsSpecificationVersion) {
    this.technologyStandardsSpecificationVersion = technologyStandardsSpecificationVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Technology Standards Specification 
   * @return technologyStandardsSpecificationStatus
  **/

  public String getTechnologyStandardsSpecificationStatus() {
    return technologyStandardsSpecificationStatus;
  }

  public void setTechnologyStandardsSpecificationStatus(String technologyStandardsSpecificationStatus) {
    this.technologyStandardsSpecificationStatus = technologyStandardsSpecificationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Technology Standards Specification 
   * @return technologyStandardsSpecificationUsageLog
  **/

  public String getTechnologyStandardsSpecificationUsageLog() {
    return technologyStandardsSpecificationUsageLog;
  }

  public void setTechnologyStandardsSpecificationUsageLog(String technologyStandardsSpecificationUsageLog) {
    this.technologyStandardsSpecificationUsageLog = technologyStandardsSpecificationUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Information about reactions to a design which is used as a basis for improvement for the Technology Standards Specification. 
   * @return technologyStandardsSpecificationFeedback
  **/

  public String getTechnologyStandardsSpecificationFeedback() {
    return technologyStandardsSpecificationFeedback;
  }

  public void setTechnologyStandardsSpecificationFeedback(String technologyStandardsSpecificationFeedback) {
    this.technologyStandardsSpecificationFeedback = technologyStandardsSpecificationFeedback;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Technology Standards Specification 
   * @return technologyStandardsSpecificationServiceProviderReference
  **/

  public String getTechnologyStandardsSpecificationServiceProviderReference() {
    return technologyStandardsSpecificationServiceProviderReference;
  }

  public void setTechnologyStandardsSpecificationServiceProviderReference(String technologyStandardsSpecificationServiceProviderReference) {
    this.technologyStandardsSpecificationServiceProviderReference = technologyStandardsSpecificationServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return technologyStandardsSpecificationRequestActionTaskRecord
  **/

  public Object getTechnologyStandardsSpecificationRequestActionTaskRecord() {
    return technologyStandardsSpecificationRequestActionTaskRecord;
  }

  public void setTechnologyStandardsSpecificationRequestActionTaskRecord(Object technologyStandardsSpecificationRequestActionTaskRecord) {
    this.technologyStandardsSpecificationRequestActionTaskRecord = technologyStandardsSpecificationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRTechnologyStandardsSpecificationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRTechnologyStandardsSpecificationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

