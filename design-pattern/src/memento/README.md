## 备忘录模式：
在不破坏封装行的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将对象回复到原先保存的状态。

 * 应用场合：
 
   - 比较适用于功能比较复杂的，但需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分的时候，就可以考虑使用备忘录模式

 * 缺点：
   
   - 要将数据完整的存储到备忘录对象中，如果数据量很大，那么资源消耗也会相应增多。非常消耗内存。