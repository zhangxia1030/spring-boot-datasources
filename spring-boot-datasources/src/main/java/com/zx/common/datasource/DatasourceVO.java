package com.zx.common.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource.primary")
public class DatasourceVO {
	private String schema = null;
	private String continueOnError = null;

	private String type = null;
	private String url = null;
	private String username = null;
	private String password = null;
	private String driverClassName = null;

	private String initialSize = null;
	private String minIdle = null;
	private String maxActive = null;
	private String maxWait = null;
	private String timeBetweenEvictionRunsMillis = null;
	private String validationQuery = null;
	private String testWhileIdle = null;
	private String testOnBorrow = null;
	private String testOnReturn = null;
	private String poolPreparedStatements = null;
	private String maxPoolPreparedStatementPerConnectionSize = null;
	private String filters = null;
	private String connectionProperties = null;
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getContinueOnError() {
		return continueOnError;
	}
	public void setContinueOnError(String continueOnError) {
		this.continueOnError = continueOnError;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getInitialSize() {
		return initialSize;
	}
	public void setInitialSize(String initialSize) {
		this.initialSize = initialSize;
	}
	public String getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(String minIdle) {
		this.minIdle = minIdle;
	}
	public String getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(String maxActive) {
		this.maxActive = maxActive;
	}
	public String getMaxWait() {
		return maxWait;
	}
	public void setMaxWait(String maxWait) {
		this.maxWait = maxWait;
	}
	public String getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}
	public void setTimeBetweenEvictionRunsMillis(
			String timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}
	public String getValidationQuery() {
		return validationQuery;
	}
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}
	public String getTestWhileIdle() {
		return testWhileIdle;
	}
	public void setTestWhileIdle(String testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}
	public String getTestOnBorrow() {
		return testOnBorrow;
	}
	public void setTestOnBorrow(String testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}
	public String getTestOnReturn() {
		return testOnReturn;
	}
	public void setTestOnReturn(String testOnReturn) {
		this.testOnReturn = testOnReturn;
	}
	public String getPoolPreparedStatements() {
		return poolPreparedStatements;
	}
	public void setPoolPreparedStatements(String poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}
	public String getMaxPoolPreparedStatementPerConnectionSize() {
		return maxPoolPreparedStatementPerConnectionSize;
	}
	public void setMaxPoolPreparedStatementPerConnectionSize(
			String maxPoolPreparedStatementPerConnectionSize) {
		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	}
	public String getFilters() {
		return filters;
	}
	public void setFilters(String filters) {
		this.filters = filters;
	}
	public String getConnectionProperties() {
		return connectionProperties;
	}
	public void setConnectionProperties(String connectionProperties) {
		this.connectionProperties = connectionProperties;
	}
	
}
