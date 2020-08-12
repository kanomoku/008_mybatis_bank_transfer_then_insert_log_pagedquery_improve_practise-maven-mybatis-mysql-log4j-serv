package com.service;

import java.io.IOException;

import com.pojo.PageInfo;

public interface LogService {
	PageInfo show(int pageNum, int pgeSize) throws IOException;

}
