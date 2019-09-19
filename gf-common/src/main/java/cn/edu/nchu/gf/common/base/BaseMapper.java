package cn.edu.nchu.gf.common.base;

import cn.edu.nchu.gf.common.query.BaseQuery;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {
    public void insert(T t);

    public void updateByPrimaryKey(T t);

    public void deleteByPrimaryKey(Serializable id);

    public T selectByPrimaryKey(Serializable id);

    public List<T> selectAll();

    public List<T> selectByQuery(BaseQuery query);
}

