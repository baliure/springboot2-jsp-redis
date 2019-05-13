package cn.baliure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.baliure.entity.SysUser;
import cn.baliure.persistence.mybatis.SysUserMapper;
import tk.mybatis.mapper.entity.Example;

@Controller
public class TestController {

	@Autowired
	SysUserMapper sysUserMapper;

	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@ResponseBody
	@GetMapping("u")
	public Object test(String name) {
		PageHelper.startPage(0, 5);
		Example example = new Example(SysUser.class);
		example.createCriteria().andCondition(" loginname LIKE CONCAT('%" + name + "%')");
		List list= sysUserMapper.selectByExample(example);
	    PageInfo<?> p = new PageInfo(list);
		return p;
	}
	
	@ResponseBody
	@RequestMapping("t")
	public Object t(String k,String v) {
		return stringRedisTemplate.opsForList().rightPush(k, v);
	}
	
	boolean p=true;
	@RequestMapping("p")
	public Object p() {
		p=!p;
	
		return p?"index":"hello";
	}
	
	
	
	
}
