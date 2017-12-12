package shenzhen.teamway.tms9000.portal.util;


/**
 * 常量类
 * @author alan
 *
 */
public class ConstantUtils {

	
	public static final Integer  ROLE_STATUS_1 = 1 ;  //角色状态 1 正常 
	public static final Integer ROLE_STATUS_2 = 2;   //2 禁用
	
	/*
	 * 门店用户类型
	 */
	public static final String STORE_USER_TYPE_0= "0";   //系统
	public static final String STORE_USER_TYPE_1 = "1";   //商户
	public static final String STORE_USER_TYPE_2= "2";   //门店
	
	public static final String SESSION_USER_="session_user";
	
	
	public static final int CASH_STATUS_BANK = 1; // 已提交银行
	public static final int CASH_STATUS_NOTBANK =2 ;//发送银行失败 
	public static final int CASH_STATUS_OVER=3 ; // 已完成
	
	//额度申请附件类型
	public static final Integer LINES_FILE= 1001;   
	
	//额度申请状态
	public static final String LINES_STATUS_APPLY= "1";   //审批中
	public static final String LINES_STATUS_THROUGH= "2";   //通过
	public static final String LINES_STATUS_REJECT= "3";   //驳回

	public static final Integer MENU_STATUS_NORMAL= 1;  //正常
	public static final Integer MENU_STATUS_CANCLE = 2;  //禁用
	public static final String PAY_TYPE_NEI="01"; //内部转账
	public static final String PAY_TYPE_KUA="05"; //跨行转账
	public static final String BANK_BUSI_CODE_SUCCESS_E="AAAAAAE";  //银行成功返回码
	public static final String BANK_BUSI_CODE_SUCCESS_A="AAAAAAA";////银行成功返回码
	public static final String BANK_BUSI_CODE_SUCCESS_C="AAAAAAC";////排队等待处理
	
	public static final int SHOP_STATUS_SAVED=1; //已保存 
	public static final int SHOP_STATUS_APPLYED=2;//已申请
	public static final int SHOP_STATUS_NOT_PASS=3;//审核未通过
	public static final int SHOP_STATUS_PASS=4; //审核已通过
	public static final int SHOP_STATUS_DISABLE=5; //审核已通过
	

	public static final int MERCHANT_STATUS_NORMAL=1;  //正常
	public static final int MERCHANT_STATUS_DISABLE=2; //禁用
	
	public static final String POS_KSY = "QY";  //正常
	public static final String POS_JY="JY-ALL";  // 禁用
	public static final String POS_JY_CZ="JY-CZ"; //禁用充值
	public static final String POS_JY_XF="JY-XF"; //禁用消费
	
	
	public static final String BUSI_TYPE_CZ="801110";
	public static final String BUSI_TYPE_CZ_SWP="801121";
	public static final String BUSI_TYPE_XF="803710";
	public static final String BUSI_TYPE_VALI="800010";
	

	public static final String USER_PASSWORD= "123456";

	// 机具流程类型（与字典相同）
	public static final int POS_PROCESS_LX_XZJJ = 1;  // 新增机具
	public static final int POS_PROCESS_LX_JJBG = 2;  // 机具变更
	public static final int POS_PROCESS_LX_GHJJ = 3;  // 更换机具
	public static final int POS_PROCESS_LX_THJJ = 4;  // 退还机具
	
	// 机具流程审批状态（与字典相同）
	public static final String POS_PROCESS_SPZT_YSQ = "1";  // 已申请
	public static final String POS_PROCESS_SPZT_YSH = "2";  // 已审核
	public static final String POS_PROCESS_SPZT_BH  = "3";  // 驳回请求
	public static final String POS_PROCESS_SPZT_YSQ_WFP = "9";  // 已审核，未分配机具
	
	//入库类型
	public static final String POS_STORAGE_TYPE_XZRK = "XZRK";  // 新增入库
	public static final String POS_STORAGE_TYPE_GHRK = "GHRK";  // 更换入库
	public static final String POS_STORAGE_TYPE_THRK = "THRK";  // 退还入库
	
	// 机具业务状态（字段business_state）
	public static final String POS_BUSINESS_STATE_QY = "QY";  // 启用
	public static final String POS_BUSINESS_STATE_JY_ALL = "JY-ALL";  // 禁用
	public static final String POS_BUSINESS_STATE_JY_CZ = "JY-CZ";  // 禁用-充值
	public static final String POS_BUSINESS_STATE_JY_XF = "JY-XF";  // 禁用-消费
	// 机具状态（字段state）
	public static final String POS_STATE_YTY = "YTY";  // 已停用
	// 一下是机具正常的状态
	public static final String POS_STATE_WSY = "WSY";  // 未使用
	public static final String POS_STATE_YSY = "YSY";  // 已使用
	public static final String POS_STATE_YSY_THJJ = "YSY-THJJ";  // 已使用-退还机具
	public static final String POS_STATE_YSY_XZJJ = "YSY-XZJJ";  // 已使用-新增机具
	public static final String POS_STATE_YSY_GHJJ = "YSY-GHJJ";  // 已使用-更换机具
	public static final String POS_STATE_YSY_BGJJ = "YSY-BGJJ";  // 已使用-变更机具
	public static final String POS_STATE_KSY = "KSY";  // 可使用
	public static final int TRADE_TYPE_RZ = 1 ; //入账
	public static final int TRADE_TYPE_TX=3; //提现
	
	public static final int TRADE_STATUS_CREATE = 0; //待发送银行
	public static final int TRADE_STATUS_WATING=1;//等待银行
	public static final int TRADE_STATUS_SUCCESS=2; //成功
	public static final int TRADE_STATUS_FAIL=3;//失败
	
	//字典默认根节点
	public static final String DICTREE_DEFAULT_NODE="10000000028"; //字典默认根节点ID
	
	//代理商角色
	public static final int AGENT_ROLE_SYS=1; //代理商管理员默认角色ID
	
	
	public static final String OPERATOR_DEFAULT_PASSWORD="123456";
	
	
	public static final String NOT_SUCCESS_ORDER_SEND_MSG_DAY="NOT_SUCCESS_ORDER_SEND_MSG_DAY";
	
	public static final String NOT_SUCCESS_ORDER_SEND_MSG_DAY_DEFAULT_VALUE="3";
	
	public static final String QUOTA_OBJ_TYPE_MERCHANT ="01";
	public static final String QUOTA_OBJ_TYPE_SHOP ="02";
	public static final String QUOTA_OBJ_TYPE_MACHINE ="03";
	
	//门店、商户类型对应相应角色ID
	public static final Integer SYS_ROLE= 1;   //系统管理员角色
	public static final Integer MERCHANT_ROLE= 47;   //商户管理员角色
	public static final Integer STORE_ROLL= 31;   //门店用户角色
}
