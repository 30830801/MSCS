package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Goods;

/**
 * 商品信息Service接口
 * 
 * @author Wangcj
 * @date 2021-07-07
 */
public interface IGoodsService 
{
    /**
     * 查询商品信息
     * 
     * @param id 商品信息ID
     * @return 商品信息
     */
    public Goods selectGoodsById(Long id);

    /**
     * 查询商品信息列表
     * 
     * @param goods 商品信息
     * @return 商品信息集合
     */
    public List<Goods> selectGoodsList(Goods goods);

    /**
     * 新增商品信息
     * 
     * @param goods 商品信息
     * @return 结果
     */
    public int insertGoods(Goods goods);

    /**
     * 修改商品信息
     * 
     * @param goods 商品信息
     * @return 结果
     */
    public int updateGoods(Goods goods);

    /**
     * 批量删除商品信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGoodsByIds(String ids);

    /**
     * 删除商品信息信息
     * 
     * @param id 商品信息ID
     * @return 结果
     */
    public int deleteGoodsById(Long id);
}
