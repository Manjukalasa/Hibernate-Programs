package com.hospital_app.controll;

import com.hospital_app.dto.Branch;
import com.hospital_app.service.BranchService;

public class Savebranch 
{
	public static void main(String[] args)
	{
		Branch branch=new Branch();
		branch.setName("bagalkot");
		branch.setPhno(7795543450l);
		branch.setEmail("manju@123");
		
		BranchService service=new BranchService();
		service.saveBranch(branch, 1);
	}
}