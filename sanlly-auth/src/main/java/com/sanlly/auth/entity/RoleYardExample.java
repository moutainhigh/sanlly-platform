package com.sanlly.auth.entity;

import java.util.ArrayList;
import java.util.List;

public class RoleYardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RoleYardExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andRoleYardIdIsNull() {
            addCriterion("role_yard_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdIsNotNull() {
            addCriterion("role_yard_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdEqualTo(Integer value) {
            addCriterion("role_yard_id =", value, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdNotEqualTo(Integer value) {
            addCriterion("role_yard_id <>", value, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdGreaterThan(Integer value) {
            addCriterion("role_yard_id >", value, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_yard_id >=", value, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdLessThan(Integer value) {
            addCriterion("role_yard_id <", value, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_yard_id <=", value, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdIn(List<Integer> values) {
            addCriterion("role_yard_id in", values, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdNotIn(List<Integer> values) {
            addCriterion("role_yard_id not in", values, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdBetween(Integer value1, Integer value2) {
            addCriterion("role_yard_id between", value1, value2, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleYardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_yard_id not between", value1, value2, "roleYardId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andYardIdIsNull() {
            addCriterion("yard_id is null");
            return (Criteria) this;
        }

        public Criteria andYardIdIsNotNull() {
            addCriterion("yard_id is not null");
            return (Criteria) this;
        }

        public Criteria andYardIdEqualTo(Integer value) {
            addCriterion("yard_id =", value, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdNotEqualTo(Integer value) {
            addCriterion("yard_id <>", value, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdGreaterThan(Integer value) {
            addCriterion("yard_id >", value, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yard_id >=", value, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdLessThan(Integer value) {
            addCriterion("yard_id <", value, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdLessThanOrEqualTo(Integer value) {
            addCriterion("yard_id <=", value, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdIn(List<Integer> values) {
            addCriterion("yard_id in", values, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdNotIn(List<Integer> values) {
            addCriterion("yard_id not in", values, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdBetween(Integer value1, Integer value2) {
            addCriterion("yard_id between", value1, value2, "yardId");
            return (Criteria) this;
        }

        public Criteria andYardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yard_id not between", value1, value2, "yardId");
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