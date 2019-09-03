package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResolutionUpdateInputModelResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQResolutionUpdateOutputModel
 */
public class BQResolutionUpdateOutputModel   {
  private BQResolutionUpdateInputModelResolutionInstanceRecord resolutionInstanceRecord = null;

  private String resolutionUpdateActionTaskReference = null;

  private Object resolutionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get resolutionInstanceRecord
   * @return resolutionInstanceRecord
  **/

  public BQResolutionUpdateInputModelResolutionInstanceRecord getResolutionInstanceRecord() {
    return resolutionInstanceRecord;
  }

  public void setResolutionInstanceRecord(BQResolutionUpdateInputModelResolutionInstanceRecord resolutionInstanceRecord) {
    this.resolutionInstanceRecord = resolutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return resolutionUpdateActionTaskReference
  **/

  public String getResolutionUpdateActionTaskReference() {
    return resolutionUpdateActionTaskReference;
  }

  public void setResolutionUpdateActionTaskReference(String resolutionUpdateActionTaskReference) {
    this.resolutionUpdateActionTaskReference = resolutionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return resolutionUpdateActionTaskRecord
  **/

  public Object getResolutionUpdateActionTaskRecord() {
    return resolutionUpdateActionTaskRecord;
  }

  public void setResolutionUpdateActionTaskRecord(Object resolutionUpdateActionTaskRecord) {
    this.resolutionUpdateActionTaskRecord = resolutionUpdateActionTaskRecord;
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

