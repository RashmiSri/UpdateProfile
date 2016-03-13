package org.crce.interns.service;

import org.crce.interns.dao.UpdateDetailsDao;
import org.crce.interns.view.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("updateService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class UpdateDetailsService {
@Autowired	
private UpdateDetailsDao updateDao;
public User updateDetails(User user, String pswd, String change){
	User res=updateDao.updateDetails(user, pswd, change);
	if(res==null) System.out.println("null!!");
	return res;
	
}
/*
 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Profile updateProfile(Profile user,String update) {
		
		Profile result = profileDAO.updateProfile(user,update);
		
		
		if(result == null){
			System.out.println("Returned NULL");
		}
		
		
		return result;
	}

 */
}
