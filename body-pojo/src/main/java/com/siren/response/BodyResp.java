package com.siren.response;

import com.siren.pojo.response.BaseResponse;
import lombok.Data;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/29
 */
@Data
public class BodyResp<T> extends BaseResponse {
    public BodyResp() {
        super();
    }
    public BodyResp(T data) {
        super(data);
    }

    public BodyResp(int code, String message, T data) {
        super(code, message, data);
    }

    public static <T> BodyResp ok(T t){
        return new BodyResp(0,"",t);
    }
}
