package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRequestInputModel
 */
public class CRCardCaseProcedureRequestInputModel   {
  private String cardCaseServicingSessionReference = null;

  private String cardCaseProcedureInstanceReference = null;

  private Object cardCaseProcedureRequestActionTaskRecord = null;

  private CRCardCaseProcedureRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCardCaseProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCardCaseProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

