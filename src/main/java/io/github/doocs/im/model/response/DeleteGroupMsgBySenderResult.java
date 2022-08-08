package io.github.doocs.im.model.response;

/**
 * 删除指定用户发送的消息-结果
 *
 * @author hyh
 * @since 2021/08/01 13:55
 */
public class DeleteGroupMsgBySenderResult extends GenericResult {
    @Override
    public String toString() {
        return "DeleteGroupMsgBySenderResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
