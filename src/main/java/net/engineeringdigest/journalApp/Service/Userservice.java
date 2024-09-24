//package net.engineeringdigest.journalApp.Service;
//
//import net.engineeringdigest.journalApp.Entity.User;
//import net.engineeringdigest.journalApp.Repository.UserRepositroy;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class Userservice {
//
//    @Autowired
//    private UserRepositroy userRepositroy;
//
//    public void Saveuser(User userentry)
//    {
//        userRepositroy.save(userentry);
//
//    }
//
//    public List<User> getall()
//    {
//        return userRepositroy.findAll();
//    }
//
//    public void deletebyid(ObjectId id)
//    {
//        userRepositroy.deleteById(id);
//
//    }
//
//    public Optional<User> findByUsername(User user) {  // Renamed to camelCase and updated parameter name
//        return userRepositroy.findByUsername(user);
//    }
//
//
//}
