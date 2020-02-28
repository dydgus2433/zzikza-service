package com.zzikza.springboot.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class StudioResponseDto {
    private final String studioName;
    private final int fee;

}
