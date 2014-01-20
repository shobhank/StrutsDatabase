package org.shobhank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAction {
	private String useraccount;
	private String userpwd;
	private String username;
	
	public String execute(){
		String exists = "failed";
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ensure that the driver class is loaded by the current classloader.
			conn = DriverManager.getConnection("<dbstring>", "<username>","<password>");
			String sql = "SELECT account FROM user_info WHERE  name = ? and pwd = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
	        ps.setString(2, userpwd);
	        ResultSet rs = ps.executeQuery();
	        while(rs.next()){
	        	setUseraccount(rs.getString(1));
	        	exists = "success";
	        }
		} catch (ClassNotFoundException e) {
			exists = "error";
			e.printStackTrace();
		} catch (SQLException e) {
			exists = "error";
			e.printStackTrace();
		}
		return exists;
	}
	
	public String getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}
	
	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}	
}
