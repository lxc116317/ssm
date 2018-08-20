package com.lxc.ssm.pojo;

public class orderdetail {

	
	private Integer id;
	private Integer ordersId;
	private Integer itemsId;
	private Integer itemNum;
	@Override
	public String toString() {
		return "orderdetail [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemNum=" + itemNum
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}
	public Integer getItemsId() {
		return itemsId;
	}
	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}
	public Integer getItemNum() {
		return itemNum;
	}
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	
	
	
}
