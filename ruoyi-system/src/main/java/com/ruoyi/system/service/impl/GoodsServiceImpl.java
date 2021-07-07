package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GoodsMapper;
import com.ruoyi.system.domain.Goods;
import com.ruoyi.system.service.IGoodsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品信息Service业务层处理
 * 
 * @author Wangcj
 * @date 2021-07-07
 */
@Service
public class GoodsServiceImpl implements IGoodsService 
{
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 查询商品信息
     * 
     * @param id 商品信息ID
     * @return 商品信息
     */
    @Override
    public Goods selectGoodsById(Long id)
    {
        return goodsMapper.selectGoodsById(id);
    }

    /**
     * 查询商品信息列表
     * 
     * @param goods 商品信息
     * @return 商品信息
     */
    @Override
    public List<Goods> selectGoodsList(Goods goods)
    {
        return goodsMapper.selectGoodsList(goods);
    }

    /**
     * 新增商品信息
     * 
     * @param goods 商品信息
     * @return 结果
     */
    @Override
    public int insertGoods(Goods goods)
    {
        return goodsMapper.insertGoods(goods);
    }

    /**
     * 修改商品信息
     * 
     * @param goods 商品信息
     * @return 结果
     */
    @Override
    public int updateGoods(Goods goods)
    {
        return goodsMapper.updateGoods(goods);
    }

    /**
     * 删除商品信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGoodsByIds(String ids)
    {
        return goodsMapper.deleteGoodsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品信息信息
     * 
     * @param id 商品信息ID
     * @return 结果
     */
    @Override
    public int deleteGoodsById(Long id)
    {
        return goodsMapper.deleteGoodsById(id);
    }
}
