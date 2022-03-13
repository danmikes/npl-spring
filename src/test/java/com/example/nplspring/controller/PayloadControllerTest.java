package com.example.nplspring.controller;

import com.example.nplspring.entity.Payload;
import com.example.nplspring.service.PayloadService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

import static org.hamcrest.Matchers.equalTo;

@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = PayloadController.class)
@Import(PayloadService.class)
class PayloadControllerTest {

  @Autowired
  private WebTestClient webTestClient;

  @Test
  void failPayload() {
    Payload payload = new Payload();
    payload.setString("abcd");
    payload.setStringinteger("12x34");

    webTestClient.post()
      .uri("")
      .contentType(MediaType.APPLICATION_JSON)
      .bodyValue(payload)
      .exchange()
      .expectStatus().isBadRequest();
  }

  @Test
  void passPayload() {
    Payload payload = new Payload();
    payload.setString("abcd");
    payload.setStringinteger("1234");

    webTestClient.post()
      .uri("")
      .contentType(MediaType.APPLICATION_JSON)
      .bodyValue(payload)
      .exchange()
      .expectStatus().isOk();
  }
}
