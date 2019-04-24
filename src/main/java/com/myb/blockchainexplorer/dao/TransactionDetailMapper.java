package com.myb.blockchainexplorer.dao;

import com.myb.blockchainexplorer.po.TransactionDetail;
import com.myb.blockchainexplorer.po.TransactionDetailKey;
import feign.Param;

import java.util.List;

public interface TransactionDetailMapper {
    int deleteByPrimaryKey(TransactionDetailKey key);

    int truncate();

    int insert(TransactionDetail record);

    int insertSelective(TransactionDetail record);

    TransactionDetail selectByPrimaryKey(TransactionDetailKey key);

    List<TransactionDetail> selectByAddress(@Param("address") String address);

    int updateByPrimaryKeySelective(TransactionDetail record);

    int updateByPrimaryKey(TransactionDetail record);
}