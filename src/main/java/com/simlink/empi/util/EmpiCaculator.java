package com.simlink.empi.util;

import com.google.common.collect.Lists;
import com.simlink.empi.dao.EmpiMatchRangeConfigDao;
import com.simlink.empi.entity.Brjbxx;
import com.simlink.empi.entity.EmpiInfo;
import com.simlink.empi.util.SpringContextHolder;

import java.util.List;

/**
 * 计算器
 * Created by Administrator on 2016/10/27 0027.
 */
public class EmpiCaculator {
    public static final Integer NOTMATCH = 0;
    public static final Integer PROPABLE= 1;
    public static final Integer MATCH = 2;

    private static EmpiMatchRangeConfigDao empiMatchRangeConfigDao = SpringContextHolder.getBean(EmpiMatchRangeConfigDao.class);


    /**
     * 根据pi中的内容建立sql
     * @param pi
     * @return
     */
    public static String generateSql(Brjbxx pi) {
        // TODO: 2016/10/27 0027
        return null;
    }

    /**
     * 返回百分比
     * @param pi
     * @return
     */
    public static Double getPercentage(Brjbxx pi){
        String sql = generateSql(pi);
        // TODO: 2016/10/27 0027 计算方法
        return 0.99;
    }

    /**
     * 返回结果
     * @param brjbxx
     * @param info
     * @return
     */
    public static Integer caculateSingleResult(Brjbxx brjbxx, EmpiInfo info){

        // TODO: 2016/10/27 0027 计算方法
        return MATCH;
    }

    /**
     * 从集合中筛选出匹配度最高的一条记录
     * @param probableEmpInfos
     * @return
     */
    public static EmpiInfo screenOut(List<EmpiInfo> probableEmpInfos) {
        // TODO: 2016/10/30 0030
        return null;
    }

    /**
     * 对empi集合进行排序，并赋予匹配度
     * @param originalList
     * @return
     */
    public static List<EmpiInfo> sort(List<EmpiInfo> originalList) {
        // TODO: 2016/10/30 0030
        List<EmpiInfo> results = Lists.newArrayList();
        results.add(0,screenOut(originalList));
        return null;
    }
}
