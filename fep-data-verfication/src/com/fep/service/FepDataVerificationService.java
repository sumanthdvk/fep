package com.fep.service;

import java.util.List;

import com.fep.model.FepClaimThrtling;
import com.fep.model.FslScheduledTask;

public interface FepDataVerificationService {
	List<FepClaimThrtling> fetchClaimThrtlingData();
	List<FslScheduledTask> fetchSchedTaskData();
}
