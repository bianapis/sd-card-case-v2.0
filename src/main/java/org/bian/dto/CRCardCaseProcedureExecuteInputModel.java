package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureExecuteInputModel
 */
public class CRCardCaseProcedureExecuteInputModel   {
  private String cardCaseServicingSessionReference = null;

  private String cardCaseProcedureInstanceReference = null;

  private Object cardCaseProcedureExecuteActionTaskRecord = null;

  private CRCardCaseProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCardCaseProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCardCaseProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

