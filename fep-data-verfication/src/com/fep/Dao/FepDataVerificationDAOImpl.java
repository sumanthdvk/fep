package com.fep.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fep.model.FepClaimThrtling;
import com.fep.model.FslScheduledTask;

@Repository
public class FepDataVerificationDAOImpl implements FepDataVerificationDAO {

	@Override
	public List<FepClaimThrtling> fetchClaimThrtlingData() {
		// get DB connection
		// get result set from DB
		return getMockClaimThrtlingData();
	}

	@Override
	public List<FslScheduledTask> fetchSchedTaskData() {
		// get DB connection
		// get result set from DB
		return getMockSchedTaskData();
	}

	private List<FepClaimThrtling> getMockClaimThrtlingData() {
		List<FepClaimThrtling> claimDataList = new ArrayList<>();
		FepClaimThrtling claimThrtling1 = new FepClaimThrtling();
		claimThrtling1.setDcn("42156421534174SDSF232");
		claimThrtling1.setCorpEntCd("TX");
		claimThrtling1.setProcStaCd("01");
		claimThrtling1.setClmReprocCnt("3");
		claimThrtling1.setLstProcTs("2018-03-03 20:22:22");
		claimThrtling1.setClmMetdtTxt("0000FDKLJDFZX00984938UKLJDF89IU304KLMDFJSDLJ34IU3EJFLJKWEPRO");
		
		FepClaimThrtling claimThrtling2 = new FepClaimThrtling();
		claimThrtling2.setDcn("42156421534174SDSF232");
		claimThrtling2.setCorpEntCd("IL");
		claimThrtling2.setProcStaCd("10");
		claimThrtling2.setClmReprocCnt("1");
		claimThrtling2.setLstProcTs("2018-03-03 20:22:22");
		claimThrtling2.setClmMetdtTxt("0000FDKLJDFZX00984938UKLJDF89IU304KLMDFJSDLJ34IU3EJFLJKWEPRO");
		
		claimDataList.add(claimThrtling1);
		claimDataList.add(claimThrtling2);
		return claimDataList;
	}
	
	private List<FslScheduledTask> getMockSchedTaskData() {
		List<FslScheduledTask> fslSchedulesTaskList = new ArrayList<>();
		FslScheduledTask fslScheduledTask1 = new FslScheduledTask();
		fslScheduledTask1.setTaskId("51512");
		fslScheduledTask1.setVersion("17");
		fslScheduledTask1.setRowVersion("333");
		fslScheduledTask1.setNextFireTime("1525353637");
		fslScheduledTask1.setValidFromTime("1573637364");
		fslScheduledTask1.setRepeatInterval("30minutes");
		fslScheduledTask1.setName("FepSLMassAdjustment");
		
		FslScheduledTask fslScheduledTask2 = new FslScheduledTask();
		fslScheduledTask2.setTaskId("33512");
		fslScheduledTask2.setVersion("11");
		fslScheduledTask2.setRowVersion("577");
		fslScheduledTask2.setNextFireTime("1525353637");
		fslScheduledTask2.setValidFromTime("1573637364");
		fslScheduledTask2.setRepeatInterval("1seconds");
		fslScheduledTask2.setName("FepSLThrottling");
		
		fslSchedulesTaskList.add(fslScheduledTask1);
		fslSchedulesTaskList.add(fslScheduledTask2);
		return fslSchedulesTaskList;
	}
}
