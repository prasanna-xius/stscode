import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.myscope.demo.restapi.PrescriptionDurgBean;

public class DrugResponse {
	
	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<PrescriptionDurgBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<PrescriptionDurgBean> getResult() {
		return result;
	}

	public void setResult(List<PrescriptionDurgBean> result) {
		this.result = result;
	}
}
