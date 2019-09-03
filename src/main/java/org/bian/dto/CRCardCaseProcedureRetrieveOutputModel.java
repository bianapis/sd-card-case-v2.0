package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceAnalysis;
import org.bian.dto.CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceRecord;
import org.bian.dto.CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRetrieveOutputModel
 */
public class CRCardCaseProcedureRetrieveOutputModel   {
  private CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord = null;

  private String cardCaseResolutionSchedule = null;

  private String cardCaseProcedureRetrieveActionTaskReference = null;

  private Object cardCaseProcedureRetrieveActionTaskRecord = null;

  private String cardCaseProcedureRetrieveActionResponse = null;

  private CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceReportRecord cardCaseProcedureInstanceReportRecord = null;

  private CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceAnalysis cardCaseProcedureInstanceAnalysis = null;


  /**
   * Get cardCaseProcedureInstanceRecord
   * @return cardCaseProcedureInstanceRecord
  **/

  public CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceRecord getCardCaseProcedureInstanceRecord() {
    return cardCaseProcedureInstanceRecord;
  }

  public void setCardCaseProcedureInstanceRecord(CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord) {
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Case Procedure instance retrieve service call 
   * @return cardCaseProcedureRetrieveActionTaskReference
  **/

  public String getCardCaseProcedureRetrieveActionTaskReference() {
    return cardCaseProcedureRetrieveActionTaskReference;
  }

  public void setCardCaseProcedureRetrieveActionTaskReference(String cardCaseProcedureRetrieveActionTaskReference) {
    this.cardCaseProcedureRetrieveActionTaskReference = cardCaseProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardCaseProcedureRetrieveActionTaskRecord
  **/

  public Object getCardCaseProcedureRetrieveActionTaskRecord() {
    return cardCaseProcedureRetrieveActionTaskRecord;
  }

  public void setCardCaseProcedureRetrieveActionTaskRecord(Object cardCaseProcedureRetrieveActionTaskRecord) {
    this.cardCaseProcedureRetrieveActionTaskRecord = cardCaseProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardCaseProcedureRetrieveActionResponse
  **/

  public String getCardCaseProcedureRetrieveActionResponse() {
    return cardCaseProcedureRetrieveActionResponse;
  }

  public void setCardCaseProcedureRetrieveActionResponse(String cardCaseProcedureRetrieveActionResponse) {
    this.cardCaseProcedureRetrieveActionResponse = cardCaseProcedureRetrieveActionResponse;
  }


  /**
   * Get cardCaseProcedureInstanceReportRecord
   * @return cardCaseProcedureInstanceReportRecord
  **/

  public CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceReportRecord getCardCaseProcedureInstanceReportRecord() {
    return cardCaseProcedureInstanceReportRecord;
  }

  public void setCardCaseProcedureInstanceReportRecord(CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceReportRecord cardCaseProcedureInstanceReportRecord) {
    this.cardCaseProcedureInstanceReportRecord = cardCaseProcedureInstanceReportRecord;
  }


  /**
   * Get cardCaseProcedureInstanceAnalysis
   * @return cardCaseProcedureInstanceAnalysis
  **/

  public CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceAnalysis getCardCaseProcedureInstanceAnalysis() {
    return cardCaseProcedureInstanceAnalysis;
  }

  public void setCardCaseProcedureInstanceAnalysis(CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceAnalysis cardCaseProcedureInstanceAnalysis) {
    this.cardCaseProcedureInstanceAnalysis = cardCaseProcedureInstanceAnalysis;
  }


}

