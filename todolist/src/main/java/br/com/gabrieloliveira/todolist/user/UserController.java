package br.com.gabrieloliveira.todolist.user;

import org.springframework.web.bind.annotation.*;

/**
 * Modificador---
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (Texto)
     * Integer (int) Números inteiros
     * Double (double) Números 0.0000
     * Float (float) Número 0.000
     * char (A C)
     * Date (data)
     * void
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());
    }

}
