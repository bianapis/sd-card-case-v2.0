package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureExecuteOutputModel
 */
public class CRCardCaseProcedureExecuteOutputModel   {
  private String cardCaseProcedureExecuteActionTaskReference = null;

  private Object cardCaseProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Case Procedure instance execute service call 
   * @return cardCaseProcedureExecuteActionTaskReference
  **/

  public String getCardCaseProcedureExecuteActionTaskReference() {
    return cardCaseProcedureExecuteActionTaskReference;
  }

  public void setCardCaseProcedureExecuteActionTaskReference(String cardCaseProcedureExecuteActionTaskReference) {
    this.cardCaseProcedureExecuteActionTaskReference = cardCaseProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return cardCaseProcedureExecuteActionTaskRecord
  **/

  public Object getCardCaseProcedureExecuteActionTaskRecord() {
    return cardCaseProcedureExecuteActionTaskRecord;
  }

  public void setCardCaseProcedureExecuteActionTaskRecord(Object cardCaseProcedureExecuteActionTaskRecord) {
    this.cardCaseProcedureExecuteActionTaskRecord = cardCaseProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

