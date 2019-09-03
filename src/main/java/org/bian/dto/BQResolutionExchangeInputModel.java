package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQResolutionExchangeInputModel
 */
public class BQResolutionExchangeInputModel   {
  private String cardCaseProcedureInstanceReference = null;

  private String resolutionInstanceReference = null;

  private Object resolutionExchangeActionTaskRecord = null;

  private CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest resolutionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Case Procedure instance 
   * @return cardCaseProcedureInstanceReference
  **/

  public String getCardCaseProcedureInstanceReference() {
    return cardCaseProcedureInstanceReference;
  }

  public void setCardCaseProcedureInstanceReference(String cardCaseProcedureInstanceReference) {
    this.cardCaseProcedureInstanceReference = cardCaseProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Resolution instance 
   * @return resolutionInstanceReference
  **/

  public String getResolutionInstanceReference() {
    return resolutionInstanceReference;
  }

  public void setResolutionInstanceReference(String resolutionInstanceReference) {
    this.resolutionInstanceReference = resolutionInstanceReference;
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
   * Get resolutionExchangeActionRequest
   * @return resolutionExchangeActionRequest
  **/

  public CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest getResolutionExchangeActionRequest() {
    return resolutionExchangeActionRequest;
  }

  public void setResolutionExchangeActionRequest(CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest resolutionExchangeActionRequest) {
    this.resolutionExchangeActionRequest = resolutionExchangeActionRequest;
  }


}

