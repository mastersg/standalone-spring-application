package com.swj.sa.example.dao;

import java.util.List;

import com.swj.sa.example.model.Foo;

public interface FooDao {
	Foo getFoo(int foo_id);
	List<Foo> getFoos();
}
