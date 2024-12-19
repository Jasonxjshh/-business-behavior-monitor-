package com.Jason.monitor.sdk.push;


import com.Jason.monitor.sdk.model.LogMessage;

/**
 * @Author: Jason
 * @Date: 2024/12/18 21:51
 * @Description:
 */
public interface IPush {
    void open(String host, int port);

    void send(LogMessage logMessage);

}
