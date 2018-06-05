package com.leno.jeep.elastic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>elastics配置</p>
 *
 * @author: XianGuo
 * @date: 2018年01月23日
 */
@ConfigurationProperties(prefix = "spring.data.elasticsearch")
@Data
public class ElasticsProperties {

    /**
     * 名称
     */
    private String clusterName;

    /**
     * 节点
     */
    private String clusterNodes;

    /**
     * 端口号
     */
    private int port = 9200;

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
        ConfigData.clusterName = this.clusterName;
    }

    public void setClusterNodes(String clusterNodes) {
        this.clusterNodes = clusterNodes;
        ConfigData.clusterNodes = this.clusterNodes;
    }

    public void setPort(int port) {
        this.port = port;
        ConfigData.port = this.port;
    }

    @Data
    public static class ConfigData {

        /**
         * 名称
         */
        private static String clusterName;

        /**
         * 节点
         */
        private static String clusterNodes;

        /**
         * 端口号
         */
        private static int port = 9200;
    }


}
