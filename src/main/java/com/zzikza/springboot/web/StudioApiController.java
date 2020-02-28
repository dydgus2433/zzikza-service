package com.zzikza.springboot.web;

import com.zzikza.springboot.web.dto.StudioResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudioApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    @ResponseStatus(value = HttpStatus.OK)
    public StudioResponseDto helloDto(@RequestParam("studioName") String studioName, @RequestParam("fee") int fee){

        return new StudioResponseDto(studioName,fee);
    }
}
