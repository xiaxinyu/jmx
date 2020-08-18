package com.xiaxinyu.jmx.service.impl;

import com.xiaxinyu.jmx.service.SpideMpbService;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@ManagedResource(objectName = "com.xiaxinyu.jmx.service:name=spideMpbServiceImpl", description = "brower spider service")
public class SpideMpbServiceImpl implements SpideMpbService {
    /**
     * 临时表当前最大id
     */
    private Long tempMaxId = 0L;

    /**
     * 暴露mbean方法
     *
     * @return
     */
    @ManagedAttribute(description = "temp info now max id")
    public Long getNowTempMaxId() {
        return tempMaxId;
    }

    @ManagedOperation
    public void shutdown(){
        System.exit(0);
    }
}