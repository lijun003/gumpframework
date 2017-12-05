package org.gumpframework.service.impl;

import org.gumpframework.domain.sys.BackUser;
import org.gumpframework.service.BackUserService;
import org.gumpframework.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class BackUserServiceImpl extends BaseService<BackUser> implements BackUserService {
//    @Autowired
//    private BackUserRepository backUserRepository;

    @Override
    public List<Map<String,Object>> login(String name,String password){
        String sql = " SELECT a.name_ AS name,a.password_ AS password,a.id_ AS id from sys_user_t a where a.name_=:p1 and a.password_=:p2 ";
        return baseRepository.getListBySQL(sql,name,password);
    }
}
