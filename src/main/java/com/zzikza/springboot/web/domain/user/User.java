package com.zzikza.springboot.web.domain.user;

import java.util.List;

public class User {

    String userSeq;
    String userId;
    String pw;
    String userName;
    String nickName;
    String tel;
    String snsType;
    String naverSeq;
    String naverConnYn;
    //user - userRequests - product
    List<UserRequest> userRequests;

}
