package com.leimingtech.extend.module.payment.module.whchat.mobile.refund.service;

import java.util.Map;

import com.leimingtech.core.entity.WeiRefund;

public interface WechatMobileRefundService {
		//跳转到微信退款页
		public Map<String,Object> toRefund(WeiRefund weirefund);
		
}