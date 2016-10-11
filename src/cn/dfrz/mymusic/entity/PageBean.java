package cn.dfrz.mymusic.entity;

import java.util.List;

public class PageBean<T> { 

	private int pageCode;//当前页码
//	private int totlePage;//总页数
	private int totleRecode;//总记录数
	private int pageSize;//每页记录数
	private List<T> beanList;//当前页的记录
	
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	
	/**
	 *计算总页数：总页数=总记录数/每页记录数
	 * @return
	 */
	public int getTotlePage() {
		
		int totlePage = totleRecode/pageSize;
		return totlePage%pageSize==0 ? totlePage:totlePage+1;
	}
	
	public int getTotleRecode() {
		return totleRecode;
	}
	public void setTotleRecode(int totleRecode) {
		this.totleRecode = totleRecode;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}
	
	
}
