package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceAnalysis
 */
public class CRCardCaseProcedureRetrieveOutputModelCardCaseProcedureInstanceAnalysis   {
  private String cardCaseProcedureInstanceAnalysisData = null;

  private String cardCaseProcedureInstanceAnalysisReportType = null;

  private Object cardCaseProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardCaseProcedureInstanceAnalysisData
  **/

  public String getCardCaseProcedureInstanceAnalysisData() {
    return cardCaseProcedureInstanceAnalysisData;
  }

  public void setCardCaseProcedureInstanceAnalysisData(String cardCaseProcedureInstanceAnalysisData) {
    this.cardCaseProcedureInstanceAnalysisData = cardCaseProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardCaseProcedureInstanceAnalysisReportType
  **/

  public String getCardCaseProcedureInstanceAnalysisReportType() {
    return cardCaseProcedureInstanceAnalysisReportType;
  }

  public void setCardCaseProcedureInstanceAnalysisReportType(String cardCaseProcedureInstanceAnalysisReportType) {
    this.cardCaseProcedureInstanceAnalysisReportType = cardCaseProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardCaseProcedureInstanceAnalysisReport
  **/

  public Object getCardCaseProcedureInstanceAnalysisReport() {
    return cardCaseProcedureInstanceAnalysisReport;
  }

  public void setCardCaseProcedureInstanceAnalysisReport(Object cardCaseProcedureInstanceAnalysisReport) {
    this.cardCaseProcedureInstanceAnalysisReport = cardCaseProcedureInstanceAnalysisReport;
  }


}

