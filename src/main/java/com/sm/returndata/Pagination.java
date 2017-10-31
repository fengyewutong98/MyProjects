package com.sm.returndata;

import java.io.Serializable;

public class Pagination implements Serializable{
	private static final long serialVersionUID = 1L;
	// 当前页
	private int pageNum;
	// 每页的数量
	private int pageSize;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
