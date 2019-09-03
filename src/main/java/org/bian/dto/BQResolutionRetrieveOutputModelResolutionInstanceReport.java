package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveOutputModelResolutionInstanceReport
 */
public class BQResolutionRetrieveOutputModelResolutionInstanceReport   {
  private Object resolutionInstanceReportRecord = null;

  private String resolutionInstanceReportType = null;

  private String resolutionInstanceReportParameters = null;

  private Object resolutionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return resolutionInstanceReportRecord
  **/

  public Object getResolutionInstanceReportRecord() {
    return resolutionInstanceReportRecord;
  }

  public void setResolutionInstanceReportRecord(Object resolutionInstanceReportRecord) {
    this.resolutionInstanceReportRecord = resolutionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return resolutionInstanceReportType
  **/

  public String getResolutionInstanceReportType() {
    return resolutionInstanceReportType;
  }

  public void setResolutionInstanceReportType(String resolutionInstanceReportType) {
    this.resolutionInstanceReportType = resolutionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return resolutionInstanceReportParameters
  **/

  public String getResolutionInstanceReportParameters() {
    return resolutionInstanceReportParameters;
  }

  public void setResolutionInstanceReportParameters(String resolutionInstanceReportParameters) {
    this.resolutionInstanceReportParameters = resolutionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return resolutionInstanceReport
  **/

  public Object getResolutionInstanceReport() {
    return resolutionInstanceReport;
  }

  public void setResolutionInstanceReport(Object resolutionInstanceReport) {
    this.resolutionInstanceReport = resolutionInstanceReport;
  }


}

