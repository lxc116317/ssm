package com.lxc.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxc.ssm.controller.validation.ValidGroup1;
import com.lxc.ssm.pojo.ItemsCustom;
import com.lxc.ssm.pojo.ItemsQueryVo;
import com.lxc.ssm.pojo.items;
import com.lxc.ssm.service.ItemsService;

@Controller
public class ItemsController {

	@Resource
	public ItemsService itemsService;
	
	@RequestMapping("/items")
	public String findItems(HttpServletRequest requset,Model model) throws Exception {
		
		ItemsCustom itemsCustom=(ItemsCustom) itemsService.findItemsById(1);
		
		model.addAttribute("items", itemsCustom);
		
		
		return "showUser";
		
	}
	
//	获取商品列表
	@RequestMapping("/getItems")
	public String getItems(ItemsQueryVo itemsQueryVo,Model model) throws Exception {
		List<ItemsCustom> listItem=itemsService.findItemsList(itemsQueryVo);
		
		model.addAttribute("items",listItem );
		
		return "ItemsList";
		
	}
	
//	根据id修改商品
	@RequestMapping("/editItem")
	public String editItem(HttpServletRequest request,Integer id,Model model) throws Exception {
		
		
		ItemsCustom itemsCustom=(ItemsCustom) itemsService.findItemsById(id);
		
		model.addAttribute("items", itemsCustom);
		
//		request.setAttribute("itemsCustom", itemsCustom);
		
		return "/editItems";
		
	}
	
//	更新商品
/*
 *  @ModelAttribute可以指定pojo回显到页面在request中的key
 *  
 *  在需要校验的pojo前边添加@Validated，在需要校验的pojo后边添加BindingResult
	bindingResult接收校验出错信息
	注意：@Validated和BindingResult bindingResult是配对出现，并且形参顺序是固定的（一前一后）。
	value={ValidGroup1.class}指定使用ValidGroup1分组的 校验
 */
	@RequestMapping("/editItemsSubmit")
	public String editItemsSubmit(HttpServletRequest request,Integer id,
			Model model,
			@ModelAttribute("items")
			@Validated(value= {ValidGroup1.class}) ItemsCustom itemsCustom,BindingResult bindingResult
			) throws Exception {
		// 获取校验错误信息
				if (bindingResult.hasErrors()) {
					// 输出错误信息
					List<ObjectError> allErrors = bindingResult.getAllErrors();

					for (ObjectError objectError : allErrors) {
						// 输出错误信息
						System.out.println(objectError.getDefaultMessage());

					}
					// 将错误信息传到页面
					model.addAttribute("allErrors", allErrors);
					
					
					//可以直接使用model将提交pojo回显到页面
					model.addAttribute("editItems", itemsCustom);
					
					// 出错重新到商品修改页面
					return "editItems";
				}
		
		
		itemsService.updateItemById(id, itemsCustom);
		
		return "success";
		
		
		
		
	}
}
