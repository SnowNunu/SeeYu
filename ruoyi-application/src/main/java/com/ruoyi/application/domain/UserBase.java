package com.ruoyi.application.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 用户基础表 app_user_base
 * 
 * @author trc
 * @date 2019-01-12
 */
public class UserBase extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer userId;
	/** 用户名 */
	private String userName;
	/** 密码 */
	private String userPassword;
	/** 年龄 */
	private String userAge;
	/** 性别 */
	private String userGender;
	/** 职业 */
	private String userProfession;
	/** 收入 */
	private String userIncome;
	/** 身高 */
	private String userHeight;
	/** 结婚状态 */
	private String userMarry;
	/** 特长 */
	private String userSpecialty;
	/** 用户等级 */
	private Integer userLevel;
	/** 用户qq */
	private String userQq;
	/** 用户微信 */
	private String userWechat;
	/** 用户城市地址 */
	private String userAddress;
	/** 用户签名 */
	private String userSignature;
	/** 播币 */
	private Double userCoin;
	/** 钻石 */
	private Double userDiamond;
	/** 用户幸福值 */
	private Double userHappinessValue;
	/** 注册时间 */
	private Date userRegisterTime;
	/** 注册ip */
	private String userRegisterIp;
	/** 用户渠道 */
	private String userChannelid;
	/** 用户是否为vip 0 不是 1 是 2 终身会员 */
	private Integer userVipStatus;
	/** 到期时间 */
	private Date userVipExpiresAt;
	/** 头像 */
	private String userHeadImg;
	/** token */
	private String userToken;
	/** 学历 */
	private String userEdu;
	/** 生日 */
	private String userBirthday;
	/** 体重 */
	private String userWeight;
	/** 星座 */
	private String userConstellation;

	public void setUserId(Integer userId) 
	{
		this.userId = userId;
	}

	public Integer getUserId() 
	{
		return userId;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getUserName() 
	{
		return userName;
	}
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}

	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserAge(String userAge) 
	{
		this.userAge = userAge;
	}

	public String getUserAge() 
	{
		return userAge;
	}
	public void setUserGender(String userGender) 
	{
		this.userGender = userGender;
	}

	public String getUserGender() 
	{
		return userGender;
	}
	public void setUserProfession(String userProfession) 
	{
		this.userProfession = userProfession;
	}

	public String getUserProfession() 
	{
		return userProfession;
	}
	public void setUserIncome(String userIncome) 
	{
		this.userIncome = userIncome;
	}

	public String getUserIncome() 
	{
		return userIncome;
	}
	public void setUserHeight(String userHeight) 
	{
		this.userHeight = userHeight;
	}

	public String getUserHeight() 
	{
		return userHeight;
	}
	public void setUserMarry(String userMarry) 
	{
		this.userMarry = userMarry;
	}

	public String getUserMarry() 
	{
		return userMarry;
	}
	public void setUserSpecialty(String userSpecialty) 
	{
		this.userSpecialty = userSpecialty;
	}

	public String getUserSpecialty() 
	{
		return userSpecialty;
	}
	public void setUserLevel(Integer userLevel) 
	{
		this.userLevel = userLevel;
	}

	public Integer getUserLevel() 
	{
		return userLevel;
	}
	public void setUserQq(String userQq) 
	{
		this.userQq = userQq;
	}

	public String getUserQq() 
	{
		return userQq;
	}
	public void setUserWechat(String userWechat) 
	{
		this.userWechat = userWechat;
	}

	public String getUserWechat() 
	{
		return userWechat;
	}
	public void setUserAddress(String userAddress) 
	{
		this.userAddress = userAddress;
	}

	public String getUserAddress() 
	{
		return userAddress;
	}
	public void setUserSignature(String userSignature) 
	{
		this.userSignature = userSignature;
	}

	public String getUserSignature() 
	{
		return userSignature;
	}
	public void setUserCoin(Double userCoin) 
	{
		this.userCoin = userCoin;
	}

	public Double getUserCoin() 
	{
		return userCoin;
	}
	public void setUserDiamond(Double userDiamond) 
	{
		this.userDiamond = userDiamond;
	}

	public Double getUserDiamond() 
	{
		return userDiamond;
	}
	public void setUserHappinessValue(Double userHappinessValue) 
	{
		this.userHappinessValue = userHappinessValue;
	}

	public Double getUserHappinessValue() 
	{
		return userHappinessValue;
	}
	public void setUserRegisterTime(Date userRegisterTime) 
	{
		this.userRegisterTime = userRegisterTime;
	}

	public Date getUserRegisterTime() 
	{
		return userRegisterTime;
	}
	public void setUserRegisterIp(String userRegisterIp) 
	{
		this.userRegisterIp = userRegisterIp;
	}

	public String getUserRegisterIp() 
	{
		return userRegisterIp;
	}
	public void setUserChannelid(String userChannelid) 
	{
		this.userChannelid = userChannelid;
	}

	public String getUserChannelid() 
	{
		return userChannelid;
	}
	public void setUserVipStatus(Integer userVipStatus) 
	{
		this.userVipStatus = userVipStatus;
	}

	public Integer getUserVipStatus() 
	{
		return userVipStatus;
	}
	public void setUserVipExpiresAt(Date userVipExpiresAt) 
	{
		this.userVipExpiresAt = userVipExpiresAt;
	}

	public Date getUserVipExpiresAt() 
	{
		return userVipExpiresAt;
	}
	public void setUserHeadImg(String userHeadImg) 
	{
		this.userHeadImg = userHeadImg;
	}

	public String getUserHeadImg() 
	{
		return userHeadImg;
	}
	public void setUserToken(String userToken) 
	{
		this.userToken = userToken;
	}

	public String getUserToken() 
	{
		return userToken;
	}
	public void setUserEdu(String userEdu) 
	{
		this.userEdu = userEdu;
	}

	public String getUserEdu() 
	{
		return userEdu;
	}
	public void setUserBirthday(String userBirthday) 
	{
		this.userBirthday = userBirthday;
	}

	public String getUserBirthday() 
	{
		return userBirthday;
	}
	public void setUserWeight(String userWeight) 
	{
		this.userWeight = userWeight;
	}

	public String getUserWeight() 
	{
		return userWeight;
	}
	public void setUserConstellation(String userConstellation) 
	{
		this.userConstellation = userConstellation;
	}

	public String getUserConstellation() 
	{
		return userConstellation;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("userPassword", getUserPassword())
            .append("userAge", getUserAge())
            .append("userGender", getUserGender())
            .append("userProfession", getUserProfession())
            .append("userIncome", getUserIncome())
            .append("userHeight", getUserHeight())
            .append("userMarry", getUserMarry())
            .append("userSpecialty", getUserSpecialty())
            .append("userLevel", getUserLevel())
            .append("userQq", getUserQq())
            .append("userWechat", getUserWechat())
            .append("userAddress", getUserAddress())
            .append("userSignature", getUserSignature())
            .append("userCoin", getUserCoin())
            .append("userDiamond", getUserDiamond())
            .append("userHappinessValue", getUserHappinessValue())
            .append("userRegisterTime", getUserRegisterTime())
            .append("userRegisterIp", getUserRegisterIp())
            .append("userChannelid", getUserChannelid())
            .append("userVipStatus", getUserVipStatus())
            .append("userVipExpiresAt", getUserVipExpiresAt())
            .append("userHeadImg", getUserHeadImg())
            .append("userToken", getUserToken())
            .append("userEdu", getUserEdu())
            .append("userBirthday", getUserBirthday())
            .append("userWeight", getUserWeight())
            .append("userConstellation", getUserConstellation())
            .toString();
    }
}
