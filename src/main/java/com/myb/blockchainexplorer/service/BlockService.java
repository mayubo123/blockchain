package com.myb.blockchainexplorer.service;

import com.myb.blockchainexplorer.po.Block;

import java.util.List;

public interface BlockService {
    List<Block> selectRecent();
}
