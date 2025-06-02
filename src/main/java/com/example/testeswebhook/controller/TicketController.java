package com.example.testeswebhook.controller;

import com.example.testeswebhook.model.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class TicketController {
    @PostMapping
    public ResponseEntity<String> receiveWebhook(@RequestBody Ticket payload) {
        System.out.println("Ticket recebido!");
        System.out.println("ID: " + payload.getId());
        System.out.println("Subject: " + payload.getSubject());
        System.out.println("Type:" + payload.getType());
        System.out.println("Description text:"+payload.getDescription_text());
        System.out.println("Custom fields: " +payload.getCustom_fields());
        return ResponseEntity.ok("OK");
    }
}
