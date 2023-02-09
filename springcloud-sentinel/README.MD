# 注意：

1.使用注解@SentinelResource的时候，配置资源时使用@SentinelResource定义的value值，若使用controller的URL配置，可能会导致兜底方法不生效。

2.使用注解@SentinelResource的时候，blockHandler方法的入参必须要有BlockException，如果是热点参数规则，参数也必须作为blockHandler方法的入参。

3.持久化时要把nacos和sentinel部署在同一台机器，否则默认配置报错如下

2020-11-05 10:20:58.449 ERROR 9316 --- [pool-2-thread-1] c.a.c.s.dashboard.metric.MetricFetcher   : Failed to fetch metric from <http://172.16.31.82:8720/metric?startTime=1604542848000&endTime=1604542854000&refetch=false> (ConnectionException: Connection refused: no further information)
2020-11-05 10:21:03.241 ERROR 9316 --- [pool-1-thread-1] c.a.c.s.d.client.SentinelApiClient       : HTTP request failed: http://172.16.31.82:8720/getRules?type=flow
java.net.ConnectException: Connection refused: no further information