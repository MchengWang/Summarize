package com.entity.view;

import com.entity.CunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 地区信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-03-31 17:44:51
 */
@TableName("cunxinxi")
public class CunxinxiView  extends CunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CunxinxiView(){
	}
 
 	public CunxinxiView(CunxinxiEntity cunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, cunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
