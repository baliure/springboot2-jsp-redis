package cn.baliure.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import cn.baliure.service.BaseService;

@Component
@Aspect
public class SysUserAspect extends BaseService implements InitializingBean{


	@AfterReturning(value="execution(* cn.baliure.persistence.mybatis.SysUserMapper.* (..))", returning="rtv")
	public void afterMethod(JoinPoint joinPoint, Object rtv) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		String methodName = methodSignature.getMethod().getName();
		if(methodName.startsWith("insert") ){
			
		}else if (methodName.startsWith("select") ) {
			System.out.print("SysUserMapper select 的参数:");
			for (Object obj : joinPoint.getArgs()) {
				System.out.print("	"+obj);
			}
			System.out.println();
		}
	}
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化SysUserMapper类成功");
	}

}
