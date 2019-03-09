package com.app.jp.extremity.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.jp.extremity.Repository.JobSeekerRepository;
import com.app.jp.extremity.ServiceI.ServiceInterface;
import com.app.jp.extremity.model.ClientPersonalDetails;

@Service
public class ServiceImplementation implements ServiceInterface {

	@Autowired
	JobSeekerRepository jr;
	
	
	@Override
	public List<ClientPersonalDetails> getAllJobseeker() {
		// TODO Auto-generated method stub
		List<ClientPersonalDetails> list  =	(List<ClientPersonalDetails>) jr.findAll();
		return list;
	}

	@Override
	public String saveJobSeeker(ClientPersonalDetails cd) {
		// TODO Auto-generated method stub
		jr.save(cd);
		
		return "Save Personal Details Successfully";
	}

	@Override
	public String deleteJobSeeker(String clientId) {
		// TODO Auto-generated method stub
		jr.deleteById(clientId);
		
		return "Data deleted Succesfully";
	}

}
