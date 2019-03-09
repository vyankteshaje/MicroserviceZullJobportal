package com.app.jp.extremity.ServiceI;

import java.util.List;

import com.app.jp.extremity.model.ClientPersonalDetails;

public interface ServiceInterface {
	
	
	public List<ClientPersonalDetails> getAllJobseeker();
	public String saveJobSeeker(ClientPersonalDetails cd);
	public String deleteJobSeeker(String clientId);

}
