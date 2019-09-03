package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceReportRecord
 */
public class CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceReportRecord   {
  private String cardCaseProcedureInstanceReportData = null;

  private String cardCaseProcedureInstanceReportType = null;

  private Object cardCaseProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardCaseProcedureInstanceReportData
  **/

  public String getCardCaseProcedureInstanceReportData() {
    return cardCaseProcedureInstanceReportData;
  }

  public void setCardCaseProcedureInstanceReportData(String cardCaseProcedureInstanceReportData) {
    this.cardCaseProcedureInstanceReportData = cardCaseProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardCaseProcedureInstanceReportType
  **/

  public String getCardCaseProcedureInstanceReportType() {
    return cardCaseProcedureInstanceReportType;
  }

  public void setCardCaseProcedureInstanceReportType(String cardCaseProcedureInstanceReportType) {
    this.cardCaseProcedureInstanceReportType = cardCaseProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardCaseProcedureInstanceReport
  **/

  public Object getCardCaseProcedureInstanceReport() {
    return cardCaseProcedureInstanceReport;
  }

  public void setCardCaseProcedureInstanceReport(Object cardCaseProcedureInstanceReport) {
    this.cardCaseProcedureInstanceReport = cardCaseProcedureInstanceReport;
  }


}

