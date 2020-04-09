<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
	<c:when test="${!empty listJobs}">
		<h1 style="color:green;text-align: center;">TRENDING JOB OPENINGS FOR THE DATE::${sysDate}</h1>
		<marquee>LATEST JOBS</marquee><br><br>
		<table border="2" align="center">
			<tr style="background-color: silver;color:red">
				<th>Sr.NO</th><th>JOBID</th><th>COMPANY</th><th>DOMAIN</th><th>POSITION</th>
				<th>SALARYRANGE</th><th>EXPERIENCE REQUIRED</th><th>NO.OF POSITIONS</th><th>LOCATION</th>
			</tr>
			<c:forEach var="dto" items="${listJobs}">
				<tr style="background-color:cyan">
					<td>${dto.srNum}</td>
					<td>${dto.jobid}</td>
					<td>${dto.company}</td>
					<td>${dto.domain}</td>
					<td>${dto.position}</td>
					<td>${dto.salaryRange}</td>
					<td>${dto.expRequired}</td>
					<td>${dto.numberOfOpenings}</td>
					<td>${dto.location}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red;text-align: center;">NO RECORDS FOUND</h1>
	</c:otherwise>
</c:choose>
<br><br><br>
<b><a href="welcome.htm">HOME</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="JavaScript:doPrint()">PRINT</a></b>
<script language="JavaScript">
	function doPrint(){
			frames.focus();
			frames.print();
		}
</script>