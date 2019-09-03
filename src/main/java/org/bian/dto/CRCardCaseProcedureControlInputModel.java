package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureControlInputModelCardCaseProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureControlInputModel
 */
public class CRCardCaseProcedureControlInputModel   {
  private String cardCaseServicingSessionReference = null;

  private String cardCaseProcedureInstanceReference = null;

  private Object cardCaseProcedureControlActionTaskRecord = null;

  private CRCardCaseProcedureControlInputModelCardCaseProcedureControlActionRequest cardCaseProcedureControlActionRequest = null;


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
   * Get cardCaseProcedureControlActionRequest
   * @return cardCaseProcedureControlActionRequest
  **/

  public CRCardCaseProcedureControlInputModelCardCaseProcedureControlActionRequest getCardCaseProcedureControlActionRequest() {
    return cardCaseProcedureControlActionRequest;
  }

  public void setCardCaseProcedureControlActionRequest(CRCardCaseProcedureControlInputModelCardCaseProcedureControlActionRequest cardCaseProcedureControlActionRequest) {
    this.cardCaseProcedureControlActionRequest = cardCaseProcedureControlActionRequest;
  }


}

