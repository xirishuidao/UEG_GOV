package Dao;

import java.util.List;

public interface BaseDao {
    int executeUpdate(String sql, Object... params);

    // 查询单条记录
    Object[] getOne(String sql, Object... params);

    // 查询多条记录
    List<Object[]> getMany(String sql, Object... params);
}
