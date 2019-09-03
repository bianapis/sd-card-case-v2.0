package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRequestOutputModel
 */
public class CRCardCaseProcedureRequestOutputModel   {
  private String cardCaseProcedureRequestActionTaskReference = null;

  private Object cardCaseProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Case Procedure instance request service call 
   * @return cardCaseProcedureRequestActionTaskReference
  **/

  public String getCardCaseProcedureRequestActionTaskReference() {
    return cardCaseProcedureRequestActionTaskReference;
  }

  public void setCardCaseProcedureRequestActionTaskReference(String cardCaseProcedureRequestActionTaskReference) {
    this.cardCaseProcedureRequestActionTaskReference = cardCaseProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return cardCaseProcedureRequestActionTaskRecord
  **/

  public Object getCardCaseProcedureRequestActionTaskRecord() {
    return cardCaseProcedureRequestActionTaskRecord;
  }

  public void setCardCaseProcedureRequestActionTaskRecord(Object cardCaseProcedureRequestActionTaskRecord) {
    this.cardCaseProcedureRequestActionTaskRecord = cardCaseProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

