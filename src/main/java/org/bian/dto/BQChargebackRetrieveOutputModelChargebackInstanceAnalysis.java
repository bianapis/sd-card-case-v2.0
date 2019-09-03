package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChargebackRetrieveOutputModelChargebackInstanceAnalysis
 */
public class BQChargebackRetrieveOutputModelChargebackInstanceAnalysis   {
  private Object chargebackInstanceAnalysisRecord = null;

  private String chargebackInstanceAnalysisReportType = null;

  private String chargebackInstanceAnalysisParameters = null;

  private Object chargebackInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return chargebackInstanceAnalysisRecord
  **/

  public Object getChargebackInstanceAnalysisRecord() {
    return chargebackInstanceAnalysisRecord;
  }

  public void setChargebackInstanceAnalysisRecord(Object chargebackInstanceAnalysisRecord) {
    this.chargebackInstanceAnalysisRecord = chargebackInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return chargebackInstanceAnalysisReportType
  **/

  public String getChargebackInstanceAnalysisReportType() {
    return chargebackInstanceAnalysisReportType;
  }

  public void setChargebackInstanceAnalysisReportType(String chargebackInstanceAnalysisReportType) {
    this.chargebackInstanceAnalysisReportType = chargebackInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return chargebackInstanceAnalysisParameters
  **/

  public String getChargebackInstanceAnalysisParameters() {
    return chargebackInstanceAnalysisParameters;
  }

  public void setChargebackInstanceAnalysisParameters(String chargebackInstanceAnalysisParameters) {
    this.chargebackInstanceAnalysisParameters = chargebackInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return chargebackInstanceAnalysisReport
  **/

  public Object getChargebackInstanceAnalysisReport() {
    return chargebackInstanceAnalysisReport;
  }

  public void setChargebackInstanceAnalysisReport(Object chargebackInstanceAnalysisReport) {
    this.chargebackInstanceAnalysisReport = chargebackInstanceAnalysisReport;
  }


}

