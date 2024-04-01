# DesignPattern

BuilderPattern(建造者模式)   
可以通过组件组合建造不同的对象.   
建造者模式使用场景举例  
一个类有10000个成员变量,创建只有一个成员变量有值的该类对象

StragetyPattern(策略模式)  
可以消除程序中过多的if-else  

AdapterPattern(适配器模式)     
BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));  
InputStreamReader将InputStream转换成Reader.InputStream是适配源,Reader是适配目标,InputStreamReader是适配器.   

DecoratorPattern(装饰者模式)   
FileInputStream fis = new FileInputStream("/test.txt");  
BufferedInputStream bis = new BufferedInputStream(fis);   
InputStream是抽象构件.FileInputStream是具体构件.FilterInputStream是装饰者.BufferedInputStream是具体装饰者.  
这里将文件输入流扩展为一个可以使用缓冲器的文件输入流,提高程序的性能.  






