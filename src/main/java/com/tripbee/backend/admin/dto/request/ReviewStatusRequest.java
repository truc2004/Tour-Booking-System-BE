package com.tripbee.backend.admin.dto.request;

import lombok.Data;

@Data
public class ReviewStatusRequest {
    private String status; // APPROVED hoặc HIDDEN
}