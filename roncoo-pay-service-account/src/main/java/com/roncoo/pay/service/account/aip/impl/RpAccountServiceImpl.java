/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.account.aip.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.service.account.api.RpAccountService;
import com.roncoo.pay.service.account.dao.RpAccountDao;
import com.roncoo.pay.service.account.entity.RpAccount;

/**
 * @类功能说明： 账户service实现类
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
@Service("rpAccountService")
public class RpAccountServiceImpl implements RpAccountService{

	@Autowired
	private RpAccountDao rpAccountDao;
	
	@Override
	public void saveData(RpAccount rpAccount) {
		rpAccountDao.insert(rpAccount);
	}

	@Override
	public void updateData(RpAccount rpAccount) {
		rpAccountDao.update(rpAccount);
	}

	@Override
	public RpAccount getDataById(String id) {
		return rpAccountDao.getById(id);
	}

	@Override
	public PageBean listPage(PageParam pageParam, RpAccount rpAccount) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("accountNo", rpAccount.getAccountNo());
		return rpAccountDao.listPage(pageParam, paramMap);
	}
}