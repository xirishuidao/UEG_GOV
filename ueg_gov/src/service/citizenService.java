package service;

public interface citizenService {
    //增加用户信息
    int insert(long cid,String cpwd,String cname);


    //删除用户信息

    int delete(long cid);

    //修改用户信息

    int update(long cid,String cpwd,String cname);

    //根据id查密码

    String findpasswd(long cid);

    //根据id查用户名

    String findname(long cid);

}
