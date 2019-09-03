package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureExchangeOutputModel
 */
public class CRCardCaseProcedureExchangeOutputModel   {
  private String cardCaseProcedureExchangeActionTaskReference = null;

  private Object cardCaseProcedureExchangeActionTaskRecord = null;

  private String cardCaseProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Case Procedure instance exchange service call 
   * @return cardCaseProcedureExchangeActionTaskReference
  **/

  public String getCardCaseProcedureExchangeActionTaskReference() {
    return cardCaseProcedureExchangeActionTaskReference;
  }

  public void setCardCaseProcedureExchangeActionTaskReference(String cardCaseProcedureExchangeActionTaskReference) {
    this.cardCaseProcedureExchangeActionTaskReference = cardCaseProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return cardCaseProcedureExchangeActionTaskRecord
  **/

  public Object getCardCaseProcedureExchangeActionTaskRecord() {
    return cardCaseProcedureExchangeActionTaskRecord;
  }

  public void setCardCaseProcedureExchangeActionTaskRecord(Object cardCaseProcedureExchangeActionTaskRecord) {
    this.cardCaseProcedureExchangeActionTaskRecord = cardCaseProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return cardCaseProcedureExchangeActionResponse
  **/

  public String getCardCaseProcedureExchangeActionResponse() {
    return cardCaseProcedureExchangeActionResponse;
  }

  public void setCardCaseProcedureExchangeActionResponse(String cardCaseProcedureExchangeActionResponse) {
    this.cardCaseProcedureExchangeActionResponse = cardCaseProcedureExchangeActionResponse;
  }


}

