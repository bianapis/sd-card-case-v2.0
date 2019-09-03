package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArbitrationUpdateInputModelArbitrationInstanceRecordNetworkParticipantNetworkServiceRequestRecord
 */
public class BQArbitrationUpdateInputModelArbitrationInstanceRecordNetworkParticipantNetworkServiceRequestRecord   {
  private String networkParticipantServiceType = null;

  private String networkParticipantServiceDateTime = null;

  private String networkParticipantServiceResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested service type (e.g. merchant alert, chargeback arbitration, chargeback reduction, arbitration) 
   * @return networkParticipantServiceType
  **/

  public String getNetworkParticipantServiceType() {
    return networkParticipantServiceType;
  }

  public void setNetworkParticipantServiceType(String networkParticipantServiceType) {
    this.networkParticipantServiceType = networkParticipantServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The time the service was requested 
   * @return networkParticipantServiceDateTime
  **/

  public String getNetworkParticipantServiceDateTime() {
    return networkParticipantServiceDateTime;
  }

  public void setNetworkParticipantServiceDateTime(String networkParticipantServiceDateTime) {
    this.networkParticipantServiceDateTime = networkParticipantServiceDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the arbitration service request 
   * @return networkParticipantServiceResult
  **/

  public String getNetworkParticipantServiceResult() {
    return networkParticipantServiceResult;
  }

  public void setNetworkParticipantServiceResult(String networkParticipantServiceResult) {
    this.networkParticipantServiceResult = networkParticipantServiceResult;
  }


}

