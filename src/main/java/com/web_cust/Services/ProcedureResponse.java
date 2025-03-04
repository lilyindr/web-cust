package com.web_cust.Services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class ProcedureResponse {
	private String p_result;
    private String p_msg;

}
