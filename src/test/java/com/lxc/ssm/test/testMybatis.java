package com.lxc.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxc.ssm.dao.ItemsMapper;
import com.lxc.ssm.pojo.ItemsCustom;
import com.lxc.ssm.pojo.ItemsQueryVo;


public class testMybatis {
	private  ApplicationContext applicationContext;
	@Before
	public   void init() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
	}

	@Test
	public void testfindUserById() throws Exception {
		ItemsMapper itemsMapper=(ItemsMapper) applicationContext.getBean("itemsMapper");
		
		ItemsCustom itemsCustom=(ItemsCustom) itemsMapper.findItemsById(2);
		
		System.out.println(itemsCustom);

	}
	
	@Test
	public void testfindItemsList() throws Exception {
		ItemsQueryVo itemsQueryVo=new ItemsQueryVo(); 
		ItemsMapper itemsMapper=(ItemsMapper) applicationContext.getBean("itemsMapper");
		
		List<ItemsCustom> list=itemsMapper.getItemsList(itemsQueryVo);
		
	
		System.out.println(list);;

	}
	
	@Test
	public void testupdateItems() throws Exception {
		ItemsCustom itemsCustom=new ItemsCustom();
		ItemsMapper itemsMapper=(ItemsMapper) applicationContext.getBean("itemsMapper");
		Integer id=itemsMapper.updateItemsByPrimaryKeyBlobs(itemsCustom);
		itemsCustom.setName("李贤春");
		itemsCustom.setId(1);
		
		System.out.println(itemsCustom);

	}
	

}
