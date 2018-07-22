package com.didi.game.domain;

import java.util.ArrayList;
import java.util.List;

public class StationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public StationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
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
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("carNum is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("carNum is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(Integer value) {
            addCriterion("carNum =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(Integer value) {
            addCriterion("carNum <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(Integer value) {
            addCriterion("carNum >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("carNum >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(Integer value) {
            addCriterion("carNum <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(Integer value) {
            addCriterion("carNum <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<Integer> values) {
            addCriterion("carNum in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<Integer> values) {
            addCriterion("carNum not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(Integer value1, Integer value2) {
            addCriterion("carNum between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("carNum not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andParkStructIsNull() {
            addCriterion("parkStruct is null");
            return (Criteria) this;
        }

        public Criteria andParkStructIsNotNull() {
            addCriterion("parkStruct is not null");
            return (Criteria) this;
        }

        public Criteria andParkStructEqualTo(Integer value) {
            addCriterion("parkStruct =", value, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructNotEqualTo(Integer value) {
            addCriterion("parkStruct <>", value, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructGreaterThan(Integer value) {
            addCriterion("parkStruct >", value, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructGreaterThanOrEqualTo(Integer value) {
            addCriterion("parkStruct >=", value, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructLessThan(Integer value) {
            addCriterion("parkStruct <", value, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructLessThanOrEqualTo(Integer value) {
            addCriterion("parkStruct <=", value, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructIn(List<Integer> values) {
            addCriterion("parkStruct in", values, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructNotIn(List<Integer> values) {
            addCriterion("parkStruct not in", values, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructBetween(Integer value1, Integer value2) {
            addCriterion("parkStruct between", value1, value2, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andParkStructNotBetween(Integer value1, Integer value2) {
            addCriterion("parkStruct not between", value1, value2, "parkStruct");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashIsNull() {
            addCriterion("totalMonthCostCash is null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashIsNotNull() {
            addCriterion("totalMonthCostCash is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashEqualTo(Float value) {
            addCriterion("totalMonthCostCash =", value, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashNotEqualTo(Float value) {
            addCriterion("totalMonthCostCash <>", value, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashGreaterThan(Float value) {
            addCriterion("totalMonthCostCash >", value, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashGreaterThanOrEqualTo(Float value) {
            addCriterion("totalMonthCostCash >=", value, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashLessThan(Float value) {
            addCriterion("totalMonthCostCash <", value, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashLessThanOrEqualTo(Float value) {
            addCriterion("totalMonthCostCash <=", value, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashIn(List<Float> values) {
            addCriterion("totalMonthCostCash in", values, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashNotIn(List<Float> values) {
            addCriterion("totalMonthCostCash not in", values, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashBetween(Float value1, Float value2) {
            addCriterion("totalMonthCostCash between", value1, value2, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCashNotBetween(Float value1, Float value2) {
            addCriterion("totalMonthCostCash not between", value1, value2, "totalMonthCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponIsNull() {
            addCriterion("totalMonthCostCoupon is null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponIsNotNull() {
            addCriterion("totalMonthCostCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponEqualTo(Float value) {
            addCriterion("totalMonthCostCoupon =", value, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponNotEqualTo(Float value) {
            addCriterion("totalMonthCostCoupon <>", value, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponGreaterThan(Float value) {
            addCriterion("totalMonthCostCoupon >", value, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponGreaterThanOrEqualTo(Float value) {
            addCriterion("totalMonthCostCoupon >=", value, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponLessThan(Float value) {
            addCriterion("totalMonthCostCoupon <", value, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponLessThanOrEqualTo(Float value) {
            addCriterion("totalMonthCostCoupon <=", value, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponIn(List<Float> values) {
            addCriterion("totalMonthCostCoupon in", values, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponNotIn(List<Float> values) {
            addCriterion("totalMonthCostCoupon not in", values, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponBetween(Float value1, Float value2) {
            addCriterion("totalMonthCostCoupon between", value1, value2, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andTotalMonthCostCouponNotBetween(Float value1, Float value2) {
            addCriterion("totalMonthCostCoupon not between", value1, value2, "totalMonthCostCoupon");
            return (Criteria) this;
        }

        public Criteria andOtherResourceIsNull() {
            addCriterion("otherResource is null");
            return (Criteria) this;
        }

        public Criteria andOtherResourceIsNotNull() {
            addCriterion("otherResource is not null");
            return (Criteria) this;
        }

        public Criteria andOtherResourceEqualTo(String value) {
            addCriterion("otherResource =", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceNotEqualTo(String value) {
            addCriterion("otherResource <>", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceGreaterThan(String value) {
            addCriterion("otherResource >", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceGreaterThanOrEqualTo(String value) {
            addCriterion("otherResource >=", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceLessThan(String value) {
            addCriterion("otherResource <", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceLessThanOrEqualTo(String value) {
            addCriterion("otherResource <=", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceLike(String value) {
            addCriterion("otherResource like", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceNotLike(String value) {
            addCriterion("otherResource not like", value, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceIn(List<String> values) {
            addCriterion("otherResource in", values, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceNotIn(List<String> values) {
            addCriterion("otherResource not in", values, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceBetween(String value1, String value2) {
            addCriterion("otherResource between", value1, value2, "otherResource");
            return (Criteria) this;
        }

        public Criteria andOtherResourceNotBetween(String value1, String value2) {
            addCriterion("otherResource not between", value1, value2, "otherResource");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashIsNull() {
            addCriterion("totalCostCash is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashIsNotNull() {
            addCriterion("totalCostCash is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashEqualTo(Float value) {
            addCriterion("totalCostCash =", value, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashNotEqualTo(Float value) {
            addCriterion("totalCostCash <>", value, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashGreaterThan(Float value) {
            addCriterion("totalCostCash >", value, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashGreaterThanOrEqualTo(Float value) {
            addCriterion("totalCostCash >=", value, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashLessThan(Float value) {
            addCriterion("totalCostCash <", value, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashLessThanOrEqualTo(Float value) {
            addCriterion("totalCostCash <=", value, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashIn(List<Float> values) {
            addCriterion("totalCostCash in", values, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashNotIn(List<Float> values) {
            addCriterion("totalCostCash not in", values, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashBetween(Float value1, Float value2) {
            addCriterion("totalCostCash between", value1, value2, "totalCostCash");
            return (Criteria) this;
        }

        public Criteria andTotalCostCashNotBetween(Float value1, Float value2) {
            addCriterion("totalCostCash not between", value1, value2, "totalCostCash");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table station
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 19 20:31:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table station
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
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