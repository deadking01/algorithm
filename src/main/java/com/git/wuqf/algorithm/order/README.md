查找和排序算法是算法的入门知识，其经典思想可以用于很多算法当中。本文件夹下内容主要对排序算法进行梳理。
---
1. 算法分类

十种常见排序算法可以分为两大类：
- 比较类排序算法：通过比较决定元素间次序，由于其时间复杂度不能突破O(nlogn)，因此也称为非线性时间比较类排序。
- 非比较类排序算法：不通过比较来决定元素间次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此也称为线性时间非比较类排序。 
![](order.png)

2. 算法复杂度
![](complex.png)

3. 相关概念
- 稳定 如果a原本在b前面，而a=b，排序之后a仍然在b的前面。
- 不稳定 如果a原本在b的前面，而a=b，排序之后 a 可能会出现在 b 的后面。
- 时间复杂度 对排序数据的总的操作次数。反映当n变化时，操作次数呈现什么规律。
- 空间复杂度 是指算法在计算机内执行时所需存储空间的度量，它也是数据规模n的函数。
