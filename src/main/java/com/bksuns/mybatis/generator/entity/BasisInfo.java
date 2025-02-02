package com.bksuns.mybatis.generator.entity;

import java.io.Serializable;
import java.util.List;

/**   
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 自动生成需要的基本信息</P>
 * @version: v1.0.0
 * @author: wujp
 */
public class BasisInfo implements Serializable{
	private static final long serialVersionUID = 123123L;

	private String project;
	
	private String author;

	private Boolean other;

	private String version;
	
	private String dbUrl;
	
	private String dbName;
	
	private String dbPassword;
	
	private String database;
	
	private String table;
	
	private String entityName;
	
	private String objectName;
	
	private String entityComment;
	
	private String createTime;
	
	private String agile;
	
	private String entityUrl;
	
	private String daoUrl;
	
	private String mapperUrl;
	
	private String serviceUrl;
	
	private String serviceImplUrl;
	
	private String controllerUrl;
	
	private String idType;
	
	private String idJdbcType;
	
	private List<PropertyInfo> cis;
	
	public BasisInfo(String project, String author, String version, String dbUrl, String dbName, String dbPassword,
			String database, String createTime, String agile, String entityUrl, String daoUrl, String mapperUrl,
			String serviceUrl, String serviceImplUrl, String controllerUrl) {
		super();
		this.project = project;
		this.author = author;
		this.version = version;
		this.dbUrl = dbUrl;
		this.dbName = dbName;
		this.dbPassword = dbPassword;
		this.database = database;
		this.createTime = createTime;
		this.agile = agile;
		this.entityUrl = entityUrl;
		this.daoUrl = daoUrl;
		this.mapperUrl = mapperUrl;
		this.serviceUrl = serviceUrl;
		this.serviceImplUrl = serviceImplUrl;
		this.controllerUrl = controllerUrl;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getEntityComment() {
		return entityComment;
	}

	public void setEntityComment(String entityComment) {
		this.entityComment = entityComment;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAgile() {
		return agile;
	}

	public void setAgile(String agile) {
		this.agile = agile;
	}

	public String getEntityUrl() {
		return entityUrl;
	}

	public void setEntityUrl(String entityUrl) {
		this.entityUrl = entityUrl;
	}

	public String getDaoUrl() {
		return daoUrl;
	}

	public void setDaoUrl(String daoUrl) {
		this.daoUrl = daoUrl;
	}

	public String getMapperUrl() {
		return mapperUrl;
	}

	public void setMapperUrl(String mapperUrl) {
		this.mapperUrl = mapperUrl;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getServiceImplUrl() {
		return serviceImplUrl;
	}

	public void setServiceImplUrl(String serviceImplUrl) {
		this.serviceImplUrl = serviceImplUrl;
	}

	public String getControllerUrl() {
		return controllerUrl;
	}

	public void setControllerUrl(String controllerUrl) {
		this.controllerUrl = controllerUrl;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdJdbcType() {
		return idJdbcType;
	}

	public void setIdJdbcType(String idJdbcType) {
		this.idJdbcType = idJdbcType;
	}

	public List<PropertyInfo> getCis() {
		return cis;
	}

	public void setCis(List<PropertyInfo> cis) {
		this.cis = cis;
	}

	public Boolean getOther() {
		return other;
	}

	public void setOther(Boolean other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "BasisInfo{" +
				"project='" + project + '\'' +
				", author='" + author + '\'' +
				", other=" + other +
				", version='" + version + '\'' +
				", dbUrl='" + dbUrl + '\'' +
				", dbName='" + dbName + '\'' +
				", dbPassword='" + dbPassword + '\'' +
				", database='" + database + '\'' +
				", table='" + table + '\'' +
				", entityName='" + entityName + '\'' +
				", objectName='" + objectName + '\'' +
				", entityComment='" + entityComment + '\'' +
				", createTime='" + createTime + '\'' +
				", agile='" + agile + '\'' +
				", entityUrl='" + entityUrl + '\'' +
				", daoUrl='" + daoUrl + '\'' +
				", mapperUrl='" + mapperUrl + '\'' +
				", serviceUrl='" + serviceUrl + '\'' +
				", serviceImplUrl='" + serviceImplUrl + '\'' +
				", controllerUrl='" + controllerUrl + '\'' +
				", idType='" + idType + '\'' +
				", idJdbcType='" + idJdbcType + '\'' +
				", cis=" + cis +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		return cis != null ;

	}

	@Override
	public int hashCode() {
		int result = project != null ? project.hashCode() : 0;
		result = 31 * result + (author != null ? author.hashCode() : 0);
		result = 31 * result + (other != null ? other.hashCode() : 0);
		result = 31 * result + (version != null ? version.hashCode() : 0);
		result = 31 * result + (dbUrl != null ? dbUrl.hashCode() : 0);
		result = 31 * result + (dbName != null ? dbName.hashCode() : 0);
		result = 31 * result + (dbPassword != null ? dbPassword.hashCode() : 0);
		result = 31 * result + (database != null ? database.hashCode() : 0);
		result = 31 * result + (table != null ? table.hashCode() : 0);
		result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
		result = 31 * result + (objectName != null ? objectName.hashCode() : 0);
		result = 31 * result + (entityComment != null ? entityComment.hashCode() : 0);
		result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
		result = 31 * result + (agile != null ? agile.hashCode() : 0);
		result = 31 * result + (entityUrl != null ? entityUrl.hashCode() : 0);
		result = 31 * result + (daoUrl != null ? daoUrl.hashCode() : 0);
		result = 31 * result + (mapperUrl != null ? mapperUrl.hashCode() : 0);
		result = 31 * result + (serviceUrl != null ? serviceUrl.hashCode() : 0);
		result = 31 * result + (serviceImplUrl != null ? serviceImplUrl.hashCode() : 0);
		result = 31 * result + (controllerUrl != null ? controllerUrl.hashCode() : 0);
		result = 31 * result + (idType != null ? idType.hashCode() : 0);
		result = 31 * result + (idJdbcType != null ? idJdbcType.hashCode() : 0);
		result = 31 * result + (cis != null ? cis.hashCode() : 0);
		return result;
	}
}
