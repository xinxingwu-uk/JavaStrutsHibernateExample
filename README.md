# JavaStrutsHibernateExample


---

基于java Struts2+Hibernate 4.2 学生报到管理 web 系统

测试环境： windows平台+myeclipse 10.6+jdk1.6.0+Apche Tomcat V7.0+mysql 5.6.24+Struts2.3.4 +Hibernate 4.2 （带数据库sql文件） 


通过struts2框架，结合mysql数据库构建一个学生报到管理系统，来模拟学生报到登记的过程。基本功能包含如下： 管理角色登录，登录不同的管理角色，可以进行不同的操作。 学生基本情况录入和查询；专业设置和查询；班级管理和查询；收费信息设置和查询 宿舍分配和查询。  基本注册流程是： 首先由管理员录入班级；宿舍和专业的基本信息；根据学生的姓名和录取通知书号录入学生基本信息；在分班界面对学生进行分班；在缴费页面录入学生缴费情况 在宿舍分配界面给学生分配宿舍。  以上流程进行下一个操作时必须完成上一个操作。例如如果学生没有分班，则无法缴费。
