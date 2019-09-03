package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArbitrationExchangeOutputModel
 */
public class BQArbitrationExchangeOutputModel   {
  private String arbitrationExchangeActionTaskReference = null;

  private Object arbitrationExchangeActionTaskRecord = null;

  private String arbitrationExchangeActionResponse = null;

  private String arbitrationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Arbitration instance exchange service call 
   * @return arbitrationExchangeActionTaskReference
  **/

  public String getArbitrationExchangeActionTaskReference() {
    return arbitrationExchangeActionTaskReference;
  }

  public void setArbitrationExchangeActionTaskReference(String arbitrationExchangeActionTaskReference) {
    this.arbitrationExchangeActionTaskReference = arbitrationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return arbitrationExchangeActionTaskRecord
  **/

  public Object getArbitrationExchangeActionTaskRecord() {
    return arbitrationExchangeActionTaskRecord;
  }

  public void setArbitrationExchangeActionTaskRecord(Object arbitrationExchangeActionTaskRecord) {
    this.arbitrationExchangeActionTaskRecord = arbitrationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return arbitrationExchangeActionResponse
  **/

  public String getArbitrationExchangeActionResponse() {
    return arbitrationExchangeActionResponse;
  }

  public void setArbitrationExchangeActionResponse(String arbitrationExchangeActionResponse) {
    this.arbitrationExchangeActionResponse = arbitrationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Arbitration instance (e.g. accepted, rejected, verified) 
   * @return arbitrationInstanceStatus
  **/

  public String getArbitrationInstanceStatus() {
    return arbitrationInstanceStatus;
  }

  public void setArbitrationInstanceStatus(String arbitrationInstanceStatus) {
    this.arbitrationInstanceStatus = arbitrationInstanceStatus;
  }


}

