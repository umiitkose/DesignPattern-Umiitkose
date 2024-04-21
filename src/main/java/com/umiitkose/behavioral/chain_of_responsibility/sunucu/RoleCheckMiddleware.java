package com.umiitkose.behavioral.chain_of_responsibility.sunucu;

public class RoleCheckMiddleware extends Middleware {

    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
