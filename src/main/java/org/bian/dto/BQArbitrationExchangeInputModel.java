package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQArbitrationExchangeInputModel
 */
public class BQArbitrationExchangeInputModel   {
  private String cardCaseProcedureInstanceReference = null;

  private String arbitrationInstanceReference = null;

  private Object arbitrationExchangeActionTaskRecord = null;

  private CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest arbitrationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Arbitration instance 
   * @return arbitrationInstanceReference
  **/

  public String getArbitrationInstanceReference() {
    return arbitrationInstanceReference;
  }

  public void setArbitrationInstanceReference(String arbitrationInstanceReference) {
    this.arbitrationInstanceReference = arbitrationInstanceReference;
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
   * Get arbitrationExchangeActionRequest
   * @return arbitrationExchangeActionRequest
  **/

  public CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest getArbitrationExchangeActionRequest() {
    return arbitrationExchangeActionRequest;
  }

  public void setArbitrationExchangeActionRequest(CRCardCaseProcedureExchangeInputModelCardCaseProcedureExchangeActionRequest arbitrationExchangeActionRequest) {
    this.arbitrationExchangeActionRequest = arbitrationExchangeActionRequest;
  }


}

