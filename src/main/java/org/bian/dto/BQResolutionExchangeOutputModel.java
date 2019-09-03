package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionExchangeOutputModel
 */
public class BQResolutionExchangeOutputModel   {
  private String resolutionExchangeActionTaskReference = null;

  private Object resolutionExchangeActionTaskRecord = null;

  private String resolutionExchangeActionResponse = null;

  private String resolutionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Resolution instance exchange service call 
   * @return resolutionExchangeActionTaskReference
  **/

  public String getResolutionExchangeActionTaskReference() {
    return resolutionExchangeActionTaskReference;
  }

  public void setResolutionExchangeActionTaskReference(String resolutionExchangeActionTaskReference) {
    this.resolutionExchangeActionTaskReference = resolutionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return resolutionExchangeActionTaskRecord
  **/

  public Object getResolutionExchangeActionTaskRecord() {
    return resolutionExchangeActionTaskRecord;
  }

  public void setResolutionExchangeActionTaskRecord(Object resolutionExchangeActionTaskRecord) {
    this.resolutionExchangeActionTaskRecord = resolutionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return resolutionExchangeActionResponse
  **/

  public String getResolutionExchangeActionResponse() {
    return resolutionExchangeActionResponse;
  }

  public void setResolutionExchangeActionResponse(String resolutionExchangeActionResponse) {
    this.resolutionExchangeActionResponse = resolutionExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Resolution instance (e.g. accepted, rejected, verified) 
   * @return resolutionInstanceStatus
  **/

  public String getResolutionInstanceStatus() {
    return resolutionInstanceStatus;
  }

  public void setResolutionInstanceStatus(String resolutionInstanceStatus) {
    this.resolutionInstanceStatus = resolutionInstanceStatus;
  }


}

