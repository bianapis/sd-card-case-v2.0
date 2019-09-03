package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureControlOutputModel
 */
public class CRCardCaseProcedureControlOutputModel   {
  private String cardCaseProcedureControlActionTaskReference = null;

  private Object cardCaseProcedureControlActionTaskRecord = null;

  private String cardCaseProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Case Procedure instance control processing service call 
   * @return cardCaseProcedureControlActionTaskReference
  **/

  public String getCardCaseProcedureControlActionTaskReference() {
    return cardCaseProcedureControlActionTaskReference;
  }

  public void setCardCaseProcedureControlActionTaskReference(String cardCaseProcedureControlActionTaskReference) {
    this.cardCaseProcedureControlActionTaskReference = cardCaseProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return cardCaseProcedureControlActionTaskRecord
  **/

  public Object getCardCaseProcedureControlActionTaskRecord() {
    return cardCaseProcedureControlActionTaskRecord;
  }

  public void setCardCaseProcedureControlActionTaskRecord(Object cardCaseProcedureControlActionTaskRecord) {
    this.cardCaseProcedureControlActionTaskRecord = cardCaseProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return cardCaseProcedureControlActionResponse
  **/

  public String getCardCaseProcedureControlActionResponse() {
    return cardCaseProcedureControlActionResponse;
  }

  public void setCardCaseProcedureControlActionResponse(String cardCaseProcedureControlActionResponse) {
    this.cardCaseProcedureControlActionResponse = cardCaseProcedureControlActionResponse;
  }


}

