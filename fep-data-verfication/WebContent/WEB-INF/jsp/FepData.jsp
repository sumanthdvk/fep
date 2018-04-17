<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function submitForm(){
	//var programId = document.getElementById("programId").value;
	document.getElementById("requestForm1").submit();
}
function setDropdownValue(opt){
	var selectedNode = opt.options[opt.selectedIndex];
	document.getElementById("requestType").value = selectedNode.value;
}
</script>
</head>
<body>
<form:form method="POST" commandName="fepDataForm" id="requestForm1" action="/fep-data-verfication/data">
	<table style="width: 99%; font-family: calibri;font-size: 18px;"  align="left">
	<tbody>
		<tr align="left">
			<td align="right">			
				Options: 
				<select id ="options" onchange="setDropdownValue(this)">
					<option value="">Please select</option>
					<option value="FSL_Scheduled_Task">FSL Scheduled Task</option>
					<option value="FEP_Claim_Throttling">FEP Claim Throttling</option>
				</select>
			</td>
			<td align="left">
				<button type="button" onclick="submitForm()">Submit</button>
				<input id="requestType" type="hidden" name="requestType" value=""/>
			</td>
	    </tr>
	</tbody>
	</table>
</form:form>
<div id="vtReportGrid">
<c:choose>
	<c:when test="${not empty fslScheduledTasks}">
		<div id="wrapper" style="width: 100%">
			<div id="rows" style="float: left; width: 100%; border: 0px solid black;">
			 <table border="0" id="myTable" >
				<thead style="font-family: calibri;font-size: 18px;font-weight: bold;">
					<tr id="tableHeader" style="background-color: #BDBDBD">
						<th style="width:7%">Task ID</th>
						<th style="width:7%">Version</th>
						<th style="width:23%">Row Version</th>
						<th style="width:7%">Next Fire Time</th>
						<th style="width:7%">Valid From Time</th>
						<th style="width:8%">Repeat in interval</th>
						<th style="width:5%">Name</th>
					</tr>
				</thead>
				<tbody style="font-family: calibri;font-size: 16px">
				<c:forEach var="task" items="${fslScheduledTasks}" >
					<tr>
						<td style="text-align:center;width:7%"><c:out value="${task.taskId}"/></td>
						<td style="text-align:center;width:7%"><c:out value="${task.version}"/></td>
						<td style="text-align:center;width:23%"><c:out value="${task.rowVersion}"/></td>
						<td style="text-align:center;width:7%"><c:out value="${task.nextFireTime}"/></td>
						<td style="text-align:center;width:7%"><c:out value="${task.validFromTime}"/></td>
						<td style="text-align:center;width:8%"><c:out value="${task.repeatInterval}"/></td>
						<td style="text-align:center;width:5%"><c:out value="${task.name}"/></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			</div>
		</div>
	</c:when>
</c:choose>
</div> 
</body>
</html>