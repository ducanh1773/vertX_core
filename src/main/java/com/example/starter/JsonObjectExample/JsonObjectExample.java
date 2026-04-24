package com.example.starter.JsonObjectExample;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class JsonObjectExample extends AbstractVerticle {

  @Test
  public void JsonObjectCanBeMapper() {
    final JsonObject myJsonObject = new JsonObject();
    myJsonObject.put("id", 1);
    myJsonObject.put("name", "Alice");
    myJsonObject.put("love_vert_x", true);
    assertEquals("", myJsonObject.encode());
  }

  @Test
  public void JsonArrayCanBeMapper() {
    final JsonArray myJsonArry = new JsonArray();
    myJsonArry.add(new JsonObject().put("id", 1))
      .add(new JsonObject().put("id", 2))
      .add(new JsonObject().put("id", 3));
    System.out.println(myJsonArry);
  }

  @Test
    public void canMapObjects(){
    Person person = new Person(1 , "name" , true);
    JsonObject jsonObject = JsonObject.mapFrom(person);
    assertEquals(person.getId() , jsonObject.getInteger("id"));
    assertEquals(person.getName() , jsonObject.getString("name"));
    assertEquals(person.isLevevertx() , jsonObject.getBoolean("levevertx").booleanValue());

  }
}

