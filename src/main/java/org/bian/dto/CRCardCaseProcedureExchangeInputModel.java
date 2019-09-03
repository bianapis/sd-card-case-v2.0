package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureExchangeInputModel
 */
public class CRCardCaseProcedureExchangeInputModel   {
  private String cardCaseServicingSessionReference = null;

  private String cardCaseProcedureInstanceReference = null;

  private Object cardCaseProcedureExchangeActionTaskRecord = null;

  private CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest cardCaseProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardCaseServicingSessionReference
  **/

  public String getCardCaseServicingSessionReference() {
    return cardCaseServicingSessionReference;
  }

  public void setCardCaseServicingSessionReference(String cardCaseServicingSessionReference) {
    this.cardCaseServicingSessionReference = cardCaseServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Case Procedure instance 
   * @return cardCaseProcedureInstanceReference
  **/

  public String getCardCaseProcedureInstanceReference() {
    return cardCaseProcedureInstanceReference;
  }

  public void setCardCaseProcedureInstanceReference(String cardCaseProcedureInstanceReference) {
    this.cardCaseProcedureInstanceReference = cardCaseProcedureInstanceReference;
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
   * Get cardCaseProcedureExchangeActionRequest
   * @return cardCaseProcedureExchangeActionRequest
  **/

  public CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest getCardCaseProcedureExchangeActionRequest() {
    return cardCaseProcedureExchangeActionRequest;
  }

  public void setCardCaseProcedureExchangeActionRequest(CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest cardCaseProcedureExchangeActionRequest) {
    this.cardCaseProcedureExchangeActionRequest = cardCaseProcedureExchangeActionRequest;
  }


}

