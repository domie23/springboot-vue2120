package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商品
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shangpin")
public class ShangpinView extends ShangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 商品类型的值
	*/
	@ColumnInfo(comment="商品类型的字典表值",type="varchar(200)")
	private String shangpinValue;
	/**
	* 推荐的值
	*/
	@ColumnInfo(comment="推荐的字典表值",type="varchar(200)")
	private String tuijianValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;

	//级联表 商家
		/**
		* 商家名称
		*/

		@ColumnInfo(comment="商家名称",type="varchar(200)")
		private String shangjiaName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String shangjiaPhone;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String shangjiaEmail;
		/**
		* 营业执照展示
		*/

		@ColumnInfo(comment="营业执照展示",type="varchar(200)")
		private String shangjiaPhoto;
		/**
		* 店铺位置
		*/

		@ColumnInfo(comment="店铺位置",type="varchar(200)")
		private String shangjiaAddress;
		/**
		* 区域
		*/
		@ColumnInfo(comment="区域",type="int(11)")
		private Integer quyuTypes;
			/**
			* 区域的值
			*/
			@ColumnInfo(comment="区域的字典表值",type="varchar(200)")
			private String quyuValue;
		/**
		* 商家信用类型
		*/
		@ColumnInfo(comment="商家信用类型",type="int(11)")
		private Integer shangjiaXingjiTypes;
			/**
			* 商家信用类型的值
			*/
			@ColumnInfo(comment="商家信用类型的字典表值",type="varchar(200)")
			private String shangjiaXingjiValue;
		/**
		* 现有余额
		*/
		@ColumnInfo(comment="现有余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 商家介绍
		*/

		@ColumnInfo(comment="商家介绍",type="longtext")
		private String shangjiaContent;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;
		/**
		* 申请状态
		*/
		@ColumnInfo(comment="申请状态",type="int(11)")
		private Integer shangjiaYesnoTypes;
			/**
			* 申请状态的值
			*/
			@ColumnInfo(comment="申请状态的字典表值",type="varchar(200)")
			private String shangjiaYesnoValue;
		/**
		* 审核意见
		*/

		@ColumnInfo(comment="审核意见",type="longtext")
		private String shangjiaYesnoText;
		/**
		* 审核时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="审核时间",type="timestamp")
		private Date shangjiaShenheTime;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer shangjiaDelete;



	public ShangpinView() {

	}

	public ShangpinView(ShangpinEntity shangpinEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 商品类型的值
	*/
	public String getShangpinValue() {
		return shangpinValue;
	}
	/**
	* 设置： 商品类型的值
	*/
	public void setShangpinValue(String shangpinValue) {
		this.shangpinValue = shangpinValue;
	}
	//当前表的
	/**
	* 获取： 推荐的值
	*/
	public String getTuijianValue() {
		return tuijianValue;
	}
	/**
	* 设置： 推荐的值
	*/
	public void setTuijianValue(String tuijianValue) {
		this.tuijianValue = tuijianValue;
	}
	//当前表的
	/**
	* 获取： 是否上架的值
	*/
	public String getShangxiaValue() {
		return shangxiaValue;
	}
	/**
	* 设置： 是否上架的值
	*/
	public void setShangxiaValue(String shangxiaValue) {
		this.shangxiaValue = shangxiaValue;
	}


	//级联表的get和set 商家

		/**
		* 获取： 商家名称
		*/
		public String getShangjiaName() {
			return shangjiaName;
		}
		/**
		* 设置： 商家名称
		*/
		public void setShangjiaName(String shangjiaName) {
			this.shangjiaName = shangjiaName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getShangjiaPhone() {
			return shangjiaPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setShangjiaPhone(String shangjiaPhone) {
			this.shangjiaPhone = shangjiaPhone;
		}

		/**
		* 获取： 邮箱
		*/
		public String getShangjiaEmail() {
			return shangjiaEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setShangjiaEmail(String shangjiaEmail) {
			this.shangjiaEmail = shangjiaEmail;
		}

		/**
		* 获取： 营业执照展示
		*/
		public String getShangjiaPhoto() {
			return shangjiaPhoto;
		}
		/**
		* 设置： 营业执照展示
		*/
		public void setShangjiaPhoto(String shangjiaPhoto) {
			this.shangjiaPhoto = shangjiaPhoto;
		}

		/**
		* 获取： 店铺位置
		*/
		public String getShangjiaAddress() {
			return shangjiaAddress;
		}
		/**
		* 设置： 店铺位置
		*/
		public void setShangjiaAddress(String shangjiaAddress) {
			this.shangjiaAddress = shangjiaAddress;
		}
		/**
		* 获取： 区域
		*/
		public Integer getQuyuTypes() {
			return quyuTypes;
		}
		/**
		* 设置： 区域
		*/
		public void setQuyuTypes(Integer quyuTypes) {
			this.quyuTypes = quyuTypes;
		}


			/**
			* 获取： 区域的值
			*/
			public String getQuyuValue() {
				return quyuValue;
			}
			/**
			* 设置： 区域的值
			*/
			public void setQuyuValue(String quyuValue) {
				this.quyuValue = quyuValue;
			}
		/**
		* 获取： 商家信用类型
		*/
		public Integer getShangjiaXingjiTypes() {
			return shangjiaXingjiTypes;
		}
		/**
		* 设置： 商家信用类型
		*/
		public void setShangjiaXingjiTypes(Integer shangjiaXingjiTypes) {
			this.shangjiaXingjiTypes = shangjiaXingjiTypes;
		}


			/**
			* 获取： 商家信用类型的值
			*/
			public String getShangjiaXingjiValue() {
				return shangjiaXingjiValue;
			}
			/**
			* 设置： 商家信用类型的值
			*/
			public void setShangjiaXingjiValue(String shangjiaXingjiValue) {
				this.shangjiaXingjiValue = shangjiaXingjiValue;
			}

		/**
		* 获取： 现有余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 现有余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 商家介绍
		*/
		public String getShangjiaContent() {
			return shangjiaContent;
		}
		/**
		* 设置： 商家介绍
		*/
		public void setShangjiaContent(String shangjiaContent) {
			this.shangjiaContent = shangjiaContent;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}
		/**
		* 获取： 申请状态
		*/
		public Integer getShangjiaYesnoTypes() {
			return shangjiaYesnoTypes;
		}
		/**
		* 设置： 申请状态
		*/
		public void setShangjiaYesnoTypes(Integer shangjiaYesnoTypes) {
			this.shangjiaYesnoTypes = shangjiaYesnoTypes;
		}


			/**
			* 获取： 申请状态的值
			*/
			public String getShangjiaYesnoValue() {
				return shangjiaYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setShangjiaYesnoValue(String shangjiaYesnoValue) {
				this.shangjiaYesnoValue = shangjiaYesnoValue;
			}

		/**
		* 获取： 审核意见
		*/
		public String getShangjiaYesnoText() {
			return shangjiaYesnoText;
		}
		/**
		* 设置： 审核意见
		*/
		public void setShangjiaYesnoText(String shangjiaYesnoText) {
			this.shangjiaYesnoText = shangjiaYesnoText;
		}

		/**
		* 获取： 审核时间
		*/
		public Date getShangjiaShenheTime() {
			return shangjiaShenheTime;
		}
		/**
		* 设置： 审核时间
		*/
		public void setShangjiaShenheTime(Date shangjiaShenheTime) {
			this.shangjiaShenheTime = shangjiaShenheTime;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getShangjiaDelete() {
			return shangjiaDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setShangjiaDelete(Integer shangjiaDelete) {
			this.shangjiaDelete = shangjiaDelete;
		}


	@Override
	public String toString() {
		return "ShangpinView{" +
			", shangpinValue=" + shangpinValue +
			", tuijianValue=" + tuijianValue +
			", shangxiaValue=" + shangxiaValue +
			", shangjiaName=" + shangjiaName +
			", shangjiaPhone=" + shangjiaPhone +
			", shangjiaEmail=" + shangjiaEmail +
			", shangjiaPhoto=" + shangjiaPhoto +
			", shangjiaAddress=" + shangjiaAddress +
			", newMoney=" + newMoney +
			", shangjiaContent=" + shangjiaContent +
			", shangjiaYesnoText=" + shangjiaYesnoText +
			", shangjiaShenheTime=" + DateUtil.convertString(shangjiaShenheTime,"yyyy-MM-dd") +
			", shangjiaDelete=" + shangjiaDelete +
			"} " + super.toString();
	}
}
