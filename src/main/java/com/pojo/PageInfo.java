package com.pojo;

import java.util.List;

public class PageInfo {
	// 每页的条数
	private int pageSize;
	// 第几页
	private int pageNum;
	// 总条数
	private long total;
	// 每页具体的项目
	List<?> list;

	public synchronized final int getPageSize() {
		return pageSize;
	}

	public synchronized final void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public synchronized final int getPageNum() {
		return pageNum;
	}

	public synchronized final void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public synchronized final long getTotal() {
		return total;
	}

	public synchronized final void setTotal(long total) {
		this.total = total;
	}

	public synchronized final List<?> getList() {
		return list;
	}

	public synchronized final void setList(List<?> list) {
		this.list = list;
	}

}
