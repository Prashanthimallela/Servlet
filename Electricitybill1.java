package com.test1.jsf.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name = "elec")
@RequestScoped
public class Electricitybill1 {
	private int meterID;
	private String consumerName;
	private int currMeterReading;
	private int prevMeterReading;
	private int amount;
	private String zone;

	

	public int getMeterID() {
		return meterID;
	}

	public void setMeterID(int meterID) {
		this.meterID = meterID;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public int getCurrMeterReading() {
		return currMeterReading;
	}

	public void setCurrMeterReading(int currMeterReading) {
		this.currMeterReading = currMeterReading;
	}

	public int getPrevMeterReading() {
		return prevMeterReading;
	}

	public void setPrevMeterReading(int prevMeterReading) {
		this.prevMeterReading = prevMeterReading;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public static List<Bill1> getBilllist() {
		return billList;
	}

	private static final List<Bill1> billList = new ArrayList<>();

	public void getBill() {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Scanner sc = new Scanner(System.in);
			String url = "jdbc:mysql://localhost:3306/infinite";
			String user = "root";
			String pass = "root@123";
			con = DriverManager.getConnection(url, user, pass);
			Statement stmt = (Statement) con.createStatement();
			if (con != null) {
				System.out.println("successful");
			}
			else {
				System.out.println("unsuccessful");
			}
			ResultSet rs = (stmt).executeQuery("select * from  ElectricityBill");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				billList.add(new Bill1(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6)));

			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
