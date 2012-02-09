package com.swj.sa.example.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.swj.sa.example.dao.FooDao;
import com.swj.sa.example.model.Foo;
import com.swj.sa.example.service.FooService;

@Service
public class FooServiceImpl implements FooService{
	
	@Resource
	private FooDao fooDao;

	@Override
	public Foo getFoo(int fooNo) {
		return fooDao.getFoo(fooNo);
	}

	@Override
	public List<Foo> getFoos() {
		return fooDao.getFoos();
	}

}
