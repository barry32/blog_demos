package com.bolingcavalry.druidtwosource.mapper.first;

import com.bolingcavalry.druidtwosource.entity.Log;
import com.bolingcavalry.druidtwosource.entity.LogExtend;
import org.springframework.stereotype.Repository;

/**
 * @Description: log表的mapper
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2020/8/4 8:32
 */

@Repository
public interface LogMapper {
    Log sel(int id);

    LogExtend selExtend(int id);

    int insertWithFields(Log log);
}
