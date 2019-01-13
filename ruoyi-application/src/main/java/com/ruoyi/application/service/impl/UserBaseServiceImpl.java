package com.ruoyi.application.service.impl;

import java.util.List;

import com.ruoyi.application.domain.UserBase;
import com.ruoyi.application.mapper.UserBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.application.service.IUserBaseService;
import com.ruoyi.common.support.Convert;

/**
 * 用户基础 服务层实现
 * 
 * @author trc
 * @date 2019-01-11
 */
@Service
public class UserBaseServiceImpl implements IUserBaseService 
{
	@Autowired
	private UserBaseMapper userBaseMapper;

	/**
     * 查询用户基础信息
     * 
     * @param userId 用户基础ID
     * @return 用户基础信息
     */
    @Override
	public UserBase selectUserBaseById(Integer userId)
	{
	    return userBaseMapper.selectUserBaseById(userId);
	}
	
	/**
     * 查询用户基础列表
     * 
     * @param userBase 用户基础信息
     * @return 用户基础集合
     */
	@Override
	public List<UserBase> selectUserBaseList(UserBase userBase)
	{
	    return userBaseMapper.selectUserBaseList(userBase);
	}
	
    /**
     * 新增用户基础
     * 
     * @param userBase 用户基础信息
     * @return 结果
     */
	@Override
	public int insertUserBase(UserBase userBase)
	{
	    return userBaseMapper.insertUserBase(userBase);
	}
	
	/**
     * 修改用户基础
     * 
     * @param userBase 用户基础信息
     * @return 结果
     */
	@Override
	public int updateUserBase(UserBase userBase)
	{
	    return userBaseMapper.updateUserBase(userBase);
	}

	/**
     * 删除用户基础对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserBaseByIds(String ids)
	{
		return userBaseMapper.deleteUserBaseByIds(Convert.toStrArray(ids));
	}
	
}
