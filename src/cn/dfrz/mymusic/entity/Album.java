package cn.dfrz.mymusic.entity;

public class Album {

	private String albumname;
	private String singername;
	private String albunimage;
	public String getAlbumname() {
		return albumname;
	}
	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}
	public String getSingername() {
		return singername;
	}
	public void setSingername(String singername) {
		this.singername = singername;
	}
	public String getAlbunimage() {
		return albunimage;
	}
	public void setAlbunimage(String albunimage) {
		this.albunimage = albunimage;
	}
	@Override
	public String toString() {
		return "Album [albumname=" + albumname + ", singername=" + singername
				+ ", albunimage=" + albunimage + "]";
	}
	public Album(String albumname, String singername, String albunimage) {
		super();
		this.albumname = albumname;
		this.singername = singername;
		this.albunimage = albunimage;
	}
	public Album() {
		super();
	}
	
	
}
