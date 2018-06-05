#!/usr/bin/env bash
# 定义变量
export JAVA_OPTIONS="-server -Xms1g -Xmx1g
-XX:MetaspaceSize=256m
-XX:MaxMetaspaceSize=512m
-Xmn512M -XX:+UseConcMarkSweepGC
-XX:CMSMaxAbortablePrecleanTime=5000
-XX:+CMSClassUnloadingEnabled
-XX:+UseCMSInitiatingOccupancyOnly
-XX:CMSInitiatingOccupancyFraction=80
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=/Users/xianguo1/logs/jeep/java.hprof
-verbose:gc -Xloggc:/Users/xianguo1/logs/jeep/gc.log -XX:+PrintGCDetails
-XX:+PrintGCDateStamps -Djava.awt.headless=true -Dsun.net.client.defaultConnectTimeout=10000
-Dsun.net.client.defaultReadTimeout=30000 -XX:+DisableExplicitGC -Xdebug
-agentlib:jdwp=transport=dt_socket,address=7029,server=y,suspend=n"
echo ${JAVA_OPTIONS}
pwd;ls;
# 打包
mvn clean package -Dmaven.test.skip -U
cd *-service/target;ls;
# 运行clear
java ${JAVA_OPTIONS} -jar *-service.jar