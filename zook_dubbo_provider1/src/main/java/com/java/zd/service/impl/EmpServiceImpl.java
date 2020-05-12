package com.java.zd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.zd.model.EmpEntity;
import com.java.zd.service.EmpService;

/**
 * 
 * @author djin
 *    Emp业务层实现类
 * @date 2020-05-11 15:12:33
 */
@Service(version = "1.0.0")
@Transactional
public class EmpServiceImpl extends BaseServiceImpl<EmpEntity> implements EmpService {
	
}
