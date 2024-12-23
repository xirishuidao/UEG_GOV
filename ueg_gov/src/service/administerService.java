package service;

import entity.administer;

public interface administerService {

    //根据id查询账户密码
    String findPassword(long aid);

    //根据id查询账户用户名
    String findName(long aid);

    //更新一个管理员信息：密码或者名字
    int update(long aid,String apwd,String aname);

}
