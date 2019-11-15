package com.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.IdGenerator;
import com.app.CustomerAmazon;
import com.app.DBConnUtil;

public class CardPayDao {

	public static String createTx(CustomerAmazon info) {
		String uid=null;
		if(info.getProdCost()!=null) {
			String sql ="insert into cardtab values(?,?,?,?,?,?)";
			uid=IdGenerator.getTxId();
			try {
				PreparedStatement ptstmt=DBConnUtil.getConn().prepareStatement(sql);
				ptstmt.setString(1, uid);
				ptstmt.setString(2, info.getCustName());
				ptstmt.setInt(3, info.getCustMobileNumber());
				ptstmt.setString(4, info.getCustAddress());
				ptstmt.setString(5, info.getProductName());
				ptstmt.setString(6, info.getProdCost());
				ptstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return uid;
	}
	
	
	public static List<CustomerAmazon> viewAllTx(){
		List<CustomerAmazon> list=null;
		try {
			String sql="select * from cardtab";
			PreparedStatement ptstmt=DBConnUtil.getConn().prepareStatement(sql);
			ResultSet rst=ptstmt.executeQuery();
			list=new ArrayList<>();
			while(rst.next()) {
				list.add(new CustomerAmazon(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getString(4),rst.getString(5),rst.getString(6)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static CustomerAmazon getOneTx(String txId){
		CustomerAmazon cinfo=null;
		try {
			String sql="select * from cardtab where txId=?";
			PreparedStatement ptstmt=DBConnUtil.getConn().prepareStatement(sql);
			ptstmt.setString(1, txId);
			ResultSet rst=ptstmt.executeQuery();
			while(rst.next()) {
				cinfo =new CustomerAmazon(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getString(4),rst.getString(5),rst.getString(6));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cinfo;
	}
	
}
