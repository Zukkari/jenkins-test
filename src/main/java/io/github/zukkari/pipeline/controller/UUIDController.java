package io.github.zukkari.pipeline.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UUIDController {
  private static final Logger log = LogManager.getLogger(UUIDController.class);

  @GetMapping
  public String uuid() {
    final var uuid = UUID.randomUUID().toString();
    log.info("Generated UUID: {}", uuid);
    return uuid;
  }
}
