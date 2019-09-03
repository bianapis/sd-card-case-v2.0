package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationRetrieveOutputModelCardCaseProcedureInstanceRecord;
import org.bian.dto.BQConsolidationRetrieveOutputModelConsolidationInstanceAnalysis;
import org.bian.dto.BQConsolidationRetrieveOutputModelConsolidationInstanceRecord;
import org.bian.dto.BQConsolidationRetrieveOutputModelConsolidationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQConsolidationRetrieveOutputModel
 */
public class BQConsolidationRetrieveOutputModel   {
  private BQConsolidationRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord = null;

  private String cardCaseResolutionSchedule = null;

  private BQConsolidationRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private String consolidationRetrieveActionTaskReference = null;

  private Object consolidationRetrieveActionTaskRecord = null;

  private String consolidationRetrieveActionResponse = null;

  private BQConsolidationRetrieveOutputModelConsolidationInstanceReport consolidationInstanceReport = null;

  private BQConsolidationRetrieveOutputModelConsolidationInstanceAnalysis consolidationInstanceAnalysis = null;


  /**
   * Get cardCaseProcedureInstanceRecord
   * @return cardCaseProcedureInstanceRecord
  **/

  public BQConsolidationRetrieveOutputModelCardCaseProcedureInstanceRecord getCardCaseProcedureInstanceRecord() {
    return cardCaseProcedureInstanceRecord;
  }

  public void setCardCaseProcedureInstanceRecord(BQConsolidationRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord) {
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
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public BQConsolidationRetrieveOutputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(BQConsolidationRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord) {
    this.consolidationInstanceRecord = consolidationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Consolidation instance retrieve service call 
   * @return consolidationRetrieveActionTaskReference
  **/

  public String getConsolidationRetrieveActionTaskReference() {
    return consolidationRetrieveActionTaskReference;
  }

  public void setConsolidationRetrieveActionTaskReference(String consolidationRetrieveActionTaskReference) {
    this.consolidationRetrieveActionTaskReference = consolidationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return consolidationRetrieveActionTaskRecord
  **/

  public Object getConsolidationRetrieveActionTaskRecord() {
    return consolidationRetrieveActionTaskRecord;
  }

  public void setConsolidationRetrieveActionTaskRecord(Object consolidationRetrieveActionTaskRecord) {
    this.consolidationRetrieveActionTaskRecord = consolidationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return consolidationRetrieveActionResponse
  **/

  public String getConsolidationRetrieveActionResponse() {
    return consolidationRetrieveActionResponse;
  }

  public void setConsolidationRetrieveActionResponse(String consolidationRetrieveActionResponse) {
    this.consolidationRetrieveActionResponse = consolidationRetrieveActionResponse;
  }


  /**
   * Get consolidationInstanceReport
   * @return consolidationInstanceReport
  **/

  public BQConsolidationRetrieveOutputModelConsolidationInstanceReport getConsolidationInstanceReport() {
    return consolidationInstanceReport;
  }

  public void setConsolidationInstanceReport(BQConsolidationRetrieveOutputModelConsolidationInstanceReport consolidationInstanceReport) {
    this.consolidationInstanceReport = consolidationInstanceReport;
  }


  /**
   * Get consolidationInstanceAnalysis
   * @return consolidationInstanceAnalysis
  **/

  public BQConsolidationRetrieveOutputModelConsolidationInstanceAnalysis getConsolidationInstanceAnalysis() {
    return consolidationInstanceAnalysis;
  }

  public void setConsolidationInstanceAnalysis(BQConsolidationRetrieveOutputModelConsolidationInstanceAnalysis consolidationInstanceAnalysis) {
    this.consolidationInstanceAnalysis = consolidationInstanceAnalysis;
  }


}

