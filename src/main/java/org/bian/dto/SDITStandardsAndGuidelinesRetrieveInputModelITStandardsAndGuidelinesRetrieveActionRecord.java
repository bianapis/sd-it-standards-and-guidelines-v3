package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesActivityAnalysis;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecord
 */
public class SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecord   {
  private SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesActivityAnalysis iTStandardsAndGuidelinesActivityAnalysis = null;

  private SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesPerformanceAnalysis iTStandardsAndGuidelinesPerformanceAnalysis = null;

  private SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get iTStandardsAndGuidelinesActivityAnalysis
   * @return iTStandardsAndGuidelinesActivityAnalysis
  **/

  public SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesActivityAnalysis getITStandardsAndGuidelinesActivityAnalysis() {
    return iTStandardsAndGuidelinesActivityAnalysis;
  }

  public void setITStandardsAndGuidelinesActivityAnalysis(SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesActivityAnalysis iTStandardsAndGuidelinesActivityAnalysis) {
    this.iTStandardsAndGuidelinesActivityAnalysis = iTStandardsAndGuidelinesActivityAnalysis;
  }


  /**
   * Get iTStandardsAndGuidelinesPerformanceAnalysis
   * @return iTStandardsAndGuidelinesPerformanceAnalysis
  **/

  public SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesPerformanceAnalysis getITStandardsAndGuidelinesPerformanceAnalysis() {
    return iTStandardsAndGuidelinesPerformanceAnalysis;
  }

  public void setITStandardsAndGuidelinesPerformanceAnalysis(SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordITStandardsAndGuidelinesPerformanceAnalysis iTStandardsAndGuidelinesPerformanceAnalysis) {
    this.iTStandardsAndGuidelinesPerformanceAnalysis = iTStandardsAndGuidelinesPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}
