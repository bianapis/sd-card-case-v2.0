/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardCaseApiServiceImpl implements CardCaseApiService {

	public SDCardCaseActivateOutputModel activate(SDCardCaseActivateInputModel request){
		return JsonReader.read("activate-SDCardCaseActivateOutputModel.json",new TypeReference<SDCardCaseActivateOutputModel>(){});
	}
	
	public SDCardCaseConfigureOutputModel configure(String sdReferenceId, SDCardCaseConfigureInputModel request){
		return JsonReader.read("configure-SDCardCaseConfigureOutputModel.json",new TypeReference<SDCardCaseConfigureOutputModel>(){});
	}
	
	public CRCardCaseProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardCaseProcedureControlInputModel request){
		return JsonReader.read("control-CRCardCaseProcedureControlOutputModel.json",new TypeReference<CRCardCaseProcedureControlOutputModel>(){});
	}
	
	public BQArbitrationExchangeOutputModel exchangeArbitration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQArbitrationExchangeInputModel request){
		return JsonReader.read("exchange-BQArbitrationExchangeOutputModel.json",new TypeReference<BQArbitrationExchangeOutputModel>(){});
	}
	
	public BQResolutionExchangeOutputModel exchangeResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionExchangeInputModel request){
		return JsonReader.read("exchange-BQResolutionExchangeOutputModel.json",new TypeReference<BQResolutionExchangeOutputModel>(){});
	}
	
	public CRCardCaseProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCardCaseProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRCardCaseProcedureExchangeOutputModel.json",new TypeReference<CRCardCaseProcedureExchangeOutputModel>(){});
	}
	
	public CRCardCaseProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCardCaseProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCardCaseProcedureExecuteOutputModel.json",new TypeReference<CRCardCaseProcedureExecuteOutputModel>(){});
	}
	
	public SDCardCaseFeedbackOutputModel feedback(String sdReferenceId, SDCardCaseFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardCaseFeedbackOutputModel.json",new TypeReference<SDCardCaseFeedbackOutputModel>(){});
	}
	
	public CRCardCaseProcedureInitiateOutputModel initiate(String sdReferenceId, CRCardCaseProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCardCaseProcedureInitiateOutputModel.json",new TypeReference<CRCardCaseProcedureInitiateOutputModel>(){});
	}
	
	public CRCardCaseProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCardCaseProcedureRequestInputModel request){
		return JsonReader.read("request-CRCardCaseProcedureRequestOutputModel.json",new TypeReference<CRCardCaseProcedureRequestOutputModel>(){});
	}
	
	public CRCardCaseProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardCaseProcedureRetrieveOutputModel.json",new TypeReference<CRCardCaseProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQArbitrationRetrieveOutputModel retrieveArbitration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQArbitrationRetrieveOutputModel.json",new TypeReference<BQArbitrationRetrieveOutputModel>(){});
	}
	
	public BQChargebackRetrieveOutputModel retrieveChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQChargebackRetrieveOutputModel.json",new TypeReference<BQChargebackRetrieveOutputModel>(){});
	}
	
	public BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQConsolidationRetrieveOutputModel.json",new TypeReference<BQConsolidationRetrieveOutputModel>(){});
	}
	
	public BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQResolutionRetrieveOutputModel.json",new TypeReference<BQResolutionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardCaseRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardCaseRetrieveOutputModel.json",new TypeReference<SDCardCaseRetrieveOutputModel>(){});
	}
	
	public CRCardCaseProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardCaseProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCardCaseProcedureUpdateOutputModel.json",new TypeReference<CRCardCaseProcedureUpdateOutputModel>(){});
	}
	
	public BQArbitrationUpdateOutputModel updateArbitration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQArbitrationUpdateInputModel request){
		return JsonReader.read("update-BQArbitrationUpdateOutputModel.json",new TypeReference<BQArbitrationUpdateOutputModel>(){});
	}
	
	public BQChargebackUpdateOutputModel updateChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChargebackUpdateInputModel request){
		return JsonReader.read("update-BQChargebackUpdateOutputModel.json",new TypeReference<BQChargebackUpdateOutputModel>(){});
	}
	
	public BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request){
		return JsonReader.read("update-BQConsolidationUpdateOutputModel.json",new TypeReference<BQConsolidationUpdateOutputModel>(){});
	}
	
	public BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request){
		return JsonReader.read("update-BQResolutionUpdateOutputModel.json",new TypeReference<BQResolutionUpdateOutputModel>(){});
	}
	
}
