package com.etcj.delivery.dao;

import com.etcj.delivery.api.model.PlatBusconf;
import com.etcj.delivery.api.model.PlatBusconfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatBusconfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    long countByExample(PlatBusconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int deleteByExample(PlatBusconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int insert(PlatBusconf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int insertSelective(PlatBusconf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    List<PlatBusconf> selectByExample(PlatBusconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    PlatBusconf selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int updateByExampleSelective(@Param("record") PlatBusconf record, @Param("example") PlatBusconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int updateByExample(@Param("record") PlatBusconf record, @Param("example") PlatBusconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int updateByPrimaryKeySelective(PlatBusconf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_busconf
     *
     * @mbg.generated Tue Dec 10 18:16:47 CST 2019
     */
    int updateByPrimaryKey(PlatBusconf record);

    int insertBatchSelective(List<PlatBusconf> records);
}