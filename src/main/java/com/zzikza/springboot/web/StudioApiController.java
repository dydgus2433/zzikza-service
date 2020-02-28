package com.zzikza.springboot.web;

import com.zzikza.springboot.web.dto.StudioResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"1. Studio"})
@RequiredArgsConstructor
@RequestMapping(value = "")
@RestController
public class StudioApiController {

    @GetMapping("/hello")
    @ApiOperation(value = "hello print", notes = "hello 출력")
    public String hello(@ApiParam(value = "단순입렵", required = false) String value)
    {
        return "hello";
    }

    @GetMapping("/hello/dto")
    @ResponseStatus(value = HttpStatus.OK)
    public StudioResponseDto helloDto(@RequestParam("studioName") String studioName, @RequestParam("fee") int fee){

        return new StudioResponseDto(studioName,fee);
    }
}

