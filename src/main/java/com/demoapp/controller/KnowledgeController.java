package com.demoapp.controller;

import com.demoapp.dto.KnowledgeBaseDto;
import com.demoapp.dto.KnowledgeBaseQuery;
import com.demoapp.dto.common.PageQuery;
import com.demoapp.entity.KnowledgeBaseEntity;
import com.demoapp.service.KnowledgeBaseService;
import com.demoapp.vo.KnowledgeBaseVo;
import com.demoapp.vo.common.PageResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/knowledge")
public class KnowledgeController {
    @Autowired
    private KnowledgeBaseService knowledgeBaseService;

    /**
     * 分页查询
     * @param knowledgeBaseQuery
     * @return
     */
    @GetMapping("page")
    public PageInfo<KnowledgeBaseVo> page(KnowledgeBaseQuery knowledgeBaseQuery) {
        return  knowledgeBaseService.page(knowledgeBaseQuery);
    }
    /*
     * 根据Id获取知识库
     * */
    @GetMapping("findById")
    public KnowledgeBaseVo findById(String id) {
        return knowledgeBaseService.findById(id);
    }

    /**
     * 创建
     *
     * @param knowledgeBaseDto
     * @return
     */
    @PostMapping("insert")
    public KnowledgeBaseVo insert(@RequestBody KnowledgeBaseDto knowledgeBaseDto) {
        return knowledgeBaseService.insert(knowledgeBaseDto);
    }

    /**
     * 修改
     *
     * @param knowledgeBaseDto
     * @return
     */
    @PostMapping("update")
    public KnowledgeBaseVo update(@RequestBody KnowledgeBaseDto knowledgeBaseDto) {
        return knowledgeBaseService.update(knowledgeBaseDto);
    }

    /**
     * 根据Id删除知识库
     *
     * @param id
     */
    @DeleteMapping("deleteById")
    public boolean deleteById(String id) {
        return knowledgeBaseService.deleteById(id);
    }

}
