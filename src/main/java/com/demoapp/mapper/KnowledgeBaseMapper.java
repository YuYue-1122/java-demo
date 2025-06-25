package com.demoapp.mapper;

import com.demoapp.entity.KnowledgeBaseEntity;
import com.demoapp.vo.common.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface KnowledgeBaseMapper {

    /**
     * 分页获取知识库列表
     *
     * @param name        名称
     * @param type        类型
     * @param description 描述
     * @return
     */
    public List<KnowledgeBaseEntity> page(String name, Integer type, String description);

    /**
     * 根据Id查找知识库
     *
     * @param id 主键
     * @return 实体
     */
    public KnowledgeBaseEntity findById(String id);

    /**
     * 创建
     *
     * @param knowledgeBaseEntity
     * @return
     */
    public boolean insert(KnowledgeBaseEntity knowledgeBaseEntity);

    /**
     * 更新
     *
     * @param knowledgeBaseEntity
     * @return
     */
    public boolean update(KnowledgeBaseEntity knowledgeBaseEntity);

    /**
     * 根据Id删除知识库
     *
     * @param id
     */
    public boolean deleteById(String id);
}
