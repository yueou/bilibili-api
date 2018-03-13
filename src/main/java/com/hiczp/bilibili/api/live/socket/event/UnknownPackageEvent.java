package com.hiczp.bilibili.api.live.socket.event;

import com.google.gson.JsonObject;

import java.util.EventObject;

public class UnknownPackageEvent extends EventObject {
    private JsonObject jsonObject;

    public UnknownPackageEvent(Object source, JsonObject jsonObject) {
        super(source);
        this.jsonObject = jsonObject;
    }

    public JsonObject getJsonObject() {
        return jsonObject;
    }
}
