package com.etcj.delivery.dao;

import com.etcj.delivery.api.model.StationRider;
import com.etcj.delivery.api.model.StationRiderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationRiderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_rider
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    long countByExample(StationRiderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_rider
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    int deleteByExample(StationRiderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_rider
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    int insert(StationRider record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_rider
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    int insertSelective(StationRider record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_rider
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    List<StationRider> selectByExample(StationRiderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_rider
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") StationRider record, @Param("example") StationRiderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_rider
     *
     * @mbg.generated Sat Dec 07 14:09:21 CST 2019
     */
    int updateByExample(@Param("record") StationRider record, @Param("example") StationRiderExample example);

    int insertBatchSelective(List<StationRider> records);
}