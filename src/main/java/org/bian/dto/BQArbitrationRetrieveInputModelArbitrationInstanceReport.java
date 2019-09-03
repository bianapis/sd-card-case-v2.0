package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArbitrationRetrieveInputModelArbitrationInstanceReport
 */
public class BQArbitrationRetrieveInputModelArbitrationInstanceReport   {
  private String arbitrationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return arbitrationInstanceReportReference
  **/

  public String getArbitrationInstanceReportReference() {
    return arbitrationInstanceReportReference;
  }

  public void setArbitrationInstanceReportReference(String arbitrationInstanceReportReference) {
    this.arbitrationInstanceReportReference = arbitrationInstanceReportReference;
  }


}

