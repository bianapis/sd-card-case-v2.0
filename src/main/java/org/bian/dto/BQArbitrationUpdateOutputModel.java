package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQArbitrationUpdateInputModelArbitrationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQArbitrationUpdateOutputModel
 */
public class BQArbitrationUpdateOutputModel   {
  private BQArbitrationUpdateInputModelArbitrationInstanceRecord arbitrationInstanceRecord = null;

  private String arbitrationUpdateActionTaskReference = null;

  private Object arbitrationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get arbitrationInstanceRecord
   * @return arbitrationInstanceRecord
  **/

  public BQArbitrationUpdateInputModelArbitrationInstanceRecord getArbitrationInstanceRecord() {
    return arbitrationInstanceRecord;
  }

  public void setArbitrationInstanceRecord(BQArbitrationUpdateInputModelArbitrationInstanceRecord arbitrationInstanceRecord) {
    this.arbitrationInstanceRecord = arbitrationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return arbitrationUpdateActionTaskReference
  **/

  public String getArbitrationUpdateActionTaskReference() {
    return arbitrationUpdateActionTaskReference;
  }

  public void setArbitrationUpdateActionTaskReference(String arbitrationUpdateActionTaskReference) {
    this.arbitrationUpdateActionTaskReference = arbitrationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return arbitrationUpdateActionTaskRecord
  **/

  public Object getArbitrationUpdateActionTaskRecord() {
    return arbitrationUpdateActionTaskRecord;
  }

  public void setArbitrationUpdateActionTaskRecord(Object arbitrationUpdateActionTaskRecord) {
    this.arbitrationUpdateActionTaskRecord = arbitrationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

