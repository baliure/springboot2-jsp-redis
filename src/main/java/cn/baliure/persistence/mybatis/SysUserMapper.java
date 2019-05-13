package cn.baliure.persistence.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.baliure.entity.SysUser;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserMapper extends Mapper<SysUser>{

	@Select("SELECT * from sys_user where loginname LIKE CONCAT('%',#{name},'%')")
	List<SysUser> selectByLoginname(@Param("name")String name);
}
