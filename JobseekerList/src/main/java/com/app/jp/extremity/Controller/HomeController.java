package com.app.jp.extremity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.jp.extremity.ServiceI.ServiceInterface;
import com.app.jp.extremity.model.ClientPersonalDetails;

@RestController
public class HomeController {
	
	
	@Autowired
	ServiceInterface si;
	@ResponseBody
	@RequestMapping(value ="/getAlljobseeker",method=RequestMethod.GET,consumes="application/json",produces="application/json")
	public List<ClientPersonalDetails> getAllJobseeker(){
		
		
		List<ClientPersonalDetails> list=si.getAllJobseeker();
		
		return list;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
