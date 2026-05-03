package ud8.bank.persistance.dao;

import ud8.bank.domain.entity.BankAccount;

public interface BankAccountDao {

        BankAccount findByIBAN(String iban);
        BankAccount latest();
        void insert(BankAccount bank);
        void update(BankAccount bank);
        void delete(String iban);

}
