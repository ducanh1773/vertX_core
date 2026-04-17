package com.example.starter.Verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getName());
    vertx.deployVerticle(new VerticleAA() , whenVerticle -> {
      System.out.println("Deployed " + VerticleAA.class.getName());
      vertx.undeploy(whenVerticle.result());
    });
    vertx.deployVerticle(new VerticleAB() , whenVerticle -> {
      System.out.println("Deployed " + VerticleAA.class.getName());
      vertx.undeploy(whenVerticle.result());
    });
    startPromise.complete();
  }

}
