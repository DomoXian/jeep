package com.leno.jeep.dal.query;


import com.leno.jeep.dal.common.BaseCriteria;
import com.leno.jeep.dal.common.BaseQuery;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class JeepCityQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public JeepCityQuery() {
        super();
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        super.oredCriteria.add(criteria);
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

    /**
     * This class corresponds to the database table jeep_city
     */
         protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameIsNull() {
            addCriterion("city_short_name is null");
            return (Criteria) this;
        }

        public Criteria andCityShortNameIsNotNull() {
            addCriterion("city_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityShortNameEqualTo(String value) {
            addCriterion("city_short_name =", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotEqualTo(String value) {
            addCriterion("city_short_name <>", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameGreaterThan(String value) {
            addCriterion("city_short_name >", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_short_name >=", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameLessThan(String value) {
            addCriterion("city_short_name <", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameLessThanOrEqualTo(String value) {
            addCriterion("city_short_name <=", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameLike(String value) {
            addCriterion("city_short_name like", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotLike(String value) {
            addCriterion("city_short_name not like", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameIn(List<String> values) {
            addCriterion("city_short_name in", values, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotIn(List<String> values) {
            addCriterion("city_short_name not in", values, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameBetween(String value1, String value2) {
            addCriterion("city_short_name between", value1, value2, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotBetween(String value1, String value2) {
            addCriterion("city_short_name not between", value1, value2, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCitySortIsNull() {
            addCriterion("city_sort is null");
            return (Criteria) this;
        }

        public Criteria andCitySortIsNotNull() {
            addCriterion("city_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCitySortEqualTo(Integer value) {
            addCriterion("city_sort =", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortNotEqualTo(Integer value) {
            addCriterion("city_sort <>", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortGreaterThan(Integer value) {
            addCriterion("city_sort >", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_sort >=", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortLessThan(Integer value) {
            addCriterion("city_sort <", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortLessThanOrEqualTo(Integer value) {
            addCriterion("city_sort <=", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortLike(Integer value) {
            addCriterion("city_sort like", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortNotLike(Integer value) {
            addCriterion("city_sort not like", value, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortIn(List<Integer> values) {
            addCriterion("city_sort in", values, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortNotIn(List<Integer> values) {
            addCriterion("city_sort not in", values, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortBetween(Integer value1, Integer value2) {
            addCriterion("city_sort between", value1, value2, "citySort");
            return (Criteria) this;
        }

        public Criteria andCitySortNotBetween(Integer value1, Integer value2) {
            addCriterion("city_sort not between", value1, value2, "citySort");
            return (Criteria) this;
        }

        public Criteria andProvIdIsNull() {
            addCriterion("prov_id is null");
            return (Criteria) this;
        }

        public Criteria andProvIdIsNotNull() {
            addCriterion("prov_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvIdEqualTo(Long value) {
            addCriterion("prov_id =", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotEqualTo(Long value) {
            addCriterion("prov_id <>", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdGreaterThan(Long value) {
            addCriterion("prov_id >", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prov_id >=", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdLessThan(Long value) {
            addCriterion("prov_id <", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdLessThanOrEqualTo(Long value) {
            addCriterion("prov_id <=", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdLike(Long value) {
            addCriterion("prov_id like", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotLike(Long value) {
            addCriterion("prov_id not like", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdIn(List<Long> values) {
            addCriterion("prov_id in", values, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotIn(List<Long> values) {
            addCriterion("prov_id not in", values, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdBetween(Long value1, Long value2) {
            addCriterion("prov_id between", value1, value2, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotBetween(Long value1, Long value2) {
            addCriterion("prov_id not between", value1, value2, "provId");
            return (Criteria) this;
        }

        public Criteria andCityIndexIsNull() {
            addCriterion("city_index is null");
            return (Criteria) this;
        }

        public Criteria andCityIndexIsNotNull() {
            addCriterion("city_index is not null");
            return (Criteria) this;
        }

        public Criteria andCityIndexEqualTo(String value) {
            addCriterion("city_index =", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexNotEqualTo(String value) {
            addCriterion("city_index <>", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexGreaterThan(String value) {
            addCriterion("city_index >", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexGreaterThanOrEqualTo(String value) {
            addCriterion("city_index >=", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexLessThan(String value) {
            addCriterion("city_index <", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexLessThanOrEqualTo(String value) {
            addCriterion("city_index <=", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexLike(String value) {
            addCriterion("city_index like", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexNotLike(String value) {
            addCriterion("city_index not like", value, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexIn(List<String> values) {
            addCriterion("city_index in", values, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexNotIn(List<String> values) {
            addCriterion("city_index not in", values, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexBetween(String value1, String value2) {
            addCriterion("city_index between", value1, value2, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andCityIndexNotBetween(String value1, String value2) {
            addCriterion("city_index not between", value1, value2, "cityIndex");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(Integer value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(Integer value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andLongitudeEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(java.math.BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(java.math.BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(java.math.BigDecimal value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(java.math.BigDecimal value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<java.math.BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<java.math.BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
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

        public Criteria andLatitudeEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(java.math.BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(java.math.BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(java.math.BigDecimal value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(java.math.BigDecimal value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<java.math.BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<java.math.BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table jeep_city
    */
    public  static class Criteria extends GeneratedCriteria{
        protected Criteria() {
            super();
        }
    }



    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}