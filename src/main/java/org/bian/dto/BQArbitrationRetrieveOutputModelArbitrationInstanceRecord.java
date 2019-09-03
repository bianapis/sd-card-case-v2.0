package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQArbitrationUpdateInputModelArbitrationInstanceRecordNetworkParticipantNetworkServiceRequestRecord;

import javax.validation.Valid;
  
/**
 * BQArbitrationRetrieveOutputModelArbitrationInstanceRecord
 */
public class BQArbitrationRetrieveOutputModelArbitrationInstanceRecord   {
  private String arbitrationCardTransactionRecordReference = null;

  private String networkParticipantNetworkServiceRequestReference = null;

  private BQArbitrationUpdateInputModelArbitrationInstanceRecordNetworkParticipantNetworkServiceRequestRecord networkParticipantNetworkServiceRequestRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the card transaction for the arbitration  
   * @return arbitrationCardTransactionRecordReference
  **/

  public String getArbitrationCardTransactionRecordReference() {
    return arbitrationCardTransactionRecordReference;
  }

  public void setArbitrationCardTransactionRecordReference(String arbitrationCardTransactionRecordReference) {
    this.arbitrationCardTransactionRecordReference = arbitrationCardTransactionRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to participant's use of a Network service 
   * @return networkParticipantNetworkServiceRequestReference
  **/

  public String getNetworkParticipantNetworkServiceRequestReference() {
    return networkParticipantNetworkServiceRequestReference;
  }

  public void setNetworkParticipantNetworkServiceRequestReference(String networkParticipantNetworkServiceRequestReference) {
    this.networkParticipantNetworkServiceRequestReference = networkParticipantNetworkServiceRequestReference;
  }


  /**
   * Get networkParticipantNetworkServiceRequestRecord
   * @return networkParticipantNetworkServiceRequestRecord
  **/

  public BQArbitrationUpdateInputModelArbitrationInstanceRecordNetworkParticipantNetworkServiceRequestRecord getNetworkParticipantNetworkServiceRequestRecord() {
    return networkParticipantNetworkServiceRequestRecord;
  }

  public void setNetworkParticipantNetworkServiceRequestRecord(BQArbitrationUpdateInputModelArbitrationInstanceRecordNetworkParticipantNetworkServiceRequestRecord networkParticipantNetworkServiceRequestRecord) {
    this.networkParticipantNetworkServiceRequestRecord = networkParticipantNetworkServiceRequestRecord;
  }


}

