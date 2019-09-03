package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureUpdateOutputModel
 */
public class CRCardCaseProcedureUpdateOutputModel   {
  private String cardCaseProcedureUpdateActionTaskReference = null;

  private Object cardCaseProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardCaseProcedureUpdateActionTaskReference
  **/

  public String getCardCaseProcedureUpdateActionTaskReference() {
    return cardCaseProcedureUpdateActionTaskReference;
  }

  public void setCardCaseProcedureUpdateActionTaskReference(String cardCaseProcedureUpdateActionTaskReference) {
    this.cardCaseProcedureUpdateActionTaskReference = cardCaseProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardCaseProcedureUpdateActionTaskRecord
  **/

  public Object getCardCaseProcedureUpdateActionTaskRecord() {
    return cardCaseProcedureUpdateActionTaskRecord;
  }

  public void setCardCaseProcedureUpdateActionTaskRecord(Object cardCaseProcedureUpdateActionTaskRecord) {
    this.cardCaseProcedureUpdateActionTaskRecord = cardCaseProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

