package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResolutionUpdateInputModelResolutionInstanceRecordResolutionTaskRecord;

import javax.validation.Valid;
  
/**
 * BQResolutionUpdateInputModelResolutionInstanceRecord
 */
public class BQResolutionUpdateInputModelResolutionInstanceRecord   {
  private String resolutionCardTransactionRecordReference = null;

  private BQResolutionUpdateInputModelResolutionInstanceRecordResolutionTaskRecord resolutionTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the card transaction for the resolution  
   * @return resolutionCardTransactionRecordReference
  **/

  public String getResolutionCardTransactionRecordReference() {
    return resolutionCardTransactionRecordReference;
  }

  public void setResolutionCardTransactionRecordReference(String resolutionCardTransactionRecordReference) {
    this.resolutionCardTransactionRecordReference = resolutionCardTransactionRecordReference;
  }


  /**
   * Get resolutionTaskRecord
   * @return resolutionTaskRecord
  **/

  public BQResolutionUpdateInputModelResolutionInstanceRecordResolutionTaskRecord getResolutionTaskRecord() {
    return resolutionTaskRecord;
  }

  public void setResolutionTaskRecord(BQResolutionUpdateInputModelResolutionInstanceRecordResolutionTaskRecord resolutionTaskRecord) {
    this.resolutionTaskRecord = resolutionTaskRecord;
  }


}

