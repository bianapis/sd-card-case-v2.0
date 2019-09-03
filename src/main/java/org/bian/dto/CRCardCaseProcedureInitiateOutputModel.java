package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureInitiateOutputModelCardCaseProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureInitiateOutputModel
 */
public class CRCardCaseProcedureInitiateOutputModel   {
  private String cardCaseProcedureInstanceReference = null;

  private String cardCaseProcedureInitiateActionReference = null;

  private Object cardCaseProcedureInitiateActionRecord = null;

  private String cardCaseProcedureInstanceStatus = null;

  private CRCardCaseProcedureInitiateOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord = null;

  private String cardCaseResolutionSchedule = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardCaseProcedureInitiateActionReference
  **/

  public String getCardCaseProcedureInitiateActionReference() {
    return cardCaseProcedureInitiateActionReference;
  }

  public void setCardCaseProcedureInitiateActionReference(String cardCaseProcedureInitiateActionReference) {
    this.cardCaseProcedureInitiateActionReference = cardCaseProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardCaseProcedureInitiateActionRecord
  **/

  public Object getCardCaseProcedureInitiateActionRecord() {
    return cardCaseProcedureInitiateActionRecord;
  }

  public void setCardCaseProcedureInitiateActionRecord(Object cardCaseProcedureInitiateActionRecord) {
    this.cardCaseProcedureInitiateActionRecord = cardCaseProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Case Procedure instance (e.g. initialised, pending, active) 
   * @return cardCaseProcedureInstanceStatus
  **/

  public String getCardCaseProcedureInstanceStatus() {
    return cardCaseProcedureInstanceStatus;
  }

  public void setCardCaseProcedureInstanceStatus(String cardCaseProcedureInstanceStatus) {
    this.cardCaseProcedureInstanceStatus = cardCaseProcedureInstanceStatus;
  }


  /**
   * Get cardCaseProcedureInstanceRecord
   * @return cardCaseProcedureInstanceRecord
  **/

  public CRCardCaseProcedureInitiateOutputModelCardCaseProcedureInstanceRecord getCardCaseProcedureInstanceRecord() {
    return cardCaseProcedureInstanceRecord;
  }

  public void setCardCaseProcedureInstanceRecord(CRCardCaseProcedureInitiateOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord) {
    this.cardCaseProcedureInstanceRecord = cardCaseProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The card case processing schedule including key tasks and dates for resolution (target and actual dates/times ) 
   * @return cardCaseResolutionSchedule
  **/

  public String getCardCaseResolutionSchedule() {
    return cardCaseResolutionSchedule;
  }

  public void setCardCaseResolutionSchedule(String cardCaseResolutionSchedule) {
    this.cardCaseResolutionSchedule = cardCaseResolutionSchedule;
  }


}

