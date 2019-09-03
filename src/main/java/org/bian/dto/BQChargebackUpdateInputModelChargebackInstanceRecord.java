package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChargebackUpdateInputModelChargebackInstanceRecord
 */
public class BQChargebackUpdateInputModelChargebackInstanceRecord   {
  private String chargebackCardTransactionRecordReference = null;

  private String chargebackInstruction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the card transaction for the consolidation  
   * @return chargebackCardTransactionRecordReference
  **/

  public String getChargebackCardTransactionRecordReference() {
    return chargebackCardTransactionRecordReference;
  }

  public void setChargebackCardTransactionRecordReference(String chargebackCardTransactionRecordReference) {
    this.chargebackCardTransactionRecordReference = chargebackCardTransactionRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The instruction to book chargeback for the transaction - could be partial chargeback 
   * @return chargebackInstruction
  **/

  public String getChargebackInstruction() {
    return chargebackInstruction;
  }

  public void setChargebackInstruction(String chargebackInstruction) {
    this.chargebackInstruction = chargebackInstruction;
  }


}

