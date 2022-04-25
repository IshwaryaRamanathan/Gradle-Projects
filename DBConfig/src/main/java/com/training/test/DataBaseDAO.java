package com.training.test;

import org.springframework.stereotype.Component;

@Component
public class DataBaseDAO {
	private String drivername,username,password,url;

	/*public DataBaseDAO() {
		super();
	}

	public DataBaseDAO(String drivername, String usernmae, String password, String url) {
		super();
		this.drivername = drivername;
		this.username = usernmae;
		this.password = password;
		this.url = url;
	}*/

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getUsernmae() {
		return username;
	}

	public void setUsernmae(String usernmae) {
		this.username = usernmae;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "DataBaseDAO [drivername=" + drivername + ", usernmae=" + username + ", password=" + password + ", url="
				+ url + "]";
	}
	
}
