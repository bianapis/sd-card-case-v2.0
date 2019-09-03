package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceAnalysis
 */
public class CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceAnalysis   {
  private String cardCaseProcedureInstanceAnalysisReference = null;

  private String cardCaseProcedureInstanceAnalysisReportType = null;

  private String cardCaseProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardCaseProcedureInstanceAnalysisReference
  **/

  public String getCardCaseProcedureInstanceAnalysisReference() {
    return cardCaseProcedureInstanceAnalysisReference;
  }

  public void setCardCaseProcedureInstanceAnalysisReference(String cardCaseProcedureInstanceAnalysisReference) {
    this.cardCaseProcedureInstanceAnalysisReference = cardCaseProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardCaseProcedureInstanceAnalysisParameters
  **/

  public String getCardCaseProcedureInstanceAnalysisParameters() {
    return cardCaseProcedureInstanceAnalysisParameters;
  }

  public void setCardCaseProcedureInstanceAnalysisParameters(String cardCaseProcedureInstanceAnalysisParameters) {
    this.cardCaseProcedureInstanceAnalysisParameters = cardCaseProcedureInstanceAnalysisParameters;
  }


}

