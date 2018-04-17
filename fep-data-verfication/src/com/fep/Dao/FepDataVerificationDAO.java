package com.fep.Dao;

import java.util.List;

import com.fep.model.FepClaimThrtling;
import com.fep.model.FslScheduledTask;

public interface FepDataVerificationDAO {
	List<FepClaimThrtling> fetchClaimThrtlingData();
	List<FslScheduledTask> fetchSchedTaskData();
}
