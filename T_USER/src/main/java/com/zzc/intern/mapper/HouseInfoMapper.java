package com.zzc.intern.mapper;

import com.zzc.intern.DTO.HouseInfoDTO;
import com.zzc.intern.entity.HouseInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * <p>
 * 宿舍信息 Mapper 接口
 * </p>
 *
 * @author administrator
 * @since 2020-09-15
 */
@Repository
public interface HouseInfoMapper extends BaseMapper<HouseInfo> {
	//查询
	public List<HouseInfo> findAll();
	//添加
	public Integer add(HouseInfo houseInfo);
	//修改
	public Integer update(HouseInfo houseInfo);
	//删除
	public Integer delete(Integer id);
	//id查询
	public HouseInfo findById(Integer id);
	//宿舍地址查询
	public List<HouseInfo> findHouseInfoByAddress(String hAddress);
	//根据id查询宿舍内容
	public List<HouseInfoDTO> findHousInfoById(Integer hId);
	//根据宿舍查实习生信息和考核
	public List<HouseInfoDTO> findAssessByAddress(String hAddress);
	//根据id查姓名
	public HouseInfo findNameById(Integer hId);
}
