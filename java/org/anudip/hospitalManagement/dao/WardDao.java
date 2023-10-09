package org.anudip.hospitalManagement.dao;

import org.anudip.hospitalManagement.bean.Ward;
import java.util.List;

public interface WardDao {
	public void save(Ward ward);
	public List<Ward> displayAllWards();
	public Ward findSingleWard(String id);
	public String generateWardId();
	//public void update(Ward ward);



}
