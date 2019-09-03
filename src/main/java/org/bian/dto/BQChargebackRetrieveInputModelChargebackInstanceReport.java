package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChargebackRetrieveInputModelChargebackInstanceReport
 */
public class BQChargebackRetrieveInputModelChargebackInstanceReport   {
  private String chargebackInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return chargebackInstanceReportReference
  **/

  public String getChargebackInstanceReportReference() {
    return chargebackInstanceReportReference;
  }

  public void setChargebackInstanceReportReference(String chargebackInstanceReportReference) {
    this.chargebackInstanceReportReference = chargebackInstanceReportReference;
  }


}

