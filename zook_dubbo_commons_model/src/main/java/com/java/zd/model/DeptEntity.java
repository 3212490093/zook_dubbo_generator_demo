package com.java.zd.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * 
 * @author djin
 *    Dept实体类
 * @date 2020-05-11 15:12:33
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class DeptEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
      //部门编号
	  private Integer deptno;
      //部门名称
	  private String dname;
      //地址
	  private String loc;

	  /**
	   * 设置：部门编号
	   */
	  public void setDeptno(Integer deptno) {
		  this.deptno = deptno;
	  }
	  /**
	   * 获取：部门编号
	   */
	  public Integer getDeptno() {
	   	  return deptno;
	  }
	  /**
	   * 设置：部门名称
	   */
	  public void setDname(String dname) {
		  this.dname = dname;
	  }
	  /**
	   * 获取：部门名称
	   */
	  public String getDname() {
	   	  return dname;
	  }
	  /**
	   * 设置：地址
	   */
	  public void setLoc(String loc) {
		  this.loc = loc;
	  }
	  /**
	   * 获取：地址
	   */
	  public String getLoc() {
	   	  return loc;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
