package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChargebackRetrieveInputModelChargebackInstanceAnalysis
 */
public class BQChargebackRetrieveInputModelChargebackInstanceAnalysis   {
  private String chargebackInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return chargebackInstanceAnalysisReference
  **/

  public String getChargebackInstanceAnalysisReference() {
    return chargebackInstanceAnalysisReference;
  }

  public void setChargebackInstanceAnalysisReference(String chargebackInstanceAnalysisReference) {
    this.chargebackInstanceAnalysisReference = chargebackInstanceAnalysisReference;
  }


}

