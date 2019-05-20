# 一键生成 CMS 插件使用样例

## 目的

这是一个一键生成 CMS 项目的使用样例。

插件项目请参考 simple-cms-generator-structure 项目



## 使用方式

```
<plugin>
    <groupId>com.liugawaheliujinnao.singleFunction</groupId>
    <artifactId>generator-plugin</artifactId>
    <version>2.6-SNAPSHOT</version>
    <executions>
        <execution>
            <goals>
                <goal>simple-cms-generator</goal>
            </goals>
            <phase>compile</phase> //挂载在 compile 阶段
        </execution>
    </executions>
    <configuration>
  		// projectId 参数，对应项目顶级包名      		<projectId>com.liugawaheliujinnao.singleFunction.simpleCmsGeneratorProjectExample</projectId> 			
  			// projectMainFolder 参数，对应项目 main 目录的绝对路径
        <projectMainFolder>/Users/wufei/IdeaProjects/liugawaheliujinnao/simple-cms-generator-project-example/src/main</projectMainFolder>
        // sysFields 参数，对应 CMS 表中通用的，不需要显示在页面上的属性
        <sysFields>
            <option>adt</option>
            <option>aUserId</option>
            <option>cdt</option>
            <option>cUserId</option>
            <option>udt</option>
            <option>uUserId</option>
            <option>serialVersionUID</option>
            <option>status</option>
            <option>remarks</option>
        </sysFields>
    </configuration>
</plugin>
```



## 注意

1、使用插件的项目目录结构需类似

main

||

java

||

controller	dao（Mybatis 自动生成的 Mapper Java 文件）	pojo	service

​																	||

​																impl（service impl 文件）

resources

||

mapping（Mybatis 自动生成的 xml 文件）	static（Thymeleaf 资源文件夹）	templates（Thymeleaf 页面文件夹）



2、Mybatis 自动生成 Pojo 和 Mapper 需要添加继承关系，如下：

xxxxPojo extends CmsTemplatePojo（可以通过 Mybatis 配置文件设置）

xxxxExample extends CmsTemplateExample { （可以通过扩展 Mybatis 插件配置）

​		………..

​		xxxxExample.Criteria extends CmsTemplateCriteria {

​		}

}
