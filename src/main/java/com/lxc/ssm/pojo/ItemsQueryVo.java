package com.lxc.ssm.pojo;

//商品信息的包装类,种类繁杂
public class ItemsQueryVo {
	
	private items items;
	
	private ItemsCustom itemsCustom;

	public items getItems() {
		return items;
	}

	public void setItems(items items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
	
	
}
