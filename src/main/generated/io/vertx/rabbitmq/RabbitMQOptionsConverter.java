package io.vertx.rabbitmq;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.rabbitmq.RabbitMQOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.rabbitmq.RabbitMQOptions} original class using Vert.x codegen.
 */
public class RabbitMQOptionsConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, RabbitMQOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "automaticRecoveryEnabled":
          if (member.getValue() instanceof Boolean) {
            obj.setAutomaticRecoveryEnabled((Boolean)member.getValue());
          }
          break;
        case "connectionTimeout":
          if (member.getValue() instanceof Number) {
            obj.setConnectionTimeout(((Number)member.getValue()).intValue());
          }
          break;
        case "handshakeTimeout":
          if (member.getValue() instanceof Number) {
            obj.setHandshakeTimeout(((Number)member.getValue()).intValue());
          }
          break;
        case "host":
          if (member.getValue() instanceof String) {
            obj.setHost((String)member.getValue());
          }
          break;
        case "includeProperties":
          if (member.getValue() instanceof Boolean) {
            obj.setIncludeProperties((Boolean)member.getValue());
          }
          break;
        case "networkRecoveryInterval":
          if (member.getValue() instanceof Number) {
            obj.setNetworkRecoveryInterval(((Number)member.getValue()).longValue());
          }
          break;
        case "password":
          if (member.getValue() instanceof String) {
            obj.setPassword((String)member.getValue());
          }
          break;
        case "port":
          if (member.getValue() instanceof Number) {
            obj.setPort(((Number)member.getValue()).intValue());
          }
          break;
        case "requestedChannelMax":
          if (member.getValue() instanceof Number) {
            obj.setRequestedChannelMax(((Number)member.getValue()).intValue());
          }
          break;
        case "requestedHeartbeat":
          if (member.getValue() instanceof Number) {
            obj.setRequestedHeartbeat(((Number)member.getValue()).intValue());
          }
          break;
        case "uri":
          if (member.getValue() instanceof String) {
            obj.setUri((String)member.getValue());
          }
          break;
        case "user":
          if (member.getValue() instanceof String) {
            obj.setUser((String)member.getValue());
          }
          break;
        case "virtualHost":
          if (member.getValue() instanceof String) {
            obj.setVirtualHost((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(RabbitMQOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(RabbitMQOptions obj, java.util.Map<String, Object> json) {
    json.put("automaticRecoveryEnabled", obj.isAutomaticRecoveryEnabled());
    json.put("connectionTimeout", obj.getConnectionTimeout());
    json.put("handshakeTimeout", obj.getHandshakeTimeout());
    if (obj.getHost() != null) {
      json.put("host", obj.getHost());
    }
    json.put("includeProperties", obj.getIncludeProperties());
    json.put("networkRecoveryInterval", obj.getNetworkRecoveryInterval());
    if (obj.getPassword() != null) {
      json.put("password", obj.getPassword());
    }
    json.put("port", obj.getPort());
    json.put("requestedChannelMax", obj.getRequestedChannelMax());
    json.put("requestedHeartbeat", obj.getRequestedHeartbeat());
    if (obj.getUri() != null) {
      json.put("uri", obj.getUri());
    }
    if (obj.getUser() != null) {
      json.put("user", obj.getUser());
    }
    if (obj.getVirtualHost() != null) {
      json.put("virtualHost", obj.getVirtualHost());
    }
  }
}
