package com.zzikza.springboot.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class StudioApiControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello_return() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
    @Test
    public void studioResponseDto_return() throws Exception{

        String studioName = "452스튜디오";
        int fee = 10;

        mvc.perform(get("/hello/dto")
        .param("studioName", studioName)
        .param("fee", String.valueOf(fee)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.studioName",is(studioName)) )
                .andExpect(jsonPath("$.fee",is(fee)) );

    }
}