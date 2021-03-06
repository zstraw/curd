package com.didi.game.dao;

import com.didi.game.domain.Station;
import com.didi.game.domain.StationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int countByExample(StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int deleteByExample(StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int insert(Station record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int insertSelective(Station record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    List<Station> selectByExample(StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    Station selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int updateByPrimaryKeySelective(Station record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    int updateByPrimaryKey(Station record);
}