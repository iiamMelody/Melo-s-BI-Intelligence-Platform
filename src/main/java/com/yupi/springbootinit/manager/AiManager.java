package com.yupi.springbootinit.manager;

import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AiManager {

    @Resource
    private YuCongMingClient yuCongMingClient;

    public String doChat(Long modelid,String message){
        DevChatRequest devChatRequest = new DevChatRequest();
        //设置模型id
        devChatRequest.setModelId(modelid);
        devChatRequest.setMessage(message);

        //获取响应结果
        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        if (response == null){
            throw new BusinessException(ErrorCode.SYSTEM_ERROR,"ai 响应错误");
        }
        return response.getData().getContent();
    }

}
