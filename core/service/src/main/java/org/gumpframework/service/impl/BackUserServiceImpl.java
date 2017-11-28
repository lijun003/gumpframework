package org.gumpframework.service.impl;

import org.gumpframework.domain.sys.BackUser;
import org.gumpframework.repository.BackUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.gumpframework.service.BackUserService;
import org.gumpframework.service.base.BaseService;
import org.springframework.stereotype.Service;


@Service
public class BackUserServiceImpl extends BaseService<BackUser> implements BackUserService {
    @Autowired
    private BackUserRepository backUserRepository;


}
