package com.swj.sa.example.service;

import java.util.List;

import com.swj.sa.example.model.Foo;

public interface FooService {
	Foo getFoo(int fooNo);
	List<Foo> getFoos();
}
