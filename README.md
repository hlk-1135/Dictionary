# Dictionary
基于Java实现的电子词典

####**CSDN原文：**
[http://blog.csdn.net/hlk_1135/article/details/78988141](http://blog.csdn.net/hlk_1135/article/details/78988141)

参考文献：
 - [拼写纠错功能实现](http://www.chepoo.com/spelling-correction-function-realization.html)
 - [ 贝叶斯公式与拼写检查器](http://blog.csdn.net/dc_726/article/details/7107364)
 - [big.txt](http://norvig.com/big.txt)
 - 《数学之美》、《统计学习方法》
 
####**算法核心：贝叶斯算法：**

####**运行效果：**
![这里写图片描述](http://img.blog.csdn.net/20180117213528044?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvSExLXzExMzU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

![这里写图片描述](http://img.blog.csdn.net/20180117213558945?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvSExLXzExMzU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

**当我们输入的单词有误时，贝叶斯算法开始派上用场了，对我们所输入的单词进行检查纠正，并进行一定的猜测。**
![这里写图片描述](http://img.blog.csdn.net/20180117213543663?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvSExLXzExMzU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
