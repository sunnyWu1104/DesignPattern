package subjectTobserver.event;

/**
 * @Author: wujiapeng
 * @Description: 通知者抽象类
 * @Date: created in 14:58 2018/5/27
 */
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * 增加观察者
     *
     * @param object 要执行方法的对象
     * @param methodName 执行方法 的方法名
     * @param args   执行方法的参数
     */
    public abstract void addListener(Object object, String methodName,
                                     Object... args);

    /**
     * 通知
     */
    public abstract void notifyX();
}
