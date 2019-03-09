package com.app.jp.extremity.Repository;

import org.springframework.data.repository.CrudRepository;

import com.app.jp.extremity.model.ClientPersonalDetails;

public interface JobSeekerRepository extends CrudRepository<ClientPersonalDetails, String>{

}
