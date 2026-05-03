package ud8.users.domain.service.imp;

import ud8.users.domain.service.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendConfirmationEmail(String email) {
        // Send email
        System.out.println("Confirmation email sent to " + email);
    }
}
