package com.xiaowudr.atmsite.service;

import com.xiaowudr.atmsite.mapper.RegistrationCodesMapper;
import com.xiaowudr.atmsite.pojo.RegistrationCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationCodesService {
    @Autowired
    private RegistrationCodesMapper registrationCodesMapper;

    public RegistrationCodes getRegistrationCodes(String registerNo) {
        return registrationCodesMapper.getRegistrationCodes(registerNo);
    }

    public void updateIsUsed(RegistrationCodes registrationCodes) {
        registrationCodesMapper.updateIsUsed(registrationCodes);
    }

    public void insertRegistrationCodes(RegistrationCodes registrationCodes) {
        registrationCodesMapper.insertRegistrationCodes(registrationCodes);
    }
}
