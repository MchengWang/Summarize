package com.dao;

import com.entity.ShuifeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuifeiVO;
import com.entity.view.ShuifeiView;


/**
 * 水费
 * 
 * @author 
 * @email 
 * @date 2030-05-30 20:23:47
 */
public interface ShuifeiDao extends BaseMapper<ShuifeiEntity> {
	
	List<ShuifeiVO> selectListVO(@Param("ew") Wrapper<ShuifeiEntity> wrapper);
	
	ShuifeiVO selectVO(@Param("ew") Wrapper<ShuifeiEntity> wrapper);
	
	List<ShuifeiView> selectListView(@Param("ew") Wrapper<ShuifeiEntity> wrapper);

	List<ShuifeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuifeiEntity> wrapper);
	
	ShuifeiView selectView(@Param("ew") Wrapper<ShuifeiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShuifeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShuifeiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShuifeiEntity> wrapper);



}
