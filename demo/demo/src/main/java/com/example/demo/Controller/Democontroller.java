package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Address;
import com.example.demo.Repository.AddressRepo;

@RestController
public class Democontroller {
	
	@Autowired
	private  AddressRepo repo;
	
//	@GetMapping("/showname")
//	public String Show(@RequestParam("fn")String fname,@RequestParam("ln")String lname)
//	{
//		
//		return fname+lname;
//	}
//	
//	@GetMapping("/showname2/{fn}/{ln}")
//	public String show2(@PathVariable(value="fn")String fnm,@PathVariable(value="ln")String lnm)
//	{
//		return fnm+" "+lnm;
//	}
//	
//	
//	@GetMapping("/showaddress/{ct}/{pin}/{lm}")
//	public String showad(@PathVariable(value="ct")String city,@PathVariable(value="pin")String pincode,@PathVariable(value="lm")String landmark)
//	{
//	
//		return city+" "+pincode+" "+landmark;
//	}
	
	@PostMapping("/addfulladdress")
	public String showfull(@RequestBody Address address)
	{
		
		repo.save(address);
		
		
		
		return "address saved sucessfully !";
	}
	
	
	// Use Case:=> find all addresses in db. FindAll()=>returns all the addresses.
	
	@GetMapping("/get-all")
	public List<Address> findalladd()
	{
	
		return repo.findAll();
		

	}
	//Use case :=>I want a specific address.
	
	
	@GetMapping("/get-by-id")
	public Address getbyid(@RequestParam("id") int id)
	{
		return repo.findById(id).get();
		//error
	}
	
	
	@DeleteMapping("/delete-by-id")
	public String deletebyid(@RequestParam("id") int id)
	{
		repo.deleteById(id);
		
		return "Done ! deleted sucessfully !";
	}
	
	@GetMapping("/get-by-pincode")
	public Address getbypn(@RequestParam("pn") String pn)
	{
	return repo.getbypincode(pn);
	}
	
	@PutMapping("/update-city")
	public int update(@RequestParam("ct") String ct,@RequestParam("id") int id)
	{
		
		
		//return repo.updatecity(ct, id);
		
		return repo.updatehql(ct, id);
	}
	
	
}

