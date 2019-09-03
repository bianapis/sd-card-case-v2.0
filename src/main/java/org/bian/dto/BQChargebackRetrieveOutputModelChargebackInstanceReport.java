package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChargebackRetrieveOutputModelChargebackInstanceReport
 */
public class BQChargebackRetrieveOutputModelChargebackInstanceReport   {
  private Object chargebackInstanceReportRecord = null;

  private String chargebackInstanceReportType = null;

  private String chargebackInstanceReportParameters = null;

  private Object chargebackInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return chargebackInstanceReportRecord
  **/

  public Object getChargebackInstanceReportRecord() {
    return chargebackInstanceReportRecord;
  }

  public void setChargebackInstanceReportRecord(Object chargebackInstanceReportRecord) {
    this.chargebackInstanceReportRecord = chargebackInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return chargebackInstanceReportType
  **/

  public String getChargebackInstanceReportType() {
    return chargebackInstanceReportType;
  }

  public void setChargebackInstanceReportType(String chargebackInstanceReportType) {
    this.chargebackInstanceReportType = chargebackInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return chargebackInstanceReportParameters
  **/

  public String getChargebackInstanceReportParameters() {
    return chargebackInstanceReportParameters;
  }

  public void setChargebackInstanceReportParameters(String chargebackInstanceReportParameters) {
    this.chargebackInstanceReportParameters = chargebackInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return chargebackInstanceReport
  **/

  public Object getChargebackInstanceReport() {
    return chargebackInstanceReport;
  }

  public void setChargebackInstanceReport(Object chargebackInstanceReport) {
    this.chargebackInstanceReport = chargebackInstanceReport;
  }


}

