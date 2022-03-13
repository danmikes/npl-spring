package com.npl.payload.service;

import org.springframework.stereotype.Service;

import javax.validation.Payload;
import javax.validation.Valid;

@Service
public class PayloadService implements IPayloadService {

  @Override
  public Payload postPayload(@Valid Payload payload) {
    return payload;
  }
}
