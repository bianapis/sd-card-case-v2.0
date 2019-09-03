package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChargebackRetrieveInputModelChargebackInstanceAnalysis;
import org.bian.dto.BQChargebackRetrieveInputModelChargebackInstanceReport;

import javax.validation.Valid;
  
/**
 * BQChargebackRetrieveInputModel
 */
public class BQChargebackRetrieveInputModel   {
  private Object chargebackRetrieveActionTaskRecord = null;

  private String chargebackRetrieveActionRequest = null;

  private BQChargebackRetrieveInputModelChargebackInstanceReport chargebackInstanceReport = null;

  private BQChargebackRetrieveInputModelChargebackInstanceAnalysis chargebackInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return chargebackRetrieveActionTaskRecord
  **/

  public Object getChargebackRetrieveActionTaskRecord() {
    return chargebackRetrieveActionTaskRecord;
  }

  public void setChargebackRetrieveActionTaskRecord(Object chargebackRetrieveActionTaskRecord) {
    this.chargebackRetrieveActionTaskRecord = chargebackRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return chargebackRetrieveActionRequest
  **/

  public String getChargebackRetrieveActionRequest() {
    return chargebackRetrieveActionRequest;
  }

  public void setChargebackRetrieveActionRequest(String chargebackRetrieveActionRequest) {
    this.chargebackRetrieveActionRequest = chargebackRetrieveActionRequest;
  }


  /**
   * Get chargebackInstanceReport
   * @return chargebackInstanceReport
  **/

  public BQChargebackRetrieveInputModelChargebackInstanceReport getChargebackInstanceReport() {
    return chargebackInstanceReport;
  }

  public void setChargebackInstanceReport(BQChargebackRetrieveInputModelChargebackInstanceReport chargebackInstanceReport) {
    this.chargebackInstanceReport = chargebackInstanceReport;
  }


  /**
   * Get chargebackInstanceAnalysis
   * @return chargebackInstanceAnalysis
  **/

  public BQChargebackRetrieveInputModelChargebackInstanceAnalysis getChargebackInstanceAnalysis() {
    return chargebackInstanceAnalysis;
  }

  public void setChargebackInstanceAnalysis(BQChargebackRetrieveInputModelChargebackInstanceAnalysis chargebackInstanceAnalysis) {
    this.chargebackInstanceAnalysis = chargebackInstanceAnalysis;
  }


}

