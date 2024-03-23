# 基于JavaWeb技术的在线考试系统设计与实现,SpringBoot+VUE+论文
![海报.jpg](https://itguang.oss-cn-beijing.aliyuncs.com/202403231151376.jpg)
## 二 技术介绍
### 1.技术栈

* 后端:  SpringBoot +Mybatis
* 数据库 : MYSQL
* 前端:  VUE + ElementUI

### 2.代码介绍
> ![代码结构](https://itguang.oss-cn-beijing.aliyuncs.com/202403231133234.png)

### 三 Quick Start

### 1. 环境准备
* MYSQL 8
* JDK1.8
* Maven 3
* IDEA
* Node 13 （如果不需要对配置后台二次开发,不需要安装)

> 以上环境需要准备好, 在自己的本地搭建好,方可进行下面步骤
### 2. 下载源码

关注微信公众号: **ITSource 每日分享**,回复 `0030` 获取源码


### 3. 后端部署

- Step1: 下载源码
- Step2: IDEA 打开项目
- Step3: 安装 Maven 依赖
- Step4: 配置检查
> 数据库配置: 找到配置文件 `src/main/resources/application.yml` 修改为你本地的数据库配置。如
```yml
spring:  
    datasource:  
        driverClassName: com.mysql.cj.jdbc.Driver  
        url: jdbc:mysql://127.0.0.1:13306/itsource_30?useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=true  
        username: root  
        password: root
```

注意：**不需要手动创建数据库和初始化表结构，直接运行项目，会自动创建数据库，初始化SQL语句**
- Step4: 启动后端项目
> Idea 运行后端项目,看到以下信息,表示运行成功
> ![Clip_2024-03-23_11-29-44.png](https://itguang.oss-cn-beijing.aliyuncs.com/202403231129908.png)


### 4. 前端部署
项目默认已经构建好了前端静态文件,如果不二次开发的话,不需要单独启动前端项目.

## 下载源码

---
---

关注微信公众号: **ITSource 每日分享**,回复 `0030` 获取源码

---
---

**关注微信公众号 【ITSource每日分享】,免费获取一万个IT资源：项目源码，软件工具，面试面经，学习视频 应有尽有！！！!**

![关注 微信公众号 ! 获取更多学习资源呀](https://itguang.oss-cn-beijing.aliyuncs.com/订阅号.jpeg)

**更多资源推荐:**
- [ITSource 分享 第10期【个人博客系统】](https://mp.weixin.qq.com/s/j5O3oi0Yc28v8ROomyR9_g)
- [ITSource 分享 第11期【简单的教务管理系统】](https://mp.weixin.qq.com/s/5AEgWPW1v0Y5Z77LGoMm1Q)
- [ITSource分享第12期【驾校理论课考试系统】springboot+vue](https://mp.weixin.qq.com/s/YpJXaGC5338ydeLCMBiLtg)
- [ITSource分享第13期【班级信息管理系统】](https://mp.weixin.qq.com/s/7FYxlXoKrb5r-nckcPlAWw)
- [ITSource分享第14期【电影院售票管理系统】springboot+vue](https://mp.weixin.qq.com/s/oRU1VtvB68Z1qJbuGIGrGw)
- [ITSource分享第15期【图书管理系统】](https://mp.weixin.qq.com/s/rgixOXuJyJyZlL8Ny0AE8A)
- [ITSource分享第16期【连锁门店管理系统】springboot+vue](https://mp.weixin.qq.com/s/5aOJ9EHIqcVqtYWdKn3ONw)
- [ITSource分享第17期【宠物管理系统(带论文)springboot+vue】](https://mp.weixin.qq.com/s/S_mDclr4BKOzGZHG6etnoA)
- [ITSource分享第18期【二手交易(电商,商城)系统(带论文和PPT)springboot+vue】](https://mp.weixin.qq.com/s/_LlrbVBq_6nhGp3BY7F38A)
- [ITSource分享第19期【学生选课管理系统springboot+vue】](https://mp.weixin.qq.com/s/b8qTt-XT9SZNzQTKOJQqSw)
- [ITSource分享第20期-Java SpringBoot 微信点餐系统视频](https://mp.weixin.qq.com/s/xqmR6R96yFSZeQOmkCQcmQ)
- [ITSource分享第21期【房屋租赁管理系统】springboot+vue](https://mp.weixin.qq.com/s/7F7EhKv_CG81LEDS1XEJHw)
- [# ITSource分享第22期【景区旅游管理系统】springboot](https://mp.weixin.qq.com/s/ygvHpQeg_frDWD2f1F-R_A)
- [ ITSource分享第23期【图书管理系统】springboot+layui前后端分离](https://mp.weixin.qq.com/s/b1-prJSZdQcEBy0M6JOnDg)
- [第24期【在线拍卖系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/VGKHG_ZPER3VA5rTdbXFiQ)
- [第25期【汽车票网上预定系统】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/CB6xxXJkvK1GAhAVFUgHZw)
- [# 第26期【在线旅游购买网站系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/BfUtXw77GQzXgPQfGyubmg)
- [# 第27期【校园网上租赁交易系统设计与实现】springboot+vue前后端分离+论文+部署文档](https://mp.weixin.qq.com/s/FvWVPlmOkuULLQ9seQHcpQ)