package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChargebackRetrieveOutputModelCardCaseProcedureInstanceRecord;
import org.bian.dto.BQChargebackRetrieveOutputModelChargebackInstanceAnalysis;
import org.bian.dto.BQChargebackRetrieveOutputModelChargebackInstanceRecord;
import org.bian.dto.BQChargebackRetrieveOutputModelChargebackInstanceReport;

import javax.validation.Valid;
  
/**
 * BQChargebackRetrieveOutputModel
 */
public class BQChargebackRetrieveOutputModel   {
  private BQChargebackRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord = null;

  private String cardCaseResolutionSchedule = null;

  private BQChargebackRetrieveOutputModelChargebackInstanceRecord chargebackInstanceRecord = null;

  private String chargebackRetrieveActionTaskReference = null;

  private Object chargebackRetrieveActionTaskRecord = null;

  private String chargebackRetrieveActionResponse = null;

  private BQChargebackRetrieveOutputModelChargebackInstanceReport chargebackInstanceReport = null;

  private BQChargebackRetrieveOutputModelChargebackInstanceAnalysis chargebackInstanceAnalysis = null;


  /**
   * Get cardCaseProcedureInstanceRecord
   * @return cardCaseProcedureInstanceRecord
  **/

  public BQChargebackRetrieveOutputModelCardCaseProcedureInstanceRecord getCardCaseProcedureInstanceRecord() {
    return cardCaseProcedureInstanceRecord;
  }

  public void setCardCaseProcedureInstanceRecord(BQChargebackRetrieveOutputModelCardCaseProcedureInstanceRecord cardCaseProcedureInstanceRecord) {
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
   * Get chargebackInstanceRecord
   * @return chargebackInstanceRecord
  **/

  public BQChargebackRetrieveOutputModelChargebackInstanceRecord getChargebackInstanceRecord() {
    return chargebackInstanceRecord;
  }

  public void setChargebackInstanceRecord(BQChargebackRetrieveOutputModelChargebackInstanceRecord chargebackInstanceRecord) {
    this.chargebackInstanceRecord = chargebackInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Chargeback instance retrieve service call 
   * @return chargebackRetrieveActionTaskReference
  **/

  public String getChargebackRetrieveActionTaskReference() {
    return chargebackRetrieveActionTaskReference;
  }

  public void setChargebackRetrieveActionTaskReference(String chargebackRetrieveActionTaskReference) {
    this.chargebackRetrieveActionTaskReference = chargebackRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return chargebackRetrieveActionTaskRecord
  **/

  public Object getChargebackRetrieveActionTaskRecord() {
    return chargebackRetrieveActionTaskRecord;
  }

  public void setChargebackRetrieveActionTaskRecord(Object chargebackRetrieveActionTaskRecord) {
    this.chargebackRetrieveActionTaskRecord = chargebackRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return chargebackRetrieveActionResponse
  **/

  public String getChargebackRetrieveActionResponse() {
    return chargebackRetrieveActionResponse;
  }

  public void setChargebackRetrieveActionResponse(String chargebackRetrieveActionResponse) {
    this.chargebackRetrieveActionResponse = chargebackRetrieveActionResponse;
  }


  /**
   * Get chargebackInstanceReport
   * @return chargebackInstanceReport
  **/

  public BQChargebackRetrieveOutputModelChargebackInstanceReport getChargebackInstanceReport() {
    return chargebackInstanceReport;
  }

  public void setChargebackInstanceReport(BQChargebackRetrieveOutputModelChargebackInstanceReport chargebackInstanceReport) {
    this.chargebackInstanceReport = chargebackInstanceReport;
  }


  /**
   * Get chargebackInstanceAnalysis
   * @return chargebackInstanceAnalysis
  **/

  public BQChargebackRetrieveOutputModelChargebackInstanceAnalysis getChargebackInstanceAnalysis() {
    return chargebackInstanceAnalysis;
  }

  public void setChargebackInstanceAnalysis(BQChargebackRetrieveOutputModelChargebackInstanceAnalysis chargebackInstanceAnalysis) {
    this.chargebackInstanceAnalysis = chargebackInstanceAnalysis;
  }


}

