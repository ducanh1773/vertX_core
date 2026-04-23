package com.example.starter.JsonObjectExample;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.JsonObject;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class JsonObjectExample extends AbstractVerticle {

  @Test
  public void JsonObjectCanBeMapper(){
    final JsonObject myJsonObject = new JsonObject();
    myJsonObject.put("id" , 1);
    myJsonObject.put("name" , "Alice");
    myJsonObject.put("love_vert_x" , true);
    assertEquals("" , myJsonObject.encode());
  }
}
