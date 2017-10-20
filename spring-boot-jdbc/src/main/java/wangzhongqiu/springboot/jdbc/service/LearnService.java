package wangzhongqiu.springboot.jdbc.service;

import wangzhongqiu.springboot.jdbc.domain.LearnResouce;
import wangzhongqiu.springboot.jdbc.tools.Page;

import java.util.Map;

/**
 * Created by tengj on 2017/4/7.
 */
public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    Page queryLearnResouceList(Map<String, Object> params);
}
