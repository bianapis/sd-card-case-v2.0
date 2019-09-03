package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConsolidationRetrieveInputModelConsolidationInstanceReport
 */
public class BQConsolidationRetrieveInputModelConsolidationInstanceReport   {
  private String consolidationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return consolidationInstanceReportReference
  **/

  public String getConsolidationInstanceReportReference() {
    return consolidationInstanceReportReference;
  }

  public void setConsolidationInstanceReportReference(String consolidationInstanceReportReference) {
    this.consolidationInstanceReportReference = consolidationInstanceReportReference;
  }


}

