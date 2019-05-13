package cn.baliure.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Table(name = "sys_user")
public class SysUser implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_ID")
	private Integer userId;
	
	@Column(name = "Member_ID")
	private Integer memberId;//同body_id
	
	@Column(name = "stock_id")
	private Integer stockId;
	
	@Column(name = "LoginName")
	private String loginname;
	
	@Column(name = "OwnerName")
	private String ownername;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "MarkForUse")
	private Integer markforuse;

	@Column(name = "PassChanged")
	private Integer passchanged;
	
	@Column(name = "departments")
	private String departments;
	
	@Column(name = "grants")
	private String grants;
	
	
	public SysUser() {
	}
	public SysUser(Integer id) {
		this.userId=id;
	}
	
	public SysUser(Integer id,String ownername,String loginname,String password,Integer markforuse) {
		this.userId=id;
		this.ownername=ownername;
		this.loginname=loginname;
		this.password=password;
		this.markforuse=markforuse;
	}
	
	
	
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getMarkforuse() {
		return markforuse;
	}

	public void setMarkforuse(Integer markforuse) {
		this.markforuse = markforuse;
	}
	
	public Integer getPassChanged() {
		return passchanged;
	}

	public void setPassChanged(Integer passchanged) {
		this.passchanged = passchanged;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public String getGrants() {
		return grants;
	}

	public void setGrants(String grants) {
		this.grants = grants;
	}
}