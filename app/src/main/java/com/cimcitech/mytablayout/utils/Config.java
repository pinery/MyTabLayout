package com.cimcitech.mytablayout.utils;

import android.content.Context;

/**
 * Created by cimcitech on 2017/7/9.
 */

public class Config {

    public static Context CONTEXT;
    public static String KEY_LOGIN_AUTO = "key_login_auto"; //保存登录账号和密码
    public static String KEY_INVOICE_AUTO = "key_invoice_auto";//保存开发票后的信息，第二次开发票直接填
    public static boolean isLogin = false;
    public static boolean isInsterOrder = false; //ParkDetailActivity //判断是否有下单成功，下单成功则返回刷新园区车辆列表
    public static boolean isUpdateUserinfo = false; //DriverActivity //是否有增删查改用户信息，有则更新
    public static boolean isInvoiceOrder = false;  //InvoiceNextActivity //是否有开发票成功 成功返回订单列表刷新
    public static boolean isUpdateOrder = false; //OrderActivity //是否对订单做了操作，有则返回刷新订单列表，则反之
    public static boolean isShowHome = false; //MainActivity //是否显示home页面

    public static final String WAITING_FOR_1ST_APPROVE = "OS03";//待一级审批

    public static final String WAITING_FOR_2ED_APPROVE = "OS04";//一级审批已完成，待二级审批

    public static final String PASSED = "OS05";//审批通过，待提车

    public static final String EXECUTING = "OS06";//订单正在执行

    public static final String COMPLETE = "OS07";//订单已完成

    public static final String REJECTED_IN_1ST_LEVEL = "OS01";//一级审批驳回

    public static final String REJECTED_IN_2ED_LEVEL = "OS02";//二级审批驳回

    public static final String CANCELED = "OS00";//订单被撤销

    public static final String ENTERPRISE_ID = "0000000000000002"; //企业组

    public static final String DRIVER_ID = "0000000000000003"; //驾驶员

    public static final String FRONTGROUNDADMIN_ID = "0000000000000004"; //现场管理员

    public static final String OBSERVER_ID = "0000000000000001"; //观察员

    public static final String IP = "http://120.77.244.255:28080/"; //IP

    //public static final String IP = "http://10.47.34.88:8080/"; //IP
    //public static final String IP = "http://10.47.34.115:8080/"; //IP

    public static final String login = IP + "shareLift/user/login"; //登录

    public static final String getAuthCode = IP + "shareLift/user/getAuthCode";//获取短信验证码

    public static final String registered = IP + "shareLift/user/register";//注册

    public static final String getUserDetail = IP + "shareLift/user/getUserDetail";//查询用户详细信息

    public static final String selectPark = IP + "shareLift/location/selectPark";//查询城市园区

    public static final String selectParkLift = IP + "shareLift/lift/getModelsInLocation";//查看园区内的所有叉车

    public static final String orderInsert = IP + "shareLift/order/insert";//生成订单

    public static final String authcodecheck = IP + "shareLift/user/authcodecheck";//短信验证码验证

    public static final String orderdetail = IP + "shareLift/order/orderdetail";//订单详情

    public static final String photoUpload = IP + "shareLift/photo/upload";//提车上传图片

    public static final String uploaddriverlicense = IP + "shareLift/photo/uploaddriverlicense";//上传驾照图片

    public static final String uploadlicense = IP + "shareLift/photo/uploadlicense";//上传营业执照图片

    public static final String selectCitis = IP + "shareLift/location/selectCitis"; //查询所有城市

    public static final String delivery = IP + "shareLift/forklift/pickup";//提车

    public static final String firststageapproval = IP + "shareLift/order/firstapproval";//审批订单

    public static final String getLiftList = IP + "shareLift/lift/getLiftList";//条件查询叉车列表

    public static final String forkliftReturn = IP + "shareLift/forklift/return"; //还车

    public static final String requestreturn = IP + "shareLift/forklift/requestreturn"; //申请还车

    public static final String orderlist = IP + "shareLift/order/orderlist";//订单列表查询For App

    public static final String firstrejection = IP + "shareLift/order/firstrejection";//一级审批拒绝

    public static final String cancelOrder = IP + "shareLift/order/cancel";//取消订单

    public static final String userMoneyDetail = IP + "shareLift/wallet/detail/"; //账户详情

    public static final String invoiceList = IP + "shareLift/invoice/list";//发票查询

    public static final String orderforinvoice = IP + "/shareLift/order/orderforinvoice";//未开发票的订单查询

    public static final String UserList = IP + "shareLift/user/userList"; //企业子账户查询(For APP)

    public static final String userApprove = IP + "shareLift/user/approve"; //驳回申请(账户通常不删除，仅使之失效即可)

    public static final String addriver = IP + "shareLift/user/addriver"; //添加企业账号

    public static final String updateUserDetail = IP + "shareLift/user/updateUserDetail"; //更新用户信息

    public static final String invoiceApplication = IP + "shareLift/invoice/application";//提交发票申请

    public static final String walletHistory = IP + "shareLift/wallet/history";//消费历史记录
}
