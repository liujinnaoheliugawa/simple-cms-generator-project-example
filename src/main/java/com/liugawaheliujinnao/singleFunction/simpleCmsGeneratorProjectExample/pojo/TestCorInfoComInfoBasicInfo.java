package com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorProjectExample.pojo;

import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.annotation.Pojo;
import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.annotation.PojoAttrDes;
import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.annotation.PojoId;
import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.annotation.PojoRichText;
import com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorStructure.template.pojo.CmsTemplatePojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 一键生成项目样例 Pojo，除注解外皆为 Mybatis 插件自动生成
 * @Author: LiugawaHeLiujinnao
 * @Date: 2019-05-20
 */
@Pojo(value = "公司简介", enValue = "Company Basic Info")
public class TestCorInfoComInfoBasicInfo extends CmsTemplatePojo implements Serializable {

    @PojoId
    @PojoAttrDes(
            des = "简介ID",
            desEn = "Information ID",
            example = "1"
    )
    private Integer companyId;

    @PojoAttrDes(
            des = "名称",
            desEn = "Company Name",
            example = "大米"
    )
    private String companyName;

    @PojoAttrDes(
            example = "DAMI"
    )
    private String companyNameEn;

    @PojoAttrDes(
            des = "简称",
            desEn = "Stock Name",
            example = "DAMI"
    )
    private String companyStockName;

    @PojoAttrDes(
            example = "DAMI Stock"
    )
    private String companyStockNameEn;

    @PojoAttrDes(
            des = "股票代码",
            desEn = "Stock Code",
            example = "DAMI"
    )
    private String companyStockCode;

    @PojoAttrDes(
            des = "建立日期",
            desEn = "Establish Date",
            example = "2017/05/01"
    )
    private Date companyDateOfEstablishment;

    @PojoAttrDes(
            des = "上市日期",
            desEn = "Listing Date",
            example = "2019/05/02"
    )
    private Date companyDateOfListing;

    @PojoAttrDes(
            des = "净值",
            desEn = "New Worth",
            example = "100万"
    )
    private String companyNewWorth;

    @PojoAttrDes(
            des = "董事长",
            desEn = "Chairman",
            example = "Lebron James"
    )
    private String companyChairman;

    @PojoAttrDes(
            example = "Lebron James"
    )
    private String companyChairmanEn;

    @PojoAttrDes(
            des = "总部",
            desEn = "Principal Office",
            example = "中国圣弗朗西城 xxx"
    )
    private String companyPrincipalOffice;

    @PojoAttrDes(
            example = "China San Francise xxx"
    )
    private String companyPrincipalOfficeEn;

    @PojoAttrDes(
            des = "股票过户机构",
            desEn = "Stock Transfer Agent",
            example = "过户机构 xxx"
    )
    private String companyStockTransferAgent;

    @PojoAttrDes(
            example = "Stock Transfer Agent xxx"
    )
    private String companyStockTransferAgentEn;

    @PojoAttrDes(
            des = "会计师事务所",
            desEn = "Auditor Agency",
            example = "会计师事务所 xxx"
    )
    private String companyAuditors;

    @PojoAttrDes(
            example = "Auditor Agency xxx"
    )
    private String companyAuditorsEn;

    @PojoAttrDes(
            des = "电话",
            desEn = "Tel",
            example = "021-83758342-93024"
    )
    private String companyTel;

    @PojoAttrDes(
            des = "传真",
            desEn = "Fax",
            example = "021-92848475"
    )
    private String companyFax;

    @PojoAttrDes(
            des = "邮箱",
            desEn = "Email",
            example = "DAMI@MIDA.com"
    )
    private String companyEmail;

    @PojoAttrDes(
            des = "网站",
            desEn = "Website",
            example = "www.DALENDADADA.com"
    )
    private String companyWebsite;

    @PojoRichText
    @PojoAttrDes(
            des = "主营业务",
            desEn = "Principal Activities",
            example = "电脑，电子产品"
    )
    private String companyPrincipleActivities;

    @PojoRichText
    @PojoAttrDes(
            example = "Computer, Electronic Products"
    )
    private String companyPrincipleActivitiesEn;

    private Byte status;

    private Date adt;

    private Integer aUserId;

    private Date cdt;

    private Integer cUserId;

    private Date udt;

    private Integer uUserId;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyNameEn() {
        return companyNameEn;
    }

    public void setCompanyNameEn(String companyNameEn) {
        this.companyNameEn = companyNameEn == null ? null : companyNameEn.trim();
    }

    public String getCompanyStockName() {
        return companyStockName;
    }

    public void setCompanyStockName(String companyStockName) {
        this.companyStockName = companyStockName == null ? null : companyStockName.trim();
    }

    public String getCompanyStockNameEn() {
        return companyStockNameEn;
    }

    public void setCompanyStockNameEn(String companyStockNameEn) {
        this.companyStockNameEn = companyStockNameEn == null ? null : companyStockNameEn.trim();
    }

    public String getCompanyStockCode() {
        return companyStockCode;
    }

    public void setCompanyStockCode(String companyStockCode) {
        this.companyStockCode = companyStockCode == null ? null : companyStockCode.trim();
    }

    public Date getCompanyDateOfEstablishment() {
        return companyDateOfEstablishment;
    }

    public void setCompanyDateOfEstablishment(Date companyDateOfEstablishment) {
        this.companyDateOfEstablishment = companyDateOfEstablishment;
    }

    public Date getCompanyDateOfListing() {
        return companyDateOfListing;
    }

    public void setCompanyDateOfListing(Date companyDateOfListing) {
        this.companyDateOfListing = companyDateOfListing;
    }

