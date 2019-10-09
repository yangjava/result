package com.common.result;

public class ResultTTest {

    public static void main(String[] args) {
        User user=new User();
        user.setId(1L);
        user.setName("杨京京");
        ResultT success = ResultTHelper.success(user);
        System.out.println(success);
        ResultT fail = ResultTHelper.fail("100001", "用户不存在");
        System.out.println(fail);
    }
}
