package org.bcos.browser.entity.rsp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @Description:查询区块的表，返回参实体类
 * @Author: v_wbsqwu
 * @Date: 2017/10/16 17:24
 */
public class RspTbBlockInfoEntity implements Serializable{
    private static final long serialVersionUID = -5509163787724100432L;
    private Integer number;//块高
    private String pkHash;//hash值
    private String parentHash;//上级hash
    private String miner;//矿工
    private Integer genIndex;
    private Integer size;
    private BigInteger gasLimit;
    private BigInteger gasUsed;
    private BigDecimal avgGasPrice;//块内交易的平均gasPrice
    private String dateTimeStr;//时间
    private BigInteger transactionNumber;//块包含的交易数
    private String extraData;
    private String detailInfo;//rpc查询结果的所有数据
    private BigDecimal avgTime;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPkHash() {
        return pkHash;
    }

    public void setPkHash(String pkHash) {
        this.pkHash = pkHash;
    }

    public String getParentHash() {
        return parentHash;
    }

    public void setParentHash(String parentHash) {
        this.parentHash = parentHash;
    }

    public String getMiner() {
        return miner;
    }

    public void setMiner(String miner) {
        this.miner = miner;
    }

    public Integer getGenIndex() {
        return genIndex;
    }

    public void setGenIndex(Integer genIndex) {
        this.genIndex = genIndex;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BigInteger getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(BigInteger gasLimit) {
        this.gasLimit = gasLimit;
    }

    public BigInteger getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(BigInteger gasUsed) {
        this.gasUsed = gasUsed;
    }

    public BigDecimal getAvgGasPrice() {
        return avgGasPrice;
    }

    public void setAvgGasPrice(BigDecimal avgGasPrice) {
        this.avgGasPrice = avgGasPrice;
    }

    public String getDateTimeStr() {
        return dateTimeStr;
    }

    public void setDateTimeStr(String dateTimeStr) {
        this.dateTimeStr = dateTimeStr;
    }

    public BigInteger getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(BigInteger transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    public BigDecimal getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(BigDecimal avgTime) {
        this.avgTime = avgTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"number\":")
                .append(number);
        sb.append(",\"pkHash\":\"")
                .append(pkHash).append('\"');
        sb.append(",\"parentHash\":\"")
                .append(parentHash).append('\"');
        sb.append(",\"miner\":\"")
                .append(miner).append('\"');
        sb.append(",\"genIndex\":")
                .append(genIndex);
        sb.append(",\"size\":")
                .append(size);
        sb.append(",\"gasLimit\":")
                .append(gasLimit);
        sb.append(",\"gasUsed\":")
                .append(gasUsed);
        sb.append(",\"avgGasPrice\":")
                .append(avgGasPrice);
        sb.append(",\"dateTimeStr\":\"")
                .append(dateTimeStr).append('\"');
        sb.append(",\"transactionNumber\":")
                .append(transactionNumber);
        sb.append(",\"extraData\":\"")
                .append(extraData).append('\"');
        sb.append(",\"detailInfo\":\"")
                .append(detailInfo).append('\"');
        sb.append(",\"avgTime\":")
                .append(avgTime);
        sb.append('}');
        return sb.toString();
    }
}