    public String getCompanyNewWorth() {
        return companyNewWorth;
    }

    public void setCompanyNewWorth(String companyNewWorth) {
        this.companyNewWorth = companyNewWorth == null ? null : companyNewWorth.trim();
    }

    public String getCompanyChairman() {
        return companyChairman;
    }

    public void setCompanyChairman(String companyChairman) {
        this.companyChairman = companyChairman == null ? null : companyChairman.trim();
    }

    public String getCompanyChairmanEn() {
        return companyChairmanEn;
    }

    public void setCompanyChairmanEn(String companyChairmanEn) {
        this.companyChairmanEn = companyChairmanEn == null ? null : companyChairmanEn.trim();
    }

    public String getCompanyPrincipalOffice() {
        return companyPrincipalOffice;
    }

    public void setCompanyPrincipalOffice(String companyPrincipalOffice) {
        this.companyPrincipalOffice = companyPrincipalOffice == null ? null : companyPrincipalOffice.trim();
    }

    public String getCompanyPrincipalOfficeEn() {
        return companyPrincipalOfficeEn;
    }

    public void setCompanyPrincipalOfficeEn(String companyPrincipalOfficeEn) {
        this.companyPrincipalOfficeEn = companyPrincipalOfficeEn == null ? null : companyPrincipalOfficeEn.trim();
    }

    public String getCompanyStockTransferAgent() {
        return companyStockTransferAgent;
    }

    public void setCompanyStockTransferAgent(String companyStockTransferAgent) {
        this.companyStockTransferAgent = companyStockTransferAgent == null ? null : companyStockTransferAgent.trim();
    }

    public String getCompanyStockTransferAgentEn() {
        return companyStockTransferAgentEn;
    }

    public void setCompanyStockTransferAgentEn(String companyStockTransferAgentEn) {
        this.companyStockTransferAgentEn = companyStockTransferAgentEn == null ? null : companyStockTransferAgentEn.trim();
    }

    public String getCompanyAuditors() {
        return companyAuditors;
    }

    public void setCompanyAuditors(String companyAuditors) {
        this.companyAuditors = companyAuditors == null ? null : companyAuditors.trim();
    }

    public String getCompanyAuditorsEn() {
        return companyAuditorsEn;
    }

    public void setCompanyAuditorsEn(String companyAuditorsEn) {
        this.companyAuditorsEn = companyAuditorsEn == null ? null : companyAuditorsEn.trim();
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel == null ? null : companyTel.trim();
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax == null ? null : companyFax.trim();
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite == null ? null : companyWebsite.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getAdt() {
        return adt;
    }

    public void setAdt(Date adt) {
        this.adt = adt;
    }

    public Integer getaUserId() {
        return aUserId;
    }

    public void setaUserId(Integer aUserId) {
        this.aUserId = aUserId;
    }

    public Date getCdt() {
        return cdt;
    }

    public void setCdt(Date cdt) {
        this.cdt = cdt;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    public Date getUdt() {
        return udt;
    }

    public void setUdt(Date udt) {
        this.udt = udt;
    }

    public Integer getuUserId() {
        return uUserId;
    }

    public void setuUserId(Integer uUserId) {
        this.uUserId = uUserId;
    }

    public String getCompanyPrincipleActivities() {
        return companyPrincipleActivities;
    }

    public void setCompanyPrincipleActivities(String companyPrincipleActivities) {
        this.companyPrincipleActivities = companyPrincipleActivities == null ? null : companyPrincipleActivities.trim();
    }

    public String getCompanyPrincipleActivitiesEn() {
        return companyPrincipleActivitiesEn;
    }

    public void setCompanyPrincipleActivitiesEn(String companyPrincipleActivitiesEn) {
        this.companyPrincipleActivitiesEn = companyPrincipleActivitiesEn == null ? null : companyPrincipleActivitiesEn.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyId=").append(companyId);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyNameEn=").append(companyNameEn);
        sb.append(", companyStockName=").append(companyStockName);
        sb.append(", companyStockNameEn=").append(companyStockNameEn);
        sb.append(", companyStockCode=").append(companyStockCode);
        sb.append(", companyDateOfEstablishment=").append(companyDateOfEstablishment);
        sb.append(", companyDateOfListing=").append(companyDateOfListing);
        sb.append(", companyNewWorth=").append(companyNewWorth);
        sb.append(", companyChairman=").append(companyChairman);
        sb.append(", companyChairmanEn=").append(companyChairmanEn);
        sb.append(", companyPrincipalOffice=").append(companyPrincipalOffice);
        sb.append(", companyPrincipalOfficeEn=").append(companyPrincipalOfficeEn);
        sb.append(", companyStockTransferAgent=").append(companyStockTransferAgent);
        sb.append(", companyStockTransferAgentEn=").append(companyStockTransferAgentEn);
        sb.append(", companyAuditors=").append(companyAuditors);
        sb.append(", companyAuditorsEn=").append(companyAuditorsEn);
        sb.append(", companyTel=").append(companyTel);
        sb.append(", companyFax=").append(companyFax);
        sb.append(", companyEmail=").append(companyEmail);
        sb.append(", companyWebsite=").append(companyWebsite);
        sb.append(", status=").append(status);
        sb.append(", adt=").append(adt);
        sb.append(", aUserId=").append(aUserId);
        sb.append(", cdt=").append(cdt);
        sb.append(", cUserId=").append(cUserId);
        sb.append(", udt=").append(udt);
        sb.append(", uUserId=").append(uUserId);
        sb.append(", companyPrincipleActivities=").append(companyPrincipleActivities);
        sb.append(", companyPrincipleActivitiesEn=").append(companyPrincipleActivitiesEn);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}
