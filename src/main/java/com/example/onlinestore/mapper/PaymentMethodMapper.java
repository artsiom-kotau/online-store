package com.example.onlinestore.mapper;

import com.example.onlinestore.domain.PaymentMethod;
import com.example.onlinestore.domain.Profile;
import com.example.onlinestore.dto.PaymentMethodDto;
import com.example.onlinestore.dto.ProfileDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public abstract class PaymentMethodMapper {
    public abstract PaymentMethodDto mapPaymentMethodToPaymentMethodDto(PaymentMethod paymentMethod);

    public abstract PaymentMethod mapPaymentMethodDtoToPaymentMethod(PaymentMethodDto paymentMethodDto);

    public abstract ProfileDto mapProfileToProfileDto(Profile profile);

    public abstract Profile mapProfileDtoToProfile(ProfileDto profileDto);

}
