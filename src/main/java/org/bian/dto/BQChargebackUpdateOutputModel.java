package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChargebackUpdateInputModelChargebackInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQChargebackUpdateOutputModel
 */
public class BQChargebackUpdateOutputModel   {
  private BQChargebackUpdateInputModelChargebackInstanceRecord chargebackInstanceRecord = null;

  private String chargebackUpdateActionTaskReference = null;

  private Object chargebackUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get chargebackInstanceRecord
   * @return chargebackInstanceRecord
  **/

  public BQChargebackUpdateInputModelChargebackInstanceRecord getChargebackInstanceRecord() {
    return chargebackInstanceRecord;
  }

  public void setChargebackInstanceRecord(BQChargebackUpdateInputModelChargebackInstanceRecord chargebackInstanceRecord) {
    this.chargebackInstanceRecord = chargebackInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return chargebackUpdateActionTaskReference
  **/

  public String getChargebackUpdateActionTaskReference() {
    return chargebackUpdateActionTaskReference;
  }

  public void setChargebackUpdateActionTaskReference(String chargebackUpdateActionTaskReference) {
    this.chargebackUpdateActionTaskReference = chargebackUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return chargebackUpdateActionTaskRecord
  **/

  public Object getChargebackUpdateActionTaskRecord() {
    return chargebackUpdateActionTaskRecord;
  }

  public void setChargebackUpdateActionTaskRecord(Object chargebackUpdateActionTaskRecord) {
    this.chargebackUpdateActionTaskRecord = chargebackUpdateActionTaskRecord;
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

