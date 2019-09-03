package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArbitrationRetrieveOutputModelArbitrationInstanceReport
 */
public class BQArbitrationRetrieveOutputModelArbitrationInstanceReport   {
  private Object arbitrationInstanceReportRecord = null;

  private String arbitrationInstanceReportType = null;

  private String arbitrationInstanceReportParameters = null;

  private Object arbitrationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return arbitrationInstanceReportRecord
  **/

  public Object getArbitrationInstanceReportRecord() {
    return arbitrationInstanceReportRecord;
  }

  public void setArbitrationInstanceReportRecord(Object arbitrationInstanceReportRecord) {
    this.arbitrationInstanceReportRecord = arbitrationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return arbitrationInstanceReportType
  **/

  public String getArbitrationInstanceReportType() {
    return arbitrationInstanceReportType;
  }

  public void setArbitrationInstanceReportType(String arbitrationInstanceReportType) {
    this.arbitrationInstanceReportType = arbitrationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return arbitrationInstanceReportParameters
  **/

  public String getArbitrationInstanceReportParameters() {
    return arbitrationInstanceReportParameters;
  }

  public void setArbitrationInstanceReportParameters(String arbitrationInstanceReportParameters) {
    this.arbitrationInstanceReportParameters = arbitrationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return arbitrationInstanceReport
  **/

  public Object getArbitrationInstanceReport() {
    return arbitrationInstanceReport;
  }

  public void setArbitrationInstanceReport(Object arbitrationInstanceReport) {
    this.arbitrationInstanceReport = arbitrationInstanceReport;
  }


}

