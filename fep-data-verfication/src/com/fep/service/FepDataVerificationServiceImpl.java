package com.fep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fep.Dao.FepDataVerificationDAO;
import com.fep.model.FepClaimThrtling;
import com.fep.model.FslScheduledTask;

@Service
public class FepDataVerificationServiceImpl implements FepDataVerificationService {
	
	@Autowired
	FepDataVerificationDAO fepDataVerificationDAO; 

	@Override
	public List<FepClaimThrtling> fetchClaimThrtlingData() {
		return fepDataVerificationDAO.fetchClaimThrtlingData();
	}

	@Override
	public List<FslScheduledTask> fetchSchedTaskData() {
		return fepDataVerificationDAO.fetchSchedTaskData();
	}

}
