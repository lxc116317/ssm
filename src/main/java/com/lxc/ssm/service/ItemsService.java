package com.lxc.ssm.service;

import java.util.List;

import com.lxc.ssm.pojo.ItemsCustom;
import com.lxc.ssm.pojo.ItemsQueryVo;
import com.lxc.ssm.pojo.items;

public interface ItemsService {
//根据商品id查询商品信息
	public items findItemsById(Integer id) throws Exception;
	
	
//	查询商品列表
	public  List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
//	更新商品信息
	public void updateItemById(Integer id,ItemsCustom itemsCustom) throws Exception;
	
}
