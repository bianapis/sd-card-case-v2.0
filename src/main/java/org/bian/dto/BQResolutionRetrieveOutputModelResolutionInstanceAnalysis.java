package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveOutputModelResolutionInstanceAnalysis
 */
public class BQResolutionRetrieveOutputModelResolutionInstanceAnalysis   {
  private Object resolutionInstanceAnalysisRecord = null;

  private String resolutionInstanceAnalysisReportType = null;

  private String resolutionInstanceAnalysisParameters = null;

  private Object resolutionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return resolutionInstanceAnalysisRecord
  **/

  public Object getResolutionInstanceAnalysisRecord() {
    return resolutionInstanceAnalysisRecord;
  }

  public void setResolutionInstanceAnalysisRecord(Object resolutionInstanceAnalysisRecord) {
    this.resolutionInstanceAnalysisRecord = resolutionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return resolutionInstanceAnalysisReportType
  **/

  public String getResolutionInstanceAnalysisReportType() {
    return resolutionInstanceAnalysisReportType;
  }

  public void setResolutionInstanceAnalysisReportType(String resolutionInstanceAnalysisReportType) {
    this.resolutionInstanceAnalysisReportType = resolutionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return resolutionInstanceAnalysisParameters
  **/

  public String getResolutionInstanceAnalysisParameters() {
    return resolutionInstanceAnalysisParameters;
  }

  public void setResolutionInstanceAnalysisParameters(String resolutionInstanceAnalysisParameters) {
    this.resolutionInstanceAnalysisParameters = resolutionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return resolutionInstanceAnalysisReport
  **/

  public Object getResolutionInstanceAnalysisReport() {
    return resolutionInstanceAnalysisReport;
  }

  public void setResolutionInstanceAnalysisReport(Object resolutionInstanceAnalysisReport) {
    this.resolutionInstanceAnalysisReport = resolutionInstanceAnalysisReport;
  }


}

