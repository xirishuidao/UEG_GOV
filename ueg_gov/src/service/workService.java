package service;

public interface workService {

    /*long cid, String wname, String wlevel, String waddress, String wcompany*/
    //增加用户信息
    int insert(long cid,String wname,String wlevel,String waddress, String wcompany);


    int delete(long cid);

    int update(long cid,String wname,String wlevel,String waddress, String wcompany);

    String findwname(long cid);

    String findwlevel(long cid);

    String findwaddress(long cid);

    String findwcompany(long cid);



}
