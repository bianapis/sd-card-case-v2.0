package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConsolidationRetrieveOutputModelConsolidationInstanceReport
 */
public class BQConsolidationRetrieveOutputModelConsolidationInstanceReport   {
  private Object consolidationInstanceReportRecord = null;

  private String consolidationInstanceReportType = null;

  private String consolidationInstanceReportParameters = null;

  private Object consolidationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return consolidationInstanceReportRecord
  **/

  public Object getConsolidationInstanceReportRecord() {
    return consolidationInstanceReportRecord;
  }

  public void setConsolidationInstanceReportRecord(Object consolidationInstanceReportRecord) {
    this.consolidationInstanceReportRecord = consolidationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return consolidationInstanceReportType
  **/

  public String getConsolidationInstanceReportType() {
    return consolidationInstanceReportType;
  }

  public void setConsolidationInstanceReportType(String consolidationInstanceReportType) {
    this.consolidationInstanceReportType = consolidationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return consolidationInstanceReportParameters
  **/

  public String getConsolidationInstanceReportParameters() {
    return consolidationInstanceReportParameters;
  }

  public void setConsolidationInstanceReportParameters(String consolidationInstanceReportParameters) {
    this.consolidationInstanceReportParameters = consolidationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return consolidationInstanceReport
  **/

  public Object getConsolidationInstanceReport() {
    return consolidationInstanceReport;
  }

  public void setConsolidationInstanceReport(Object consolidationInstanceReport) {
    this.consolidationInstanceReport = consolidationInstanceReport;
  }


}

