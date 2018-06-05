package com.leno.jeep.dal.query;


import com.leno.jeep.dal.common.BaseCriteria;
import com.leno.jeep.dal.common.BaseQuery;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class JeepProvinceQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public JeepProvinceQuery() {
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
     * This class corresponds to the database table jeep_province
     */
         protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "id");
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

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameIsNull() {
            addCriterion("province_short_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameIsNotNull() {
            addCriterion("province_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameEqualTo(String value) {
            addCriterion("province_short_name =", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotEqualTo(String value) {
            addCriterion("province_short_name <>", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameGreaterThan(String value) {
            addCriterion("province_short_name >", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_short_name >=", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameLessThan(String value) {
            addCriterion("province_short_name <", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameLessThanOrEqualTo(String value) {
            addCriterion("province_short_name <=", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameLike(String value) {
            addCriterion("province_short_name like", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotLike(String value) {
            addCriterion("province_short_name not like", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameIn(List<String> values) {
            addCriterion("province_short_name in", values, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotIn(List<String> values) {
            addCriterion("province_short_name not in", values, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameBetween(String value1, String value2) {
            addCriterion("province_short_name between", value1, value2, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotBetween(String value1, String value2) {
            addCriterion("province_short_name not between", value1, value2, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceSortIsNull() {
            addCriterion("province_sort is null");
            return (Criteria) this;
        }

        public Criteria andProvinceSortIsNotNull() {
            addCriterion("province_sort is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceSortEqualTo(Integer value) {
            addCriterion("province_sort =", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortNotEqualTo(Integer value) {
            addCriterion("province_sort <>", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortGreaterThan(Integer value) {
            addCriterion("province_sort >", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_sort >=", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortLessThan(Integer value) {
            addCriterion("province_sort <", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortLessThanOrEqualTo(Integer value) {
            addCriterion("province_sort <=", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortLike(Integer value) {
            addCriterion("province_sort like", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortNotLike(Integer value) {
            addCriterion("province_sort not like", value, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortIn(List<Integer> values) {
            addCriterion("province_sort in", values, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortNotIn(List<Integer> values) {
            addCriterion("province_sort not in", values, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortBetween(Integer value1, Integer value2) {
            addCriterion("province_sort between", value1, value2, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceSortNotBetween(Integer value1, Integer value2) {
            addCriterion("province_sort not between", value1, value2, "provinceSort");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexIsNull() {
            addCriterion("province_index is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexIsNotNull() {
            addCriterion("province_index is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexEqualTo(String value) {
            addCriterion("province_index =", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexNotEqualTo(String value) {
            addCriterion("province_index <>", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexGreaterThan(String value) {
            addCriterion("province_index >", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexGreaterThanOrEqualTo(String value) {
            addCriterion("province_index >=", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexLessThan(String value) {
            addCriterion("province_index <", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexLessThanOrEqualTo(String value) {
            addCriterion("province_index <=", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexLike(String value) {
            addCriterion("province_index like", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexNotLike(String value) {
            addCriterion("province_index not like", value, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexIn(List<String> values) {
            addCriterion("province_index in", values, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexNotIn(List<String> values) {
            addCriterion("province_index not in", values, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexBetween(String value1, String value2) {
            addCriterion("province_index between", value1, value2, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andProvinceIndexNotBetween(String value1, String value2) {
            addCriterion("province_index not between", value1, value2, "provinceIndex");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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

    }

    /**
     * This class corresponds to the database table jeep_province
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