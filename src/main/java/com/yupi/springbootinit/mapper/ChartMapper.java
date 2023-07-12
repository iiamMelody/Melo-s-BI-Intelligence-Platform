package com.yupi.springbootinit.mapper;

import java.util.*;
import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author HahaZhen
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2023-06-14 18:13:42
* @Entity com.yupi.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {
    List<Map<String,Object>> queryChartData(String queryData);
}




