package com.CapybaraDev.BuenRaviol.Domain.Dto;
import lombok.*;


@Builder
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
