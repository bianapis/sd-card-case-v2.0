package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConsolidationUpdateInputModelConsolidationInstanceRecordConsolidationTaskRecord
 */
public class BQConsolidationUpdateInputModelConsolidationInstanceRecordConsolidationTaskRecord   {
  private String consolidationInstruction = null;

  private String correspondenceReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String consolidationTaskWorkProducts = null;

  private String consolidationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The instruction message to the merchant to provide card transaction related paperwork, includes issued device details, transaction identification information and the retrieval reason 
   * @return consolidationInstruction
  **/

  public String getConsolidationInstruction() {
    return consolidationInstruction;
  }

  public void setConsolidationInstruction(String consolidationInstruction) {
    this.consolidationInstruction = consolidationInstruction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the document request messages sent to the merchant 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to documents obtained 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return consolidationTaskWorkProducts
  **/

  public String getConsolidationTaskWorkProducts() {
    return consolidationTaskWorkProducts;
  }

  public void setConsolidationTaskWorkProducts(String consolidationTaskWorkProducts) {
    this.consolidationTaskWorkProducts = consolidationTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the consolidation workstep 
   * @return consolidationTaskResult
  **/

  public String getConsolidationTaskResult() {
    return consolidationTaskResult;
  }

  public void setConsolidationTaskResult(String consolidationTaskResult) {
    this.consolidationTaskResult = consolidationTaskResult;
  }


}

