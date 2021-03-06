package com.hejj.service.Impl;

import com.hejj.dao.AllKindsMapper;
import com.hejj.pojo.AllKinds;
import com.hejj.service.AllKindsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wsk1103 on 2017/5/13.
 */
@Service
public class AllKindsServiceImpl implements AllKindsService {
    @Resource
    private AllKindsMapper allKindsMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(AllKinds record) {
        return allKindsMapper.insert(record);
    }

    @Override
    public int insertSelective(AllKinds record) {
        return allKindsMapper.insertSelective(record);
    }

    @Override
    public AllKinds selectByPrimaryKey(Integer id) {
        return allKindsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AllKinds record) {
        return allKindsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AllKinds record) {
        return allKindsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<AllKinds> selectAll() {
        return allKindsMapper.selectAll();
    }
}
