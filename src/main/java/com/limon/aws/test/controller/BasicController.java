package com.limon.aws.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class BasicController {

    @GetMapping("/greet")
    public ResponseEntity<?> greet(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name){
        return ResponseEntity.ok(String.format("Hello %s!",name));
    }

    @PostMapping("/echo")
    public ResponseEntity<?> echo(@RequestBody(required = false) Map<String,Object> data){
        if(data == null){
            data = new HashMap<>();
            data.put("Remark","Empty Input");
        }
        data.put("Echoed",true);

        return ResponseEntity.ok(data);
    }
}
