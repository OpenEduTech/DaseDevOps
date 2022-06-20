# DaseDevops

微服务架构模板

微服务注册中心:nacos

微服务配置中心:nacos

服务调用:Feign

路由控制:Springcloud gateway

服务者和消费者的概念

服务消费者就是服务调用的一方，服务提供者是服务被调用的一方分开来是为了解耦，同时区分开来，便于实现负载均衡，突破性能瓶颈

其中三个微服务提供者:Provider_one、Provider_two、provider_three

微服务提供者一号和二号提供了同样的api功能，访问hello返回当前使用的微服务提供者的端口号，
配合Feign使用接口+注解的调用方法，配合nacos实现负载均衡。

微服务三号为提供了一个简单的假登录功能

两个微服务消费者:hello、login


微服务网关gateway使用的是springcloud gateway

SpringCloud Gateway 是 Spring Cloud 的一个全新项目，该项目是基于 Spring 5.0，Spring Boot 2.0 和 Project Reactor 等技术开发的网关，它旨在为微服务架构提供一种简单有效的统一的 API 路由管理方式。

客户端向 Spring Cloud Gateway 发出请求。
然后在 Gateway Handler Mapping 中找到与请求相匹配的路由，
将其发送到 Gateway Web Handler。Handler 再通过指定的过滤器链来将请求发送到我们实际的服务执行业务逻辑，然后返回。






