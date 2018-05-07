package com.ibm.coke.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("coke-config")
public class Configuration {
	
	
	private String dbServerName;
	private String dbServerURL;
	private String dbServerUser;
	private String dbServerPassword;
	
	
	private String memberStatusGoldTransaction;
	private String memberStatusGoldBalance;
	private String memberStatusGoldMemberType;
	private String memberStatusGoldCashBack;
	
	private String memberStatusDimondTransaction;
	private String memberStatusDimondBalance;
	private String memberStatusDimondMemberType;
	private String memberStatusDimondCashBack;
	
	
	private String memberStatusPlatinumTransaction;
	private String memberStatusPlatinumBalance;
	private String memberStatusPlatinumMemberType;
	private String memberStatusPlatinumCashBack;
	
	private String memberStatusSuperTransaction;
	private String memberStatusSuperBalance;
	private String memberStatusSuperMemberType;
	private String memberStatusSuperCashBack;
	
	public Configuration() {
		
	}
	

	public Configuration(String dbServerName, String dbServerURL, String dbServerUser, String dbServerPassword,
			String memberStatusGoldTransaction, String memberStatusGoldBalance, String memberStatusGoldMemberType,
			String memberStatusGoldCashBack, String memberStatusDimondTransaction, String memberStatusDimondBalance,
			String memberStatusDimondMemberType, String memberStatusDimondCashBack,
			String memberStatusPlatinumTransaction, String memberStatusPlatinumBalance,
			String memberStatusPlatinumMemberType, String memberStatusPlatinumCashBack,
			String memberStatusSuperTransaction, String memberStatusSuperBalance, String memberStatusSuperMemberType,
			String memberStatusSuperCashBack) {
		super();
		this.dbServerName = dbServerName;
		this.dbServerURL = dbServerURL;
		this.dbServerUser = dbServerUser;
		this.dbServerPassword = dbServerPassword;
		this.memberStatusGoldTransaction = memberStatusGoldTransaction;
		this.memberStatusGoldBalance = memberStatusGoldBalance;
		this.memberStatusGoldMemberType = memberStatusGoldMemberType;
		this.memberStatusGoldCashBack = memberStatusGoldCashBack;
		this.memberStatusDimondTransaction = memberStatusDimondTransaction;
		this.memberStatusDimondBalance = memberStatusDimondBalance;
		this.memberStatusDimondMemberType = memberStatusDimondMemberType;
		this.memberStatusDimondCashBack = memberStatusDimondCashBack;
		this.memberStatusPlatinumTransaction = memberStatusPlatinumTransaction;
		this.memberStatusPlatinumBalance = memberStatusPlatinumBalance;
		this.memberStatusPlatinumMemberType = memberStatusPlatinumMemberType;
		this.memberStatusPlatinumCashBack = memberStatusPlatinumCashBack;
		this.memberStatusSuperTransaction = memberStatusSuperTransaction;
		this.memberStatusSuperBalance = memberStatusSuperBalance;
		this.memberStatusSuperMemberType = memberStatusSuperMemberType;
		this.memberStatusSuperCashBack = memberStatusSuperCashBack;
	}
	
	
	public String getMemberStatusGoldTransaction() {
		return memberStatusGoldTransaction;
	}

	public void setMemberStatusGoldTransaction(String memberStatusGoldTransaction) {
		this.memberStatusGoldTransaction = memberStatusGoldTransaction;
	}

	public String getMemberStatusGoldBalance() {
		return memberStatusGoldBalance;
	}

	public void setMemberStatusGoldBalance(String memberStatusGoldBalance) {
		this.memberStatusGoldBalance = memberStatusGoldBalance;
	}

	public String getMemberStatusGoldMemberType() {
		return memberStatusGoldMemberType;
	}

	public void setMemberStatusGoldMemberType(String memberStatusGoldMemberType) {
		this.memberStatusGoldMemberType = memberStatusGoldMemberType;
	}

