package com.tun.casestudy1.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateEmployeeRecordRequest {
    int type;

    String reason;

    LocalDate date;

    int employeeId;
}
