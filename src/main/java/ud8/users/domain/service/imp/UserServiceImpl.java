package ud8.users.domain.service.imp;

import ud8.users.common.exception.ResourceNotFoundException;
import ud8.users.domain.entity.User;
import ud8.users.domain.service.EmailService;
import ud8.users.domain.service.UserService;
import ud8.users.persistance.repository.UserRepository;

public class UserServiceImpl implements UserService {
    private final EmailService emailService;
    private final UserRepository userRepository;

    public UserServiceImpl(EmailService emailService, UserRepository userRepository) {
        this.emailService = emailService;
        this.userRepository = userRepository;
    }

    @Override
    public User findById(int id) throws ResourceNotFoundException {
        User user = userRepository.findById(id);
        if (user == null) {
            throw new ResourceNotFoundException("User not found");
        }
        return user;
    }

    @Override
    public boolean create(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return false;
        }

        userRepository.create(user);
        emailService.sendConfirmationEmail(user.getEmail());
        return true;
    }

    @Override
    public boolean update(User user) {
        if (!userRepository.existsById(user.getId())) {
            return false;
        }
        userRepository.update(user);
        return true;
    }

    @Override
    public boolean delete(int id) {
        if (!userRepository.existsById(id)) {
            return false;
        }
        userRepository.delete(id);
        return true;
    }
}
