package com.fep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fep.form.FepDataForm;
import com.fep.model.FepClaimThrtling;
import com.fep.model.FslScheduledTask;
import com.fep.service.FepDataVerificationService;

@Controller
public class FepDataVerificationController {
	
	@Autowired
	FepDataVerificationService fepDataVerificationService;
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String loadJsp(ModelMap model) {
	      //model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "FepData";
	}
	
	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public String getData(ModelMap model, @ModelAttribute("fepDataForm") FepDataForm fepDataForm) {
	      if (fepDataForm.getRequestType().equalsIgnoreCase("FSL_Scheduled_Task")) {
	    	  System.out.println("entered task");
	    	  List<FslScheduledTask> fslScheduledTasks = fepDataVerificationService.fetchSchedTaskData();
	    	  model.addAttribute("fslScheduledTasks", fslScheduledTasks);
	    	  
	      } else {
	    	  List<FepClaimThrtling> claimData = fepDataVerificationService.fetchClaimThrtlingData();
	    	  model.addAttribute("claimData",claimData);
	    	  System.out.println("entered claim");
	      }
	      return "FepData";
	   }
}
