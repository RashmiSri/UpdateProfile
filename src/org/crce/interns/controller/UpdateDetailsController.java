package org.crce.interns.controller;

import org.crce.interns.service.UpdateDetailsService;
import org.crce.interns.view.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateDetailsController {
	
	@Autowired
	private UpdateDetailsService updateService;
	
	@RequestMapping(value="/gotoeditprofile.html", method = RequestMethod.GET)
	public ModelAndView gotoeditprofile(){
		//return new String("updatedetails");
		ModelAndView model=null;
		//User user=new User();
		//user.setUserName("tars");
		//user.setRoleId(1412);
		//User res=updateService.updateDetails(user, );
		model = new ModelAndView("updatedetails");
		
		//model.addObject("name",user);
		
		return model;
		
	}
	
	 @RequestMapping(value="/update-profile.html", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam("name") String name, @RequestParam("xpassword") String xpassword, @RequestParam("password") String password){
		ModelAndView model=null;
		User user=new User();
		user.setUserName(name);
		user.setPassword(password);
		User res=updateService.updateDetails(user, xpassword, password);
		if(res.getPassword().equals(password)){
			model = new ModelAndView("success");
			model.addObject("name",res.getUserName());
			model.addObject("password",res.getPassword());
			return model;
		}
		else{
			model = new ModelAndView("failure");
			model.addObject("name",res.getUserName());
			//model.addObject("msg", "Sorry, could not update the password: Entered current password may be wrong");
			return model;
		}
	}
	

}
