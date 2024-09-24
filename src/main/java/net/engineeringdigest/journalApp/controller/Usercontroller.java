//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.Entity.User;
//import net.engineeringdigest.journalApp.Service.Userservice;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.Repository;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//
//@RestController
//@RequestMapping("/user")
//public class Usercontroller {
//
//    @Autowired
//    private Userservice userservice;
//
//    @GetMapping
//    public List<User> getall()
//    {
//        return userservice.getall();
//    }
//
//    @PostMapping
//    public ResponseEntity<User> Create(@RequestBody User userinput)
//    {
//       try {
//
//           userservice.Saveuser(userinput);
//           return new ResponseEntity<>(userinput, HttpStatus.CREATED);
//
//
//       } catch (Exception e)
//       {
//           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//       }
//    }
//
//    @DeleteMapping
//    public ResponseEntity<?> deletebyid(@PathVariable ObjectId id)
//    {
//        userservice.deletebyid(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//
//    }
//
//    @PutMapping
//    public ResponseEntity<?> updateuser(@RequestBody User user)
//    {
//        User userIndb = userservice.findByUsername()
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
