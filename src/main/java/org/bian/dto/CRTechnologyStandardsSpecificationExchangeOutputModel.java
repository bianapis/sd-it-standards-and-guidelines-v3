package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTechnologyStandardsSpecificationExchangeOutputModel
 */
public class CRTechnologyStandardsSpecificationExchangeOutputModel   {
  private String technologyStandardsSpecificationParameterType = null;

  private String technologyStandardsSpecificationSelectedOption = null;

  private String technologyStandardsSpecificationVersion = null;

  private String technologyStandardsSpecificationStatus = null;

  private String technologyStandardsSpecificationUsageLog = null;

  private String technologyStandardsSpecificationFeedback = null;

  private String technologyStandardsSpecificationExchangeActionTaskReference = null;

  private Object technologyStandardsSpecificationExchangeActionTaskRecord = null;

  private String technologyStandardsSpecificationExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Technology Standards Specification instance exchange service call 
   * @return technologyStandardsSpecificationExchangeActionTaskReference
  **/

  public String getTechnologyStandardsSpecificationExchangeActionTaskReference() {
    return technologyStandardsSpecificationExchangeActionTaskReference;
  }

  public void setTechnologyStandardsSpecificationExchangeActionTaskReference(String technologyStandardsSpecificationExchangeActionTaskReference) {
    this.technologyStandardsSpecificationExchangeActionTaskReference = technologyStandardsSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return technologyStandardsSpecificationExchangeActionTaskRecord
  **/

  public Object getTechnologyStandardsSpecificationExchangeActionTaskRecord() {
    return technologyStandardsSpecificationExchangeActionTaskRecord;
  }

  public void setTechnologyStandardsSpecificationExchangeActionTaskRecord(Object technologyStandardsSpecificationExchangeActionTaskRecord) {
    this.technologyStandardsSpecificationExchangeActionTaskRecord = technologyStandardsSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return technologyStandardsSpecificationExchangeActionResponse
  **/

  public String getTechnologyStandardsSpecificationExchangeActionResponse() {
    return technologyStandardsSpecificationExchangeActionResponse;
  }

  public void setTechnologyStandardsSpecificationExchangeActionResponse(String technologyStandardsSpecificationExchangeActionResponse) {
    this.technologyStandardsSpecificationExchangeActionResponse = technologyStandardsSpecificationExchangeActionResponse;
  }


}

