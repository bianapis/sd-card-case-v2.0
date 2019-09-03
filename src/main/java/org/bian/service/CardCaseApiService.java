/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardCaseApiService {

	SDCardCaseActivateOutputModel activate(SDCardCaseActivateInputModel request);
	
	SDCardCaseConfigureOutputModel configure(String sdReferenceId, SDCardCaseConfigureInputModel request);
	
	CRCardCaseProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardCaseProcedureControlInputModel request);
	
	BQArbitrationExchangeOutputModel exchangeArbitration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQArbitrationExchangeInputModel request);
	
	BQResolutionExchangeOutputModel exchangeResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionExchangeInputModel request);
	
	CRCardCaseProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCardCaseProcedureExchangeInputModel request);
	
	CRCardCaseProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCardCaseProcedureExecuteInputModel request);
	
	SDCardCaseFeedbackOutputModel feedback(String sdReferenceId, SDCardCaseFeedbackInputModel request);
	
	CRCardCaseProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardCaseProcedureInitiateInputModel request);
	
	CRCardCaseProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCardCaseProcedureRequestInputModel request);
	
	CRCardCaseProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQArbitrationRetrieveOutputModel retrieveArbitration(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQChargebackRetrieveOutputModel retrieveChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardCaseRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardCaseProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardCaseProcedureUpdateInputModel request);
	
	BQArbitrationUpdateOutputModel updateArbitration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQArbitrationUpdateInputModel request);
	
	BQChargebackUpdateOutputModel updateChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChargebackUpdateInputModel request);
	
	BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request);
	
	BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request);
	
}
