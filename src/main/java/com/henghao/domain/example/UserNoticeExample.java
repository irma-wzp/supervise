package com.henghao.domain.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzp
 * @description: mybatis逆向生成 - 辅助类，若不使用可忽略。
 * @create on 2017/12/3.
 */
@SuppressWarnings("all")
public class UserNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserNoticeExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("gid like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("gid not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUserIsreadIsNull() {
            addCriterion("user_isRead is null");
            return (Criteria) this;
        }

        public Criteria andUserIsreadIsNotNull() {
            addCriterion("user_isRead is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsreadEqualTo(String value) {
            addCriterion("user_isRead =", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadNotEqualTo(String value) {
            addCriterion("user_isRead <>", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadGreaterThan(String value) {
            addCriterion("user_isRead >", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadGreaterThanOrEqualTo(String value) {
            addCriterion("user_isRead >=", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadLessThan(String value) {
            addCriterion("user_isRead <", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadLessThanOrEqualTo(String value) {
            addCriterion("user_isRead <=", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadLike(String value) {
            addCriterion("user_isRead like", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadNotLike(String value) {
            addCriterion("user_isRead not like", value, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadIn(List<String> values) {
            addCriterion("user_isRead in", values, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadNotIn(List<String> values) {
            addCriterion("user_isRead not in", values, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadBetween(String value1, String value2) {
            addCriterion("user_isRead between", value1, value2, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsreadNotBetween(String value1, String value2) {
            addCriterion("user_isRead not between", value1, value2, "userIsread");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteIsNull() {
            addCriterion("user_isDelete is null");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteIsNotNull() {
            addCriterion("user_isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteEqualTo(String value) {
            addCriterion("user_isDelete =", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteNotEqualTo(String value) {
            addCriterion("user_isDelete <>", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteGreaterThan(String value) {
            addCriterion("user_isDelete >", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteGreaterThanOrEqualTo(String value) {
            addCriterion("user_isDelete >=", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteLessThan(String value) {
            addCriterion("user_isDelete <", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteLessThanOrEqualTo(String value) {
            addCriterion("user_isDelete <=", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteLike(String value) {
            addCriterion("user_isDelete like", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteNotLike(String value) {
            addCriterion("user_isDelete not like", value, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteIn(List<String> values) {
            addCriterion("user_isDelete in", values, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteNotIn(List<String> values) {
            addCriterion("user_isDelete not in", values, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteBetween(String value1, String value2) {
            addCriterion("user_isDelete between", value1, value2, "userIsdelete");
            return (Criteria) this;
        }

        public Criteria andUserIsdeleteNotBetween(String value1, String value2) {
            addCriterion("user_isDelete not between", value1, value2, "userIsdelete");
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