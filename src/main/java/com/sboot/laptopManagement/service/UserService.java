package com.sboot.laptopManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.laptopManagement.dao.LaptopDao;
import com.sboot.laptopManagement.dao.PurchaseDao;
import com.sboot.laptopManagement.dao.UserDao;
import com.sboot.laptopManagement.entity.Laptop;
import com.sboot.laptopManagement.entity.Purchase;
import com.sboot.laptopManagement.entity.User;
@Service
public class UserService {
	@Autowired
	UserDao udao;
	
	@Autowired
	LaptopDao ldao;
	
	@Autowired
	PurchaseDao pdao;

	public String registerUser(User u1) {

		udao.save(u1);
		return "User registration got successful";
	}

	public User viewUser(int uId) {
		for (User u : udao.findAll()) {
			if (u.getUserId() == uId) {
				return u;
			}
		}
		return null;

	}

	public boolean checkUserLogin(int uid, String password) {
		User u = udao.findById(uid).orElse(null);
		if(u != null) {
			return password.equals(u.getPassword());
		}
		else {
			return false;
		}

	}

	public List<Purchase> getinvoice(int uid) {
	ArrayList<Purchase> plist = new ArrayList<Purchase>();
	if(uid==1234) {
		return pdao.findAll();
	}
		for(Purchase p : pdao.findAll()) {
			if(p.getUid()==uid) {
				plist.add(p);
			
			}
		}
		return plist;
	}
		
	
	public String purchaseLaptop(int lid, int uid) {
		Laptop l = ldao.findById(lid).orElse(null);
		User u = udao.findById(uid).orElse(null);
		if (l != null && u != null ) {
			if( l.getQuantity()>0) {
				pdao.save(new Purchase(lid, uid, (l.getLcost() + 500)));
				return "Purchase Completed";
			}
			else
			{
				ldao.increaseStock(lid);
				return "Try after sometime...";
			}
		}
		return "Invalid Input";
	}
	
	public List<Laptop> viewPurchaseList() {
		return ldao.findAll();
	}
	
	public Purchase getPurchseData(int pid) {
		return pdao.findById(pid).orElse(null);
	}
}
