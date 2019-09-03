package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceReportRecord
 */
public class CRCardCaseProcedureRetrieveInputModelCardCaseProcedureInstanceReportRecord   {
  private String cardCaseProcedureInstanceReportReference = null;

  private String cardCaseProcedureInstanceReportType = null;

  private String cardCaseProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardCaseProcedureInstanceReportReference
  **/

  public String getCardCaseProcedureInstanceReportReference() {
    return cardCaseProcedureInstanceReportReference;
  }

  public void setCardCaseProcedureInstanceReportReference(String cardCaseProcedureInstanceReportReference) {
    this.cardCaseProcedureInstanceReportReference = cardCaseProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardCaseProcedureInstanceReportParameters
  **/

  public String getCardCaseProcedureInstanceReportParameters() {
    return cardCaseProcedureInstanceReportParameters;
  }

  public void setCardCaseProcedureInstanceReportParameters(String cardCaseProcedureInstanceReportParameters) {
    this.cardCaseProcedureInstanceReportParameters = cardCaseProcedureInstanceReportParameters;
  }


}

