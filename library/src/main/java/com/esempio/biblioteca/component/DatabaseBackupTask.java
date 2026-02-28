package com.esempio.biblioteca.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatabaseBackupTask {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Scheduled(fixedRate= 30000)
	public void backup() {
		jdbcTemplate.execute("SCRIPT DATA TO 'src/main/resources/data.sql'");
	}
}
