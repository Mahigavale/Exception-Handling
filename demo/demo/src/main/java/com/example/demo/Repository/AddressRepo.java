package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Address;

import jakarta.transaction.Transactional;

@Repository
public interface AddressRepo  extends JpaRepository<Address, Integer> {

	//HQL / SQL
	
	
	@Query(value="select * from address where pincode= :pn",nativeQuery=true)
	public Address getbypincode(@Param("pn") String pn);
	
	//extensibility
	//reusability
	
	
	
	//transactional and modifying
	
	@Transactional
	@Modifying
	@Query(value="update address set city= :ct where addid= :id",nativeQuery=true)
	public int updatecity(@Param("ct") String ct,@Param("id") int id);
	
	
	@Transactional
	@Modifying
	@Query(value="update Address set city= :ct where addid= :id")
	public int updatehql(@Param("ct") String ct,@Param("id") int id);
	
	
}


