package it.studiofontanelli.jabistudio.dao;

import it.studiofontanelli.jabistudio.mybatis.entity.AbiMainPofT;
import it.studiofontanelli.jabistudio.mybatis.entity.AbiMainPofTExample;
import java.util.List;

public interface AbiMainPofTDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int countByExample(AbiMainPofTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int deleteByExample(AbiMainPofTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    void insert(AbiMainPofT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    void insertSelective(AbiMainPofT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    List selectByExample(AbiMainPofTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    AbiMainPofT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByExampleSelective(AbiMainPofT record, AbiMainPofTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByExample(AbiMainPofT record, AbiMainPofTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByPrimaryKeySelective(AbiMainPofT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_t
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    int updateByPrimaryKey(AbiMainPofT record);
}