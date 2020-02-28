package com.zzikza.springboot.web.domain.product;

import com.zzikza.springboot.web.domain.exhibition.Exhibition;
import com.zzikza.springboot.web.domain.studio.Studio;
import com.zzikza.springboot.web.domain.user.UserRequest;

import java.util.List;
public class Product {
    //product - exhibitionProduct - exhibition
    List<Exhibition> exhibitions;
    //product - productFile
    List<ProductFile> productFiles;
    Studio studio;
    //requestProduct - UserRequest - user
    List<UserRequest> userRequests;
}
