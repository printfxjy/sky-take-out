package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     *
     * @param flavors
     */
    void insetBatch(List<DishFlavor> flavors);

    void deleteByDishIds(List<Long> DishIds);

    @Delete("delete from dish_flavor where dish_id = #{dishId} ;")
    void deleteByDishId(Long DishId);

    @Select("select * from dish_flavor where dish_id = #{dishId};")
    List<DishFlavor> getByDishId(Long DishId);
}
