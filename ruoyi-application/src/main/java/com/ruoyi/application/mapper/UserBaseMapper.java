package com.ruoyi.application.mapper;

import com.ruoyi.application.domain.UserBase;
import java.util.List;	

/**
 * 用户基础 数据层
 * 
 * @author trc
 * @date 2019-01-12
 */
public interface UserBaseMapper 
{
	/**
     * 查询用户基础信息
     * 
     * @param userId 用户基础ID
     * @return 用户基础信息
     */
	public UserBase selectUserBaseById(Integer userId);
	
	/**
     * 查询用户基础列表
     * 
     * @param userBase 用户基础信息
     * @return 用户基础集合
     */
	public List<UserBase> selectUserBaseList(UserBase userBase);
	
	/**
     * 新增用户基础
     * 
     * @param userBase 用户基础信息
     * @return 结果
     */
	public int insertUserBase(UserBase userBase);
	
	/**
     * 修改用户基础
     * 
     * @param userBase 用户基础信息
     * @return 结果
     */
	public int updateUserBase(UserBase userBase);
	
	/**
     * 删除用户基础
     * 
     * @param userId 用户基础ID
     * @return 结果
     */
	public int deleteUserBaseById(Integer userId);
	
	/**
     * 批量删除用户基础
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserBaseByIds(String[] userIds);
	
}