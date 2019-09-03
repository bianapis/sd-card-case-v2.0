package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQArbitrationRetrieveInputModelArbitrationInstanceAnalysis;
import org.bian.dto.BQArbitrationRetrieveInputModelArbitrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQArbitrationRetrieveInputModel
 */
public class BQArbitrationRetrieveInputModel   {
  private Object arbitrationRetrieveActionTaskRecord = null;

  private String arbitrationRetrieveActionRequest = null;

  private BQArbitrationRetrieveInputModelArbitrationInstanceReport arbitrationInstanceReport = null;

  private BQArbitrationRetrieveInputModelArbitrationInstanceAnalysis arbitrationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return arbitrationRetrieveActionTaskRecord
  **/

  public Object getArbitrationRetrieveActionTaskRecord() {
    return arbitrationRetrieveActionTaskRecord;
  }

  public void setArbitrationRetrieveActionTaskRecord(Object arbitrationRetrieveActionTaskRecord) {
    this.arbitrationRetrieveActionTaskRecord = arbitrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return arbitrationRetrieveActionRequest
  **/

  public String getArbitrationRetrieveActionRequest() {
    return arbitrationRetrieveActionRequest;
  }

  public void setArbitrationRetrieveActionRequest(String arbitrationRetrieveActionRequest) {
    this.arbitrationRetrieveActionRequest = arbitrationRetrieveActionRequest;
  }


  /**
   * Get arbitrationInstanceReport
   * @return arbitrationInstanceReport
  **/

  public BQArbitrationRetrieveInputModelArbitrationInstanceReport getArbitrationInstanceReport() {
    return arbitrationInstanceReport;
  }

  public void setArbitrationInstanceReport(BQArbitrationRetrieveInputModelArbitrationInstanceReport arbitrationInstanceReport) {
    this.arbitrationInstanceReport = arbitrationInstanceReport;
  }


  /**
   * Get arbitrationInstanceAnalysis
   * @return arbitrationInstanceAnalysis
  **/

  public BQArbitrationRetrieveInputModelArbitrationInstanceAnalysis getArbitrationInstanceAnalysis() {
    return arbitrationInstanceAnalysis;
  }

  public void setArbitrationInstanceAnalysis(BQArbitrationRetrieveInputModelArbitrationInstanceAnalysis arbitrationInstanceAnalysis) {
    this.arbitrationInstanceAnalysis = arbitrationInstanceAnalysis;
  }


}

