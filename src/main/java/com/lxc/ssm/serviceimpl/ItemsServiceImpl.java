package com.lxc.ssm.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxc.ssm.dao.ItemsMapper;
import com.lxc.ssm.pojo.ItemsCustom;
import com.lxc.ssm.pojo.ItemsQueryVo;
import com.lxc.ssm.pojo.items;
import com.lxc.ssm.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	public ItemsMapper itemsMapper;

	@Override
	public items findItemsById(Integer id) throws Exception {
		items items=itemsMapper.findItemsById(id);
		ItemsCustom itemsCustom=null;
		if(items!=null) {
			itemsCustom=new ItemsCustom();
//		将items的属性值copy到itemsCustom里
			BeanUtils.copyProperties(items, itemsCustom);
		}
		return itemsCustom;
	}

	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		List<ItemsCustom> list=itemsMapper.getItemsList(itemsQueryVo);
		
		return list;
	}

	@Override
	public void updateItemById(Integer id, ItemsCustom itemsCustom) throws Exception {
//	更新商品信息使用updateItemsByPrimaryKeyBlobs,根据id更新所有表中字段，包括大文本字段
//		updateItemsByPrimaryKeyBlobs要求必须转入id
		itemsCustom.setId(id);
		itemsMapper.updateItemsByPrimaryKeyBlobs(itemsCustom);
		
	}

	

}
