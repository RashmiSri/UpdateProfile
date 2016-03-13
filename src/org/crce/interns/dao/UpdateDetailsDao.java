package org.crce.interns.dao;

import java.util.Calendar;

import org.crce.interns.view.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("updateDao")
public class UpdateDetailsDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public User updateDetails(User user,String pswd, String change){
			
		User res=(User)sessionFactory.getCurrentSession().get(User.class,user.getUserName());
		System.out.println(res.getRoleId());
		Session session=sessionFactory.openSession();
		if(res.getPassword().equals(pswd)){
			res.setPassword(change);
			session.beginTransaction();
			session.update(res);
			session.getTransaction().commit();
			//sessionFactory.getCurrentSession().update(res);
			res=(User)sessionFactory.getCurrentSession().get(User.class,user.getUserName());
			return res;
		}
		return res;
		
	}
	/*
	 public Profile updateProfile(Profile user,String update) {
		// get user and store in Profile result
		Profile result = (Profile)sessionFactory.getCurrentSession().get(Profile.class, user.getId());
			System.out.println(result.getName());
		
		// update name of Profile result
		result.setName(update);
			System.out.println(result.getName());
		
		// update Profile result in database
		sessionFactory.getCurrentSession().update(result);
		
		result = (Profile)sessionFactory.getCurrentSession().get(Profile.class, result.getId());
		return result;
	}

	 */

}
