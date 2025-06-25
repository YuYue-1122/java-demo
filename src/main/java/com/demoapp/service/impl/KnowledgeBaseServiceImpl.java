package com.demoapp.service.impl;

import com.demoapp.dto.KnowledgeBaseDto;
import com.demoapp.dto.KnowledgeBaseQuery;
import com.demoapp.entity.KnowledgeBaseEntity;
import com.demoapp.mapper.KnowledgeBaseMapper;
import com.demoapp.service.KnowledgeBaseService;
import com.demoapp.utils.UuidUtils;
import com.demoapp.vo.KnowledgeBaseVo;
import com.demoapp.vo.common.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class KnowledgeBaseServiceImpl implements KnowledgeBaseService {

    @Autowired
    private KnowledgeBaseMapper knowledgeBaseMapper;

    /**
     * 分页查询
     *
     * @param knowledgeBaseQuery
     * @return
     */
    @Override
    public PageInfo<KnowledgeBaseVo> page(KnowledgeBaseQuery knowledgeBaseQuery) {
        // 启动分页（必须在查询方法前调用）
        PageHelper.startPage(knowledgeBaseQuery.getPageNum(), knowledgeBaseQuery.getPageSize());

        List<KnowledgeBaseEntity> list = knowledgeBaseMapper.page( knowledgeBaseQuery.getName(), knowledgeBaseQuery.getType(), knowledgeBaseQuery.getDescription());
        List<KnowledgeBaseVo> knowledgeBaseVoList = new ArrayList<>();
        for (KnowledgeBaseEntity knowledgeBaseEntity : list) {

            knowledgeBaseVoList.add(new KnowledgeBaseVo(knowledgeBaseEntity));
        }
        return new PageInfo<KnowledgeBaseVo>(knowledgeBaseVoList);
    }

    /**
     * 根据Id查询知识库
     *
     * @param id
     * @return
     */
    @Override
    public KnowledgeBaseVo findById(String id) {
        //根据id查询知识库
        KnowledgeBaseEntity knowledgeBaseEntity = knowledgeBaseMapper.findById(id);
        if (knowledgeBaseEntity == null) {
            throw new RuntimeException("知识库不存在");
        }
        return new KnowledgeBaseVo(knowledgeBaseEntity);
    }

    /**
     * 创建
     *
     * @param knowledgeBaseDto
     * @return
     */
    @Override
    public KnowledgeBaseVo insert(KnowledgeBaseDto knowledgeBaseDto) {
        KnowledgeBaseEntity knowledgeBaseEntity = KnowledgeBaseEntity.builder()
                .id(UuidUtils.lowerNumber())
                .name(knowledgeBaseDto.getName())
                .description(knowledgeBaseDto.getDescription())
                .type(knowledgeBaseDto.type)
                .creator_id("1")//应设置为当前登录用户Id
                .enabled(1)
                .deleted(0)
                .build();

        boolean result = knowledgeBaseMapper.insert(knowledgeBaseEntity);
        return new KnowledgeBaseVo(knowledgeBaseEntity);
    }

    /**
     * 修改
     *
     * @param knowledgeBaseDto
     * @return
     */
    @Override
    public KnowledgeBaseVo update(KnowledgeBaseDto knowledgeBaseDto) {
        //根据id查询知识库
        KnowledgeBaseEntity knowledgeBaseEntity = knowledgeBaseMapper.findById(knowledgeBaseDto.getId());
        if (knowledgeBaseEntity == null) {
            throw new RuntimeException("知识库不存在");
        }
        knowledgeBaseEntity.setName(knowledgeBaseDto.getName());
        knowledgeBaseEntity.setDescription(knowledgeBaseDto.getDescription());
        knowledgeBaseEntity.setType(knowledgeBaseDto.getType());
        boolean result = knowledgeBaseMapper.update(knowledgeBaseEntity);
        return new KnowledgeBaseVo(knowledgeBaseEntity);
    }

    /**
     * 根据Id删除知识库
     *
     * @param id
     */
    @Override
    public boolean deleteById(String id) {
        //根据id查询知识库
        KnowledgeBaseEntity knowledgeBaseEntity = knowledgeBaseMapper.findById(id);
        if (knowledgeBaseEntity == null) {
            throw new RuntimeException("知识库不存在");
        }
        return knowledgeBaseMapper.deleteById(id);
    }
}
