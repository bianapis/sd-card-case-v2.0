package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArbitrationRetrieveOutputModelArbitrationInstanceAnalysis
 */
public class BQArbitrationRetrieveOutputModelArbitrationInstanceAnalysis   {
  private Object arbitrationInstanceAnalysisRecord = null;

  private String arbitrationInstanceAnalysisReportType = null;

  private String arbitrationInstanceAnalysisParameters = null;

  private Object arbitrationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return arbitrationInstanceAnalysisRecord
  **/

  public Object getArbitrationInstanceAnalysisRecord() {
    return arbitrationInstanceAnalysisRecord;
  }

  public void setArbitrationInstanceAnalysisRecord(Object arbitrationInstanceAnalysisRecord) {
    this.arbitrationInstanceAnalysisRecord = arbitrationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return arbitrationInstanceAnalysisReportType
  **/

  public String getArbitrationInstanceAnalysisReportType() {
    return arbitrationInstanceAnalysisReportType;
  }

  public void setArbitrationInstanceAnalysisReportType(String arbitrationInstanceAnalysisReportType) {
    this.arbitrationInstanceAnalysisReportType = arbitrationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return arbitrationInstanceAnalysisParameters
  **/

  public String getArbitrationInstanceAnalysisParameters() {
    return arbitrationInstanceAnalysisParameters;
  }

  public void setArbitrationInstanceAnalysisParameters(String arbitrationInstanceAnalysisParameters) {
    this.arbitrationInstanceAnalysisParameters = arbitrationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return arbitrationInstanceAnalysisReport
  **/

  public Object getArbitrationInstanceAnalysisReport() {
    return arbitrationInstanceAnalysisReport;
  }

  public void setArbitrationInstanceAnalysisReport(Object arbitrationInstanceAnalysisReport) {
    this.arbitrationInstanceAnalysisReport = arbitrationInstanceAnalysisReport;
  }


}

