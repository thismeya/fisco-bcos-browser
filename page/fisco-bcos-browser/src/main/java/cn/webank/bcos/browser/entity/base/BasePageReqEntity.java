package cn.webank.bcos.browser.entity.base;



import cn.webank.bcos.browser.base.ConstantCode;
import cn.webank.bcos.browser.base.Constants;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class BasePageReqEntity {
    @NotNull(message = ConstantCode.QUERY_FAIL_PAGE_SIZE_EMPTY)
    @Min(value = 5,message = ConstantCode.QUERY_FAIL_PAGE_SIZE_MIN_5)
    private Integer pageSize = Constants.DB_QUERY_DEFAULT_PAGE_SIZE;

    @NotNull(message = ConstantCode.QUERY_FAIL_PAGE_NUMBER_EMPTY)
    @Min(value = 1,message = ConstantCode.QUERY_FAIL_PAGE_NUMBER_MIN_1)
    private Integer pageNumber = Constants.DB_QUERY_DEFAULT_PAGE_NO;
    private Integer start = 0;

    public Integer getPageSize() {
        return (pageSize==null || pageSize==0 || pageSize>Constants.DB_QUERY_MAX_PAGE_SIZE) ? Constants.DB_QUERY_DEFAULT_PAGE_SIZE : pageSize;
    }

    public Integer getPageNumber() {
        return (pageNumber==null || pageNumber==0) ? Constants.DB_QUERY_DEFAULT_PAGE_NO : pageNumber;
    }

    public Integer getStart() {
        return (getPageNumber() - 1) * getPageSize();
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
