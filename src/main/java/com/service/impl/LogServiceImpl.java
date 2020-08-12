package com.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pojo.LogInfo;
import com.pojo.PageInfo;
import com.service.LogService;

public class LogServiceImpl implements LogService {

	@Override
	public PageInfo show(int pageNum, int pgeSize) throws IOException {
		InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession session = build.openSession();
		
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageNum(pageNum);
		pageInfo.setPageSize(pgeSize);

		Map<String, Integer> map = new HashMap();
		map.put("pageStart", pgeSize * (pageNum - 1));
		map.put("pageSize", pgeSize);
		List<LogInfo> list = session.selectList("com.mapper.LogMapper.selLog", map);
		pageInfo.setList(list);
		long count = session.selectOne("com.mapper.LogMapper.selCount", map);
		pageInfo.setTotal(count % pgeSize == 0 ? count / pgeSize : count / pgeSize + 1);

		session.close();
		return pageInfo;
	}

}
