package com.dyd.model;


public interface IfsConstant {
	/**
	 * http的header中的content-type属性的内容
	 */
	public final String CONTENT_TYPE_UTF_8 = "application/json; charset=UTF-8";

	// 通讯返回的状态 key
	public final String _CODE = "code";
	
	// 通讯返回的状态 key
	public final String _FLAG = "flag";

	// 通讯返回的消息 key
	public final String _MSG = "msg";

	// 通讯返回的数据集 key
	public final String _RESULT = "result";

	// 通讯数据集 key
	public final String _DATA = "data";

	// 通讯返回的数据集 key
	public final String _SIGNATURE = "signature";
		
	public String MALL_IFS_SERVICE_SIGNKEY = "mall_ifs_service_signkey";

	/**
	 * 获取不到接口地址，返回编码（用户接口做特殊处理，比如查询自己数据库）
	 */
	public String NO_IFS_URL_CODE="2";
	
	// 接口服务编码
	public enum IfsCode {
		// 小猫接口
		MallMonthCardPayment("monthCardPayment", "小猫月卡缴费"), MallCancelCard("cancelCard","小猫月卡注销"), MallMonthCardStop(
				"monthCardStop", "小猫月卡报停"), MallLockCar("lockCar", "小猫锁车"), MallSearchCar("searchCar", "小猫查询车所在位置"), MallParkingSpaceNum(
				"parkingSpaceNum", "获取小猫停车位数量");

		private String code;
		private String desc;

		private IfsCode(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}

		public String getDesc() {
			return desc;
		}

		public String getCode() {
			return code;
		}
		
		public static final IfsCode getIfsCode(String code) {
	        if (code == null)
	            return null;
	        
	        if("monthCardPayment".equals(code)){
	        	return IfsCode.MallMonthCardPayment;
	        }else if("cancelCard".equals(code)){
	        	return IfsCode.MallCancelCard;
	        }else if("monthCardStop".equals(code)){
	        	return IfsCode.MallMonthCardStop;
	        }else if("lockCar".equals(code)){
	        	return IfsCode.MallLockCar;
	        }else if("searchCar".equals(code)){
	        	return IfsCode.MallSearchCar;
	        }else if("parkingSpaceNum".equals(code)){
	        	return IfsCode.MallParkingSpaceNum;
	        }else{
	        	return null;
	        }
		}
	}

	/**
	 * 第三方接口通信，防止用户信息泄漏使用固定值传输
	 */
	public String THREAD_CONST_USERNAME="UHOME";
	
	/**
	 * 第三方接口通信，防止用户信息泄漏使用固定值传输
	 */
	public String THREAD_CONST_TEL="13900000000";
	
	/**
	 * 优家园，与第三方接口服务默认编码
	 */
	public String UHOME_CHANEL="uhome001";
	/**
	 * 第三方接口，小猫服务编码
	 */
	public String THREAD_MALL_CHANEL="small001";


	/**
	 * 接口日志表状态 是否成功：0失败，1成功
	 */
	public Integer INTERFACE_SERVICE_LOG_STATUS_FAIL=0;
	public Integer INTERFACE_SERVICE_LOG_STATUS_SUCCESS=1;

	/**
	 * 接口日志表最多调用次数
	 */
	public Integer INTERFACE_SERVICE_LOG_MAX_CALL_COUNT = 3;

	/**
	 * 接口调用渠道 1: app 2:web
	 */
	Integer INTERFACE_SOURCE_CHANNEL_APP = 1;
}
