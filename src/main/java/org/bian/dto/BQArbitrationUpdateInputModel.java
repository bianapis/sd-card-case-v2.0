package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQArbitrationUpdateInputModelArbitrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQArbitrationUpdateInputModel
 */
public class BQArbitrationUpdateInputModel   {
  private String cardCaseProcedureInstanceReference = null;

  private String arbitrationInstanceReference = null;

  private BQArbitrationUpdateInputModelArbitrationInstanceRecord arbitrationInstanceRecord = null;

  private Object arbitrationUpdateActionTaskRecord = null;

  private String arbitrationUpdateActionRequest = null;


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
   * Get arbitrationInstanceRecord
   * @return arbitrationInstanceRecord
  **/

  public BQArbitrationUpdateInputModelArbitrationInstanceRecord getArbitrationInstanceRecord() {
    return arbitrationInstanceRecord;
  }

  public void setArbitrationInstanceRecord(BQArbitrationUpdateInputModelArbitrationInstanceRecord arbitrationInstanceRecord) {
    this.arbitrationInstanceRecord = arbitrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return arbitrationUpdateActionTaskRecord
  **/

  public Object getArbitrationUpdateActionTaskRecord() {
    return arbitrationUpdateActionTaskRecord;
  }

  public void setArbitrationUpdateActionTaskRecord(Object arbitrationUpdateActionTaskRecord) {
    this.arbitrationUpdateActionTaskRecord = arbitrationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return arbitrationUpdateActionRequest
  **/

  public String getArbitrationUpdateActionRequest() {
    return arbitrationUpdateActionRequest;
  }

  public void setArbitrationUpdateActionRequest(String arbitrationUpdateActionRequest) {
    this.arbitrationUpdateActionRequest = arbitrationUpdateActionRequest;
  }


}

