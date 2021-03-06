package it.studiofontanelli.jabistudio.dao;

import it.studiofontanelli.jabistudio.mybatis.entity.AbiDocksDock;
import it.studiofontanelli.jabistudio.mybatis.entity.AbiDocksDockExample;
import java.util.List;

public interface AbiDocksDockDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int countByExample(AbiDocksDockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int deleteByExample(AbiDocksDockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    void insert(AbiDocksDock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    void insertSelective(AbiDocksDock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    List selectByExample(AbiDocksDockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    AbiDocksDock selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByExampleSelective(AbiDocksDock record, AbiDocksDockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByExample(AbiDocksDock record, AbiDocksDockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByPrimaryKeySelective(AbiDocksDock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByPrimaryKey(AbiDocksDock record);
}