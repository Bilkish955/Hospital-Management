package org.anudip.hospitalManagement.dao;

import java.util.List;
import org.anudip.hospitalManagement.bean.Ward;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Repository
@Service
public class WardDaoImpl implements WardDao {
	@Autowired
	private WardRepository repository;


	@Override
	public void save(Ward ward) {
		repository.save(ward); 

	}

	@Override
	public List<Ward> displayAllWards() {
		return repository.findAll(); 
	}

	@Override
	public Ward findSingleWard(String id) {
		return repository.findById(id).get(); 
	}

	@Override
	public String generateWardId() {
		int n=repository.getCountId();
		String id="";
		if (n==0)
			id="W101";
		else {
			n++;
			n=100+n;
			id="W"+n;
			
		System.out.println(id);
		}
		return id;
		

	}
}

	


