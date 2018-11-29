package com.suyu.websocket.domain;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class ServerEncoder implements Encoder.Text<MessagePojo> {
    @Override
    public String encode(MessagePojo messagePojo) throws EncodeException {
        try {
            return JsonUtils.objectToJsonStr(messagePojo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
