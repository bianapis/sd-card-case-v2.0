package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResolutionRetrieveInputModelResolutionInstanceAnalysis;
import org.bian.dto.BQResolutionRetrieveInputModelResolutionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveInputModel
 */
public class BQResolutionRetrieveInputModel   {
  private Object resolutionRetrieveActionTaskRecord = null;

  private String resolutionRetrieveActionRequest = null;

  private BQResolutionRetrieveInputModelResolutionInstanceReport resolutionInstanceReport = null;

  private BQResolutionRetrieveInputModelResolutionInstanceAnalysis resolutionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return resolutionRetrieveActionTaskRecord
  **/

  public Object getResolutionRetrieveActionTaskRecord() {
    return resolutionRetrieveActionTaskRecord;
  }

  public void setResolutionRetrieveActionTaskRecord(Object resolutionRetrieveActionTaskRecord) {
    this.resolutionRetrieveActionTaskRecord = resolutionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return resolutionRetrieveActionRequest
  **/

  public String getResolutionRetrieveActionRequest() {
    return resolutionRetrieveActionRequest;
  }

  public void setResolutionRetrieveActionRequest(String resolutionRetrieveActionRequest) {
    this.resolutionRetrieveActionRequest = resolutionRetrieveActionRequest;
  }


  /**
   * Get resolutionInstanceReport
   * @return resolutionInstanceReport
  **/

  public BQResolutionRetrieveInputModelResolutionInstanceReport getResolutionInstanceReport() {
    return resolutionInstanceReport;
  }

  public void setResolutionInstanceReport(BQResolutionRetrieveInputModelResolutionInstanceReport resolutionInstanceReport) {
    this.resolutionInstanceReport = resolutionInstanceReport;
  }


  /**
   * Get resolutionInstanceAnalysis
   * @return resolutionInstanceAnalysis
  **/

  public BQResolutionRetrieveInputModelResolutionInstanceAnalysis getResolutionInstanceAnalysis() {
    return resolutionInstanceAnalysis;
  }

  public void setResolutionInstanceAnalysis(BQResolutionRetrieveInputModelResolutionInstanceAnalysis resolutionInstanceAnalysis) {
    this.resolutionInstanceAnalysis = resolutionInstanceAnalysis;
  }


}