	public String getMemberStatusGoldCashBack() {
		return memberStatusGoldCashBack;
	}

	public void setMemberStatusGoldCashBack(String memberStatusGoldCashBack) {
		this.memberStatusGoldCashBack = memberStatusGoldCashBack;
	}

	public String getMemberStatusDimondTransaction() {
		return memberStatusDimondTransaction;
	}

	public void setMemberStatusDimondTransaction(String memberStatusDimondTransaction) {
		this.memberStatusDimondTransaction = memberStatusDimondTransaction;
	}

	public String getMemberStatusDimondBalance() {
		return memberStatusDimondBalance;
	}

	public void setMemberStatusDimondBalance(String memberStatusDimondBalance) {
		this.memberStatusDimondBalance = memberStatusDimondBalance;
	}

	public String getMemberStatusDimondMemberType() {
		return memberStatusDimondMemberType;
	}

	public void setMemberStatusDimondMemberType(String memberStatusDimondMemberType) {
		this.memberStatusDimondMemberType = memberStatusDimondMemberType;
	}

	public String getMemberStatusDimondCashBack() {
		return memberStatusDimondCashBack;
	}

	public void setMemberStatusDimondCashBack(String memberStatusDimondCashBack) {
		this.memberStatusDimondCashBack = memberStatusDimondCashBack;
	}

	public String getMemberStatusPlatinumTransaction() {
		return memberStatusPlatinumTransaction;
	}

	public void setMemberStatusPlatinumTransaction(String memberStatusPlatinumTransaction) {
		this.memberStatusPlatinumTransaction = memberStatusPlatinumTransaction;
	}

	public String getMemberStatusPlatinumBalance() {
		return memberStatusPlatinumBalance;
	}

	public void setMemberStatusPlatinumBalance(String memberStatusPlatinumBalance) {
		this.memberStatusPlatinumBalance = memberStatusPlatinumBalance;
	}

	public String getMemberStatusPlatinumMemberType() {
		return memberStatusPlatinumMemberType;
	}

	public void setMemberStatusPlatinumMemberType(String memberStatusPlatinumMemberType) {
		this.memberStatusPlatinumMemberType = memberStatusPlatinumMemberType;
	}

	public String getMemberStatusPlatinumCashBack() {
		return memberStatusPlatinumCashBack;
	}

	public void setMemberStatusPlatinumCashBack(String memberStatusPlatinumCashBack) {
		this.memberStatusPlatinumCashBack = memberStatusPlatinumCashBack;
	}

	public String getMemberStatusSuperTransaction() {
		return memberStatusSuperTransaction;
	}

	public void setMemberStatusSuperTransaction(String memberStatusSuperTransaction) {
		this.memberStatusSuperTransaction = memberStatusSuperTransaction;
	}

	public String getMemberStatusSuperBalance() {
		return memberStatusSuperBalance;
	}

	public void setMemberStatusSuperBalance(String memberStatusSuperBalance) {
		this.memberStatusSuperBalance = memberStatusSuperBalance;
	}

	public String getMemberStatusSuperMemberType() {
		return memberStatusSuperMemberType;
	}

	public void setMemberStatusSuperMemberType(String memberStatusSuperMemberType) {
		this.memberStatusSuperMemberType = memberStatusSuperMemberType;
	}

	public String getMemberStatusSuperCashBack() {
		return memberStatusSuperCashBack;
	}

	public void setMemberStatusSuperCashBack(String memberStatusSuperCashBack) {
		this.memberStatusSuperCashBack = memberStatusSuperCashBack;
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
		return "Configuration [memberStatusGoldTransaction=" + memberStatusGoldTransaction
				+ ", memberStatusGoldBalance=" + memberStatusGoldBalance + ", memberStatusGoldMemberType="
				+ memberStatusGoldMemberType + ", memberStatusGoldCashBack=" + memberStatusGoldCashBack + "]";
	}
	
	
	

}
