注意@Required对于javaconfig配置的Bean是不起作用的，对于XML配置的Bean才起作用
https://stackoverflow.com/questions/16769360/how-does-required-annotation-work-with-javaconfig

如Required.png所示，标有@Required的属性如果没有设置会被注入的话，会报错
org.springframework.beans.factory.BeanInitializationException: