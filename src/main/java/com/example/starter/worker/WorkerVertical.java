package com.example.starter.worker;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WorkerVertical extends AbstractVerticle {
  private static final Logger LOG = LoggerFactory.getLogger(WorkerVertical.class);

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOG.debug("Deployment as worker vertical");
    startPromise.complete();
    Thread.sleep(5000);
  }
}
