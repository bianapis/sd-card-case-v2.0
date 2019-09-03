package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationUpdateInputModelConsolidationInstanceRecordConsolidationTaskRecord;

import javax.validation.Valid;
  
/**
 * BQConsolidationUpdateInputModelConsolidationInstanceRecord
 */
public class BQConsolidationUpdateInputModelConsolidationInstanceRecord   {
  private String consolidationCardTransactionRecordReference = null;

  private BQConsolidationUpdateInputModelConsolidationInstanceRecordConsolidationTaskRecord consolidationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the card transaction for the consolidation  
   * @return consolidationCardTransactionRecordReference
  **/

  public String getConsolidationCardTransactionRecordReference() {
    return consolidationCardTransactionRecordReference;
  }

  public void setConsolidationCardTransactionRecordReference(String consolidationCardTransactionRecordReference) {
    this.consolidationCardTransactionRecordReference = consolidationCardTransactionRecordReference;
  }


  /**
   * Get consolidationTaskRecord
   * @return consolidationTaskRecord
  **/

  public BQConsolidationUpdateInputModelConsolidationInstanceRecordConsolidationTaskRecord getConsolidationTaskRecord() {
    return consolidationTaskRecord;
  }

  public void setConsolidationTaskRecord(BQConsolidationUpdateInputModelConsolidationInstanceRecordConsolidationTaskRecord consolidationTaskRecord) {
    this.consolidationTaskRecord = consolidationTaskRecord;
  }


}

