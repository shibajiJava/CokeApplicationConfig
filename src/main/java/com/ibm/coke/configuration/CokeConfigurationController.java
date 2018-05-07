package com.ibm.coke.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.coke.configuration.bean.CokeConfigurationBean;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CokeConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@Autowired
	private Environment environment;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/getConfiguration")
	@HystrixCommand(fallbackMethod="defaltConfig")
	public CokeConfigurationBean getConfiguration()
	{
		CokeConfigurationBean cokeConfigurationBean=null;
		if(configuration.getMemberStatusGoldTransaction()!=null ||configuration.getMemberStatusDimondTransaction() !=null ||configuration.getMemberStatusPlatinumTransaction()!=null ||configuration.getMemberStatusSuperTransaction()!=null )
		{
			cokeConfigurationBean = new CokeConfigurationBean(configuration.getDbServerName(),configuration.getDbServerURL(),configuration.getDbServerUser(),
				configuration.getDbServerPassword(),
				configuration.getMemberStatusGoldTransaction(),configuration.getMemberStatusGoldBalance(),configuration.getMemberStatusGoldMemberType(),configuration.getMemberStatusGoldCashBack(),
				configuration.getMemberStatusDimondTransaction(),configuration.getMemberStatusDimondBalance(),configuration.getMemberStatusDimondMemberType(),configuration.getMemberStatusDimondCashBack(),
				configuration.getMemberStatusPlatinumTransaction(),configuration.getMemberStatusPlatinumBalance(),configuration.getMemberStatusPlatinumMemberType(),configuration.getMemberStatusPlatinumCashBack(),
				configuration.getMemberStatusSuperTransaction(),configuration.getMemberStatusSuperBalance(),configuration.getMemberStatusSuperMemberType(),configuration.getMemberStatusSuperCashBack(),environment.getProperty("local.server.port"));
		}
		else
		{
			throw new RuntimeException();
		}
		
		logger.info("{}", "Log for coke_allication_config_test"+cokeConfigurationBean);
		
		return cokeConfigurationBean;
	}
	
	
	public CokeConfigurationBean defaltConfig()
	{
		CokeConfigurationBean cokeConfigurationBean = new CokeConfigurationBean("","","",
				"",
				"0","0","0","0",
				"0","0","0","0",
				"0","0","0","0",
				"0","0","0","0","none");
		return cokeConfigurationBean;
	}

}
