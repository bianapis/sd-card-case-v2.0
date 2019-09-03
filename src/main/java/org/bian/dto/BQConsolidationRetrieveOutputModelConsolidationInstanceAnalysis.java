package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConsolidationRetrieveOutputModelConsolidationInstanceAnalysis
 */
public class BQConsolidationRetrieveOutputModelConsolidationInstanceAnalysis   {
  private Object consolidationInstanceAnalysisRecord = null;

  private String consolidationInstanceAnalysisReportType = null;

  private String consolidationInstanceAnalysisParameters = null;

  private Object consolidationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return consolidationInstanceAnalysisRecord
  **/

  public Object getConsolidationInstanceAnalysisRecord() {
    return consolidationInstanceAnalysisRecord;
  }

  public void setConsolidationInstanceAnalysisRecord(Object consolidationInstanceAnalysisRecord) {
    this.consolidationInstanceAnalysisRecord = consolidationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return consolidationInstanceAnalysisReportType
  **/

  public String getConsolidationInstanceAnalysisReportType() {
    return consolidationInstanceAnalysisReportType;
  }

  public void setConsolidationInstanceAnalysisReportType(String consolidationInstanceAnalysisReportType) {
    this.consolidationInstanceAnalysisReportType = consolidationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return consolidationInstanceAnalysisParameters
  **/

  public String getConsolidationInstanceAnalysisParameters() {
    return consolidationInstanceAnalysisParameters;
  }

  public void setConsolidationInstanceAnalysisParameters(String consolidationInstanceAnalysisParameters) {
    this.consolidationInstanceAnalysisParameters = consolidationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return consolidationInstanceAnalysisReport
  **/

  public Object getConsolidationInstanceAnalysisReport() {
    return consolidationInstanceAnalysisReport;
  }

  public void setConsolidationInstanceAnalysisReport(Object consolidationInstanceAnalysisReport) {
    this.consolidationInstanceAnalysisReport = consolidationInstanceAnalysisReport;
  }


}

