package com.common.result;

/**
 * 返回结果帮助类
 */
public class ResultTHelper {

    public static <T> ResultT success(T data){
        return new ResultT(data);
    }

    public  static <T> ResultT fail(String code,String message){
        return new ResultT(code,message);
    }
}
