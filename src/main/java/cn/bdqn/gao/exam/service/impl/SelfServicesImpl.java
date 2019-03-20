package cn.bdqn.gao.exam.service.impl;

import cn.bdqn.gao.exam.dao.SelfMapper;
import cn.bdqn.gao.exam.entity.self;
import cn.bdqn.gao.exam.service.SelfServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SelfServicesImpl implements SelfServices {
    @Resource
    private SelfMapper mapper;
    @Override
    public List<self> queryself() {
        return this.mapper.queryself();
    }
}
