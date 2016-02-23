package it.studiofontanelli.jabistudio.mybatis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbiMainPofRExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    protected List oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public AbiMainPofRExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    protected AbiMainPofRExample(AbiMainPofRExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Feb 22 15:20:44 CET 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPoftidIsNull() {
            addCriterion("poftid is null");
            return (Criteria) this;
        }

        public Criteria andPoftidIsNotNull() {
            addCriterion("poftid is not null");
            return (Criteria) this;
        }

        public Criteria andPoftidEqualTo(Integer value) {
            addCriterion("poftid =", value, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidNotEqualTo(Integer value) {
            addCriterion("poftid <>", value, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidGreaterThan(Integer value) {
            addCriterion("poftid >", value, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidGreaterThanOrEqualTo(Integer value) {
            addCriterion("poftid >=", value, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidLessThan(Integer value) {
            addCriterion("poftid <", value, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidLessThanOrEqualTo(Integer value) {
            addCriterion("poftid <=", value, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidIn(List values) {
            addCriterion("poftid in", values, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidNotIn(List values) {
            addCriterion("poftid not in", values, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidBetween(Integer value1, Integer value2) {
            addCriterion("poftid between", value1, value2, "poftid");
            return (Criteria) this;
        }

        public Criteria andPoftidNotBetween(Integer value1, Integer value2) {
            addCriterion("poftid not between", value1, value2, "poftid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemid is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemid is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("itemid =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("itemid <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("itemid >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemid >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("itemid <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("itemid <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List values) {
            addCriterion("itemid in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List values) {
            addCriterion("itemid not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("itemid between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemid not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andUmlIsNull() {
            addCriterion("uml is null");
            return (Criteria) this;
        }

        public Criteria andUmlIsNotNull() {
            addCriterion("uml is not null");
            return (Criteria) this;
        }

        public Criteria andUmlEqualTo(String value) {
            addCriterion("uml =", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotEqualTo(String value) {
            addCriterion("uml <>", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlGreaterThan(String value) {
            addCriterion("uml >", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlGreaterThanOrEqualTo(String value) {
            addCriterion("uml >=", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlLessThan(String value) {
            addCriterion("uml <", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlLessThanOrEqualTo(String value) {
            addCriterion("uml <=", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlLike(String value) {
            addCriterion("uml like", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotLike(String value) {
            addCriterion("uml not like", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlIn(List values) {
            addCriterion("uml in", values, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotIn(List values) {
            addCriterion("uml not in", values, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlBetween(String value1, String value2) {
            addCriterion("uml between", value1, value2, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotBetween(String value1, String value2) {
            addCriterion("uml not between", value1, value2, "uml");
            return (Criteria) this;
        }

        public Criteria andUmcIsNull() {
            addCriterion("umc is null");
            return (Criteria) this;
        }

        public Criteria andUmcIsNotNull() {
            addCriterion("umc is not null");
            return (Criteria) this;
        }

        public Criteria andUmcEqualTo(String value) {
            addCriterion("umc =", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcNotEqualTo(String value) {
            addCriterion("umc <>", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcGreaterThan(String value) {
            addCriterion("umc >", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcGreaterThanOrEqualTo(String value) {
            addCriterion("umc >=", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcLessThan(String value) {
            addCriterion("umc <", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcLessThanOrEqualTo(String value) {
            addCriterion("umc <=", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcLike(String value) {
            addCriterion("umc like", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcNotLike(String value) {
            addCriterion("umc not like", value, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcIn(List values) {
            addCriterion("umc in", values, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcNotIn(List values) {
            addCriterion("umc not in", values, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcBetween(String value1, String value2) {
            addCriterion("umc between", value1, value2, "umc");
            return (Criteria) this;
        }

        public Criteria andUmcNotBetween(String value1, String value2) {
            addCriterion("umc not between", value1, value2, "umc");
            return (Criteria) this;
        }

        public Criteria andMultIsNull() {
            addCriterion("mult is null");
            return (Criteria) this;
        }

        public Criteria andMultIsNotNull() {
            addCriterion("mult is not null");
            return (Criteria) this;
        }

        public Criteria andMultEqualTo(Short value) {
            addCriterion("mult =", value, "mult");
            return (Criteria) this;
        }

        public Criteria andMultNotEqualTo(Short value) {
            addCriterion("mult <>", value, "mult");
            return (Criteria) this;
        }

        public Criteria andMultGreaterThan(Short value) {
            addCriterion("mult >", value, "mult");
            return (Criteria) this;
        }

        public Criteria andMultGreaterThanOrEqualTo(Short value) {
            addCriterion("mult >=", value, "mult");
            return (Criteria) this;
        }

        public Criteria andMultLessThan(Short value) {
            addCriterion("mult <", value, "mult");
            return (Criteria) this;
        }

        public Criteria andMultLessThanOrEqualTo(Short value) {
            addCriterion("mult <=", value, "mult");
            return (Criteria) this;
        }

        public Criteria andMultIn(List values) {
            addCriterion("mult in", values, "mult");
            return (Criteria) this;
        }

        public Criteria andMultNotIn(List values) {
            addCriterion("mult not in", values, "mult");
            return (Criteria) this;
        }

        public Criteria andMultBetween(Short value1, Short value2) {
            addCriterion("mult between", value1, value2, "mult");
            return (Criteria) this;
        }

        public Criteria andMultNotBetween(Short value1, Short value2) {
            addCriterion("mult not between", value1, value2, "mult");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIvaIsNull() {
            addCriterion("iva is null");
            return (Criteria) this;
        }

        public Criteria andIvaIsNotNull() {
            addCriterion("iva is not null");
            return (Criteria) this;
        }

        public Criteria andIvaEqualTo(Short value) {
            addCriterion("iva =", value, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaNotEqualTo(Short value) {
            addCriterion("iva <>", value, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaGreaterThan(Short value) {
            addCriterion("iva >", value, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaGreaterThanOrEqualTo(Short value) {
            addCriterion("iva >=", value, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaLessThan(Short value) {
            addCriterion("iva <", value, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaLessThanOrEqualTo(Short value) {
            addCriterion("iva <=", value, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaIn(List values) {
            addCriterion("iva in", values, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaNotIn(List values) {
            addCriterion("iva not in", values, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaBetween(Short value1, Short value2) {
            addCriterion("iva between", value1, value2, "iva");
            return (Criteria) this;
        }

        public Criteria andIvaNotBetween(Short value1, Short value2) {
            addCriterion("iva not between", value1, value2, "iva");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNull() {
            addCriterion("insert_date is null");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNotNull() {
            addCriterion("insert_date is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDateEqualTo(Date value) {
            addCriterion("insert_date =", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotEqualTo(Date value) {
            addCriterion("insert_date <>", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThan(Date value) {
            addCriterion("insert_date >", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_date >=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThan(Date value) {
            addCriterion("insert_date <", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThanOrEqualTo(Date value) {
            addCriterion("insert_date <=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateIn(List values) {
            addCriterion("insert_date in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotIn(List values) {
            addCriterion("insert_date not in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateBetween(Date value1, Date value2) {
            addCriterion("insert_date between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotBetween(Date value1, Date value2) {
            addCriterion("insert_date not between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andPricePricelistIsNull() {
            addCriterion("price_pricelist is null");
            return (Criteria) this;
        }

        public Criteria andPricePricelistIsNotNull() {
            addCriterion("price_pricelist is not null");
            return (Criteria) this;
        }

        public Criteria andPricePricelistEqualTo(BigDecimal value) {
            addCriterion("price_pricelist =", value, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistNotEqualTo(BigDecimal value) {
            addCriterion("price_pricelist <>", value, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistGreaterThan(BigDecimal value) {
            addCriterion("price_pricelist >", value, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_pricelist >=", value, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistLessThan(BigDecimal value) {
            addCriterion("price_pricelist <", value, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_pricelist <=", value, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistIn(List values) {
            addCriterion("price_pricelist in", values, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistNotIn(List values) {
            addCriterion("price_pricelist not in", values, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_pricelist between", value1, value2, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andPricePricelistNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_pricelist not between", value1, value2, "pricePricelist");
            return (Criteria) this;
        }

        public Criteria andOfferIsNull() {
            addCriterion("offer is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsNotNull() {
            addCriterion("offer is not null");
            return (Criteria) this;
        }

        public Criteria andOfferEqualTo(String value) {
            addCriterion("offer =", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotEqualTo(String value) {
            addCriterion("offer <>", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThan(String value) {
            addCriterion("offer >", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThanOrEqualTo(String value) {
            addCriterion("offer >=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThan(String value) {
            addCriterion("offer <", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThanOrEqualTo(String value) {
            addCriterion("offer <=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLike(String value) {
            addCriterion("offer like", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotLike(String value) {
            addCriterion("offer not like", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferIn(List values) {
            addCriterion("offer in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotIn(List values) {
            addCriterion("offer not in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferBetween(String value1, String value2) {
            addCriterion("offer between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotBetween(String value1, String value2) {
            addCriterion("offer not between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Integer value) {
            addCriterion("qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Integer value) {
            addCriterion("qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Integer value) {
            addCriterion("qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Integer value) {
            addCriterion("qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Integer value) {
            addCriterion("qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List values) {
            addCriterion("qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List values) {
            addCriterion("qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Integer value1, Integer value2) {
            addCriterion("qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("qty not between", value1, value2, "qty");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated do_not_delete_during_merge Mon Feb 22 15:20:44 CET 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}