package com.example.starter.eventbus;

import com.example.starter.eventloop.EventLoopExample;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PublishSubcribeExample {

  public static void main(String[] args) {
    var vertx = Vertx.vertx();
    vertx.deployVerticle(new Publish());
    vertx.deployVerticle(new Subcirber1());
    vertx.deployVerticle(Subcirber2.class.getName(),
      new DeploymentOptions().setInstances(2));  }


  // Nguoi gui cho toan bo
  public static class Publish extends AbstractVerticle{
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
       startPromise.complete();
      vertx.setPeriodic(1000, id -> {
        vertx.eventBus().publish(Publish.class.getName(), "A message for everyone");
      });
    }
  }

  // Nguoi nhan 1
  public static class Subcirber1 extends AbstractVerticle{
    private static final Logger LOG = LoggerFactory.getLogger(Subcirber1.class);
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.eventBus().<String>consumer(Publish.class.getName() , message ->{
        LOG.info("Receiver1: {}" + message.body());
      });
    }
  }


  // Nguoi nhan 2
  static class Subcirber2 extends AbstractVerticle{
    private static final Logger LOG = LoggerFactory.getLogger(Subcirber2.class);
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.eventBus().<String>consumer(Publish.class.getName() , message ->{
        LOG.info("Receiver2: {}" + message.body());
      });
    }
  }

}
