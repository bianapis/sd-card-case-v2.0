package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArbitrationRetrieveInputModelArbitrationInstanceAnalysis
 */
public class BQArbitrationRetrieveInputModelArbitrationInstanceAnalysis   {
  private String arbitrationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return arbitrationInstanceAnalysisReference
  **/

  public String getArbitrationInstanceAnalysisReference() {
    return arbitrationInstanceAnalysisReference;
  }

  public void setArbitrationInstanceAnalysisReference(String arbitrationInstanceAnalysisReference) {
    this.arbitrationInstanceAnalysisReference = arbitrationInstanceAnalysisReference;
  }


}

