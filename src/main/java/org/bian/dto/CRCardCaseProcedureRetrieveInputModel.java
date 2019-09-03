package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceAnalysis;
import org.bian.dto.CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRetrieveInputModel
 */
public class CRCardCaseProcedureRetrieveInputModel   {
  private Object cardCaseProcedureRetrieveActionTaskRecord = null;

  private String cardCaseProcedureRetrieveActionRequest = null;

  private CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceReportRecord cardCaseProcedureInstanceReportRecord = null;

  private CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceAnalysis cardCaseProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardCaseProcedureRetrieveActionRequest
  **/

  public String getCardCaseProcedureRetrieveActionRequest() {
    return cardCaseProcedureRetrieveActionRequest;
  }

  public void setCardCaseProcedureRetrieveActionRequest(String cardCaseProcedureRetrieveActionRequest) {
    this.cardCaseProcedureRetrieveActionRequest = cardCaseProcedureRetrieveActionRequest;
  }


  /**
   * Get cardCaseProcedureInstanceReportRecord
   * @return cardCaseProcedureInstanceReportRecord
  **/

  public CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceReportRecord getCardCaseProcedureInstanceReportRecord() {
    return cardCaseProcedureInstanceReportRecord;
  }

  public void setCardCaseProcedureInstanceReportRecord(CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceReportRecord cardCaseProcedureInstanceReportRecord) {
    this.cardCaseProcedureInstanceReportRecord = cardCaseProcedureInstanceReportRecord;
  }


  /**
   * Get cardCaseProcedureInstanceAnalysis
   * @return cardCaseProcedureInstanceAnalysis
  **/

  public CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceAnalysis getCardCaseProcedureInstanceAnalysis() {
    return cardCaseProcedureInstanceAnalysis;
  }

  public void setCardCaseProcedureInstanceAnalysis(CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceAnalysis cardCaseProcedureInstanceAnalysis) {
    this.cardCaseProcedureInstanceAnalysis = cardCaseProcedureInstanceAnalysis;
  }


}

