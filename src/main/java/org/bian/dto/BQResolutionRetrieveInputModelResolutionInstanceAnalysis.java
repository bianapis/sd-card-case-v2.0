package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveInputModelResolutionInstanceAnalysis
 */
public class BQResolutionRetrieveInputModelResolutionInstanceAnalysis   {
  private String resolutionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return resolutionInstanceAnalysisReference
  **/

  public String getResolutionInstanceAnalysisReference() {
    return resolutionInstanceAnalysisReference;
  }

  public void setResolutionInstanceAnalysisReference(String resolutionInstanceAnalysisReference) {
    this.resolutionInstanceAnalysisReference = resolutionInstanceAnalysisReference;
  }


}

