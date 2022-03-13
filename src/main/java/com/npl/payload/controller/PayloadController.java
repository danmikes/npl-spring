package com.npl.payload.controller;

import com.npl.payload.service.IPayloadService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Payload;
import javax.validation.Valid;

@Validated
@RestController
public class PayloadController {

  private final IPayloadService payloadService;

  public PayloadController(IPayloadService payloadService) {
    this.payloadService = payloadService;
  }

  @PostMapping("")
  @ResponseStatus(HttpStatus.OK)
  public Mono<Payload> postHandle(@Valid @RequestBody Payload payload) {
    return Mono.just(payloadService.postPayload(payload));
  }
}
