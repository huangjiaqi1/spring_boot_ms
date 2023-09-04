package com.huang.wms.mapper;

import com.huang.wms.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //运行时，自动生成接口实现类对象（动态代理技术），并交给IOC容器管理。
public interface UserMapper {
    @Select("select * from user")
    List<User> list();
}
