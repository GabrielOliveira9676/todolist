package br.com.gabrieloliveira.todolist.user;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if (user != null){
            System.out.println("Usuário já existe");
            //Mensagem de erro
            //Status Code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe.");
        }
        var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashred);

        var userCreated = this.userRepository.save(userModel);
       return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
