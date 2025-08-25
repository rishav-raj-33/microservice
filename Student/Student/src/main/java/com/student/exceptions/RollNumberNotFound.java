package com.student.exceptions;

public class RollNumberNotFound extends RuntimeException{

    public RollNumberNotFound(Integer rollNo){
        super(rollNo+" Not Found!!");
    }



}
