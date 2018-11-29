package com.suyu.websocket.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class MessagePojo implements Serializable {
    private static final long serialVersionUID = 2559548757126315723L;
    Integer messageType;
    String messageContent;
}
