package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResolutionRetrieveOutputModelCardCaseProcedureInstanceRecord;
import org.bian.dto.BQResolutionRetrieveOutputModelResolutionInstanceAnalysis;
import org.bian.dto.BQResolutionRetrieveOutputModelResolutionInstanceRecord;
import org.bian.dto.BQResolutionRetrieveOutputModelResolutionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveOutputModel
 */
public class BQResolutionRetrieveOutputModel   {
  private BQResolutionRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord = null;

  private String cardCaseResolutionSchedule = null;

  private BQResolutionRetrieveOutputModelResolutionInstanceRecord resolutionInstanceRecord = null;

  private String resolutionRetrieveActionTaskReference = null;

  private Object resolutionRetrieveActionTaskRecord = null;

  private String resolutionRetrieveActionResponse = null;

  private BQResolutionRetrieveOutputModelResolutionInstanceReport resolutionInstanceReport = null;

  private BQResolutionRetrieveOutputModelResolutionInstanceAnalysis resolutionInstanceAnalysis = null;


  /**
   * Get cardCaseProcedureInstanceRecord
   * @return cardCaseProcedureInstanceRecord
  **/

  public BQResolutionRetrieveOutputModelCardCaseProcedureInstanceRecord getCardCaseProcedureInstanceRecord() {
    return cardCaseProcedureInstanceRecord;
  }

  public void setCardCaseProcedureInstanceRecord(BQResolutionRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord) {
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
   * Get resolutionInstanceRecord
   * @return resolutionInstanceRecord
  **/

  public BQResolutionRetrieveOutputModelResolutionInstanceRecord getResolutionInstanceRecord() {
    return resolutionInstanceRecord;
  }

  public void setResolutionInstanceRecord(BQResolutionRetrieveOutputModelResolutionInstanceRecord resolutionInstanceRecord) {
    this.resolutionInstanceRecord = resolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Resolution instance retrieve service call 
   * @return resolutionRetrieveActionTaskReference
  **/

  public String getResolutionRetrieveActionTaskReference() {
    return resolutionRetrieveActionTaskReference;
  }

  public void setResolutionRetrieveActionTaskReference(String resolutionRetrieveActionTaskReference) {
    this.resolutionRetrieveActionTaskReference = resolutionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return resolutionRetrieveActionTaskRecord
  **/

  public Object getResolutionRetrieveActionTaskRecord() {
    return resolutionRetrieveActionTaskRecord;
  }

  public void setResolutionRetrieveActionTaskRecord(Object resolutionRetrieveActionTaskRecord) {
    this.resolutionRetrieveActionTaskRecord = resolutionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return resolutionRetrieveActionResponse
  **/

  public String getResolutionRetrieveActionResponse() {
    return resolutionRetrieveActionResponse;
  }

  public void setResolutionRetrieveActionResponse(String resolutionRetrieveActionResponse) {
    this.resolutionRetrieveActionResponse = resolutionRetrieveActionResponse;
  }


  /**
   * Get resolutionInstanceReport
   * @return resolutionInstanceReport
  **/

  public BQResolutionRetrieveOutputModelResolutionInstanceReport getResolutionInstanceReport() {
    return resolutionInstanceReport;
  }

  public void setResolutionInstanceReport(BQResolutionRetrieveOutputModelResolutionInstanceReport resolutionInstanceReport) {
    this.resolutionInstanceReport = resolutionInstanceReport;
  }


  /**
   * Get resolutionInstanceAnalysis
   * @return resolutionInstanceAnalysis
  **/

  public BQResolutionRetrieveOutputModelResolutionInstanceAnalysis getResolutionInstanceAnalysis() {
    return resolutionInstanceAnalysis;
  }

  public void setResolutionInstanceAnalysis(BQResolutionRetrieveOutputModelResolutionInstanceAnalysis resolutionInstanceAnalysis) {
    this.resolutionInstanceAnalysis = resolutionInstanceAnalysis;
  }


}

