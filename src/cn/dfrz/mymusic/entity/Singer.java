package cn.dfrz.mymusic.entity;

public class Singer {
	
	private int singerid;//主键
	private String singername;//歌手名字
	private String sex;//歌手性别
	private String singerinfo;//歌手信息
	private String singerregion;//歌手地区
	private int singerattention;//歌手关注度
	private String singerimage;
	public Singer(int singerid, String singername, String sex,
			String singerinfo, String singerregion, int singerattention,
			String singerimage) {
		super();
		this.singerid = singerid;
		this.singername = singername;
		this.sex = sex;
		this.singerinfo = singerinfo;
		this.singerregion = singerregion;
		this.singerattention = singerattention;
		this.singerimage = singerimage;
	}
	public Singer() {
		super();
	}
	public int getSingerid() {
		return singerid;
	}
	public void setSingerid(int singerid) {
		this.singerid = singerid;
	}
	public String getSingername() {
		return singername;
	}
	public void setSingername(String singername) {
		this.singername = singername;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSingerinfo() {
		return singerinfo;
	}
	public void setSingerinfo(String singerinfo) {
		this.singerinfo = singerinfo;
	}
	public String getSingerregion() {
		return singerregion;
	}
	public void setSingerregion(String singerregion) {
		this.singerregion = singerregion;
	}
	public int getSingerattention() {
		return singerattention;
	}
	public void setSingerattention(int singerattention) {
		this.singerattention = singerattention;
	}
	public String getSingerimage() {
		return singerimage;
	}
	public void setSingerimage(String singerimage) {
		this.singerimage = singerimage;
	}
	@Override
	public String toString() {
		return "Singer [singerid=" + singerid + ", singername=" + singername
				+ ", sex=" + sex + ", singerinfo=" + singerinfo
				+ ", singerregion=" + singerregion + ", singerattention="
				+ singerattention + ", singerimage=" + singerimage + "]";
	}


}
