package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQArbitrationRetrieveOutputModelArbitrationInstanceAnalysis;
import org.bian.dto.BQArbitrationRetrieveOutputModelArbitrationInstanceRecord;
import org.bian.dto.BQArbitrationRetrieveOutputModelArbitrationInstanceReport;
import org.bian.dto.BQArbitrationRetrieveOutputModelCardCaseProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQArbitrationRetrieveOutputModel
 */
public class BQArbitrationRetrieveOutputModel   {
  private BQArbitrationRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord = null;

  private String cardCaseResolutionSchedule = null;

  private BQArbitrationRetrieveOutputModelArbitrationInstanceRecord arbitrationInstanceRecord = null;

  private String arbitrationRetrieveActionTaskReference = null;

  private Object arbitrationRetrieveActionTaskRecord = null;

  private String arbitrationRetrieveActionResponse = null;

  private BQArbitrationRetrieveOutputModelArbitrationInstanceReport arbitrationInstanceReport = null;

  private BQArbitrationRetrieveOutputModelArbitrationInstanceAnalysis arbitrationInstanceAnalysis = null;


  /**
   * Get cardCaseProcedureInstanceRecord
   * @return cardCaseProcedureInstanceRecord
  **/

  public BQArbitrationRetrieveOutputModelCardCaseProcedureInstanceRecord getCardCaseProcedureInstanceRecord() {
    return cardCaseProcedureInstanceRecord;
  }

  public void setCardCaseProcedureInstanceRecord(BQArbitrationRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord) {
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
   * Get arbitrationInstanceRecord
   * @return arbitrationInstanceRecord
  **/

  public BQArbitrationRetrieveOutputModelArbitrationInstanceRecord getArbitrationInstanceRecord() {
    return arbitrationInstanceRecord;
  }

  public void setArbitrationInstanceRecord(BQArbitrationRetrieveOutputModelArbitrationInstanceRecord arbitrationInstanceRecord) {
    this.arbitrationInstanceRecord = arbitrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Arbitration instance retrieve service call 
   * @return arbitrationRetrieveActionTaskReference
  **/

  public String getArbitrationRetrieveActionTaskReference() {
    return arbitrationRetrieveActionTaskReference;
  }

  public void setArbitrationRetrieveActionTaskReference(String arbitrationRetrieveActionTaskReference) {
    this.arbitrationRetrieveActionTaskReference = arbitrationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return arbitrationRetrieveActionTaskRecord
  **/

  public Object getArbitrationRetrieveActionTaskRecord() {
    return arbitrationRetrieveActionTaskRecord;
  }

  public void setArbitrationRetrieveActionTaskRecord(Object arbitrationRetrieveActionTaskRecord) {
    this.arbitrationRetrieveActionTaskRecord = arbitrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return arbitrationRetrieveActionResponse
  **/

  public String getArbitrationRetrieveActionResponse() {
    return arbitrationRetrieveActionResponse;
  }

  public void setArbitrationRetrieveActionResponse(String arbitrationRetrieveActionResponse) {
    this.arbitrationRetrieveActionResponse = arbitrationRetrieveActionResponse;
  }


  /**
   * Get arbitrationInstanceReport
   * @return arbitrationInstanceReport
  **/

  public BQArbitrationRetrieveOutputModelArbitrationInstanceReport getArbitrationInstanceReport() {
    return arbitrationInstanceReport;
  }

  public void setArbitrationInstanceReport(BQArbitrationRetrieveOutputModelArbitrationInstanceReport arbitrationInstanceReport) {
    this.arbitrationInstanceReport = arbitrationInstanceReport;
  }


  /**
   * Get arbitrationInstanceAnalysis
   * @return arbitrationInstanceAnalysis
  **/

  public BQArbitrationRetrieveOutputModelArbitrationInstanceAnalysis getArbitrationInstanceAnalysis() {
    return arbitrationInstanceAnalysis;
  }

  public void setArbitrationInstanceAnalysis(BQArbitrationRetrieveOutputModelArbitrationInstanceAnalysis arbitrationInstanceAnalysis) {
    this.arbitrationInstanceAnalysis = arbitrationInstanceAnalysis;
  }


}

