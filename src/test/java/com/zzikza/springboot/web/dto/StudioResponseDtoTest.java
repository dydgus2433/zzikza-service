package com.zzikza.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StudioResponseDtoTest {

    @Test
    public void lombok_method_test(){
        //given
        String studioName = "452Studio";
        int fee = 10;

        //when
        StudioResponseDto dto = new StudioResponseDto(studioName, fee);

        //then
        assertThat(dto.getStudioName()).isEqualTo(studioName);
        assertThat(dto.getFee()).isEqualTo(fee);

    }
}