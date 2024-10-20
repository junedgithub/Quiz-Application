package com.tyss.quizapp.util;

import com.tyss.quizapp.entity.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
   private ResponseUtil(){}
    private static ApiResponse initApiResponse(){
       return ApiResponse.builder().build();
    }
   public static ResponseEntity<ApiResponse> getBadRequestResponse(Object response){
    ApiResponse apiResponse = initApiResponse();
    apiResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
    apiResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
    apiResponse.setResponse(response);
    return new ResponseEntity<>(apiResponse,HttpStatus.BAD_REQUEST);
   }

   public static ResponseEntity<ApiResponse> getOKRequestResponse(Object response) {
       ApiResponse apiResponse = initApiResponse();
       apiResponse.setStatusCode(HttpStatus.OK.value());
       apiResponse.setHttpStatus(HttpStatus.OK);
       apiResponse.setResponse(response);
       return new ResponseEntity<>(apiResponse,HttpStatus.OK);
   }

   public static ResponseEntity<ApiResponse> getNoContentRequestResponse(Object response) {
       ApiResponse apiResponse = initApiResponse();
       apiResponse.setStatusCode(HttpStatus.NO_CONTENT.value());
       apiResponse.setHttpStatus(HttpStatus.NO_CONTENT);
       apiResponse.setResponse(response);
       return new ResponseEntity<>(apiResponse, HttpStatus.NO_CONTENT);
   }
}
