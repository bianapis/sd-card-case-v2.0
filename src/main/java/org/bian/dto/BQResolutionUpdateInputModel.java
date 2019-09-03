package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResolutionUpdateInputModelResolutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQResolutionUpdateInputModel
 */
public class BQResolutionUpdateInputModel   {
  private String cardCaseProcedureInstanceReference = null;

  private String resolutionInstanceReference = null;

  private BQResolutionUpdateInputModelResolutionInstanceRecord resolutionInstanceRecord = null;

  private Object resolutionUpdateActionTaskRecord = null;

  private String resolutionUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Case Procedure instance 
   * @return cardCaseProcedureInstanceReference
  **/

  public String getCardCaseProcedureInstanceReference() {
    return cardCaseProcedureInstanceReference;
  }

  public void setCardCaseProcedureInstanceReference(String cardCaseProcedureInstanceReference) {
    this.cardCaseProcedureInstanceReference = cardCaseProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Resolution instance 
   * @return resolutionInstanceReference
  **/

  public String getResolutionInstanceReference() {
    return resolutionInstanceReference;
  }

  public void setResolutionInstanceReference(String resolutionInstanceReference) {
    this.resolutionInstanceReference = resolutionInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return resolutionUpdateActionRequest
  **/

  public String getResolutionUpdateActionRequest() {
    return resolutionUpdateActionRequest;
  }

  public void setResolutionUpdateActionRequest(String resolutionUpdateActionRequest) {
    this.resolutionUpdateActionRequest = resolutionUpdateActionRequest;
  }


}

