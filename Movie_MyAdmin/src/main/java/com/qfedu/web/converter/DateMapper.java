package com.qfedu.web.converter;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

//重写ObjectMapper
//@Component //等价于<bean>
//页面到控制器
public class DateMapper extends ObjectMapper{

	public DateMapper() {
		setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
	}
}
