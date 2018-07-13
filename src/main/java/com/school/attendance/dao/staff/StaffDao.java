package com.school.attendance.dao.staff;

import java.util.List;

import com.school.attendance.domine.staff.Staff;
import com.school.attendance.model.staff.StaffModel;
import com.school.attendance.response.Response;

public interface StaffDao {

	public Response addStaff(Staff st)throws Exception;

	

	public Staff getStaff(String staffId)throws Exception;

	public Response deleteStaff(String staffId)throws Exception;



	public Response updateStaff(Staff staff)throws Exception;



	public List<Staff> getStaffs()throws Exception;

}
