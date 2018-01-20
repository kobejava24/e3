package com.e3.service.user.api;

import com.e3.service.user.pojo.SysPermission;
import com.e3.service.user.pojo.TbUser;
import com.e3.util.common.E3Result;

import java.util.List;

/**
 * Created by 91908 on 2017/12/21.
 */
public interface UserService {
    E3Result authenticat(String usercode,String pwd);

    List<SysPermission> queryMenusList(String userid);

    List<SysPermission> queryPermissionList(String userid);

    E3Result checkParam(String param,Integer type);

    E3Result redister(TbUser tbuser);

    E3Result login(String username,String password);

    E3Result getBytokenUser(String token);


}
