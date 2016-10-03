package cn.dfrz.mymusic.entity;

public class Song {
	
	private int songid;//主键
	private String songname;//歌曲名
	private String singername;//歌手名
	private String path;//歌曲路径
	private String album;//专辑
	private String type;//类型
	private int heat;//热度
	public int getSongid() {
		return songid;
	}
	public void setSongid(int songid) {
		this.songid = songid;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getSingername() {
		return singername;
	}
	public void setSingername(String singername) {
		this.singername = singername;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeat() {
		return heat;
	}
	public void setHeat(int heat) {
		this.heat = heat;
	}
	public Song(int songid, String songname, String singername, String path,
			String album, String type, int heat) {
		super();
		this.songid = songid;
		this.songname = songname;
		this.singername = singername;
		this.path = path;
		this.album = album;
		this.type = type;
		this.heat = heat;
	}
	public Song() {
		super();
	}
	
	

}
