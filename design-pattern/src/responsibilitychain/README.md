## 责任链模式：
 * 目的：使多个对象都有机会请求，从而避免请求的发送者和接受者之间的耦合关系。将这个对象连成一条链，并沿着这个链传递该请求，直到有一个对象处理它为止
 * 场景：
    1. 当发出请求的客户端不知道这当中的哪一个对象最终处理这个请求，这样系统的更改可以在不影响客户端的情况下动态地重新组织和分配责任
    2. 当接受者和发送者之间都没有明确的信息，链中对象也不知道自己的链结构。责任链可以简化对象的相互连接。
 * 好处：
    1. 随时地增加或修改处理一个请求的结构，增强了给对象指派职责的灵活性。
 * 缺点：一个请求极有可能到了链的末端都得不到处理，或者因为没有正确配置而得不到处理。要考虑全面（就要swtch-case里的default）
 * 

#### 责任链模式
![责任链模式](http://p95stksgt.bkt.clouddn.com/%E8%B4%A3%E4%BB%BB%E9%93%BE%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F.jpeg)

