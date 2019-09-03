package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveInputModelResolutionInstanceReport
 */
public class BQResolutionRetrieveInputModelResolutionInstanceReport   {
  private String resolutionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return resolutionInstanceReportReference
  **/

  public String getResolutionInstanceReportReference() {
    return resolutionInstanceReportReference;
  }

  public void setResolutionInstanceReportReference(String resolutionInstanceReportReference) {
    this.resolutionInstanceReportReference = resolutionInstanceReportReference;
  }


}

