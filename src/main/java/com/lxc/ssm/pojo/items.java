package com.lxc.ssm.pojo;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.lxc.ssm.controller.validation.ValidGroup1;



public class items {
	private Integer id;
	
	
	@Size(min=1,max=30,message="{items.name.length.error}",groups={ValidGroup1.class})
	private String name;
	private Integer price;
	 //非空校验
    @NotNull(message="{items.createTime.isNUll}")
	private String detail;
	private String pic;
	private Date createTime;
	@Override
	public String toString() {
		return "items [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", pic=" + pic
				+ ", createTime=" + createTime + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
