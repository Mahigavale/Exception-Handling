package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Address;

@Repository
public interface AddressRepo  extends JpaRepository<Address, Integer> {

	//HQL / SQL
	
	
	@Query(value="select * from address where pincode= :pn",nativeQuery=true)
	public Address getbypincode(@Param("pn") String pn);
	
	//extensibility
	//reusability
}
