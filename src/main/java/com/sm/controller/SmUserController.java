package com.sm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sm.entity.SmUserDto;
import com.sm.returndata.ApiResult;
import com.sm.service.SmUserService;
import com.sm.utils.CommonUtil;

@Controller
@RequestMapping("/user")
public class SmUserController {

	@Autowired
	private SmUserService smUserService;

	@RequestMapping("/selectByPrimaryKey")
	@ResponseBody
	public Object selectByPrimaryKey(Integer id) {
		ApiResult<SmUserDto> result = new ApiResult<>();
		try {
			SmUserDto smUserDto = smUserService.selectByPrimaryKey(id);
			result.setData(smUserDto);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
		}
		return result;
	}
	
	@RequestMapping("/saveSmUser")
	@ResponseBody
	public Object saveSmUser(@RequestBody SmUserDto smUserDto) {
		ApiResult<Integer> result = new ApiResult<>();
		try {
			smUserDto.setPassword(CommonUtil.encoderByMd5(smUserDto.getPassword()));
			smUserService.insertSmUser(smUserDto);
			result.setData(smUserDto.getId());
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
		}
		return result;
	}
	
	@RequestMapping("/updateByPrimaryKey")
	@ResponseBody
	public Object updateByPrimaryKey(@RequestBody SmUserDto smUserDto){
		ApiResult<Integer> result = new ApiResult<>();
		try {
			smUserDto.setPassword(CommonUtil.encoderByMd5(smUserDto.getPassword()));
			int data = smUserService.updateByPrimaryKeySelective(smUserDto);
			result.setData(data);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
		}
		return result;
	}
	
	@RequestMapping("/deleteByPrimaryKey")
	@ResponseBody
	public Object deleteByPrimaryKey(Integer id) {
		ApiResult<Integer> result = new ApiResult<>();
		try {
			int data = smUserService.deleteByPrimaryKey(id);
			result.setData(data);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
		}
		return result;
	}
	
	@RequestMapping("/queryUserListByExample")
	@ResponseBody
	public Object queryPostListByExample(@RequestBody SmUserDto smUserDto,HttpServletRequest request) {
		ApiResult<PageInfo<SmUserDto>> result = new ApiResult<>();
		try {
			PageInfo<SmUserDto> data = smUserService.selectByExample(smUserDto);
			result.setData(data);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
		}
		return result;
	}

}
