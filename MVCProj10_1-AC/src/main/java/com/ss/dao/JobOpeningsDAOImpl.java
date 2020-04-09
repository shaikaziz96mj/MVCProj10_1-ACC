package com.ss.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ss.bo.JobOpeningsBO;

public final class JobOpeningsDAOImpl implements JobOpeningsDAO {
	
	private static final String GET_JOB_OPENINGS_QUERY="SELECT JOBID,COMPANY,DOMAIN,POSITION,SALARYRANGE,EXP_REQUIRED,NUMBER_OF_POSITIONS,LOCATION FROM JOBOPENINGSLIST";
	private JdbcTemplate jt;

	public JobOpeningsDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<JobOpeningsBO> getAllOpeningsList() {
		
		List<JobOpeningsBO> listBO=null;
		
		listBO=jt.query(GET_JOB_OPENINGS_QUERY,new JobOpeningsExtractor());
		return listBO;
	}
	
	private class JobOpeningsExtractor implements ResultSetExtractor<List<JobOpeningsBO>>{

		@Override
		public List<JobOpeningsBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			
			List<JobOpeningsBO> listBO=null;
			JobOpeningsBO bo=null;
			
			//process the resultset
			listBO=new ArrayList<JobOpeningsBO>();
			while(rs.next()) {
				bo=new JobOpeningsBO();
				bo.setJobid(rs.getInt(1));
				bo.setCompany(rs.getString(2));
				bo.setDomain(rs.getString(3));
				bo.setPosition(rs.getString(4));
				bo.setSalaryRange(rs.getString(5));
				bo.setExpRequired(rs.getString(6));
				bo.setNumberOfOpenings(rs.getInt(7));
				bo.setLocation(rs.getString(8));
				//set bo object to listBO
				listBO.add(bo);
			}//while
			return listBO;
		}//method
	}//inner class
}//class