package com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorProjectExample.pojo;

import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.template.pojo.CmsTemplateCriteria;
import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.template.pojo.CmsTemplateExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: 除了 Example 与 Criteria 继承关系外皆为 Mybatis 自动生成
 * @Author: LiugawaHeLiujinnao
 * @Date: 2019-05-20
 */
public class TestCorInfoComInfoBasicInfoExample extends CmsTemplateExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestCorInfoComInfoBasicInfoExample() {
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

    protected abstract static class GeneratedCriteria extends CmsTemplateCriteria {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnIsNull() {
            addCriterion("company_name_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnIsNotNull() {
            addCriterion("company_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnEqualTo(String value) {
            addCriterion("company_name_en =", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotEqualTo(String value) {
            addCriterion("company_name_en <>", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnGreaterThan(String value) {
            addCriterion("company_name_en >", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_name_en >=", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnLessThan(String value) {
            addCriterion("company_name_en <", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnLessThanOrEqualTo(String value) {
            addCriterion("company_name_en <=", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnLike(String value) {
            addCriterion("company_name_en like", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotLike(String value) {
            addCriterion("company_name_en not like", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnIn(List<String> values) {
            addCriterion("company_name_en in", values, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotIn(List<String> values) {
            addCriterion("company_name_en not in", values, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnBetween(String value1, String value2) {
            addCriterion("company_name_en between", value1, value2, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotBetween(String value1, String value2) {
            addCriterion("company_name_en not between", value1, value2, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameIsNull() {
            addCriterion("company_stock_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameIsNotNull() {
            addCriterion("company_stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEqualTo(String value) {
            addCriterion("company_stock_name =", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameNotEqualTo(String value) {
            addCriterion("company_stock_name <>", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameGreaterThan(String value) {
            addCriterion("company_stock_name >", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_stock_name >=", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameLessThan(String value) {
            addCriterion("company_stock_name <", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameLessThanOrEqualTo(String value) {
            addCriterion("company_stock_name <=", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameLike(String value) {
            addCriterion("company_stock_name like", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameNotLike(String value) {
            addCriterion("company_stock_name not like", value, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameIn(List<String> values) {
            addCriterion("company_stock_name in", values, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameNotIn(List<String> values) {
            addCriterion("company_stock_name not in", values, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameBetween(String value1, String value2) {
            addCriterion("company_stock_name between", value1, value2, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameNotBetween(String value1, String value2) {
            addCriterion("company_stock_name not between", value1, value2, "companyStockName");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnIsNull() {
            addCriterion("company_stock_name_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnIsNotNull() {
            addCriterion("company_stock_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnEqualTo(String value) {
            addCriterion("company_stock_name_en =", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnNotEqualTo(String value) {
            addCriterion("company_stock_name_en <>", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnGreaterThan(String value) {
            addCriterion("company_stock_name_en >", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_stock_name_en >=", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnLessThan(String value) {
            addCriterion("company_stock_name_en <", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnLessThanOrEqualTo(String value) {
            addCriterion("company_stock_name_en <=", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnLike(String value) {
            addCriterion("company_stock_name_en like", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnNotLike(String value) {
            addCriterion("company_stock_name_en not like", value, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnIn(List<String> values) {
            addCriterion("company_stock_name_en in", values, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnNotIn(List<String> values) {
            addCriterion("company_stock_name_en not in", values, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnBetween(String value1, String value2) {
            addCriterion("company_stock_name_en between", value1, value2, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockNameEnNotBetween(String value1, String value2) {
            addCriterion("company_stock_name_en not between", value1, value2, "companyStockNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeIsNull() {
            addCriterion("company_stock_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeIsNotNull() {
            addCriterion("company_stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeEqualTo(String value) {
            addCriterion("company_stock_code =", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeNotEqualTo(String value) {
            addCriterion("company_stock_code <>", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeGreaterThan(String value) {
            addCriterion("company_stock_code >", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_stock_code >=", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeLessThan(String value) {
            addCriterion("company_stock_code <", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeLessThanOrEqualTo(String value) {
            addCriterion("company_stock_code <=", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeLike(String value) {
            addCriterion("company_stock_code like", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeNotLike(String value) {
            addCriterion("company_stock_code not like", value, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeIn(List<String> values) {
            addCriterion("company_stock_code in", values, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeNotIn(List<String> values) {
            addCriterion("company_stock_code not in", values, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeBetween(String value1, String value2) {
            addCriterion("company_stock_code between", value1, value2, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyStockCodeNotBetween(String value1, String value2) {
            addCriterion("company_stock_code not between", value1, value2, "companyStockCode");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentIsNull() {
            addCriterion("company_date_of_establishment is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentIsNotNull() {
            addCriterion("company_date_of_establishment is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentEqualTo(Date value) {
            addCriterion("company_date_of_establishment =", value, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentNotEqualTo(Date value) {
            addCriterion("company_date_of_establishment <>", value, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentGreaterThan(Date value) {
            addCriterion("company_date_of_establishment >", value, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentGreaterThanOrEqualTo(Date value) {
            addCriterion("company_date_of_establishment >=", value, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentLessThan(Date value) {
            addCriterion("company_date_of_establishment <", value, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentLessThanOrEqualTo(Date value) {
            addCriterion("company_date_of_establishment <=", value, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentIn(List<Date> values) {
            addCriterion("company_date_of_establishment in", values, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentNotIn(List<Date> values) {
            addCriterion("company_date_of_establishment not in", values, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentBetween(Date value1, Date value2) {
            addCriterion("company_date_of_establishment between", value1, value2, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfEstablishmentNotBetween(Date value1, Date value2) {
            addCriterion("company_date_of_establishment not between", value1, value2, "companyDateOfEstablishment");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingIsNull() {
            addCriterion("company_date_of_listing is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingIsNotNull() {
            addCriterion("company_date_of_listing is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingEqualTo(Date value) {
            addCriterion("company_date_of_listing =", value, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingNotEqualTo(Date value) {
            addCriterion("company_date_of_listing <>", value, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingGreaterThan(Date value) {
            addCriterion("company_date_of_listing >", value, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingGreaterThanOrEqualTo(Date value) {
            addCriterion("company_date_of_listing >=", value, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingLessThan(Date value) {
            addCriterion("company_date_of_listing <", value, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingLessThanOrEqualTo(Date value) {
            addCriterion("company_date_of_listing <=", value, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingIn(List<Date> values) {
            addCriterion("company_date_of_listing in", values, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingNotIn(List<Date> values) {
            addCriterion("company_date_of_listing not in", values, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingBetween(Date value1, Date value2) {
            addCriterion("company_date_of_listing between", value1, value2, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyDateOfListingNotBetween(Date value1, Date value2) {
            addCriterion("company_date_of_listing not between", value1, value2, "companyDateOfListing");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthIsNull() {
            addCriterion("company_new_worth is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthIsNotNull() {
            addCriterion("company_new_worth is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthEqualTo(String value) {
            addCriterion("company_new_worth =", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthNotEqualTo(String value) {
            addCriterion("company_new_worth <>", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthGreaterThan(String value) {
            addCriterion("company_new_worth >", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthGreaterThanOrEqualTo(String value) {
            addCriterion("company_new_worth >=", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthLessThan(String value) {
            addCriterion("company_new_worth <", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthLessThanOrEqualTo(String value) {
            addCriterion("company_new_worth <=", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthLike(String value) {
            addCriterion("company_new_worth like", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthNotLike(String value) {
            addCriterion("company_new_worth not like", value, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthIn(List<String> values) {
            addCriterion("company_new_worth in", values, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthNotIn(List<String> values) {
            addCriterion("company_new_worth not in", values, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthBetween(String value1, String value2) {
            addCriterion("company_new_worth between", value1, value2, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyNewWorthNotBetween(String value1, String value2) {
            addCriterion("company_new_worth not between", value1, value2, "companyNewWorth");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanIsNull() {
            addCriterion("company_chairman is null");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanIsNotNull() {
            addCriterion("company_chairman is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEqualTo(String value) {
            addCriterion("company_chairman =", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanNotEqualTo(String value) {
            addCriterion("company_chairman <>", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanGreaterThan(String value) {
            addCriterion("company_chairman >", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanGreaterThanOrEqualTo(String value) {
            addCriterion("company_chairman >=", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanLessThan(String value) {
            addCriterion("company_chairman <", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanLessThanOrEqualTo(String value) {
            addCriterion("company_chairman <=", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanLike(String value) {
            addCriterion("company_chairman like", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanNotLike(String value) {
            addCriterion("company_chairman not like", value, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanIn(List<String> values) {
            addCriterion("company_chairman in", values, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanNotIn(List<String> values) {
            addCriterion("company_chairman not in", values, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanBetween(String value1, String value2) {
            addCriterion("company_chairman between", value1, value2, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanNotBetween(String value1, String value2) {
            addCriterion("company_chairman not between", value1, value2, "companyChairman");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnIsNull() {
            addCriterion("company_chairman_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnIsNotNull() {
            addCriterion("company_chairman_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnEqualTo(String value) {
            addCriterion("company_chairman_en =", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnNotEqualTo(String value) {
            addCriterion("company_chairman_en <>", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnGreaterThan(String value) {
            addCriterion("company_chairman_en >", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_chairman_en >=", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnLessThan(String value) {
            addCriterion("company_chairman_en <", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnLessThanOrEqualTo(String value) {
            addCriterion("company_chairman_en <=", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnLike(String value) {
            addCriterion("company_chairman_en like", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnNotLike(String value) {
            addCriterion("company_chairman_en not like", value, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnIn(List<String> values) {
            addCriterion("company_chairman_en in", values, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnNotIn(List<String> values) {
            addCriterion("company_chairman_en not in", values, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnBetween(String value1, String value2) {
            addCriterion("company_chairman_en between", value1, value2, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyChairmanEnNotBetween(String value1, String value2) {
            addCriterion("company_chairman_en not between", value1, value2, "companyChairmanEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeIsNull() {
            addCriterion("company_principal_office is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeIsNotNull() {
            addCriterion("company_principal_office is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEqualTo(String value) {
            addCriterion("company_principal_office =", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeNotEqualTo(String value) {
            addCriterion("company_principal_office <>", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeGreaterThan(String value) {
            addCriterion("company_principal_office >", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("company_principal_office >=", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeLessThan(String value) {
            addCriterion("company_principal_office <", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeLessThanOrEqualTo(String value) {
            addCriterion("company_principal_office <=", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeLike(String value) {
            addCriterion("company_principal_office like", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeNotLike(String value) {
            addCriterion("company_principal_office not like", value, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeIn(List<String> values) {
            addCriterion("company_principal_office in", values, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeNotIn(List<String> values) {
            addCriterion("company_principal_office not in", values, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeBetween(String value1, String value2) {
            addCriterion("company_principal_office between", value1, value2, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeNotBetween(String value1, String value2) {
            addCriterion("company_principal_office not between", value1, value2, "companyPrincipalOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnIsNull() {
            addCriterion("company_principal_office_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnIsNotNull() {
            addCriterion("company_principal_office_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnEqualTo(String value) {
            addCriterion("company_principal_office_en =", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnNotEqualTo(String value) {
            addCriterion("company_principal_office_en <>", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnGreaterThan(String value) {
            addCriterion("company_principal_office_en >", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_principal_office_en >=", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnLessThan(String value) {
            addCriterion("company_principal_office_en <", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnLessThanOrEqualTo(String value) {
            addCriterion("company_principal_office_en <=", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnLike(String value) {
            addCriterion("company_principal_office_en like", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnNotLike(String value) {
            addCriterion("company_principal_office_en not like", value, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnIn(List<String> values) {
            addCriterion("company_principal_office_en in", values, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnNotIn(List<String> values) {
            addCriterion("company_principal_office_en not in", values, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnBetween(String value1, String value2) {
            addCriterion("company_principal_office_en between", value1, value2, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyPrincipalOfficeEnNotBetween(String value1, String value2) {
            addCriterion("company_principal_office_en not between", value1, value2, "companyPrincipalOfficeEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentIsNull() {
            addCriterion("company_stock_transfer_agent is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentIsNotNull() {
            addCriterion("company_stock_transfer_agent is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEqualTo(String value) {
            addCriterion("company_stock_transfer_agent =", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentNotEqualTo(String value) {
            addCriterion("company_stock_transfer_agent <>", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentGreaterThan(String value) {
            addCriterion("company_stock_transfer_agent >", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentGreaterThanOrEqualTo(String value) {
            addCriterion("company_stock_transfer_agent >=", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentLessThan(String value) {
            addCriterion("company_stock_transfer_agent <", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentLessThanOrEqualTo(String value) {
            addCriterion("company_stock_transfer_agent <=", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentLike(String value) {
            addCriterion("company_stock_transfer_agent like", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentNotLike(String value) {
            addCriterion("company_stock_transfer_agent not like", value, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentIn(List<String> values) {
            addCriterion("company_stock_transfer_agent in", values, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentNotIn(List<String> values) {
            addCriterion("company_stock_transfer_agent not in", values, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentBetween(String value1, String value2) {
            addCriterion("company_stock_transfer_agent between", value1, value2, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentNotBetween(String value1, String value2) {
            addCriterion("company_stock_transfer_agent not between", value1, value2, "companyStockTransferAgent");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnIsNull() {
            addCriterion("company_stock_transfer_agent_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnIsNotNull() {
            addCriterion("company_stock_transfer_agent_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnEqualTo(String value) {
            addCriterion("company_stock_transfer_agent_en =", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnNotEqualTo(String value) {
            addCriterion("company_stock_transfer_agent_en <>", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnGreaterThan(String value) {
            addCriterion("company_stock_transfer_agent_en >", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_stock_transfer_agent_en >=", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnLessThan(String value) {
            addCriterion("company_stock_transfer_agent_en <", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnLessThanOrEqualTo(String value) {
            addCriterion("company_stock_transfer_agent_en <=", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnLike(String value) {
            addCriterion("company_stock_transfer_agent_en like", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnNotLike(String value) {
            addCriterion("company_stock_transfer_agent_en not like", value, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnIn(List<String> values) {
            addCriterion("company_stock_transfer_agent_en in", values, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnNotIn(List<String> values) {
            addCriterion("company_stock_transfer_agent_en not in", values, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnBetween(String value1, String value2) {
            addCriterion("company_stock_transfer_agent_en between", value1, value2, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyStockTransferAgentEnNotBetween(String value1, String value2) {
            addCriterion("company_stock_transfer_agent_en not between", value1, value2, "companyStockTransferAgentEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsIsNull() {
            addCriterion("company_auditors is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsIsNotNull() {
            addCriterion("company_auditors is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEqualTo(String value) {
            addCriterion("company_auditors =", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsNotEqualTo(String value) {
            addCriterion("company_auditors <>", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsGreaterThan(String value) {
            addCriterion("company_auditors >", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsGreaterThanOrEqualTo(String value) {
            addCriterion("company_auditors >=", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsLessThan(String value) {
            addCriterion("company_auditors <", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsLessThanOrEqualTo(String value) {
            addCriterion("company_auditors <=", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsLike(String value) {
            addCriterion("company_auditors like", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsNotLike(String value) {
            addCriterion("company_auditors not like", value, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsIn(List<String> values) {
            addCriterion("company_auditors in", values, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsNotIn(List<String> values) {
            addCriterion("company_auditors not in", values, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsBetween(String value1, String value2) {
            addCriterion("company_auditors between", value1, value2, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsNotBetween(String value1, String value2) {
            addCriterion("company_auditors not between", value1, value2, "companyAuditors");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnIsNull() {
            addCriterion("company_auditors_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnIsNotNull() {
            addCriterion("company_auditors_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnEqualTo(String value) {
            addCriterion("company_auditors_en =", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnNotEqualTo(String value) {
            addCriterion("company_auditors_en <>", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnGreaterThan(String value) {
            addCriterion("company_auditors_en >", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_auditors_en >=", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnLessThan(String value) {
            addCriterion("company_auditors_en <", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnLessThanOrEqualTo(String value) {
            addCriterion("company_auditors_en <=", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnLike(String value) {
            addCriterion("company_auditors_en like", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnNotLike(String value) {
            addCriterion("company_auditors_en not like", value, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnIn(List<String> values) {
            addCriterion("company_auditors_en in", values, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnNotIn(List<String> values) {
            addCriterion("company_auditors_en not in", values, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnBetween(String value1, String value2) {
            addCriterion("company_auditors_en between", value1, value2, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorsEnNotBetween(String value1, String value2) {
            addCriterion("company_auditors_en not between", value1, value2, "companyAuditorsEn");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNull() {
            addCriterion("company_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNotNull() {
            addCriterion("company_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelEqualTo(String value) {
            addCriterion("company_tel =", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotEqualTo(String value) {
            addCriterion("company_tel <>", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThan(String value) {
            addCriterion("company_tel >", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel >=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThan(String value) {
            addCriterion("company_tel <", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThanOrEqualTo(String value) {
            addCriterion("company_tel <=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLike(String value) {
            addCriterion("company_tel like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotLike(String value) {
            addCriterion("company_tel not like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIn(List<String> values) {
            addCriterion("company_tel in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotIn(List<String> values) {
            addCriterion("company_tel not in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelBetween(String value1, String value2) {
            addCriterion("company_tel between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotBetween(String value1, String value2) {
            addCriterion("company_tel not between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNull() {
            addCriterion("company_fax is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNotNull() {
            addCriterion("company_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxEqualTo(String value) {
            addCriterion("company_fax =", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotEqualTo(String value) {
            addCriterion("company_fax <>", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThan(String value) {
            addCriterion("company_fax >", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThanOrEqualTo(String value) {
            addCriterion("company_fax >=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThan(String value) {
            addCriterion("company_fax <", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThanOrEqualTo(String value) {
            addCriterion("company_fax <=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLike(String value) {
            addCriterion("company_fax like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotLike(String value) {
            addCriterion("company_fax not like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIn(List<String> values) {
            addCriterion("company_fax in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotIn(List<String> values) {
            addCriterion("company_fax not in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxBetween(String value1, String value2) {
            addCriterion("company_fax between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotBetween(String value1, String value2) {
            addCriterion("company_fax not between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("company_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("company_email =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("company_email <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("company_email >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("company_email >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("company_email <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("company_email <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("company_email like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("company_email not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("company_email in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("company_email not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("company_email between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("company_email not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("company_website is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("company_website is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("company_website =", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("company_website <>", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("company_website >", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("company_website >=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("company_website <", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("company_website <=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("company_website like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("company_website not like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("company_website in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("company_website not in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("company_website between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("company_website not between", value1, value2, "companyWebsite");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAdtIsNull() {
            addCriterion("adt is null");
            return (Criteria) this;
        }

        public Criteria andAdtIsNotNull() {
            addCriterion("adt is not null");
            return (Criteria) this;
        }

        public Criteria andAdtEqualTo(Date value) {
            addCriterion("adt =", value, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtNotEqualTo(Date value) {
            addCriterion("adt <>", value, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtGreaterThan(Date value) {
            addCriterion("adt >", value, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtGreaterThanOrEqualTo(Date value) {
            addCriterion("adt >=", value, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtLessThan(Date value) {
            addCriterion("adt <", value, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtLessThanOrEqualTo(Date value) {
            addCriterion("adt <=", value, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtIn(List<Date> values) {
            addCriterion("adt in", values, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtNotIn(List<Date> values) {
            addCriterion("adt not in", values, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtBetween(Date value1, Date value2) {
            addCriterion("adt between", value1, value2, "adt");
            return (Criteria) this;
        }

        public Criteria andAdtNotBetween(Date value1, Date value2) {
            addCriterion("adt not between", value1, value2, "adt");
            return (Criteria) this;
        }

        public Criteria andAUserIdIsNull() {
            addCriterion("a_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAUserIdIsNotNull() {
            addCriterion("a_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAUserIdEqualTo(Integer value) {
            addCriterion("a_user_id =", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdNotEqualTo(Integer value) {
            addCriterion("a_user_id <>", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdGreaterThan(Integer value) {
            addCriterion("a_user_id >", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_user_id >=", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdLessThan(Integer value) {
            addCriterion("a_user_id <", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_user_id <=", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdIn(List<Integer> values) {
            addCriterion("a_user_id in", values, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdNotIn(List<Integer> values) {
            addCriterion("a_user_id not in", values, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdBetween(Integer value1, Integer value2) {
            addCriterion("a_user_id between", value1, value2, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_user_id not between", value1, value2, "aUserId");
            return (Criteria) this;
        }

        public Criteria andCdtIsNull() {
            addCriterion("cdt is null");
            return (Criteria) this;
        }

        public Criteria andCdtIsNotNull() {
            addCriterion("cdt is not null");
            return (Criteria) this;
        }

        public Criteria andCdtEqualTo(Date value) {
            addCriterion("cdt =", value, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtNotEqualTo(Date value) {
            addCriterion("cdt <>", value, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtGreaterThan(Date value) {
            addCriterion("cdt >", value, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtGreaterThanOrEqualTo(Date value) {
            addCriterion("cdt >=", value, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtLessThan(Date value) {
            addCriterion("cdt <", value, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtLessThanOrEqualTo(Date value) {
            addCriterion("cdt <=", value, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtIn(List<Date> values) {
            addCriterion("cdt in", values, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtNotIn(List<Date> values) {
            addCriterion("cdt not in", values, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtBetween(Date value1, Date value2) {
            addCriterion("cdt between", value1, value2, "cdt");
            return (Criteria) this;
        }

        public Criteria andCdtNotBetween(Date value1, Date value2) {
            addCriterion("cdt not between", value1, value2, "cdt");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNull() {
            addCriterion("c_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("c_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(Integer value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(Integer value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(Integer value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(Integer value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<Integer> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<Integer> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andUdtIsNull() {
            addCriterion("udt is null");
            return (Criteria) this;
        }

        public Criteria andUdtIsNotNull() {
            addCriterion("udt is not null");
            return (Criteria) this;
        }

        public Criteria andUdtEqualTo(Date value) {
            addCriterion("udt =", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotEqualTo(Date value) {
            addCriterion("udt <>", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThan(Date value) {
            addCriterion("udt >", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtGreaterThanOrEqualTo(Date value) {
            addCriterion("udt >=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThan(Date value) {
            addCriterion("udt <", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtLessThanOrEqualTo(Date value) {
            addCriterion("udt <=", value, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtIn(List<Date> values) {
            addCriterion("udt in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotIn(List<Date> values) {
            addCriterion("udt not in", values, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtBetween(Date value1, Date value2) {
            addCriterion("udt between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUdtNotBetween(Date value1, Date value2) {
            addCriterion("udt not between", value1, value2, "udt");
            return (Criteria) this;
        }

        public Criteria andUUserIdIsNull() {
            addCriterion("u_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUUserIdIsNotNull() {
            addCriterion("u_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUUserIdEqualTo(Integer value) {
            addCriterion("u_user_id =", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdNotEqualTo(Integer value) {
            addCriterion("u_user_id <>", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdGreaterThan(Integer value) {
            addCriterion("u_user_id >", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_user_id >=", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdLessThan(Integer value) {
            addCriterion("u_user_id <", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_user_id <=", value, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdIn(List<Integer> values) {
            addCriterion("u_user_id in", values, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdNotIn(List<Integer> values) {
            addCriterion("u_user_id not in", values, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdBetween(Integer value1, Integer value2) {
            addCriterion("u_user_id between", value1, value2, "uUserId");
            return (Criteria) this;
        }

        public Criteria andUUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_user_id not between", value1, value2, "uUserId");
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
