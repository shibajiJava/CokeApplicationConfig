package com.ibm.coke.configuration.bean;

public class CokeConfigurationBean {
	
	private String dbServerName;
	private String dbServerURL;
	private String dbServerUser;
	private String dbServerPassword;
	
	private String cashBackGoldTransaction;
	private String cashBackGoldBalance;
	private String cashBackGoldMemberType;
	private String cashBackGoldAmt;
	
	
	private String cashBackDimondTransaction;
	private String cashBackDimondBalance;
	private String cashBackDimondMemberType;
	private String cashBackDimondAmt;
	
	private String cashBackPlatinumTransaction;
	private String cashBackPlatinumBalance;
	private String cashBackPlatinumMemberType;
	private String cashBackPlatinumAmt;
	
	
	private String cashBackSuperTransaction;
	private String cashBackSuperBalance;
	private String cashBackSuperMemberType;
	private String cashBackSuperAmt;
	
	private String serverPort; 
	
	public CokeConfigurationBean() {
		
	}
	
	
	
	public CokeConfigurationBean(String dbServerName, String dbServerURL, String dbServerUser, String dbServerPassword,
			String cashBackGoldTransaction, String cashBackGoldBalance, String cashBackGoldMemberType,
			String cashBackGoldAmt, String cashBackDimondTransaction, String cashBackDimondBalance,
			String cashBackDimondMemberType, String cashBackDimondAmt, String cashBackPlatinumTransaction,
			String cashBackPlatinumBalance, String cashBackPlatinumMemberType, String cashBackPlatinumAmt,
			String cashBackSuperTransaction, String cashBackSuperBalance, String cashBackSuperMemberType,
			String cashBackSuperAmt,String serverPort) {
		super();
		this.dbServerName = dbServerName;
		this.dbServerURL = dbServerURL;
		this.dbServerUser = dbServerUser;
		this.dbServerPassword = dbServerPassword;
		this.cashBackGoldTransaction = cashBackGoldTransaction;
		this.cashBackGoldBalance = cashBackGoldBalance;
		this.cashBackGoldMemberType = cashBackGoldMemberType;
		this.cashBackGoldAmt = cashBackGoldAmt;
		this.cashBackDimondTransaction = cashBackDimondTransaction;
		this.cashBackDimondBalance = cashBackDimondBalance;
		this.cashBackDimondMemberType = cashBackDimondMemberType;
		this.cashBackDimondAmt = cashBackDimondAmt;
		this.cashBackPlatinumTransaction = cashBackPlatinumTransaction;
		this.cashBackPlatinumBalance = cashBackPlatinumBalance;
		this.cashBackPlatinumMemberType = cashBackPlatinumMemberType;
		this.cashBackPlatinumAmt = cashBackPlatinumAmt;
		this.cashBackSuperTransaction = cashBackSuperTransaction;
		this.cashBackSuperBalance = cashBackSuperBalance;
		this.cashBackSuperMemberType = cashBackSuperMemberType;
		this.cashBackSuperAmt = cashBackSuperAmt;
		this.serverPort=serverPort;
	}
	
	
	
	
	public String getServerPort() {
		return serverPort;
	}



	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}



	public String getCashBackGoldTransaction() {
		return cashBackGoldTransaction;
	}
	public void setCashBackGoldTransaction(String cashBackGoldTransaction) {
		this.cashBackGoldTransaction = cashBackGoldTransaction;
	}
	public String getCashBackGoldBalance() {
		return cashBackGoldBalance;
	}
	public void setCashBackGoldBalance(String cashBackGoldBalance) {
		this.cashBackGoldBalance = cashBackGoldBalance;
	}
	public String getCashBackGoldMemberType() {
		return cashBackGoldMemberType;
	}
	public void setCashBackGoldMemberType(String cashBackGoldMemberType) {
		this.cashBackGoldMemberType = cashBackGoldMemberType;
	}
	public String getCashBackGoldAmt() {
		return cashBackGoldAmt;
	}
	public void setCashBackGoldAmt(String cashBackGoldAmt) {
		this.cashBackGoldAmt = cashBackGoldAmt;
	}
	public String getCashBackDimondTransaction() {
		return cashBackDimondTransaction;
	}
	public void setCashBackDimondTransaction(String cashBackDimondTransaction) {
		this.cashBackDimondTransaction = cashBackDimondTransaction;
	}
	public String getCashBackDimondBalance() {
		return cashBackDimondBalance;
	}
	public void setCashBackDimondBalance(String cashBackDimondBalance) {
		this.cashBackDimondBalance = cashBackDimondBalance;
	}
	public String getCashBackDimondMemberType() {
		return cashBackDimondMemberType;
	}
	public void setCashBackDimondMemberType(String cashBackDimondMemberType) {
		this.cashBackDimondMemberType = cashBackDimondMemberType;
	}
	public String getCashBackDimondAmt() {
		return cashBackDimondAmt;
	}
	public void setCashBackDimondAmt(String cashBackDimondAmt) {
		this.cashBackDimondAmt = cashBackDimondAmt;
	}
	public String getCashBackPlatinumTransaction() {
		return cashBackPlatinumTransaction;
	}
	public void setCashBackPlatinumTransaction(String cashBackPlatinumTransaction) {
		this.cashBackPlatinumTransaction = cashBackPlatinumTransaction;
	}
	public String getCashBackPlatinumBalance() {
		return cashBackPlatinumBalance;
	}
	public void setCashBackPlatinumBalance(String cashBackPlatinumBalance) {
		this.cashBackPlatinumBalance = cashBackPlatinumBalance;
	}
	public String getCashBackPlatinumMemberType() {
		return cashBackPlatinumMemberType;
	}
	public void setCashBackPlatinumMemberType(String cashBackPlatinumMemberType) {
		this.cashBackPlatinumMemberType = cashBackPlatinumMemberType;
	}
	public String getCashBackPlatinumAmt() {
		return cashBackPlatinumAmt;
	}
	public void setCashBackPlatinumAmt(String cashBackPlatinumAmt) {
		this.cashBackPlatinumAmt = cashBackPlatinumAmt;
	}
	public String getCashBackSuperTransaction() {
		return cashBackSuperTransaction;
	}
	public void setCashBackSuperTransaction(String cashBackSuperTransaction) {
		this.cashBackSuperTransaction = cashBackSuperTransaction;
	}
	public String getCashBackSuperBalance() {
		return cashBackSuperBalance;
	}
	public void setCashBackSuperBalance(String cashBackSuperBalance) {
		this.cashBackSuperBalance = cashBackSuperBalance;
	}
	public String getCashBackSuperMemberType() {
		return cashBackSuperMemberType;
	}
	public void setCashBackSuperMemberType(String cashBackSuperMemberType) {
		this.cashBackSuperMemberType = cashBackSuperMemberType;
	}
	public String getCashBackSuperAmt() {
		return cashBackSuperAmt;
	}
	public void setCashBackSuperAmt(String cashBackSuperAmt) {
		this.cashBackSuperAmt = cashBackSuperAmt;
	}
	public String getDbServerName() {
		return dbServerName;
	}
	public void setDbServerName(String dbServerName) {
		this.dbServerName = dbServerName;
	}
	public String getDbServerURL() {
		return dbServerURL;
	}
	public void setDbServerURL(String dbServerURL) {
		this.dbServerURL = dbServerURL;
	}
	public String getDbServerUser() {
		return dbServerUser;
	}
	public void setDbServerUser(String dbServerUser) {
		this.dbServerUser = dbServerUser;
	}
	public String getDbServerPassword() {
		return dbServerPassword;
	}
	public void setDbServerPassword(String dbServerPassword) {
		this.dbServerPassword = dbServerPassword;
	}



	@Override
	public String toString() {
		return "CokeConfigurationBean [dbServerName=" + dbServerName + ", dbServerURL=" + dbServerURL
				+ ", dbServerUser=" + dbServerUser + ", dbServerPassword=" + dbServerPassword
				+ ", cashBackGoldTransaction=" + cashBackGoldTransaction + ", cashBackGoldBalance="
				+ cashBackGoldBalance + ", cashBackGoldMemberType=" + cashBackGoldMemberType + ", cashBackGoldAmt="
				+ cashBackGoldAmt + ", cashBackDimondTransaction=" + cashBackDimondTransaction
				+ ", cashBackDimondBalance=" + cashBackDimondBalance + ", cashBackDimondMemberType="
				+ cashBackDimondMemberType + ", cashBackDimondAmt=" + cashBackDimondAmt
				+ ", cashBackPlatinumTransaction=" + cashBackPlatinumTransaction + ", cashBackPlatinumBalance="
				+ cashBackPlatinumBalance + ", cashBackPlatinumMemberType=" + cashBackPlatinumMemberType
				+ ", cashBackPlatinumAmt=" + cashBackPlatinumAmt + ", cashBackSuperTransaction="
				+ cashBackSuperTransaction + ", cashBackSuperBalance=" + cashBackSuperBalance
				+ ", cashBackSuperMemberType=" + cashBackSuperMemberType + ", cashBackSuperAmt=" + cashBackSuperAmt
				+ "]";
	}
	
	
	
}
