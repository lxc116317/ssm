package com.lxc.ssm.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.lxc.ssm.pojo.ItemsCustom;
import com.lxc.ssm.pojo.ItemsQueryVo;
import com.lxc.ssm.pojo.items;

@Repository
public interface ItemsMapper {

//	根据id查找商品信息
	public items findItemsById(Integer id) throws Exception;
	
//	查询商品列表
	public List<ItemsCustom> getItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
//	更新商品信息
	public Integer updateItemsByPrimaryKeyBlobs(ItemsCustom itemsCustom) throws Exception;
	
}
