package com.example.starter.Verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.impl.logging.LoggerFactory;

import java.util.logging.Logger;

public class VerticleN extends AbstractVerticle {


  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getName() + " With config " + config().toString());
    startPromise.complete();
  }

}
