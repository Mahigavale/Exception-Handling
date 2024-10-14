package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Address;

@RestController
public class Democontroller {
	
	
	@GetMapping("/showname")
	public String Show(@RequestParam("fn")String fname,@RequestParam("ln")String lname)
	{
		
		return fname+lname;
	}
	
	@GetMapping("/showname2/{fn}/{ln}")
	public String show2(@PathVariable(value="fn")String fnm,@PathVariable(value="ln")String lnm)
	{
		return fnm+" "+lnm;
	}
	
	
	@GetMapping("/showaddress/{ct}/{pin}/{lm}")
	public String showad(@PathVariable(value="ct")String city,@PathVariable(value="pin")String pincode,@PathVariable(value="lm")String landmark)
	{
	
		return city+" "+pincode+" "+landmark;
	}
	
	@GetMapping("/showfulladdress")
	public Address showfull(@RequestBody Address address)
	{
		return address;
	}
	
	
}

