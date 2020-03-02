package com.zzikza.springboot.web.domain.user;

import com.zzikza.springboot.web.common.generator.PrefixSeqIdGenerator;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.List;

@Builder
@Getter
@Entity(name = "tb_user")
public class User {

    @Id
    @Column(name = "USER_SEQ")
    @TableGenerator(allocationSize = 1,
            name = "user_seq",
            table = "sequences",
            pkColumnName = "name",
            pkColumnValue = "tb_user",
            valueColumnName = "currval"
    )
    @GenericGenerator(
            name = "user_seq",
            strategy = "com.zzikza.springboot.web.common.generator.PrefixSeqIdGenerator",
            parameters = {
                    @Parameter(name = PrefixSeqIdGenerator.INCREMENT_PARAM, value = "1"),
                    @Parameter(name = PrefixSeqIdGenerator.VALUE_PREFIX_PARAMETER, value = "USER"),
                    @Parameter(name = PrefixSeqIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%14d") })
    String id;
    @Column(name = "USER_ID")
    String userId ;
    String pw;
    String name;
    String nickName;
    String tel;
    String snsType;
    String naverSeq;
    String naverConnYn;
    //user - userRequests - product
//    List<UserRequest> userRequests;

}
