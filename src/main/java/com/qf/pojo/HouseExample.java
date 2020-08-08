package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
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

        public Criteria andHProIsNull() {
            addCriterion("h_pro is null");
            return (Criteria) this;
        }

        public Criteria andHProIsNotNull() {
            addCriterion("h_pro is not null");
            return (Criteria) this;
        }

        public Criteria andHProEqualTo(String value) {
            addCriterion("h_pro =", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProNotEqualTo(String value) {
            addCriterion("h_pro <>", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProGreaterThan(String value) {
            addCriterion("h_pro >", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProGreaterThanOrEqualTo(String value) {
            addCriterion("h_pro >=", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProLessThan(String value) {
            addCriterion("h_pro <", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProLessThanOrEqualTo(String value) {
            addCriterion("h_pro <=", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProLike(String value) {
            addCriterion("h_pro like", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProNotLike(String value) {
            addCriterion("h_pro not like", value, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProIn(List<String> values) {
            addCriterion("h_pro in", values, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProNotIn(List<String> values) {
            addCriterion("h_pro not in", values, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProBetween(String value1, String value2) {
            addCriterion("h_pro between", value1, value2, "hPro");
            return (Criteria) this;
        }

        public Criteria andHProNotBetween(String value1, String value2) {
            addCriterion("h_pro not between", value1, value2, "hPro");
            return (Criteria) this;
        }

        public Criteria andHOwnerIsNull() {
            addCriterion("h_owner is null");
            return (Criteria) this;
        }

        public Criteria andHOwnerIsNotNull() {
            addCriterion("h_owner is not null");
            return (Criteria) this;
        }

        public Criteria andHOwnerEqualTo(String value) {
            addCriterion("h_owner =", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerNotEqualTo(String value) {
            addCriterion("h_owner <>", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerGreaterThan(String value) {
            addCriterion("h_owner >", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("h_owner >=", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerLessThan(String value) {
            addCriterion("h_owner <", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerLessThanOrEqualTo(String value) {
            addCriterion("h_owner <=", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerLike(String value) {
            addCriterion("h_owner like", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerNotLike(String value) {
            addCriterion("h_owner not like", value, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerIn(List<String> values) {
            addCriterion("h_owner in", values, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerNotIn(List<String> values) {
            addCriterion("h_owner not in", values, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerBetween(String value1, String value2) {
            addCriterion("h_owner between", value1, value2, "hOwner");
            return (Criteria) this;
        }

        public Criteria andHOwnerNotBetween(String value1, String value2) {
            addCriterion("h_owner not between", value1, value2, "hOwner");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNull() {
            addCriterion("h_type is null");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNotNull() {
            addCriterion("h_type is not null");
            return (Criteria) this;
        }

        public Criteria andHTypeEqualTo(String value) {
            addCriterion("h_type =", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotEqualTo(String value) {
            addCriterion("h_type <>", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThan(String value) {
            addCriterion("h_type >", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_type >=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThan(String value) {
            addCriterion("h_type <", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThanOrEqualTo(String value) {
            addCriterion("h_type <=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLike(String value) {
            addCriterion("h_type like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotLike(String value) {
            addCriterion("h_type not like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeIn(List<String> values) {
            addCriterion("h_type in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotIn(List<String> values) {
            addCriterion("h_type not in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeBetween(String value1, String value2) {
            addCriterion("h_type between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotBetween(String value1, String value2) {
            addCriterion("h_type not between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHAreaIsNull() {
            addCriterion("h_area is null");
            return (Criteria) this;
        }

        public Criteria andHAreaIsNotNull() {
            addCriterion("h_area is not null");
            return (Criteria) this;
        }

        public Criteria andHAreaEqualTo(Integer value) {
            addCriterion("h_area =", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotEqualTo(Integer value) {
            addCriterion("h_area <>", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaGreaterThan(Integer value) {
            addCriterion("h_area >", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_area >=", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLessThan(Integer value) {
            addCriterion("h_area <", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLessThanOrEqualTo(Integer value) {
            addCriterion("h_area <=", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaIn(List<Integer> values) {
            addCriterion("h_area in", values, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotIn(List<Integer> values) {
            addCriterion("h_area not in", values, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaBetween(Integer value1, Integer value2) {
            addCriterion("h_area between", value1, value2, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("h_area not between", value1, value2, "hArea");
            return (Criteria) this;
        }

        public Criteria andBuidtimeIsNull() {
            addCriterion("buidtime is null");
            return (Criteria) this;
        }

        public Criteria andBuidtimeIsNotNull() {
            addCriterion("buidtime is not null");
            return (Criteria) this;
        }

        public Criteria andBuidtimeEqualTo(Date value) {
            addCriterionForJDBCDate("buidtime =", value, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("buidtime <>", value, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("buidtime >", value, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buidtime >=", value, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeLessThan(Date value) {
            addCriterionForJDBCDate("buidtime <", value, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buidtime <=", value, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeIn(List<Date> values) {
            addCriterionForJDBCDate("buidtime in", values, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("buidtime not in", values, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buidtime between", value1, value2, "buidtime");
            return (Criteria) this;
        }

        public Criteria andBuidtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buidtime not between", value1, value2, "buidtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}