package cn.dfrz.mymusic.entity;

public class User {
	
	private String userid;//主键
	private String username;//用户名
	private String password;//密码
	private String repassword;//确认密码
	private String sex;//性别
	private String email;//邮箱
	private String brithday;//出生日期
	private String code;//激活码
	private boolean state;//状态码
	private String vercode;//验证码
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getVercode() {
		return vercode;
	}
	public void setVercode(String vercode) {
		this.vercode = vercode;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username
				+ ", password=" + password + ", repassword=" + repassword
				+ ", sex=" + sex + ", email=" + email + ", brithday="
				+ brithday + ", code=" + code + ", state=" + state
				+ ", vercode=" + vercode + "]";
	}
	public User(String userid, String username, String password,
			String repassword, String sex, String email, String brithday,
			String code, boolean state, String vercode) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.sex = sex;
		this.email = email;
		this.brithday = brithday;
		this.code = code;
		this.state = state;
		this.vercode = vercode;
	}
	public User() {
		super();
	}
	
	

	


}
